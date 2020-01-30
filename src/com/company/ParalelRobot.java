
package com.company;


public class ParalelRobot extends ManupulatorRobot{

    public ParalelRobot(int loadCarryingCapacity, int robotArmLength, int transportSpeed, Robot robot) {
        super(loadCarryingCapacity, robotArmLength, transportSpeed, robot);
        transportSpeed = 200;
        loadCarryingCapacity = 200;
    }

}
