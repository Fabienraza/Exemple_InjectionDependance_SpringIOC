package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import service.IArticleservice;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/ApplicationContent.xml");
		
		//context.getBean("articleservice") : methode retournant un objet de type sevice d'où la necessité de  caster!!!
		IArticleservice service = (IArticleservice) context.getBean("articleservice");

		service.affichePrixTTC();
	}

}
