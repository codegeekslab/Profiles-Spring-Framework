package com.codegeekslab.items;

import com.codegeekslab.menu.Menu;

public class Sandwich extends Menu {
	private String flavour;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Sandwich [flavour=" + flavour + "]";
	}

}
