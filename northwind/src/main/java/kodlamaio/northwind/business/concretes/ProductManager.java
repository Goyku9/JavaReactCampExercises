package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;


@Service
public class ProductManager implements ProductService{ //product service jpayı extends ediyor. bu sayede hipernite oluşturuyor.

	private ProductDao productDao;
	
	
	@Autowired //spring dependecy injectionı bu şekilde oluşturur.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}



	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
