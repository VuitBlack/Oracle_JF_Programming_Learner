package Section_1.animalshop_07;

public class Dog {
    private String name;
    private String breed;
    private String barkNoise = "Woof";
    private Double weigh;

    public Dog(String name, String breed, Double weigh){
        this.name = name;
        this.breed = breed;
        this.weigh = weigh;
    }

    public Dog(String name, String breed, String barkNoise, Double weigh) {
        this.name = name;
        this.breed = breed;
        this.barkNoise = barkNoise;
        this.weigh = weigh;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
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

}
