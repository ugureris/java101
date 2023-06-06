public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A3";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "BMW M3";
        bmw.speed = 20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(100);
        bmw.printSpeed();


        Car skoda = new Car();
        skoda.model = "Skoda Octavia";
        skoda.speed = 30;
        skoda.printSpeed();



    }
}
