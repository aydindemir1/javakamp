package business;

import java.util.ArrayList;
import java.util.List;

import coreLogging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		for (Course myCourse : courses) {

			if (myCourse.getName().equals(course.getName())) {
				throw new Exception("aynı isimli kurs ekleyemezsiniz");
			}

			if (course.getPrice() < 0) {
				throw new Exception("kursun ücreti 0 dan az olamaz.");
			}
		}

		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	public void update(Course course) {
		courseDao.update(course);
	}

	public void delete(Course course) {
		courseDao.delete(course);
	}
}