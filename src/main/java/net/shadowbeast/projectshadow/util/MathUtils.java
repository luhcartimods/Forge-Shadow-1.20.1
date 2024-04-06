package net.shadowbeast.projectshadow.util;

public class MathUtils {
    public static double toRadians(double degrees) {
        double pi = 3.14159265359;
        return degrees * pi / 180;
    }
    public static double toDegrees(double radians) {
        return radians * 57.2957795f;
    }

    public static double getRelative(String axis, double yaw, double pitch, float radius) {
        double x;
        double y;
        double z;
        x = Math.sin(toRadians(yaw)) * radius * Math.sin(toRadians(pitch));
        z = Math.cos(toRadians(yaw)) * radius * Math.sin(toRadians(pitch));
        y = Math.cos(toRadians(pitch)) * radius;
        return switch (axis) {
            case "x" -> x;
            case "z" -> z;
            case "y" -> y;
            default -> 0;
        };
    }
}
