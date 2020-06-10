package day12Work;

interface flying{
	void takeoff();
	void fly();
	void land();
	public default void anotherFlying() {
		System.out.println();
	}
	public static void flyingmethod() {
		System.out.println("This is the flying interface ------- satatic method");
	}
}

interface living{
	void eat();
	void sleep();
	void breathe();
	public default void anotherFlying() {
		System.out.println("This is a instance method in the interface flying");
	}
}

class Bird implements flying,living{

	@Override
	public void eat() {
		System.out.println("Birds eat worms and fruits");
		
	}

	@Override
	public void sleep() {
		System.out.println("Birds sleep on trees");
		
	}

	@Override
	public void breathe() {
		System.out.println("Inhale and exale.... reapeat");
		
	}

	@Override
	public void takeoff() {
		System.out.println("flap wings fast");
		
	}

	@Override
	public void fly() {
		System.out.println("Maintain height");
		
	}

	@Override
	public void land() {
		System.out.println("Stop flapping");
		
	}

	@Override
	public void anotherFlying() {
		flying.super.anotherFlying();
		living.super.anotherFlying();
	}
	
}

public class World {

	public static void main(String[] args) {
		Bird bird = new Bird();
		flying flyingobject;
		flyingobject = bird;
		flyingobject.anotherFlying();
		flyingobject.takeoff();
		flyingobject.fly();
		flyingobject.land();
		System.out.println("------------");
		living livingobject = bird;
		livingobject.anotherFlying();
		livingobject.eat();
		livingobject.sleep();
		livingobject.breathe();

	}

}
