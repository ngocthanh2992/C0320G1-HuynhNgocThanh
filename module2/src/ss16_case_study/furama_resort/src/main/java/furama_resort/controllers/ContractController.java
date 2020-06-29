package furama_resort.controllers;

import furama_resort.models.Contract;
import furama_resort.services.ContractService;
import furama_resort.services.CustomerService;
import furama_resort.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    CustomerService customerService;

    @Autowired
    ServiceService serviceService;

    @Autowired
    ContractService contractService;

    @GetMapping("/add")
    public ModelAndView add(Contract contract){
        ModelAndView modelAndView = new ModelAndView("/contract/add","contract",new Contract());
        modelAndView.addObject("customers",customerService.getAllCustomer());
        modelAndView.addObject("services",serviceService.getAllService());
        return modelAndView;
    }

    @PostMapping("/add")
    public String create(@ModelAttribute("contract")Contract contract, RedirectAttributes redirectAttributes){
        if (contract == null){
            return "/contract/404";
        }try {
            contractService.save(contract);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        redirectAttributes.addFlashAttribute("message","Create Successfully");
        return "redirect:/contract/add";
    }
}
