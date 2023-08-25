package Practice_Advanced.Test1_Advanced;

import java.util.Scanner;

public class Phone {
    public String model;
    public int number;
    public double weight;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void provideDetails(String phoneName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the model for " + phoneName + ": ");
        String model = scanner.nextLine();
        System.out.println("Enter the number for " + phoneName + ": ");
        int number = scanner.nextInt();
        System.out.println("Enter the weight for " + phoneName + ": ");
        double weight = scanner.nextDouble();

        this.setModel(model);
        this.setNumber(number);
        this.setWeight(weight);
    }

    public void printDetails(String brandName) {
        System.out.println(brandName + ":");
        System.out.println("Model is " + this.getModel());
        System.out.println("Number is " + this.getNumber());
        System.out.println("Weight is " + this.getWeight());
        System.out.println();
    }
}

