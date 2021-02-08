/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegazus;
import java.util.Scanner;
/**
 *
 * @author FAMILIA TONATO
 */
public class PEGAZUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

             do {
            System.out.println(" ========= PEGAZUS =========");
            System.out.println("1. -> ** Perimeter of  Plot** ");
            System.out.println("2. -> ++ Area of Surface ++ ");
            System.out.println("3. -> ** Magnitude of an Earthquake ** ");
            System.out.println("4. -> ++ Tidal Range ++");
            System.out.println("5. -> :( Exit :( ");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    Perimeterofplot(input);
                    break;
                
                case 2:
                    Areaofsurface(input);
                    break;
                
               
                case 4:

                    float tallheight;
                    float lowheight;
                    float amplitude1;
                    System.out.println(" Tallheight -> ");
                    tallheight = input.nextFloat();
                    System.out.println(" Lowheight -> ");
                    lowheight = input.nextFloat();
                    amplitude1= tallheight - lowheight;
                    
                    System.out.println(" Tidal Range " + amplitude1);
                    break;
               
                case 5:
                    System.out.println(" THANKKS FOR USING OUR PROGRAM ");                 
                    System.exit(0); 
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
    }

    private static void Perimeterofplot(Scanner input) {
        double number1;
        double number2;
        double number3;
        double perimeter;
        System.out.println(" Enter Side1 -> ");
        number1 = input.nextFloat();
        System.out.println(" Enter Side2 -> ");
        number2 = input.nextFloat();
        System.out.println(" Enter Side3 -> ");
        number3 = input.nextFloat();
        perimeter = number1 + number2 + number3;
        
        System.out.println(" Perimeter of  Plot is --> " + perimeter);
    }

    private static void Perimeterofplot(Scanner input) {
        double number1;
        double number2;
        double number3;
        double perimeter;
        System.out.println(" Enter Side1 -> ");
        number1 = input.nextFloat();
        System.out.println(" Enter Side2 -> ");
        number2 = input.nextFloat();
        System.out.println(" Enter Side3 -> ");
        number3 = input.nextFloat();
        perimeter = number1 + number2 + number3;
        
        System.out.println(" Perimeter of  Plot is --> " + perimeter);
    }
    
}
