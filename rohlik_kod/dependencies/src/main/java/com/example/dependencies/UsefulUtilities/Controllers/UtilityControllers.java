package com.example.dependencies.UsefulUtilities.Controllers;

import com.example.dependencies.UsefulUtilities.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityControllers {
    private UtilityService utilityService;
    private String backgroundColor;
    private String email;
    private String encoder;
    private String decoder;

    @Autowired
    public UtilityControllers(UtilityService utilityService) {
        this.utilityService = utilityService;
    }


    @GetMapping(value = "/useful")
    public String useful(Model model) {
        model.addAttribute("backgroundColor", this.backgroundColor);
        model.addAttribute("email", this.email);
        model.addAttribute("encoder", encoder);
        model.addAttribute("decoder", decoder);

        return "index";
    }

    @GetMapping(value = "/useful/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("randomColor", this.utilityService.randomColor());

        return "random";
    }

    @GetMapping(value = "/useful/email")
    public String email(Model model, @RequestParam String email) {
        String isValid = this.utilityService.emailValidator(email);
        model.addAttribute("email", isValid);
        model.addAttribute("textEmail", email);

        return "email";
    }

    @GetMapping(value = "/useful/encoder")
    public String encoder(Model model,
                          @RequestParam String text,
                          @RequestParam int number) {

        String modified = this.utilityService.caesar(text, number);
        model.addAttribute("text", modified);

        return "caesar";
    }

    @GetMapping("/useful/decoder")
    public String decoder(Model model,
                          @RequestParam String text,
                          @RequestParam int number) {

        String modified = this.utilityService.caesar(text, number * -1);
        model.addAttribute("text", modified);

        return "caesar";
    }
}
