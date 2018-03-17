package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {

	private Date date;
	private Date paymentDate;
	private List<InvoicePosition> positions = new ArrayList<InvoicePosition>();
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public List<InvoicePosition> getPositions() {
		return positions;
	}
	
	public void addPosition(InvoicePosition position){
		this.positions.add(position);
	}
	
	public void addProduct(Product product){
		InvoicePosition position = getPositionWithProduct(product);
		if(position!=null)
		{
			position.setCount(position.getCount()+1);
			return;
		}
		positions.add(new InvoicePosition(product));
		
	}
	
	private InvoicePosition getPositionWithProduct(Product product) {

		for(InvoicePosition p: this.positions){
			if(p.getProduct().getCode().equalsIgnoreCase(product.getCode()))
				return p;
		}
		return null;
	}
	
	public static void print(Invoice invoice){
		System.out.println("|NAZWA\t|ILOŚĆ\t|CENA NETTO\t| STAWKA VAT\t|PODATEK");
		System.out.println("******************************************************");
		for(InvoicePosition p: invoice.getPositions()){
			InvoicePosition.print(p);
			System.out.println();
			System.out.println("---------------------------------------------------");
		}
	}
	
}
