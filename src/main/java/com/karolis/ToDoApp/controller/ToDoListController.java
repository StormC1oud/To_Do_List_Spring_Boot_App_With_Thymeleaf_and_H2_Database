package com.karolis.ToDoApp.controller;

import com.karolis.ToDoApp.entity.ToDoList;
import com.karolis.ToDoApp.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ToDoListController {

    @Autowired
    private ToDoListRepository toDoListRepository;

    @GetMapping("/todolist")
    public String getAll(Model model, @Param("keyword") String keyword) {

        List<ToDoList> todolist;

        if (keyword == null || keyword.isEmpty()) {
            todolist = toDoListRepository.findAll();
        } else {
            todolist = toDoListRepository.findByTaskContainingIgnoreCase(keyword);
        }

        model.addAttribute("todolist", todolist);
        model.addAttribute("keyword", keyword);
        return "todolist";
    }

    @GetMapping("/todolist/new")
    public String addTutorial(Model model) {

        ToDoList todolist = new ToDoList();
        model.addAttribute("todolist", todolist);
        model.addAttribute("pageTitle", "Create new task");
        return "todolist_form";
    }

    @PostMapping("/todolist/save")
    public String saveToDoList(ToDoList todolist, RedirectAttributes redirectAttributes) {

        try {
            toDoListRepository.save(todolist);
            redirectAttributes.addFlashAttribute("message", "The task has been saved successfully!");

        } catch (Exception e) {
            redirectAttributes.addAttribute("message", e.getMessage());
        }

        return "redirect:/todolist";
    }

    @GetMapping("/todolist/{id}")
    public String editToDoList(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {

        try {
            ToDoList todolist = toDoListRepository.findById(id).get();
            model.addAttribute("todolist", todolist);
            model.addAttribute("pageTitle", "Edit task (ID: " + id + ")");
            return "todolist_form";

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", e.getMessage());
            return "redirect:/todolist";
        }
    }

    @GetMapping("/todolist/delete/{id}")
    public String deleteToDoList(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {

        try {
            toDoListRepository.deleteById(id);
            redirectAttributes.addFlashAttribute("message", "The task with id=" + id + " has been deleted successfully!");

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", e.getMessage());
        }

        return "redirect:/todolist";
    }

}
