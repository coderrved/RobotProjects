package com.company;

import javax.swing.*;
import java.awt.*;

public class UseOfGraphics extends JPanel {

    Main main = new Main();
    @Override
    public void paint(Graphics g) {
        super.paint(g);

            g.setColor(Color.BLACK);
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    g.drawRect(i * 30, j * 30, 30, 30);

                }
            }

            main.grid();
            String obstacleControl = main.obstacle();

            if (obstacleControl.equalsIgnoreCase("yes")) {
                for (int i = 0; i < main.numberOfObstacle; i++) {
                    g.fillRect(main.arrayX[i] * 30, main.arrayY[i] * 30, 30, 30);
                }
            }

            main.gridView();
            main.whichRobot();

        if(main.typeOfRobot.equalsIgnoreCase("Traveling")){
            g.setColor(Color.RED);
            main.travelingRobot();
            g.fillRect(main.travelingRobotX * 30, main.travelingRobotY * 30, 30, 30);
        }

        main.selectedRobot("Spider");

    }

    public UseOfGraphics() {

        setBackground(Color.WHITE);
    }

    @Override
    public void repaint() {
        super.repaint();
    }
}
