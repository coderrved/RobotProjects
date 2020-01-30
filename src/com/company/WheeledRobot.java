
package com.company;


public class WheeledRobot extends TravelingRobot{
    
    private int numberOfWheels;
    private double time = 0.0;

    public WheeledRobot(double travellingSpeed, Robot robot, int numberOfWheels) {
        super(travellingSpeed, robot);
        this.numberOfWheels = numberOfWheels;
        travellingSpeed = 10;
    }
       
   public double findTimeForPassingObstacle(){
       time += robot.numberOfEngines * 0.5;
       return time;
   }

   
    // Gettter & Setter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
   
   
    
}
