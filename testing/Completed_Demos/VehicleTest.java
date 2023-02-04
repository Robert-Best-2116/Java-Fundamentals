class VehicleTest {
    public static void main(String[] args) {

        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        Vehicle mustang = new Vehicle();
        Vehicle redCar = new Vehicle("red");

        bike.setNumberOfWheels(2);
        bike.setColor("red");

        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();


        car.setNumberOfWheels(4);
        car.setColor("green");

        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();


        mustang.setNumberOfWheels(4);
        mustang.setColor("Forest Green");

        int mustangWheels = mustang.getNumberOfWheels();
        String mustangColor = mustang.getColor();


        String color = redCar.getColor();


        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
        System.out.println("The mustang has " + mustangWheels + " wheels, and the color is " + mustangColor);
        System.out.println("The Vehicles color is " + color);



    }
}