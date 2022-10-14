package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("jdbc ile eklendi.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("jdbc ile güncellendi.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("jdbc ile silindi");
		
	}

	
}
