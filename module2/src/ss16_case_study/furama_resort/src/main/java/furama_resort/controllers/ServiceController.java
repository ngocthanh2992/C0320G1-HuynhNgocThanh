package furama_resort.controllers;

import furama_resort.models.Service;
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
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    ServiceService serviceService;

    @GetMapping("/add")
    public ModelAndView add(Service service){
        return new ModelAndView("/service/add","service",new Service());
    }

    @PostMapping("/add")
    public String create(@ModelAttribute("service") Service service, RedirectAttributes redirectAttributes){
        if (service == null){
            return "service/404";
        }try {
            serviceService.save(service);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        redirectAttributes.addFlashAttribute("message","Create Successfully");
        return "redirect:/service/add";
    }

}
