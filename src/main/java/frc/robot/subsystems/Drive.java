/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.nerdherd.lib.drivetrain.experimental.ShiftingDrivetrain;
import com.nerdherd.lib.motor.motorcontrollers.CANMotorController;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.nerdherd.lib.motor.motorcontrollers.NerdyFalcon;
import com.nerdherd.lib.pneumatics.Piston;

import frc.robot.RobotMap;


public class Drive extends ShiftingDrivetrain {
  /**
   * Creates a new ExampleSubsystem.
   */
  public Drive() {
    super(new NerdyFalcon(RobotMap.kLeftParentTalonID), 
    new NerdyFalcon(RobotMap.kRightParentTalonID), 
    new CANMotorController[] {new NerdyFalcon(RobotMap.kLeftChildTalonID)}, 
    new CANMotorController[] {new NerdyFalcon(RobotMap.kRightChildTalonID)}, true, false, 
    new Piston(RobotMap.kShifterPort1ID, RobotMap.kShifterPort2ID), RobotMap.kTrackWidth);

  }
    
    

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
