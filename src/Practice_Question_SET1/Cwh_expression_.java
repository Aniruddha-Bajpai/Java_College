package com;
import java.util.*;
public class Cwh_expression_ {
    public static void main(String[] args) {
        int v,u,a,s;
        Scanner in = new Scanner(System.in);
        v = in.nextInt();
        u = in.nextInt();
        a = in.nextInt();
        s = in.nextInt();
        int exp = (v*v-u*u)/(2*a*s);
        System.out.println(exp);
    }
}
