package io.piano.oop;

public class Inheritance {
    public static void main(String[] args) {
        Truck truck = new Truck();
        PassengerCar passengerCar = new PassengerCar();

        passengerCar.brand = "Toyota";
        passengerCar.numberOfPassengers = 5;
        truck.brand = "Mercedes";
        truck.numberOfPassengers = 3;

        System.out.println(passengerCar.brand + " is a brand of passenger car. It has seats for " +
                passengerCar.numberOfPassengers + " passengers in total. Its max carrying weight is " +
                passengerCar.maxWeight + "kg.");
        System.out.println(truck.brand + " is a brand of truck. It has " + truck.numberOfPassengers +
                " seats for passengers and its max carrying weight is " + truck.maxWeight + "kg.");
    }

}
