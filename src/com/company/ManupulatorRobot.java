
package com.company;

public class ManupulatorRobot {
    
    private int loadCarryingCapacity;
    private int robotArmLength;
    private int transportSpeed; 
    Robot robot = new Robot();

    public ManupulatorRobot(int loadCarryingCapacity, int robotArmLength, int transportSpeed, Robot robot) {
        this.loadCarryingCapacity = loadCarryingCapacity;
        this.robotArmLength = robotArmLength;
        this.transportSpeed = transportSpeed;
        this.robot = robot;
    }
      
    //Getter & Setter
    public int getLoadCarryingCapacity() {
        return loadCarryingCapacity;
    }

    public void setLoadCarryingCapacity(int loadCarryingCapacity) {
        this.loadCarryingCapacity = loadCarryingCapacity;
    }

    public int getRobotArmLength() {
        return robotArmLength;
    }

    public void setRobotArmLength(int robotArmLength) {
        this.robotArmLength = robotArmLength;
    }

    public int getTransportSpeed() {
        return transportSpeed;
    }

    public void setTransportSpeed(int transportSpeed) {
        this.transportSpeed = transportSpeed;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
    
    
}
