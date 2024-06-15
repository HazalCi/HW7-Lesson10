package org.example.solarsystem;

public enum Planet {
    MERCURY(1, 57.9, 2439.7, 58.6),
    VENUS(2, 108.2, 6051.8, 243.0),
    EARTH(3, 149.6, 6371.0, 1.0),
    MARS(4, 227.9, 3389.5, 1.03),
    JUPITER(5, 778.3, 69911.0, 0.41),
    SATURN(6, 1427.0, 58232.0, 0.45),
    URANUS(7, 2871.0, 25362.0, 0.72),
    NEPTUNE(8, 4497.1, 24622.0, 0.67);

    private final int sequenceNumber;
    private final double distanceToSun;
    private final double radius;
    private final double rotationPeriod;

    Planet(int sequenceNumber, double distanceToSun, double radius, double rotationPeriod) {
        this.sequenceNumber = sequenceNumber;
        this.distanceToSun = distanceToSun;
        this.radius = radius;
        this.rotationPeriod = rotationPeriod;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public double getRadius() {
        return radius;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }
}
