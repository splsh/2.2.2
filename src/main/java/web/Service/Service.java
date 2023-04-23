package web.Service;

import web.model.Car;

import java.util.List;

public interface Service {

    List<Car> getSomeCars(List <Car> cars, int quantity);
}
