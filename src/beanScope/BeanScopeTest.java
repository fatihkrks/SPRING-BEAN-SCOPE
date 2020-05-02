package beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {
public static void main(String[] args) {
	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext-bean-scope.xml");
	
	//Scope=Singleton (default)
	Student student=context.getBean("studentId" ,Student.class);
	System.out.println(student);
	
	
	
	//Scope=prototype
	Teacher teacher=context.getBean("teacherId",Teacher.class);
	Teacher teacher2=context.getBean("teacherId",Teacher.class);
	System.out.println(teacher);
	System.out.println(teacher2);
	
}
}
