package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	
Product getByProductName(String productName);  //getBy findBy ile where koşulu yazılıyor.
	
	
Product getByProductNameAndCategory_CategoryId(String productName, int categoryId); // and operatörü içeren where koşulu yazılır.
	
	
	List<Product> getByProductNameOrCategory_CategoryId(String prouctName, int categoryId);  //or dediğim için list kullandım.
	
	Product getByCategoryIn(List<Integer> categories);  // categories tablosundaki idleri içeren ürünleri getir. // select * from products where category_id(1,2,3,4)
	
	List<Product> getByProductNameContains(String productName);//ürün ismine göre arama yapacak.
	
     List<Product> getByProductNameStartsWith(String productName);
     
    
}
