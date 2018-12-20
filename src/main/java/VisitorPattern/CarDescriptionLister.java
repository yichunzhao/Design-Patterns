package VisitorPattern;

/**
 * @author YNZ
 */
public class CarDescriptionLister implements CarVisitor {

    @Override
    public void visitTyre(CarTyre tyre) {

        System.out.println("visiting car tyre: " + tyre.getBrand());

    }

    @Override
    public void visitDoor(CarDoor door) {
        System.out.println("visiting car door: " + door.getNumberOfDoors());

    }

    @Override
    public void visitEngine(CarEngine engine) {
        System.out.println("visiting car engine: " + engine.getVolume());

    }

    @Override
    public void visitSteeringWheel(CarSteeringWheel steeringWheel) {
        System.out.println("visiting car steering straight up? " + steeringWheel.isStraightUp());

    }
}
