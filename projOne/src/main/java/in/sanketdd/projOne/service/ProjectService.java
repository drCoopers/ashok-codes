package in.sanketdd.projOne.service;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService  {

    public List<String> getAll();

    public String getStudent();

}
