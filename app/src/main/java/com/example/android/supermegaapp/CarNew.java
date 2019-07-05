package com.example.android.supermegaapp;

public class CarNew {

    private float speed;
    private boolean isSportCar;
    private String model;
    private int weight;

    public CarNew(float speed) {
        this.speed = speed;
    }

    public CarNew(float speed, boolean isSportCar, String model, int weight) {
        this.speed = speed;
        this.isSportCar = isSportCar;
        this.model = model;
        this.weight = weight;
        System.out.println("New Card is Ready!");
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarNew carNew = (CarNew) o;

        if (Float.compare(carNew.speed, speed) != 0) return false;
        if (isSportCar != carNew.isSportCar) return false;
        if (weight != carNew.weight) return false;
        return model.equals(carNew.model);
    }

    @Override
    public int hashCode() {
        int result = (speed != +0.0f ? Float.floatToIntBits(speed) : 0);
        result = 31 * result + (isSportCar ? 1 : 0);
        result = 31 * result + model.hashCode();
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", isSportCar=" + isSportCar +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
