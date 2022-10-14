package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("jdbc ile eklendi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("jdbc ile güncellendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("jdbc ile silindi");
		
	}

}
