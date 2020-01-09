/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6865.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.cameraserver.CameraServer;


public class Robot extends TimedRobot {
public Spark feed = new Spark(2);
public Spark arm = new Spark(6);

// Set Joysticks 

private Joystick bigJ = new Joystick(1);
private Joystick xBox = new Joystick(0);


// Set Constants

private final double deadZone = 0.05;

    @Override
    public void robotInit() {
        // This is called once when the robot code initializes
    	SmartDashboard.putNumber("DrivePower",0.82);
    	
    	// Camera USB
    	CameraServer.getinstance().startAutomaticCapture();
    	
    }

    @Override
    public void robotPeriodic() {
        // This is called every period regardless of mode
    	
    	
    }

    @Override
    public void autonomousInit() {
        // This is called once when the robot first enters autonomous mode
    }

    @Override
    public void autonomousPeriodic() {
        // This is called periodically while the robot is in autonomous mode
    }

    @Override
    public void teleopInit() {
        // This is called once when the robot first enters teleoperated mode
    	
    }

    @Override
    public void teleopPeriodic() {
        // This is called periodically while the robot is in teleopreated mode
    }

    @Override
    public void testInit() {
        // This is called once when the robot enters test mode
    }

    @Override
    public void testPeriodic() {
        // This is called periodically while the robot is in test mode
    }

}