package com.uty.exam03;

public class OrderExam {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.setAppetizer("Salad");
		order.setDessert("Cake");
		order.setDrink("Coffee");
		order.setMaindish("Stake");
		order.setTogo(false);
		
		System.out.println("<주문 현황>");
		System.out.println("appetizer: " + order.getAppetizer());
		System.out.println("Dessert: " + order.getDessert());
		System.out.println("Drink: " + order.getDrink());
		System.out.println("Maindish: " + order.getMaindish());
		System.out.println("Togo: " + order.isTogo());

	}

}
