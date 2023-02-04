package application;

import hashCodeAndEquals.entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@maria.com");
		Client c2 = new Client("Maria", "maria@maria.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
	}
}
