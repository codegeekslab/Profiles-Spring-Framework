package com.codegeekslab.items;

import com.codegeekslab.menu.Menu;

public class Burger extends Menu {
	private String flavour;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Burger [flavour=" + flavour + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
