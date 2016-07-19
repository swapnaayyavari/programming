package shoppingcart1;
import java.util.ArrayList;

public class Testproduct {
	public static void main(String[] args) {
		ArrayList<Products> products=new ArrayList <Products>();
		Products p = new Products("PRS1","Dell Laptop",50000.00);
		products.add(p); 
		p = new Products("PRS2","phone",60000.00);
		products.add(p);
		p = new Products("PRS3","iphone65",65000.00);
		products.add(p);
		for(Products prd:products)
		{
		
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
		}
	}
}
