package com.train

import java.util.*

fun main() {
    val scn = Scanner(System.`in`)
    var num = 0;
    do{
        println("Please enter your Box size that you want。")
        print("Please enter object's length(cm): ");
        var length = scn.nextFloat();

        print("Please enter object's width(cm): ");
        var width = scn.nextFloat();

        System.out.print("Please enter object's height(cm): ");
        var height = scn.nextFloat();


        boxRecommend(length, width, height)

        println("Try again(1); Quit(-1)。");
        print("Your choice: ")
        num = scn.nextInt();

    }while (num != -1)
    println("Thank you")
}

private fun boxRecommend(length: Float, width: Float, height: Float) {
    val box3 = Box3();
    val box5 = Box5();

    if (box3.validate(length, width, height)) {
        println("Recommended box size: Box3");
    } else if (box5.validate(length, width, height)) {
        println("Recommended box size: Box5");
    } else {
        println("Sorry，No box can use!");
    }
}

open class Box(var length: Float, var width: Float, var height: Float){

     fun validate(length: Float, width: Float, height: Float) =
        length < this.length && width < this.width && height < this.height
}
//Box3: 長23，寬14，高13 (cm)
class Box3(): Box(23f,14f,13f)
//Box5: 長39.5，寬27.5，高23 (cm)
class Box5(): Box(39.5f,27.5f,23f)