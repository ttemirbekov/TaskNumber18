package com.company;

import java.util.Arrays;

public  class Farm {
    private String OwnerName;
    private String address;
    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm() {
    }

    public Farm(String ownerName, String address, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        OwnerName = ownerName;
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm " +
                "\n OwnerName: " + OwnerName +
                "\n Address: " + address +
                "\n Cows: " + Arrays.toString(cows) +
                "\n Sheep: " + Arrays.toString(sheep) +
                "\n Horses: " + Arrays.toString(horses) ;
    }
}
