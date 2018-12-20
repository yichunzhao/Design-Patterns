package VisitorPattern;

import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class UsingVisitorPattern {
    //we use visitor pattern
    //when adding new functionality in existing code without changing the existing code.
    //visitor itself is a centralised place to contain the different functionality.
    //visitable itself might be existing data objects
    //in general, visitor pattern separate data from its logic. That is why it is good for adding new functionality
    //on existing data objects.

    public static void main(String[] args) {

        Car carToShow = Car.builder()
                .door(CarDoor.builder().numberOfDoors(4).build())
                .engine(CarEngine.builder().volume(1.4f).build())
                .steeringWheel(CarSteeringWheel.builder().straightUp(true).build())
                .tyre(CarTyre.builder().brand("mx").build())
                .build();


        CarVisitor carDescriptionLister = new CarDescriptionLister();

        //A visitor visits each part of a car.
        Stream.of(carToShow.door, carToShow.steeringWheel, carToShow.tyre, carToShow.engine)
                .forEach(part -> part.accept(carDescriptionLister));


    }
}
