package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity //product entitydir.//veritabanı nesnesi.
@Table(name="products") //veritabınında hangi tabloya karşılık geldiğini belirtir.
public class Product {
	
	@Id //sorgular bu id'ye göre yapılandırılır.
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //id'nin tek tek arttırıldığı. Otomatik
	@Column(name="product_id")
	private int id;

	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;  //ürünün hangi kategoride olduğunu belirliyoruz.
	

}
