
public class ProductManager {
	
	public void add(Product product) {
		
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Veri Tabanına Eklendi");	
		}else {
			System.out.println("Eklenemedi");
		}
		
	}

}
