package customer.controller;

import customer.model.Customer;
import customer.service.CustomerService;
import customer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("")
    public ModelAndView showListCustomer(@PageableDefault(value = 4) Pageable pageable, @RequestParam(value = "s",defaultValue = "")String s,@RequestParam(value = "l",defaultValue = "") String l) {
        Page<Customer> customers;
            customers = customerService.findAllByIsDeleteIsFalseAndFirstNameContainingAndLastNameContaining(s ,l ,pageable);
        ModelAndView modelAndView = new ModelAndView("customer/list","customers",customers);
        modelAndView.addObject("s",s);
        modelAndView.addObject("l",l);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/create", "customers", new Customer());
        modelAndView.addObject("provinces", provinceService.getAllProvince());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirect) {
        if (customer == null) {
            return "customer/404";
        }
        try {
            customerService.saveCustomer(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        redirect.addFlashAttribute("message", "Create Successfully");
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showFormDeleteCustomer(@PathVariable("id") Long id) {
        return new ModelAndView("customer/delete", "customer", customerService.getCustomerById(id));
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirect) {
        try {
            customerService.deleteCustomer(customer);
        } catch (Exception e) {
            return "customer/500";
        }
        redirect.addFlashAttribute("message", "Delete Successfully");
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEditCustomer(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("customer/edit", "customer", customerService.getCustomerById(id));
        modelAndView.addObject("provinces", provinceService.getAllProvince());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirect) {
        if (customer == null) {
            return "customer/404";
        }
        try {
            customerService.saveCustomer(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        redirect.addFlashAttribute("message", "Edit Successfully");
        return "redirect:/customer";
    }
}

