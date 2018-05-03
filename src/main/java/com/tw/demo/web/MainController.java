package com.tw.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/employees")
    public Employees[] index() {
        Employees employee0 = new Employees(0, "小明", 20, "男");
        Employees employee1 = new Employees(1, "小红", 19, "女");
        Employees employee2 = new Employees(2, "小智", 15, "男");
        Employees employee3 = new Employees(3, "小刚", 16, "男");
        Employees employee4 = new Employees(4, "小霞", 15, "女");

        Employees[] result = {employee0, employee1, employee2, employee3, employee4};

        return result;
    }

}

