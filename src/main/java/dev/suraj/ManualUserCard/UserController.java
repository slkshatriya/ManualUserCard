package dev.suraj.ManualUserCard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/user")
    public String showForm(){

        return "user";
    }

    @PostMapping("/user")
    public String submitForm(@RequestParam String name, @RequestParam String lastName, @RequestParam String aadhar,
                             @RequestParam String username, @RequestParam String dob, @RequestParam String address, Model model){

        model.addAttribute("name", name);
        model.addAttribute("lastname", lastName);
        model.addAttribute("aadhar", aadhar);
        model.addAttribute("username", username);
        model.addAttribute("dob", dob);
        model.addAttribute("address", address);

        return "userResult";
    }
}
