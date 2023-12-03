package in.sanketdd.projOne.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeServiceImpl implements ProjectService{
    @Override
    public List<String> getAll() {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("ganesh");
        employee.add("suresh");
        employee.add("ramesh");
        return employee;

    }

    @Override
    public String getStudent() {
        return null;
    }
}
