public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;


    void increaseSpeed(int increment) {
        speed+=increment;
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hızınız: " + speed);
    }

}
