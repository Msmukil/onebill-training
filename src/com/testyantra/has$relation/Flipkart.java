package com.testyantra.has$relation;

public class Flipkart {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		Battery battery = new Battery();
		battery.brand = "hp";
		battery.type = "lithium";
		battery.capacity = 20000;
		
		Rom rom = new Rom();
		rom.type = "ddr4";
		rom.brand = 2.4;
		
		
		Screen screen = new Screen();
		screen.brand = "samsung";
		screen.capacity = 20000;
		screen.type = "led";
		
		laptop.brand = "dell";
		laptop.price = 20000;
		
		System.out.println(laptop);
				
	}

}
