package com.tw.demo.web;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class MainController {

    private List<Employees> _employees = new ArrayList<>();

    private List<Employees> initial() {
        _employees.add(new Employees(0, "小明", 20, "男"));
        _employees.add(new Employees(1, "小红", 19, "女"));
        _employees.add(new Employees(2, "小智", 15, "男"));
        _employees.add(new Employees(3, "小刚", 16, "男"));
        _employees.add(new Employees(4, "小霞", 15, "女"));

        return _employees;
    }

    @GetMapping("/read")
    public List<Employees> read() {
        return initial();
    }

    @PostMapping("/create")
    public void create(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age, @RequestParam("gender") String gender){
        _employees.add(new Employees(id, name, age, gender));
    }

    @GetMapping("/delete")
    public void delete(@RequestParam("id") Integer id){
        _employees.remove(id);
    }

}

