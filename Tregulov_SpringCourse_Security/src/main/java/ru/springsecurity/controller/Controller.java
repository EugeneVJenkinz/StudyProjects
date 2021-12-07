package ru.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String getInfo() {
        return "view-info";
    }

    @GetMapping("/hr-info")
    public String hrInfo() {
        return "view-hr";
    }

    @GetMapping("/manager-info")
    public String managerInfo() {
        return "view-manager";
    }
}
