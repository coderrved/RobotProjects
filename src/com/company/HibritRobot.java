
package com.company;


public class HibritRobot {
    
   private int fixingTime; // second
   private ManupulatorRobot mRobot;
   private TravelingRobot tRobot;
   private int transitionTime; // second
   
    public HibritRobot(int fixingTime, int transitionTime, ManupulatorRobot mRobot, TravelingRobot tRobot) {
        this.fixingTime = fixingTime;
        this.transitionTime = transitionTime;
        this.mRobot = mRobot;
        this.tRobot = tRobot;
    }
   
   
    
}
