package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        System.out.println("------------------");
        model.addAttribute("firstName", "Vladimir");
        model.addAttribute("lastName", "Maslov");
        return "hello";
    }
}
