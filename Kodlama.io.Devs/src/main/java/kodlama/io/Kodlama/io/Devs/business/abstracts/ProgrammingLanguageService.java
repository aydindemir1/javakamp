package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	public void add(ProgrammingLanguage programmingLanguage);
	public void update(ProgrammingLanguage programmingLanguage);
	public void delete(int id);
	ProgrammingLanguage getById(int id); 
	boolean checkIfNameExist (ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> getAll();
}
