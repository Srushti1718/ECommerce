package Ecommerce.Shopping;

public class Cart {
	private int cartid;
	private int quantity;
	private int productid;
	
	public void addProducttoCart()
	{
		System.out.println("Adding product to cart");
	}
	
	public void checkout()
	{
		System.out.println("Checkout");
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}
	

}
