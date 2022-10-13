package classessWithAttiributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "laptop",  "asus laptop", 3000, 2,"siyah");

		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		
		
		
		

	}

}
