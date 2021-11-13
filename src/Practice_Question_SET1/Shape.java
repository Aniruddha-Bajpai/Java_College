//Q1) Write a program to create a class named shape.
// It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively

package Practice_Question_SET1;

import java.util.*;
class Shape
{
    public static void main(String[] args) {
        draw();
        erase();
    }
    public static void draw(){
        System.out.println("Drawing Shape");
    }
    public static void erase(){
        System.out.println("Erasing Shape");
    }
}