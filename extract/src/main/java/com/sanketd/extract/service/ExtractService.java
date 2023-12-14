package com.sanketd.extract.service;

import com.sanketd.extract.model.Course;
import com.sanketd.extract.repository.CourseRepo;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ExtractService {

    @Autowired
    CourseRepo courseRepo;

    public ResponseEntity<T> extractData(HttpServletResponse response) throws IOException {

        List<Course> courseList = courseRepo.findAll();

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheet = hssfWorkbook.createSheet("course Info");
        HSSFRow headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Price");

        int dataIndex=1;

        for (Course course:courseList){
           HSSFRow dataRow=sheet.createRow(dataIndex);
           dataRow.createCell(0).setCellValue(course.getCid());
           dataRow.createCell(1).setCellValue(course.getName());
           dataRow.createCell(2).setCellValue(course.getPrice());
           dataIndex++;
        }
       ServletOutputStream outputStream= response.getOutputStream();
        hssfWorkbook.write(outputStream);
        hssfWorkbook.close();
        outputStream.close();

        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}
