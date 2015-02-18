package org.usfirst.frc.team1899.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends SampleRobot {
    
    Joystick stick;
    Encoder encoder1;
    Encoder encoder2;
    Encoder encoder3;
    Encoder encoder4;
    
    public Robot() {
        stick = new Joystick(0);
        encoder1 = new Encoder(1,2);
        encoder2 = new Encoder(3,4);
        encoder3 = new Encoder(5,6);
        encoder4 = new Encoder(7,8);
    }
    
    public void operatorControl() {
        while(true) {
            System.out.println(
                    encoder1.get() + " " + 
                    encoder2.get() + " " + 
                    encoder3.get() + " " +
                    encoder4.get());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void autonomous() {
        
    }

    public void test() {
        
    }
}