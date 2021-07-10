package com.tom.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Please enter your Box size that you want。");
            System.out.print("Please enter object's length(cm): ");
            float length = scanner.nextFloat();

            System.out.print("Please enter object's width(cm): ");
            float width = scanner.nextFloat();

            System.out.print("Please enter object's height(cm): ");
            float height = scanner.nextFloat();

            boxRecommend(length, width, height);

            System.out.println("Try again(1); Quit(-1)。");
            System.out.print("Your choice: ");
            num = scanner.nextInt();
        }while (num != -1);

        System.out.println("Thank you");

    }

    private static void boxRecommend(float length, float width, float height) {
        Box3 box3 = new Box3(length, width, height);
        Box5 box5 = new Box5(length, width, height);

        if(box3.validate(length, width, height)){
            System.out.println("Recommended box size: Box3");
        }else if(box5.validate(length, width, height)){
            System.out.println("Recommended box size: Box5");
        }else {
            System.out.println("Sorry，No box can use!");
        }
    }
}
