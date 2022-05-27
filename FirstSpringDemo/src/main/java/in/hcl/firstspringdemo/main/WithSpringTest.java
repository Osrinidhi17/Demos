package in.hcl.firstspringdemo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import in.hcl.firstspringdemo.util.Greeting;

public class WithSpringTest {
    public static void main(String[] args)
    {
    	//create bean factory
    	Resource resource = new FileSystemResource("beans.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	System.out.println(beanFactory);
    	Greeting greeting;
        greeting = (Greeting) beanFactory.getBean("greeting");
    	System.out.println(greeting);
    	greeting.greet();
    	}
}


 //ApplicationContext ctx = new ClassPathXmlApplicationContext("resource/beans.xml");
