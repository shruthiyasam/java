package streams;

public class Product {
	private Integer pid;
	private String name;
	private Integer price;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	public Integer getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public Integer getPrice() {
		return price;
	}
	public Product(Integer pid, String name, Integer price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
}
