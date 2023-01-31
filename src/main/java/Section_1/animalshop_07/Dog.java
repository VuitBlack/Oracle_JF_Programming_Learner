package Section_1.animalshop_07;

public class Dog extends Animal {
    private String name;
    private String barkNoise = "Woof";
    private Double weigh;

    public Dog(String name, String breed, Double weigh, String colour){
        super (breed, colour);
        this.name = name;
        this.weigh = weigh;
    }

    public Dog(String name, String breed, String barkNoise, Double weigh, String colour) {
        super (breed, colour);
        this.name = name;
        this.barkNoise = barkNoise;
        this.weigh = weigh;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getWeigh() {
        return weigh;
    }
    public void setWeigh(Double weigh) {
        this.weigh = weigh;
    }
    public String bark() {
        System.out.println(barkNoise);
        return null;
    }
    public void bark(String barkNoise){
        System.out.println(barkNoise);
    }

}
