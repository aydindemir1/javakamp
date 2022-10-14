package dataAccess;

import entities.Instructor;

public interface InstructorDao {

	void add(Instructor instructor);
	
	void update(Instructor instructor);
	
	void delete(Instructor instructor);
}
