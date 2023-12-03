package in.sanketdd.projOne.configuration;

import in.sanketdd.projOne.service.EmployeServiceImpl;
import in.sanketdd.projOne.service.ProjectService;
import in.sanketdd.projOne.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectServiceConfig {
    @Bean(name = "EmployeServiceImpl")
    public ProjectService employeService() {
        return new EmployeServiceImpl();
    }

    @Bean(name = "StudentServiceImpl")
    public ProjectService studentService() {
        return new StudentServiceImpl();
    }
}