package com.sanketd.extract.controller;

import com.sanketd.extract.service.ExtractService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    @Autowired
    ExtractService extractService;
    @GetMapping("/extract")
    public ResponseEntity<T> extractData(HttpServletResponse httpServletResponse) throws IOException {
            httpServletResponse.setContentType("application/octet-stream");
            String key="Content-Disposition";
            String value="attachment;filename=courses.xls";
            httpServletResponse.setHeader(key,value);


        return extractService.extractData(httpServletResponse);
    }

}
