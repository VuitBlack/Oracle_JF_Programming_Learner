package Section_1.animalshop_07;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Bailey", "Boerboel","arf-arf",80.2,"brown");
        Fish fish = new Fish("Goldfish","Cold","Red");

        System.out.println("Dog: Name: "+dog.getName());
        System.out.println("Dog: Breed: "+dog.getBreed());
        System.out.println("Dog: Bark-Noise: "+dog.bark());
        System.out.println("Dog: Weigh: "+dog.getWeigh());
        System.out.println("Dog: Colour: "+dog.getColour());
        System.out.println();
        System.out.println("Fish: Breed: "+fish.getBreed());
        System.out.println("Fish: Water Type: "+fish.getWaterType());
        System.out.println("Fish: Colour: "+fish.getColour());
    }
}
