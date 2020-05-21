public class Driver {
    String name;

    public Driver(String name) {
        this.name = name;
    }

    public void drive(Car car) {
        System.out.println(name + " is driving " + car.carName + ".");
    }

    public static void main(String[] args) {
        Driver driver = new Driver("driver1");
        Car bmw = new Car("bmw", 4);
        driver.drive(bmw);
    }
}