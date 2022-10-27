package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if(!programmingLanguageRepository.checkIfNameExist(programmingLanguage) || programmingLanguage.getName() == null || programmingLanguage.getName().length() == 0 ) {
			programmingLanguageRepository.add(programmingLanguage);
			System.out.println("eklendi");
		}
		System.out.println("eklenmedi.");
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguageRepository.update(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		if(programmingLanguageRepository.getById(id) != null) {
			programmingLanguageRepository.delete(id);
			System.out.println("silindi");
		}
		System.out.println("silinmedi");
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public boolean checkIfNameExist(ProgrammingLanguage programmingLanguage) {
		if(programmingLanguageRepository.checkIfNameExist(programmingLanguage)) {
			return true;
		}
		return false;
	}

}
