
public class World {
	
	void live() {
		Animal animal = new Animal();
		System.out.println(animal.type);
		System.out.println("----------------");
		ShowlifeStyle(animal);
		animal = new Cat();
		System.out.println(animal.type);
		ShowlifeStyle(animal);
	}
	
	void ShowlifeStyle(Animal a ) {
		a.eat();
		a.Breathe();
		a.sleep();
		
	}
	
	public static void main(String[] args) {
		World myworld = new World();
		myworld.live();
		
	}

}
