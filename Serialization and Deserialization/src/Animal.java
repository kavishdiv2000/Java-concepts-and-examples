import java.io.Serializable;

public class Animal implements Serializable{
    private String animalName;
    private String animalType;
    private int animalAge;

    public Animal(String animalName, String animalType, int animalAge) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getAnimalAge() {
        return animalAge;
    }


    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalAge=" + animalAge +
                '}';
    }
}
