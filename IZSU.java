
package ızsu;

import java.util.*;
public class IZSU {

    
    public static void main(String[] args) {
                  int waterconsump;


            Scanner sc = new Scanner(System.in);

            System.out.println("Water Consumption?");

            waterconsump = sc.nextInt();

            double bill = 0;

            if (waterconsump <= 13 && waterconsump>=0 )
                bill = waterconsump * 6.41;

            else if (waterconsump >= 14 && waterconsump <= 20)
                bill = (13 * 6.41) + ((waterconsump - 13) * 6.92);

            else if (waterconsump >= 21)
                bill = (13 * 6.41) + (7 * 6.92) + ((waterconsump - 20) * 14.27);

            else
                System.out.println("Error Message");

            System.out.println("Total Bill Amount : " + bill * 1.08);
        }
    }

    

