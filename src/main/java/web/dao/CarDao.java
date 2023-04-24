package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarDao {

    List<Car> createFiveCars();
    List<Car> getSomeCars(List<Car> cars, int quantity);

    }
