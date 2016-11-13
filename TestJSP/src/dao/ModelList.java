package dao;

import java.util.ArrayList;
import java.util.List;

import model.Model;

public class ModelList {
	
	public List<Model> getModel() {
		List<Model> list = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			Model model = new Model("doudou_","doudou", "1993-10-20", "2587179398@qq.com", 1603);
			model.setUserName(model.getUserName() + i);
			list.add(model);
		}
		return list;
	}
}
