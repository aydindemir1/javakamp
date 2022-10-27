package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	public void add(ProgrammingLanguage programmingLanguage);
	public void update(ProgrammingLanguage programmingLanguage);
	public void delete(int id);
	ProgrammingLanguage getById(int id);
	boolean checkIfNameExist(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> getAll();
}
