package org.example;

public class Animal {

    private int animalId;
    private String animalName;
    private String animalDescription;


    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

    @Override
    public String toString() {
        return " id: " + getAnimalId() + " Name: " + getAnimalName() + "  Description: " + getAnimalDescription();
    }
}
