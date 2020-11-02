package com.bfs.ryan.rest_api_interceptor.controller;


import com.bfs.ryan.rest_api_interceptor.model.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

//    @RequestMapping("home")
//    public String home(@RequestParam("name") String myName, String age, HttpSession session) {
//
//        System.out.println("hi " + myName);
//        System.out.println("age " + age);
//        session.setAttribute("name", myName);
//        session.setAttribute("age", age);
//
//        return "home";
//    }

//    @RequestMapping("home")
//    public ModelAndView home(@RequestParam("name") String myName, @RequestParam("age") String age) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", myName);
//        mv.addObject("age", age);
//        mv.setViewName("home");
//        return mv;
//
//    }

    @RequestMapping("home")
    public ModelAndView home(Emp emp) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", emp);
        mv.setViewName("home");
        return mv;
    }
}
