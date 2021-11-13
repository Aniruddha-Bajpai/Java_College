package com;
class emp {
    public void show (){
        System.out.println("Welcome");
    }
}
//Execution class
public class demo3{
    public static void main(String[] args) {
//        emp obj = new emp();
//        obj.show();
//        Anonyous object used only for one time usage
    new emp().show();
    }
}
