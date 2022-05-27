package in.hcl.firstspringdemo.daoimpl;

import in.hcl.firstspringdemo.dao.FoodDAO;
import in.hcl.firstspringdemo.model.Food;

public class FoodDAOImpl implements FoodDAO {

	@Override
	public void save(Food food) {
     System.out.println("-----------------Food save in DB: find below deatils-------------------");	
     System.out.println(food);
	}

	
	
}
