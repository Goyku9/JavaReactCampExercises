package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="categories")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"}) //orm'de sonsuz loop oluşmasın diye istediğim kadar mapping getirsin diye eklendi.
public class Category{
	
	
	@Id //primary key
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	

	@OneToMany(mappedBy="category")  //ürünlerle categori tablosunu ilişkilendir.
	private List<Product> products; //categorinin ürünleri
}

