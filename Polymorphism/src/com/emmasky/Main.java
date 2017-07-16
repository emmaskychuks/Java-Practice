package com.emmasky;

public class Main {

    public static void main(String[] args)
    {
        BugattiVeyron bugatti = new BugattiVeyron(8, "Bugatti Veyron", 256);
        FordExplorer fordExplorer = new FordExplorer(4, "Ford Explorer", 200);

        bugatti.accelerate();
        fordExplorer.accelerate();

        bugatti.startEngine();
        fordExplorer.startEngine();

        bugatti.brake();
        fordExplorer.brake();
    }
}
