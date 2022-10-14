package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("hibernate ile eklendi.");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("hibernate ile güncellendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("hibernate ile silindi");
		
	}

}
