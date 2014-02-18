package org.vaadin.mockapp.samples.backend;

import java.util.Collection;

import org.vaadin.mockapp.samples.data.Category;
import org.vaadin.mockapp.samples.data.Product;

public abstract class DataService {

	public abstract Collection<Product> getAllProducts();

	public abstract Collection<Category> getAllCategories();

	public abstract void updateProduct(Product p);

	public static DataService get() {
		return MockDataService.getInstance();
	}
}