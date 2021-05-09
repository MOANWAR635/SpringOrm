package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("hi i am mo anwar");
        
        
        	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml"); 
 
 
 		StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
 
 		Student student=new Student(13, "Ammy", "Azamgarh");
 
 				int i= studentdao.insert(student);
 			System.out.println("Successfull: done:"+i);
        
        
    }
}
