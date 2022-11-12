package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.quealcomm.robotcore.hardware.Motor;

@TeleOp(name = "SA3 T2 (Blocks to Java)", group = "SA3'sPrograms")
public class firstop2test extends LinearOpMode {

  private Motor Motor1;

  /**
   * Describe this function...
   */
  @Override
  public void runOpMode() {

    Motor1 = hardwareMap.Motor.get("Motor1");

    waitForStart();
    while (opModeIsActive()) {
      if (gamepad1.y) {
        Motor1.setPower(-5);
      } else {
        Motor1.setPower(0);
      }
      if (gamepad1.b) {
        Motor1.setPower(5);
      }
      if (gamepad1.x) {
        Motor1.setPower(-5);
      } else {
        Motor1.setPower(0);
      }
      if (gamepad1.a) {
        Motor1.setPower(5);
      } else {
        Motor1.setPower(0);
      }
    }
  }
}
