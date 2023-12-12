package web.carDAO;

import web.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> carList(Integer count);
}
