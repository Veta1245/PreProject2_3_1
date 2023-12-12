package web.models;

public class Car {
    private String modelCar;
    private int year;
    private int price;

    public Car(String modelCar, int year, int price) {
        this.modelCar = modelCar;
        this.year = year;
        this.price = price;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
