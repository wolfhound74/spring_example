package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String main(Model model) {

        return "main/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model) {

        return "main/index";
    }
}
