package edu.du.cerino.Lab4;

import edu.du.cerino.Lab4.Pizza.PizzaSize;


public class Lab4 {

	public static void main(String[] args) {
		PizzaOrder order1 = new PizzaOrder();
		System.out.println(order1);
		Pizza pizza1 = new Pizza(PizzaSize.MEDIUM,1,1,1);
		Pizza pizza2 = new Pizza(PizzaSize.LARGE,1,0,1);
		
		order1.addPizza(pizza1);
		order1.addPizza(pizza2);
		order1.printOrder();
		
		PizzaOrder order2 = new PizzaOrder();
		Pizza pizza3 = new Pizza(PizzaSize.SMALL,1,0,0);
		Pizza pizza4 = new Pizza(PizzaSize.MEDIUM,1,1,0);
		Pizza pizza5 = new Pizza(PizzaSize.LARGE,1,1,1);
		
		order2.addPizza(pizza3);
		order2.addPizza(pizza4);
		order2.addPizza(pizza5);
		order2.printOrder();
		
		PizzaOrder order3 = order2;
		order3.printOrder();
		
		order1.changePizzaToppings(0, 1, 0, 1);
		order1.printOrder();
		
		order2.changePizzaToppings(0, 1, 1, 1);
		order2.printOrder();
		order3.printOrder();
		
	}

}
