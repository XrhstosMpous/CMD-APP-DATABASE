/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package privateschool.DbUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PSO
 */
public class Validations {
    
    
    
    
    public static boolean isNoNumbersValid(String s) {
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence) s);
        return matcher.matches();
    }
    
       public static double validDouble() {
         Scanner sc =new Scanner(System.in);  
        double nextDouble;
        do {
            if (sc.hasNextDouble()) {
                nextDouble = sc.nextDouble();
                break;
            } else {
                System.out.print("\nWrong input. Please enter a valid input: ");
                sc.next();
            }
        } while (true);
        return nextDouble;
    }
    
    public static int validInt() {
        Scanner sc=new Scanner(System.in);
        int nextInt = 0;
        do {
            if (sc.hasNextInt()) {
                nextInt = sc.nextInt();
                break;
            } else {
                System.out.print("\nWrong input. Please enter a valid input: ");
                sc.next();
            }
        } while (true);
        return nextInt;
    }
    
    
    public static boolean isValidDate(String s) {
        String regex = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence) s);
        return matcher.matches();
    }
    
    
    
}
