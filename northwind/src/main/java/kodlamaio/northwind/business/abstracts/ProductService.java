package kodlamaio.northwind.business.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	DataResult<List<Product>> getAllSorted();
	
	Result add(Product product);
	

	DataResult<Product> getByProductNameId(String productName);  //getBy findBy ile where koşulu yazılıyor.
	
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId); // and operatörü içeren where koşulu yazılır.
	
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String prouctName, int categoryId);  //or dediğim için list kullandım.
	
	
	DataResult<List<Product>> getByProductNameContains(String productName);//ürün ismine göre arama yapacak.
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	


}
