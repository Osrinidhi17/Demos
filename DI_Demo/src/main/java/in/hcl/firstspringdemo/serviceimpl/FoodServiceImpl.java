package in.hcl.firstspringdemo.serviceimpl;

import in.hcl.firstspringdemo.dao.FoodDAO;
import in.hcl.firstspringdemo.model.Food;
import in.hcl.firstspringdemo.service.FoodService;

public class FoodServiceImpl  implements FoodService {
	
	private FoodDAO foodDAO;


	public void setFoodDAO(FoodDAO foodDAO) {
		this.foodDAO = foodDAO;
	}


	@Override
	public void addFood(Food food) {
          foodDAO.save(food);		
	}
}
