package shopping;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Customer cust = new Customer("sumer","sumer@mail.com","8201597901");
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		
		Product[] prod = new Product[5];
		
		prod[0] = new Product(1,"monitor","dell",5,5000);
		prod[1] = new Product(2,"mouse","hp",5,500);
		prod[2] = new Product(3,"keyboard","dell",5,2000);
		prod[3] = new Product(4,"pen","link",5,50);
		prod[4] = new Product(5,"pencil","natraj",5,5);
		int opt =1;
		
		while(opt == 1) {
		
		System.out.println( "list of products are shown you can select any one to add to cart   ");
		System.out.println();
		
		for(int i=0;i<5;i++) {
			prod[i].display();
			
		}
		int ch = sc.nextInt();
		switch (ch){
		case 1: cart.addToCart(prod[0]);
		    
		        break;
		case 2: cart.addToCart(prod[1]);
          		
          		break;
          		
		case 3: cart.addToCart(prod[2]);
       			
       			break;
        
		case 4: cart.addToCart(prod[3]);
        		
        		break;
        
		case 5: cart.addToCart(prod[4]);
        		
        		break;
        default :
        	     System.out.println("sorry something wrong option selected");
        	     break;
		
		}
		
		System.out.println("press 1 to add more product to cart");
		opt = sc.nextInt();
		
		
		}
		
	    System.out.println("Details from cart are shown below");
        cart.display();
        
        

		

	}

}
