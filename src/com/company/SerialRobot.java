
package com.company;


public class SerialRobot extends ManupulatorRobot{

    public SerialRobot(int loadCarryingCapacity, int robotArmLength, int transportSpeed, Robot robot) {
        super(loadCarryingCapacity, robotArmLength, transportSpeed, robot);
        transportSpeed = 100;
        loadCarryingCapacity = 100;
    }
    
}
