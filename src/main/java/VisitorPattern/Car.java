package VisitorPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @author YNZ
 */

@Builder
@AllArgsConstructor
public class Car {

    CarEngine engine;
    CarDoor door;
    CarTyre tyre;
    CarSteeringWheel steeringWheel;
}
