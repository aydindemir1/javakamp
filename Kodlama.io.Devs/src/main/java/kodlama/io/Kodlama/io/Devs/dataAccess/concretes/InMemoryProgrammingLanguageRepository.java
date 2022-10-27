package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {


	List<ProgrammingLanguage> programmingLanguages;
	
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
		
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		
		int index = 0;
		for(int i = 0; i < programmingLanguages.size(); i++) {
			if(programmingLanguages.get(i).getId() == programmingLanguage.getId()) {
				index = i;
			}
		}
		programmingLanguages.set(index, programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		programmingLanguages.remove(getById(id));
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
			
		}
		return null;
	}

	@Override
	public boolean checkIfNameExist(ProgrammingLanguage programmingLanguage) {
		
		if(programmingLanguage.getName() == programmingLanguage.getName()) {
			return true;
		}
		return false;
	}

}
