package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("hibernate ile eklendi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("hibernate ile güncellendi.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("hibernate ile silindi.");
		
	}

}
