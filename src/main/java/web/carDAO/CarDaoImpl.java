package web.carDAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {


    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList;

        {
            carList = new ArrayList<>();
            carList.add(new Car("model1", 2011, 1000001));
            carList.add(new Car("model2", 2014, 1000452));
            carList.add(new Car("model3", 2016, 1000864));
            carList.add(new Car("model4", 2010, 1000111));
            carList.add(new Car("model5", 2012, 1000986));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
