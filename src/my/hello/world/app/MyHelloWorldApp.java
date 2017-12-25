/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.hello.world.app;

import java.util.Scanner;

/**
 *
 * @author missy
 */
public class MyHelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        String age = sc.next();
        System.out.println(age);
        // TODO code application logic here
    }
    
}
