package com.springapp.courseapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springapp.courseapp.entities.Course;

//why course and long? answer: because this is course dao and the primary key in that class is id which is having long data type so long.
public interface CourseDao extends JpaRepository<Course, Long> {

}
