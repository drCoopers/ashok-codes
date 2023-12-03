package in.sanketdd.projOne.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements  ProjectService{
    @Override
    public List<String> getAll() {
        ArrayList<String> student = new ArrayList<>();
        student.add("Sanket");
        student.add("vikas");
        student.add("Milind");
        return student;
    }

    @Override
    public String getStudent() {
        return "Sanket";
    }
}
