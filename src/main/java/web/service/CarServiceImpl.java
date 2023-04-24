package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDaoImpl carDao;

    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getSomeCars(List<Car> cars, int quantity) {
        return carDao.getSomeCars(cars, quantity);
    }

    @Override
    public List<Car> createFiveCars() {
        return carDao.createFiveCars();
    }

    @Override
    public List<Car> returnCarQuantity(int quantity) {
        List <Car> cars = createFiveCars();
        return getSomeCars(cars, quantity);
    }
}
