package com.company;

public class Main {

    public static void main(String[] args) {

        DomesticAnimal cow1 = new Cow("Zdanka", "Female", 4, 300);
        DomesticAnimal cow2 = new Cow("Kara-Ui", "Female", 3, 350);
        DomesticAnimal cow3 = new Cow(" Angus", "Female", 3, 400);
        DomesticAnimal cow4 = new Cow("Onyx", "Female", 5, 570);
        DomesticAnimal cow5 = new Cow("Panda", "Female", 2, 380);
        DomesticAnimal cow6 = new Cow("Magic", "Female", 3, 408);


        DomesticAnimal sheep1 = new Sheep("Tyan-Shan", "Female", 3, 80);
        DomesticAnimal sheep2 = new Sheep("Arashan", "Male", 2, 100);
        DomesticAnimal sheep3 = new Sheep("Daisy", "Male", 1, 70);
        DomesticAnimal sheep4 = new Sheep("Bale", "Male", 2, 67);


        DomesticAnimal horse1 = new Horse("Taiphun", "Female", 4, 500, "Black");
        DomesticAnimal horse2 = new Horse("Storm", "Male", 3, 480, "White");
        DomesticAnimal horse3 = new Horse("Heracle", "Male", 4, 520, "Black");

        DomesticAnimal[] domesticAnimals1 = {cow1, cow2, cow3, cow4, cow5, sheep1, sheep2, sheep3, horse1, horse2};
        DomesticAnimal[] domesticAnimals2 = {cow6, sheep4, horse3};

        Cow[] cowf1 = new Cow[5];
        Cow[] cowf2 = new Cow[1];
        Sheep[] sheepf1 = new Sheep[3];
        Sheep[] sheepf2 = new Sheep[1];
        Horse[] horsef1 = new Horse[2];
        Horse[] horsef2 = new Horse[1];


        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for (DomesticAnimal domesticAnimal : domesticAnimals1) {
            if (domesticAnimal instanceof Cow) {
                cowf1[count++] = ((Cow) domesticAnimal);
            }
            if (domesticAnimal instanceof Sheep) {
                sheepf1[count1++] = ((Sheep) domesticAnimal);
            }
            if (domesticAnimal instanceof Horse) {
                horsef1[count2++] = ((Horse) domesticAnimal);
            }


        }
        for (DomesticAnimal Animal : domesticAnimals2) {
            if (Animal instanceof Cow) {
                cowf2[count3++] = ((Cow) Animal);
            }
            if (Animal instanceof Sheep) {
                sheepf2[count4++] = ((Sheep) Animal);
            }
            if (Animal instanceof Horse) {
                horsef2[count5++] = ((Horse) Animal);
            }

        }
        Farm farm1 = new Farm("Asanbek", "Karakol", cowf1, sheepf1, horsef1);

        System.out.println(farm1);
        Farm farm2 = new Farm("Nurgazy", "Karkyra", cowf2, sheepf2, horsef2);
        System.out.println(farm2);
    }
}
