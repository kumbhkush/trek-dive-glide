package com.tdg.tdgbackend.dao;

import java.util.List;

import com.tdg.tdgbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id);

}
