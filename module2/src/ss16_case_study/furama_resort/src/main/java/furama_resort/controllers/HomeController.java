package furama_resort.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("/service")
    public String service(){
        return "service/service";
    }
    @GetMapping("/contract")
    public String contract(){
        return "contract/contract";
    }
    @GetMapping("/customer")
    public String customer(){
        return "customer/customer";
    }
}
