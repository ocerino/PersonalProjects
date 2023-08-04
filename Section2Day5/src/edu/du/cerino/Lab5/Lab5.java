package edu.du.cerino.Lab5;

import edu.du.cerino.Lab5.Pizza;
import edu.du.cerino.Lab5.PizzaOrder;
import edu.du.cerino.Lab5.Pizza.PizzaSize;

public class Lab5 {

	public static void main(String[] args) {
		PizzaOrder order1 = new PizzaOrder();
		Pizza pizza1 = new Pizza(PizzaSize.MEDIUM,1,1,1);
		Pizza pizza2 = new Pizza(PizzaSize.LARGE,1,0,1);
		
		order1.addPizza(pizza1);
		order1.addPizza(pizza2);
		order1.printOrder();
	
		PizzaOrder order4;
		order4 = new PizzaOrder(order1);
		order4.printOrder();
		
		Pizza pizza6 = new Pizza(PizzaSize.MEDIUM,1,1,1);
		order4.addPizza(pizza6);
		order4.printOrder();
		
		order1.changePizzaToppings(0, 1, 0, 1);
		order1.printOrder();
		order4.printOrder();
		
	}

}
