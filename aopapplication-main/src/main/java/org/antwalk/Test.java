package org.antwalk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*
;public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		CustomerService cs=context.getBean("customerServiceProxy",CustomerService.class);
//		System.out.println("Name:"+cs.getName());
//		System.out.println("URL:"+cs.getUrl());
		Student stu=context.getBean("StudentMarks",Student.class);
		stu.avgMark();
		stu.showResult();
	}

}
