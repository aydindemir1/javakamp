package oopWithNLayered;

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import coreLogging.DatabaseLogger;
import coreLogging.FileLogger;
import coreLogging.Logger;
import coreLogging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course(1, "JAVA", 0);
		Logger[] loggers = {  new DatabaseLogger()};
		List<Course> courses = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1);

		Category category1 = new Category(2, "Programlama");
		List<Category> categories = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category1);

		Instructor instructor = new Instructor(3, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
	}
}