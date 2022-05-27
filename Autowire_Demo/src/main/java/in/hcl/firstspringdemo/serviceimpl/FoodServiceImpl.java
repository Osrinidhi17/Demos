package in.hcl.firstspringdemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.firstspringdemo.dao.FoodDAO;
import in.hcl.firstspringdemo.model.Food;
import in.hcl.firstspringdemo.service.FoodService;

@Service
public class FoodServiceImpl  implements FoodService {
	
	@Autowired
	private FoodDAO foodDAO;

	@Override
	public void addFood(Food food) {
          foodDAO.save(food);		
	}
}
