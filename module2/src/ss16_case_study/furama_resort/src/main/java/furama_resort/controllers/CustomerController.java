package furama_resort.controllers;

import furama_resort.models.Customer;
import furama_resort.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/add")
    public ModelAndView add(Customer customer){
        return new ModelAndView("/customer/add","customer",new Customer());
    }

    @PostMapping("/add")
    public String create(@ModelAttribute("customer") Customer customer , RedirectAttributes redirectAttributes){
        if (customer == null){
            return "customer/404";
        }try {
            customerService.save(customer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        redirectAttributes.addFlashAttribute("message","Create Successfully");
        return "redirect:/customer/add";
    }

    @GetMapping("/list")
    public ModelAndView showListCustomer(@PageableDefault(value = 5)Pageable pageable, @RequestParam(value = "name",defaultValue = "") String name, @RequestParam(value = "type",defaultValue = "") String type, @RequestParam(value = "start",required = false)Date start, @RequestParam(value = "end",required = false)Date end) {
    Page<Customer> customers;
    if (start==null&& end==null){
        start = new Date(120,5, 1);
        end = new Date(System.currentTimeMillis());
    }
    customers =customerService.findAllByNameAndTypeCustomerAndBirthday(name,type,start,end,pageable);
    ModelAndView modelAndView = new ModelAndView("/customer/list","customers",customers);
    modelAndView.addObject("name",name);
    modelAndView.addObject("type",type);
    modelAndView.addObject("start",start);
    modelAndView.addObject("end",end);
    return modelAndView;
    }

    
}
