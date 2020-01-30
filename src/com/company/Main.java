package com.company;

import java.util.Scanner;



public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static String obstacle, directionInformation = "", stop;
    public static int numberOfObstacle =0;
    public static int[][] grid = new int[20][20];
    public static int[] arrayX, arrayY;
    public static int travelingRobotX=-1, travelingRobotY=-1;
    public static int numberOfSteps, lastXCoordinate = travelingRobotX,
            lastYCoordinate = travelingRobotY, totalNumberOfSteps = 0;
    public static boolean isFinished = true;
    public static String typeOfRobot = "";
    public static boolean robotControl = true;


    public static void whichRobot(){
        while (robotControl) {
            System.out.print("select robot type (Travelling / Manipulator / Hibrit): ");
            typeOfRobot = scan.next();
            if (typeOfRobot.equalsIgnoreCase("Traveling") ||
                    typeOfRobot.equalsIgnoreCase("Manipulator") ||
                    typeOfRobot.equalsIgnoreCase("Hibrit")) {
                robotControl = false;
            } else {
                System.out.println("Please make the correct entry !");
            }
        }
    }

    public static void travelingRobot(){
        String typeOfTravelingRobot = "";
        while(!typeOfTravelingRobot.equalsIgnoreCase("Spider") &&
                !typeOfTravelingRobot.equalsIgnoreCase("Wheeled") &&
                !typeOfTravelingRobot.equalsIgnoreCase("Pallet")) {
            System.out.print("Select the type of the traveling robot(Spider / Wheeled / Pallet): ");
            typeOfTravelingRobot = scan.next();
        }

        boolean control = true;
        while (control) {
            int arrayControl = 0;
            while (travelingRobotX < 0 || travelingRobotX > 19) {
                System.out.print("Enter x coordinate of the traveling robot: ");
                travelingRobotX = scan.nextInt();
                if (travelingRobotX < 0 || travelingRobotX > 19) {
                    System.out.println("please enter a number between 0 and 20 !");
                }
            }

            while (travelingRobotY < 0 || travelingRobotY > 19) {
                System.out.print("Enter y coordinate of the traveling robot: ");
                travelingRobotY = scan.nextInt();
                if (travelingRobotY < 0 || travelingRobotY > 19) {
                    System.out.println("please enter a number between 0 and 20 !");
                }
            }
            if(obstacle.equalsIgnoreCase("yes")) {
                if (travelingRobotX == arrayX[arrayControl] && travelingRobotY == arrayY[arrayControl]) {
                    travelingRobotX = -1;
                    travelingRobotY = -1;
                    System.out.println("Robots can not be placed on the barriers");
                } else {
                    control = false;
                }
            }else{
                control = false;
            }
        }
    }

    public static void selectedRobot(String typeOfRobot){

        boolean isFinished = true;
        int totalNumberOfSteps = 0;

        while (isFinished){

            System.out.print("Which direction would you like to move the travelling robot? (right,left,up,down) ");
            directionInformation = scan.next();

            System.out.print("Enter the number of steps of traveling robot: ");
            numberOfSteps = scan.nextInt();
            totalNumberOfSteps += numberOfSteps;

            if(directionInformation.equalsIgnoreCase("right")){
                lastXCoordinate = lastXCoordinate + numberOfSteps;
                if (lastXCoordinate>19){
                    System.out.println("You went out of the field!");
                    lastXCoordinate=19;
                }
                System.out.println("RobotX: " + lastXCoordinate + " RobotY: " + lastYCoordinate);
            }

            if(directionInformation.equalsIgnoreCase("left")){
                lastXCoordinate = lastXCoordinate - numberOfSteps;
                if (lastXCoordinate<0){
                    System.out.println("You went out of the field!");
                    lastXCoordinate=0;
                }
                System.out.println("RobotX: " + lastXCoordinate + " RobotY: " + lastYCoordinate);
            }

            if(directionInformation.equalsIgnoreCase("up")){
                lastYCoordinate = lastYCoordinate - numberOfSteps;
                if(lastYCoordinate<0){
                    System.out.println("You went out of the field!");
                    lastYCoordinate=0;
                }
                System.out.println("RobotX: " + lastXCoordinate + " RobotY: " + lastYCoordinate);
            }

            if(directionInformation.equalsIgnoreCase("down")){
                lastYCoordinate = lastYCoordinate + numberOfSteps;
                if (lastYCoordinate>19){
                    System.out.println("You went out of the field!");
                    lastYCoordinate=19;
                }
                System.out.println("RobotX: " + lastXCoordinate + " RobotY: " + lastYCoordinate);
            }

            System.out.print("Do you want to stop the traveling robot? (yes/no) ");
            stop = scan.next();
            if (stop.equalsIgnoreCase("yes")){
                isFinished=false;
                travelingRobotX = lastXCoordinate;
                travelingRobotY = lastYCoordinate;
                System.out.println("Last coordinates of the traveling robot: " + travelingRobotX + " " + travelingRobotY);
            }
        }
    }


    public static void grid(){
        for (int i=0; i<20; i++){
            for (int j=0; j<20; j++){
                grid[i][j] = 0;
            }
        }
    }

    public static void obstacle(){
        System.out.print("Do you want to place obstacle ? (yes/no) ");
        obstacle = scan.next();

        if(obstacle.equalsIgnoreCase("yes")) {
            System.out.print("How many do you want to put obstacle ? ");
            numberOfObstacle = scan.nextInt();
        }
        arrayX = new int[numberOfObstacle];
        arrayY = new int[numberOfObstacle];

        if(obstacle.equalsIgnoreCase("yes")){

            for (int t=0; t<numberOfObstacle; t++){
                arrayX[t]=-1;
                arrayY[t]=-1;
            }
            for(int i=0; i<numberOfObstacle; i++) {

                while (arrayX[i]<0 || arrayX[i]>19) {
                    System.out.print("Can you enter (x" + i + ") the location information ? ");
                    arrayX[i] = scan.nextInt();
                    if(arrayX[i]<0 || arrayX[i]>19){
                        System.out.println("please enter a number between 0 and 20 !");
                    }
                }

                while (arrayY[i]<0 || arrayY[i]>19) {
                    System.out.print("Can you enter (y" + i + ") the location information ? ");
                    arrayY[i] = scan.nextInt();
                    if(arrayY[i]<0 || arrayY[i]>19){
                        System.out.println("please enter a number between 0 and 20 !");
                    }
                }
                grid[arrayX[i]][arrayY[i]] = 1;
            }

            for (int k=0; k<numberOfObstacle; k++){
                System.out.println("ArrayX: " + arrayX[k] + " ArrayY: " + arrayY[k]);
            }

        } // finished obstacle
    }

    public static void gridView(){
        for (int i=0; i<20; i++){
            for (int j=0; j<20; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {


        grid();
        obstacle();
        gridView();
        whichRobot();

        if(typeOfRobot.equalsIgnoreCase("Traveling")){
            travelingRobot();
        }

        selectedRobot("spider");


        // Kendime Not: robot hareket edeceği zaman konum -1,-1 e atıyor onu düzelt.


        System.out.println("The program is quits");
    }
}