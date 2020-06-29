package validation_form.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import validation_form.Model.User;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/user")
    public ModelAndView showForm(){
       return new ModelAndView("view/index","user", new User());
    }
    @PostMapping("/validateUser")
    public ModelAndView checkValidation(@Valid @ModelAttribute("user") User user,BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("view/index");
        }
        return new ModelAndView("view/result");
    }
}
