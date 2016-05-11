package hisokaSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("mySpring.xml");
		
		Hisoka myInjectedObject = (Hisoka) context.getBean("hisokaClass");
		
		myInjectedObject.showDetails();
	}

}
