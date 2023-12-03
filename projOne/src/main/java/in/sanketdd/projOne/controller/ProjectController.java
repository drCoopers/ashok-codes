package in.sanketdd.projOne.controller;

import in.sanketdd.projOne.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProjectController {


    @Autowired
    @Qualifier("EmployeServiceImpl")
    ProjectService projectService;


    @Qualifier("StudentServiceImpl")
    @Autowired
    ProjectService projectServices;

    @GetMapping("/emp")
    public List<String>  getStudent(){
         return  projectService.getAll();
    }
    @GetMapping("/student")
    public List<String>  getSS(){
        return  projectServices.getAll();
    }

}
