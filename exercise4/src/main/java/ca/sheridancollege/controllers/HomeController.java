package ca.sheridancollege.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.School;
import ca.sheridancollege.database.SchoolDatabase;


@Controller
public class HomeController
{
    private SchoolDatabase database;
 

    public HomeController(SchoolDatabase database)
    {
        this.database = database;

    }

    @GetMapping("/")
    public String goHome()
    {
        return "index";
    }
    @GetMapping("/addschoolform")
    public String addSchoolForm()
    {
        return "addSchool";
    }
    @PostMapping("/add")
    public String addString(@RequestParam String schoolName,
                            @RequestParam String  city,
                            @RequestParam int numofStudents)
    {
        School school = new School(schoolName, city, numofStudents);
        database.getSchoolList().add(school);
            return "index";
    }
    @GetMapping("/removeAll")
    public String removeandGoHOme()
    {
        database.getSchoolList().clear();
        return "index";
    }
    @GetMapping("/viewSchools")
    public String viewSchool(Model model)
    {
   
        model.addAttribute("database",database);
        return "listing";
    }

    
}
