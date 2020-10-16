public class PassBy {

	public static void main(String args[]) {
		Car a1 = new Car("Tesla");
		Car a2 = new Car("Honda");

		System.out.println("Before shuffle:- a1:" + a1 + "; a2:" + a2);
		shuffle(a1, a2);
		System.out.println("After shuffle:- a1:" + a1 + "; a2:" + a2);
	}

	public static void shuffle(Car car1, Car car2) {
		Car temp = new Car("");
		temp = car1;
		car1 = car2;
		car2 = temp;
	}

}

class Car {
	String name;

	public Car(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
//There was no actual shuffle because Java utilized pass by value
//Output
//Before shuffle:- a1:Tesla; a2:Honda                                                                               
//After shuffle:- a1:Tesla; a2:Honda 
