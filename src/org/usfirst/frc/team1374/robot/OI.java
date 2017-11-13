package org.usfirst.frc.team1374.robot;


import org.usfirst.frc.team1374.robot.Util.Xbox360Controller;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Xbox360Controller Driver = new Xbox360Controller(0,0.15);
    public static boolean shiftdown() {return Driver.getButtonA();}
    public static boolean shiftup() {return Driver.getButtonB();}


    public static double getDriverSpeed()
        {
            return Driver.getRightTrigger()- Driver.getLeftTrigger();
        }
    public static double getSteer ()
    {
        return Driver.getLeftXAxis();
    }

    /**Usage:
     *
     * private static final Xbox360Controller JS_DRIVER = new Xbox360Controller(int port,double deadzone)
     *
     * Example:
     *
     * public static void getDriverSpeed()
     * {
     * return DRIVER.getRightTrigger() - DRIVER.getLeftTrigger()
     * }
     */
}

