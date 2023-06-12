package com.dell.service;

import com.dell.dto.UserAssignment;
import com.dell.repository.EmployeeRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;
    public String tech_assignment(UserAssignment userAssignment) {
        userAssignment = addType(userAssignment);
        UserAssignment result = repo.save(userAssignment);
        if(result!=null) {
            return "user/home";
        }
        throw new RuntimeException("Assessment not saved");
    }


    private UserAssignment addType(UserAssignment userAssignment) {
        if(userAssignment.getAssisgnment().equalsIgnoreCase("java") ||
                userAssignment.getAssisgnment().equalsIgnoreCase("cpp"))
            userAssignment.setType("TECH");
        else
            userAssignment.setType("BEH");
        return userAssignment;
    }
}
