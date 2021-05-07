package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao; //dependency injection
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Product product) {
		// �� kodlar� yaz�l�r.
		
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		//burada veritaban�na eri�mem gerekiyor.// DataAccess interface'ine ihtyac�m var.
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n logland� "+ product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
