package com.codegeekslab.cart;

import java.util.ArrayList;
import java.util.List;

import com.codegeekslab.menu.Menu;

public class ShoppingCart {
	private List<Menu> items = new ArrayList<Menu>();

	public void addItem(Menu item) {
		items.add(item);
	}

	public List<Menu> getItems() {
		return items;
	}
}
