package in.hcl.firstspringdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.hcl.firstspringdemo.model.Food;
import in.hcl.firstspringdemo.service.FoodService;
import in.hcl.firstspringdemo.serviceimpl.FoodServiceImpl;

public class WithSpringTest {
    public static void main(String[] args)
    {
    	//create bean factory
    	 ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        FoodService foodService = (FoodService) ctx.getBean("foodServiceImpl");
        /**
         * model objects are not managered by the continer spring can only manage DAO,Service,Util or continer objects.
         */
        Food food = new Food();
        food.setId(101);
        food.setName("chicken");
        food.setPrice(200);
        
        foodService.addFood(food);
    	}
}


