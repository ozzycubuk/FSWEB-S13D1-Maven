package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock<0 || clock>23){
            return false;
        }
        if(isBarking && clock>8 || clock<20){
            return true;
        }else{
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if((firstAge >=13 && firstAge <=19) || (secondAge >=13 && secondAge <=19) || (thirdAge >=13 && thirdAge <=19) ){
           return true;
       }else {
           return false;
       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;  // Yaz ise üst limit 45, değilse 35
        return temp >= 25 && temp <= upperLimit; // Oyun oynama koşulu
    }

    public static double area(double width, double height) {
        // Eğer negatif değer girilmişse -1 döndür
        if (width < 0 || height < 0) {
            return -1;
        }
        // Alan hesaplama
        return width * height;
    }

    public static double area(double radius) {
        // Negatif değer kontrolü
        if (radius < 0) {
            return -1;
        }
        // Alan hesaplama
        return radius * radius * Math.PI;
    }
}
