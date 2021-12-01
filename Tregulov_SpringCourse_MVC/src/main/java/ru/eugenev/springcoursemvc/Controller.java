package ru.eugenev.springcoursemvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
@RequestMapping("/firstcontroller")
public class Controller {

    // /firstcontroller/
    @RequestMapping("/")
    public String welcomePage() {
        return "welcome-page";
    }

    // /firstcontroller/askDetails
    @RequestMapping("/askDetails")
    public String askDetails() {
        return "ask-details-view";
    }

    // /firstcontroller/showDetails
    @RequestMapping("/showDetails")
    public String showDetails(HttpServletRequest request, Model model) {
        String name = request.getParameter("name"); //Забираем из параметр name из формы ask-details-view
        name += " DungeonMaster";
        model.addAttribute("nameAttribute", name); //Добавляем атрибут, который можно отобразить на форме
        model.addAttribute("descAttribute", " ,Perfomance Artist");
        return "show-details-view";
    }

    //Здесь вместо HttpServletRequest для получения параметра используется аннотация
    //@RequestParam("имя параметра на странице")
    @RequestMapping("/showDetailsModified")
    public String showDetails(@RequestParam("name") String name, Model model) {
        name += " Mighty";
        model.addAttribute("nameAttribute", name);
        model.addAttribute("descAttribute", " ,SomeAttr");
        return "show-details-view";
    }

}
