package Ecommerce.Shopping;

public class Customer {
	private int cid;
	private String name;
	private String Address;
	private int MobileNo;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	public void Register()
	{
		System.out.println("Register customer details");
	}
	public void ViewProduct()
	{
		System.out.println("Product can be viewed");
	}
	public void OrderProduct()
	{
		System.out.println("Order Product");	
	}
	public void MakePayment()
	{
		System.out.println("Pay the amount");
	}
	public void AddtoCart()
	{
		System.out.println("Add product to cart");
	}

}
