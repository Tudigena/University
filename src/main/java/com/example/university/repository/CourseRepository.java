package com.example.university.repository;

import com.example.university.model.Course;
import com.example.university.model.Professor;
import com.example.university.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface CourseRepository {
    ArrayList<Course> getCourses();

    Course getCourseById(int courseId);

    Course addCourse(Course course);

    Course updateCourse(int courseId, Course course);

    void deleteCourse(int courseId);

    Professor getProfessorCourses(int courseId);

    List<Student> getStudentCourses(int courseId);
}