package ru.eugenev.springcoursemvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
@RequestMapping("/springController")
public class SpringController {

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "spring-ask-details-view";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("employee") Employee employee) {
        return "spring-show-details-view";
    }

}
