package pl.oskarpolak.firstproject.models;

/**
 * Created by Lenovo on 31.08.2017.
 */
public class CarModel {
    private String model;
    private String brand;
    private String engine;
    private int doors;

    public CarModel() {
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", doors=" + doors +
                '}';
    }

    public CarModel(String model, String brand, String engine, int doors) {

        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
