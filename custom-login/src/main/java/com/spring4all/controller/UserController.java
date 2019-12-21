package com.spring4all.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal Principal principal, Model model, HttpServletRequest request){
        Object obj= request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        model.addAttribute("username", principal.getName());
        return "user/user";
    }

}
