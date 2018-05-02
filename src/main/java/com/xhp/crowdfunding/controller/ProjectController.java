package com.xhp.crowdfunding.controller;

import com.xhp.crowdfunding.entity.Project;
import com.xhp.crowdfunding.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luqinglin
 * Date: 2018-05-02
 * Time: 9:39
 */
@RestController
@RequestMapping("/manage")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @PostMapping("showIndex.do")
    public List<Project> showIndex(){
        return projectService.searchIndex();
    }
    @PostMapping("listProject.do")
    public List<Project> searchAll(){
        return projectService.searchAll();
    }

}
