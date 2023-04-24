package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String manufacturer;

    private String model;

    private double engine;

    public Car() {
    }

    public Car(String manufacturer, String model, double engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

}
