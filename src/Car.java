public class Car {
    private int wheelNum;
    public String carName;

    public Car(){
        wheelNum = 4;
    }

    public Car(String carName, int wheelNum) {
        this.carName = carName;
        this.wheelNum = wheelNum;
    }

    public void run() {
        System.out.println(carName + " is running.");
        System.out.println(carName + " has " + getWheelNum() + " wheels.");
    }

    private int getWheelNum() {
        return wheelNum;
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW", 4);
        bmw.run();
    }
}
