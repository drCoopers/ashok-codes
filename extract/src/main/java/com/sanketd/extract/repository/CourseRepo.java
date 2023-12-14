package com.sanketd.extract.repository;

import com.sanketd.extract.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
