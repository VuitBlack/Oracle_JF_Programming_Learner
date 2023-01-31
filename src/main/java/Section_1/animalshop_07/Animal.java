package Section_1.animalshop_07;

public class Animal {
    public String breed;
    private String colour;

    public Animal (String breed, String colour){
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
}
