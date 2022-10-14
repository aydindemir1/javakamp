package dataAccess;

import entities.Course;

public class JdbcCourseDao  implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("jdbc ile silindi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("jdbc ile güncellendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("jdbc ile silindi");
		
	}

}
