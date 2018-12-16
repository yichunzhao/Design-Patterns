package VisitorPattern;

/**
 * @author YNZ
 */
public interface CarVisitor {
    void visitTyre(CarTyre tyre);

    void visitDoor(CarDoor door);

    void visitEngine(CarEngine engine);

    void visitSteeringWheel(CarSteeringWheel steeringWheel);

}
