
package com.company;

public class TravelingRobot{

   
    private double travellingSpeed;
    Robot robot = new Robot();

    public TravelingRobot(double travellingSpeed, Robot robot) {
        this.travellingSpeed = travellingSpeed;
        this.robot = robot;
    }
    
    public double getTravellingSpeed() {
        return travellingSpeed;
    }

    public void setTravellingSpeed(double travellingSpeed) {
        this.travellingSpeed = travellingSpeed;
    }
    
    
}
