package com.cis.Event.controller;

import com.cis.Event.model.Event;
import com.cis.Event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("/hello")
    public String get(){
        return "hello";
    }

    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("events",eventService.getAllEvent());
        return  "main";

    }
}
