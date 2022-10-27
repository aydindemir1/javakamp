package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	

	@PostMapping("/add")
	public void add (ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.add(programmingLanguage);
	}
	
	@PutMapping("/update")
	public void update (ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.update(programmingLanguage);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete (int id) {
		programmingLanguageService.delete(id);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public ProgrammingLanguage getbyid(int id){
		return programmingLanguageService.getById(id);
	}
	

	
}
