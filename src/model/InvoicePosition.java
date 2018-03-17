package model;

public class InvoicePosition {

	public final static double TAX_5=0.05;
	public final static double TAX_8=0.8;
	public final static double TAX_25=0.25;
	
	private Product product;
	private int count;
	private double tax;
	
	public InvoicePosition(Product product){
		this.product = product;
		this.count=1;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double nettoPrice(){
		return count * product.getNetPrice();
	}
	
	public double grossPrice(){
		return nettoPrice()*(1+TAX_25);
	}
	
	public double taxValue(){
		return grossPrice()-nettoPrice();
	}
	
	public static void print(InvoicePosition position){
		System.out.print("|"+position.getProduct().getName()+"\t|");
		System.out.print(position.getCount()+"\t|");
		System.out.print(position.nettoPrice()+"\t\t|");
		System.out.print(position.grossPrice()+"\t\t|");
		System.out.print(position.taxValue()+"\t\t|");
		
	}
}
