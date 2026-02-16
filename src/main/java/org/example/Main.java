package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (!isBarking) {
            return false;
        }
        if (clock < 0 || clock > 23) {
            return false;
        }

        switch (clock) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
            case 20: case 21: case 22: case 23:
                return true;
            default:
                return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if (firstAge >= 13 && firstAge < 19 || secondAge >= 13 && secondAge < 19 || thirdAge >= 13 && thirdAge < 19) {
           return true;
       } else {
           return false;
       }
    }



    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            if (temp >= 25 && temp <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp >= 25 && temp <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static double area(double width, double height) {
       if (width < 0 || height < 0) {
           return -1;
       }

       if (width == 0 || height == 0) {
           return 0;
       }

       return width * height;
    }

    public static double area(double radius) {

       if (radius < 0) {
           return -1;
       }

        double pi = Math.PI;

       return radius * radius * pi;
    }
}
