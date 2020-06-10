package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @GetMapping("/dictionary")
    public String dictionary() {
        return "index";
    }
    @PostMapping("/dictionary/result")
    public String result(@RequestParam String txtSearch, Model model){
        Map<String,String> dic = new HashMap<>();
        dic.put("Hello","Xin chào");
        dic.put("How","Thế nào");
        dic.put("Book","Quyển vở");
        dic.put("Computer","Máy tính");
        String result = dic.get(txtSearch);
        if (result != null){
            model.addAttribute("result",result);
            model.addAttribute("word",txtSearch);
        }else {
            model.addAttribute("word",txtSearch);
            model.addAttribute("message","Not Found");
        }
        return "index1";
    }
}
