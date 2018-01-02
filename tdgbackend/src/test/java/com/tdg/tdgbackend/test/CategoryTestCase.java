package com.tdg.tdgbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tdg.tdgbackend.dao.CategoryDAO;
import com.tdg.tdgbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.tdg.tdgbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Gliding");
	 * category.setDescription("This is the description for Gliding Accessories");
	 * category.setImageURL("Glid_1.png");
	 * 
	 * assertEquals("Successfully added a category inside the table", true,
	 * categoryDAO.add(category));
	 * 
	 * }
	 */

	// @Test
	// public void testGetCategory() {
	//
	// category = categoryDAO.get(3);
	//
	// assertEquals("Successfully fetched a single category from the table",
	// "Gliding", category.getName());
	// }

	//
	// @Test
	// public void testUpdateCategory() {
	//
	// category = categoryDAO.get(3);
	//
	// category.setName("Glide Acc");
	//
	// assertEquals("Successfully fetched a single category in the table", true ,
	// categoryDAO.update(category));
	// }

	// @Test
	// public void testDeleteCategory() {
	//
	// category = categoryDAO.get(3);
	//
	// assertEquals("Successfully deleted a single category in the table", true,
	// categoryDAO.delete(category));
	// }

	// @Test
	// public void testListCategory() {
	//
	// assertEquals("Successfully fetched the list of categories from the table", 2,
	// categoryDAO.list().size());
	// }

	@Test
	public void testCRUDCategory() {

		// add operation

		category = new Category();

		category.setName("Gliding");
		category.setDescription("This is the description for Gliding Accessories");
		category.setImageURL("Glid_2.png");

		assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Diving");
		category.setDescription("This is the description for Diving Accessories");
		category.setImageURL("Div_1.png");

		assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));

		// fetching and updating the category
		category = categoryDAO.get(2);

		category.setName("Glide Acc");

		assertEquals("Successfully fetched a single category in the table", true, categoryDAO.update(category));

		
		// delete the category
		assertEquals("Successfully deleted a single category in the table", true,
				 categoryDAO.delete(category));
		
		// fetching the list
		assertEquals("Successfully fetched the list of categories from the table", 1,
				 categoryDAO.list().size());
		
		
	}

}
