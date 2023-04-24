package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> createFiveCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("hyndai", "sonata", 1.5));
        cars.add(new Car("oka", "golf", 0.3));
        cars.add(new Car("iveco", "transporter", 8));
        cars.add(new Car("honda", "accord", 2.2));
        cars.add(new Car("kia", "tel-aviv", 1.3));
        return cars;
    }

    @Override
    public List<Car> getSomeCars(List<Car> cars, int quantity) {
        quantity = quantity < 0 | quantity > 5 ? 5 : quantity;
        return cars.subList(0, quantity);
    }
}
