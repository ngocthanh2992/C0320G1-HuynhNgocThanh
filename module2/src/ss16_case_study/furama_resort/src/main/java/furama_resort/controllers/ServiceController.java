package furama_resort.controllers;

import furama_resort.models.Service;
import furama_resort.services.ServiceService;
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
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    ServiceService serviceService;

    @GetMapping("/add")
    public ModelAndView add(Service service) {
        return new ModelAndView("/service/add", "service", new Service());
    }

    @PostMapping("/add")
    public String create(@Valid @ModelAttribute("service") Service service, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
        return "service/add";
        }else {
            serviceService.save(service);
        }
        redirectAttributes.addFlashAttribute("message", "Create Successfully");
        return "redirect:/service/add";
    }

    @GetMapping("/list")
    public ModelAndView showListService(@PageableDefault(value = 5) Pageable pageable,
                                        @RequestParam(value = "name", defaultValue = "") String name,
                                        @RequestParam(value = "cost", defaultValue = "") String cost,
                                        @RequestParam(value = "floor", required = false) Long floor) {
        Page<Service> services;
        ModelAndView modelAndView = new ModelAndView("/service/list");
        if (floor == null) {
            floor = Long.MIN_VALUE;
        }
        services = serviceService.findAllByNameAndCostAndNumber(name, cost, floor, pageable);
        modelAndView.addObject("services", services);
        modelAndView.addObject("name", name);
        modelAndView.addObject("cost", cost);
        modelAndView.addObject("floor", floor);
        return modelAndView;
    }

//    @GetMapping("/bookingservice")
//    public ModelAndView showFormBooking()
}
