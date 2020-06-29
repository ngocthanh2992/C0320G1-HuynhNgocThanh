package custom_validation.Controller;

import custom_validation.Model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("phonenumber", new PhoneNumber());
        return "view/index";
    }

    @PostMapping("/")
    public String checkValidation(@Valid @ModelAttribute("phonenumber") PhoneNumber phoneNumber, BindingResult bindingResult, Model model) {
        new PhoneNumber().validate(phoneNumber, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "view/index";
        } else {
            model.addAttribute("phonenumber",phoneNumber.getNumber());
            return "view/result";
        }
    }
}
