package model;

import java.util.Arrays;

import model.*;

public class Program {

	public static void main(String[] args){
		
		Product tv1 = new Product();
		tv1.setCode("ABC123");
		tv1.setName("Tv");
		tv1.setNetPrice(1000);
		

		Product tv2 = new Product();
		tv2.setCode("ABC123");
		tv2.setName("Tv");
		tv2.setNetPrice(1000);
		

		Product radio = new Product();
		radio.setCode("DEF123");
		radio.setName("radio");
		radio.setNetPrice(1000);
		
		Invoice invoice = new Invoice();
		invoice.addProduct(tv1);
		invoice.addProduct(radio);
		invoice.addProduct(tv2);
		Invoice.print(invoice);
	}
	
}
