package com.example.thi.controller;

import com.example.thi.model.Customer;
import com.example.thi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public ModelAndView showListCustomer(@PageableDefault(value = 3)Pageable pageable,
                                         @RequestParam(value = "name", defaultValue = "") String name,
                                         @RequestParam(value = "type", defaultValue = "") String type
                                         ){
        Page<Customer> customers;
        customers = customerService.findAllByNameAndTypeCustomer(name,type,pageable);
        ModelAndView modelAndView = new ModelAndView("/customer/list","customers",customers);
        modelAndView.addObject("name",name);
        modelAndView.addObject("type",type);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEditCustomer(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("customer/edit", "customer", customerService.getCustomerById(id));
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "customer/edit";
        }else {
            customerService.save(customer);
        }
        redirectAttributes.addFlashAttribute("message", "Edit Successfully");
        return "redirect:";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showFormDeleteCustomer(@PathVariable("id") Long id) {
        return new ModelAndView("/customer/delete","customer",customerService.getCustomerById(id));
    }
    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer,RedirectAttributes redirectAttributes){
        try {
            customerService.deleteCustomer(customer);
        }catch (Exception e){
            return "/customer/404";
        }
        redirectAttributes.addFlashAttribute("message","Delete Successfully");
        return "redirect:";
    }

}
