package com.hunter;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//		Movie movies=ctx.getBean(MovieService.class);
		//can be done like this also using it's ID 
		movieLib movies=(movieLib) ctx.getBean("library");
		Movie movies1=ctx.getBean(MovieService.class);
		movies1.addMovie("The Shawshank Redemption");
		movies1.addMovie("Inception");
		movies1.addMovie("Shutter Island");
		movies1.addMovie("Zero Dark Thirty");
		movies1.addMovie("Real Steel");
		
		movies.showAllMovies();
		
		((AbstractApplicationContext) ctx).close();
	}

}
