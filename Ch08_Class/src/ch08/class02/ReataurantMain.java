package ch08.class02;

public class ReataurantMain {
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		rest.name = "새마을 식당";
		rest.viewMenu();
		rest.selectFoodMenu();
		rest.deliveryFoodMenu();
		rest.keyboardEnd();
	}

}
