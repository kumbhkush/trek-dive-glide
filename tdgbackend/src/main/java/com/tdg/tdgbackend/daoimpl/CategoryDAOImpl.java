package com.tdg.tdgbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tdg.tdgbackend.dao.CategoryDAO;
import com.tdg.tdgbackend.dto.Category;


@Repository ("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		
		//adding first category
		category.setId(1);
		category.setName("Trekking");
		category.setDescription("This is the description for Trekking Accessories");
		category.setImageURL("Trek_1.png");
		
		categories.add(category);
		
		//Second Category
		category = new Category();
		category.setId(2);
		category.setName("Diving");
		category.setDescription("This is the description for Diving Accessories");
		category.setImageURL("Dive_1.png");
		
		categories.add(category);
		
		

		//Third Category
		category = new Category();
		category.setId(3);
		category.setName("Gliding");
		category.setDescription("This is the description for Gliding Accessories");
		category.setImageURL("Glide_1.png");
		
		categories.add(category);

	}
	
	@Override
	public List<Category> list() {
	
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		for (Category category: categories) {
			if(category.getId() == id) return category;
	}
	
	return null;

}
}
