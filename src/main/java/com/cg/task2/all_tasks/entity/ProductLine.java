package cg.entity;
 
import jakarta.persistence.*;
import java.util.List;
 
@Entity
@Table(name = "productlines")
public class ProductLine {
    @Id
    private String productLine;
 
    private String textDescription;
    private String htmlDescription;
 
    @Lob
    private byte[] image;
 
    @OneToMany(mappedBy = "productLine", cascade = CascadeType.ALL)
    private List<Product> products;

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
 
    // Getters and Setters
    
}
 