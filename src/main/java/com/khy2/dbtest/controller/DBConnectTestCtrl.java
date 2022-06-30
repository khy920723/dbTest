package com.khy2.dbtest.controller;

import com.khy2.dbtest.dao.TestDAO;
import com.khy2.dbtest.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {

    @Autowired
    private TestDAO testDAO;

    @GetMapping("/hello")
    public List<TestDTO> HelloWorld(){
        return testDAO.getTestData();
    }
}
