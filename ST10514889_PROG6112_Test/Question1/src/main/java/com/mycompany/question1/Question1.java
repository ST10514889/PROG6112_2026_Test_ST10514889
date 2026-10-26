/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;
import java.util.Scanner;
/**
 *
 * @author nemat
 */
public class Question1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int electronicSales [][] = new int [4][4];
         
        String cities [] = {"Cape Town", "Port Elizibeth", "Pretoria"};
        
        int psSales [] = {1000, 2000, 3000};
        
        int xboxSales [] = {2000, 3000, 4000};
                
        int switchSales [] = {1500, 1100, 1200};
                
        System.out.println("-------------------------------------------------------------------------\nGAMING CONSOLE REPORT\n-------------------------------------------------------------------------");
        
        System.out.println("\t\tPS5\tXBOX\tSWITCH"); 
        
        for (int i = 0; i < cities.length; i++) {
            
            System.out.println(cities[i] );
           
            System.out.printf("\t\t%04d", psSales[i]);
            System.out.printf("\t\t%04d", xboxSales[i]);
            System.out.printf("\t\t%04d", switchSales[i]);
            System.out.println();
        
            
        }
        
        System.out.println("-------------------------------------------------------------------------\nCONSLE SALES TOTALS FOR EACH CITY\n-------------------------------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            
        }
    }
}
