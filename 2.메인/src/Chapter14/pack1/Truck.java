package pack1;

import pack2.Car;

public class Truck extends Car {
	Truck() {
		System.out.println("��Ű��1�� Truck �������Դϴ�.");
	}

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		System.out.println(pack2.Car.CAR_NAME);
	}
}

/*
// �⺻���� 14-13

package pack1;

public class Truck extends pack2.Car {
	Truck() {
		System.out.println("��Ű��1�� Truck �������Դϴ�.");
	}

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		System.out.println(pack2.Car.CAR_NAME);
	}
}
*/