package assig9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		Customer cust = context.getBean("customer",Customer.class);
		
//		cust.getAddress();
		
		System.out.println(cust);
		
	}

}
