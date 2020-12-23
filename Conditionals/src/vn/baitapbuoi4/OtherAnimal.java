package vn.baitapbuoi4;

public class OtherAnimal implements IAnimal {

	@Override
	public void makeSound() {
		throw new RuntimeException("I don't know that animal");
	}

}
