package vn.baitapbuoi4;

public class Main {
public static void main(String[] args) {
	Animal dog = (Animal) new Dog();
	dog.makeSound();
	IAnimal other = new OtherAnimal();
	other.makeSound();
}
}
