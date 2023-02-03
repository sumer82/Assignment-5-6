package shopping;

import java.util.ArrayList;

public class Cart {
	
	public int id;
	public int cartTotal;
	Product prod = new Product();
	ArrayList<Product> cartProduct = new ArrayList<>(); 
	
	
	public void addToCart(Product prod) {
		this.prod = prod;
		this.prod.qty--;
		this.cartTotal = this.cartTotal+ this.prod.price;
		cartProduct.add(this.prod);
		System.out.println("product added to card sucessfully");
		
	}
	
	 public void display()
	    {
		 for (int i = 0; i < cartProduct.size(); i++) {
			  System.out.println("id :"+cartProduct.get(i).id+"\n product name is : " + cartProduct.get(i).name + " "
                      + "\n brand: "
                      +cartProduct.get(i).brand + "\n quantity :" + cartProduct.get(i).qty +"\n price :" + cartProduct.get(i).price);
              System.out.println();
		    }
		 
		 
		 System.out.println(" cart total is "+ cartTotal);
	      
	    }

}
