package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("hibernate ile eklendi.");
		
	}

	@Override
	public void update(Instructor instructor) {
	System.out.println("hibernate ile güncellendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("hibernate ile silindi");
		
	}

}
