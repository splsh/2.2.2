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

    public static List<Car> createFiveCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("hyndai", "sonata", 1.5));
        cars.add(new Car("oka", "golf", 0.3));
        cars.add(new Car("iveco", "transporter", 8));
        cars.add(new Car("honda", "accord", 2.2));
        cars.add(new Car("kia", "tel-aviv", 1.3));
        return cars;
    }

    public static List<Car> getSomeCars(List<Car> cars, int quantity) {
        List<Car> result = new ArrayList<>();
        if (quantity > cars.size()) {
            return cars;
        }
        for (int i = quantity - 1; i == 0; i--) {
            result.add(cars.get(i));
        }
        return result;
    }




}
