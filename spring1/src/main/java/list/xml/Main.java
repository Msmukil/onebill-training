package list.xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	@SuppressWarnings("resource")
  public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("List.xml");
		Namelist bean = context.getBean(Namelist.class);
		System.out.println(bean);
	}
}
