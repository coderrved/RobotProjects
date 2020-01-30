
package com.company;


public class PalletRobot extends TravelingRobot{
    
    private int numberOfPallets;
    private double time = 0.0;
    public PalletRobot(double travellingSpeed, Robot robot, int numberOfPallets) {
        super(travellingSpeed, robot);
        this.numberOfPallets = numberOfPallets;
        travellingSpeed = 20;
    }
    
    public double findTimeForPassingObstacle(){
       time = robot.numberOfEngines * 3;
       return time;
   }
    
    
    // Getter & Setter
    public int getNumberOfPallets() {
        return numberOfPallets;
    }

    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
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
