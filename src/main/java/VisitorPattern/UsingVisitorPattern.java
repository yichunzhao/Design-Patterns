package VisitorPattern;

import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class UsingVisitorPattern {

    public static void main(String[] args) {

        Car carToShow = Car.builder()
                .door(CarDoor.builder().numberOfDoors(4).build())
                .engine(CarEngine.builder().volume(1.4f).build())
                .steeringWheel(CarSteeringWheel.builder().straightUp(true).build())
                .tyre(CarTyre.builder().brand("mx").build())
                .build();


        CarVisitor carDescriptionLister = new CarDiscriptionLister();

        //A visitor visits each part of a car.
        Stream.of(carToShow.door, carToShow.steeringWheel, carToShow.tyre, carToShow.engine)
                .forEach(part -> part.accept(carDescriptionLister));


    }
}
