package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getSomeCars(List <Car> cars, int quantity);

    List<Car> createFiveCars();

    List<Car> returnCarQuantity(int quantity);
}
