package business;

import java.util.ArrayList;
import java.util.List;

import coreLogging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) {

		for (Category myCategory : categories) {

			if (myCategory.getName().equals(category.getName())) {

				System.out.println("mevcut kategori ismini ekleyemezsiniz");
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	public void update(Category category) {
		categoryDao.update(category);
	}

	public void delete(Category category) {
		categoryDao.delete(category);
	}
}
