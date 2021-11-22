package com.oops.qus2;

public class AwayFromHome extends NearHome {
	public void shoppingCenter() {
		System.out.println("A week later, while traveling to a nearby town,I walked into the shop and find a new variant of the same brand which you liked even more.");
	}
	public void buy() {
		System.out.println("went to the Shopping Centre near your home to get those amazing pair of Jeans but couldn't find it.");
	}

	public static void main(String[] args) {
		
		AwayFromHome af = new AwayFromHome();
		af.shoppingCenter();
		NearHome nh = new NearHome();
		nh.shoppingCenter();
		af.wentAgain();
		af.buy();
		
		

	}

}
