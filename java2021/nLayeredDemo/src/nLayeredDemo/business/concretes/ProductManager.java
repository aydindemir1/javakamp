package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	
	private ProductDao productdao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productdao, LoggerService loggerService) {
		this.productdao = productdao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("bu kategoride ürün kabul edilmiyor.");
			return;
		}
		this.productdao.add(product);
		this.loggerService.logToSystem("ürün eklendi : " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
