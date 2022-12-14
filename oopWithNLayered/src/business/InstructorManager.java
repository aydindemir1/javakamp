package business;

import coreLogging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}

	public void update(Instructor instructor) {
		instructorDao.update(instructor);
	}

	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}
}
