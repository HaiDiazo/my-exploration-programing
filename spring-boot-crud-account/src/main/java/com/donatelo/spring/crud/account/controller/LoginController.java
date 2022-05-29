package com.donatelo.spring.crud.account.controller;

import com.donatelo.spring.crud.account.entity.Account;
import com.donatelo.spring.crud.account.service.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@RestController
public class LoginController {

    @Autowired
    private Login service;



    @GetMapping("/login")
    public ModelAndView login()
    {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Account());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Account user, HttpServletResponse response) throws IOException {
        Account oautuhUser = service.login(user.getUsername(), user.getPassword());

        System.out.println(oautuhUser);
        if (Objects.nonNull(oautuhUser))
        {
            System.out.println(oautuhUser.getUsername());
            System.out.println(oautuhUser.getPassword());
            response.sendRedirect("/");
            return "redirect:/index.html";
        }else{
            return "redirect:/login";
        }
    }

    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/login");
        return "redirect:/login";
    }
}
