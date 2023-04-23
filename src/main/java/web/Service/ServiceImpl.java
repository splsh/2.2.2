package web.Service;

import web.model.Car;

import java.util.List;

public class ServiceImpl implements Service {

    @Override
    public List<Car> getSomeCars(List<Car> cars, int quantity) {
        return Car.getSomeCars(cars, quantity);
    }
}
