package org.example.solarsystem;

public class Main {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Planet Name: " + planet.name());
            System.out.println("Ordinal number to the Sun: " + planet.getSequenceNumber());
            System.out.println("Distance from Sun (million km): " + planet.getDistanceToSun());
            System.out.println("Radius (km): " + planet.getRadius());
            System.out.println("Rotation Period (Earth days): " + planet.getRotationPeriod());
            System.out.println();
        }
    }
}
