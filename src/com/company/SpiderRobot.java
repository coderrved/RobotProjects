/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author HP
 */
public class SpiderRobot extends TravelingRobot{

    private int numberOfLegs;
    private double time = 0.0;
    
    public SpiderRobot(double travellingSpeed, Robot robot, int numberOfLegs) {
        super(travellingSpeed, robot);
        this.numberOfLegs = numberOfLegs;
        travellingSpeed = 30;
    }

    
    // Getter & Setter
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
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
