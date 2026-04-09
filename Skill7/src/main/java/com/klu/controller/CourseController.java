package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.klu.entity.Course;
import com.klu.service.CourseManager;

@RestController
@RequestMapping("/courses")
@ResponseBody
public class CourseController 
{
    @Autowired
    CourseManager cm;

    // Insert
    @PostMapping("/insert")
    public String insert(@RequestBody Course c1)
    {
        return cm.insertData(c1);
    }

    // Get All
    @GetMapping("/getall")
    public List<Course> getAll()
    {
        return cm.getAllData();
    }

    // Get By Id
    @GetMapping("/getbyid/{id}")
    public Course getById(@PathVariable Long id)
    {
        return cm.getDataById(id);
    }

    // Update
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Course c2)
    {
        return cm.updateAllData(id, c2);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id)
    {
        return cm.deleteData(id);
    }

    // Search
    @GetMapping("/search/{title}")
    public List<Course> search(@PathVariable String title)
    {
        return cm.searchByTitle(title);
    }
}