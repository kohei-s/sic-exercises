package mars;

public class MarsRobot {

    String status;
    int speed;
    float temperature;
    int batteryLevel;

    void checkTemperature() {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
        System.out.println("Battery Level: " + batteryLevel);
    }

    void checkBatteryLevel() {
        if (batteryLevel < 3) {
            status = "Stop moving";
            speed = 0;
        }
        System.out.println("Battery Level ist more than 3");
    }

}
