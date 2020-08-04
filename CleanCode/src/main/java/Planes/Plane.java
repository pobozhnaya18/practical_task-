package Planes;

import models.ExperimentalPlaneSpecifications;
import models.MilitaryAircraftSpecifications;
import models.PassengerPlaneSpecifications;

import java.util.Objects;

abstract public class Plane {

    private String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public Plane(MilitaryAircraftSpecifications aircraftSpecifications) {
        this.model = aircraftSpecifications.model;
        this.maxSpeed = aircraftSpecifications.maxSpeed;
        this.maxFlightDistance = aircraftSpecifications.maxFlightDistance;
        this.maxLoadCapacity = aircraftSpecifications.maxLoadCapacity;
    }

    public Plane(ExperimentalPlaneSpecifications experimentalPlaneSpecifications) {
        this.model = experimentalPlaneSpecifications.model;
        this.maxSpeed = experimentalPlaneSpecifications.maxSpeed;
        this.maxFlightDistance = experimentalPlaneSpecifications.maxFlightDistance;
        this.maxLoadCapacity = experimentalPlaneSpecifications.maxLoadCapacity;
    }

    public Plane(PassengerPlaneSpecifications passengerPlaneSpecifications) {
        this.model = passengerPlaneSpecifications.model;
        this.maxSpeed = passengerPlaneSpecifications.maxSpeed;
        this.maxFlightDistance = passengerPlaneSpecifications.maxFlightDistance;
        this.maxLoadCapacity = passengerPlaneSpecifications.maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Plane)) return false;
        Plane plane = (Plane) object;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
