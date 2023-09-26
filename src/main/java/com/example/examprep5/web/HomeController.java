package com.example.examprep5.web;

import com.example.examprep5.service.TaskService;
import jakarta.servlet.http.HttpSession;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final TaskService taskService;
    private final ModelMapper modelMapper;

    public HomeController(TaskService taskService, ModelMapper modelMapper) {
        this.taskService = taskService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model){
        if(httpSession.getAttribute("user") == null){
            return "index";
        }
        //model.addAttribute("tasks", taskService.findAllTasks());
        return "home";
    }
}
