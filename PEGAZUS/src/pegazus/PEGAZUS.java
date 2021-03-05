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
            option = printDatesMenus(input);
                    double number1;
                    double number2;
                    double number3;
                    double perimeter;
           
            switch (option) {

                case 1:
                    takeOutThePerimeterOfPlot(input);
                    break;
                
                case 2:
                  
                    calculateTheAreaOfSurface(input);
                    break;
               
                case 3:
                   
                    calculateMagnitudeOfAnEarthquake(input);
                    break;
               
                case 4:
                    
                    calculateWaveRange(input);
                    break;
                case 5 :
                    
                    takeOutTheTemperatureCalculator(input);
                    break;
                case 6:
                    
                    calulateTheCoordinatePolar(input);
                    break;
                case 7:  
                    
                    calculateAirTime(input);
                    break;
                case 8:
                    calculateDisplacement(input);
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    System.out.println(" THANKKS FOR USING OUR PROGRAM ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 11);
        
        
    }

    private static int printDatesMenus(Scanner input) {
        int option;
        System.out.println(" ========= PEGAZUS =======");
        System.out.println("1. -> Perimeter of  Plot ");
        System.out.println("2. -> Area of Surface");
        System.out.println("3. -> Magnitude of an Earthquake");
        System.out.println("4. -> Tidal Range");
        System.out.println("5. -> temperature calculator");
        System.out.println("6. -> calculate polar coordinates");
        System.out.println("7. -> Calculate the Air and Time");
        System.out.println("8. -> Calculate Displacement -> ");
        System.out.println("9. -> -> ");
        System.out.println("10. ->  -> ");
        System.out.println("11. -> Exit");
        System.out.println("Enter your menu option --> ");
        option = input.nextInt();
        return option;
    }

    private static void calculateWaveRange(Scanner input) {
        float tallheight;
        float lowheight;
        float amplitude1;
        System.out.println(" Tallheight -> ");
        tallheight = input.nextFloat();
        System.out.println(" Lowheight -> ");
        lowheight = input.nextFloat();
        amplitude1= tallheight - lowheight;
        System.out.println(" Tidal Range " + amplitude1);
    }

    private static void calculateMagnitudeOfAnEarthquake(Scanner input) {
        float amplitude;
        float timevariation;
        float magnitude;
        System.out.println(" Amplitude -> ");
        amplitude = input.nextFloat();
        System.out.println(" Time of varation -> ");
        timevariation = input.nextFloat();
        magnitude = (float)(Math.log10(amplitude)+ 3 * Math.log10(8 * timevariation)-2.85);
        System.out.println(" Magnitude of an Earthquake " + magnitude);
    }

    private static void calculateTheAreaOfSurface(Scanner input) {
        double equivalentdistances;
        double bandwidth;
        double area;
        System.out.println(" Enter Equivalentdistances -> ");
        equivalentdistances = input.nextFloat();
        System.out.println(" Enter Bandwidth -> ");
        bandwidth = input.nextFloat();
        area = equivalentdistances*bandwidth ;
        System.out.println(" Area of Surface -->" + area);
    }

    
    }
    private static void takeOutTheTemperatureCalculator(Scanner input){
        double F;
        double C;
        double K;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter values ​​in degrees Fahrenhei: ");
        
        F=input.nextFloat();
        C= (F- 32) * 5 / 9;
        K= (F- 32) * 5 / 9 + 273;
       
        System.out.println("Transformed to centigrade they are;" + C);
      
        System.out.println(" Transformed to degrees Kelvin " + K);
        System.out.println();
}
 public static void calulateTheCoordinatePolar(Scanner input) {
     double polarCoordinateX;
        double polarCoordinateY;
        double pi = 3.14F;
        double x;
        double y;
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter  coordinate X ");
        x = input.nextInt();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter coordinate Y  ");
        y = input.nextInt();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("transformed to polar coordinates ");
        System.out.println();
        
        polarCoordinateX = calculateModuleCoordianteX(x, y);
        
        polarCoordinateY = calculateModuleCoordinateX(y, x, pi);
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
       
        System.out.println("Your polar coordinate " + "➙" + polarCoordinateX + " , " + polarCoordinateY + "←");
        System.out.println();
 }
  private static float calculateModuleCoordinateX
        (double y, double x, double pi) {
        double polarCoordinateX;
        polarCoordinateX = (double) Math.atan(y / x) * (180 / pi);
        return (float) polarCoordinateX;
    
    
}
 private static float calculateModuleCoordianteX
        (double x,double y) {
        double polarCoordinateX;
 
        double X;
        X = (float) Math.pow(x, 2);
        double Y;
        Y = (double) Math.pow(y, 2);
         polarCoordinateX= (double) Math.sqrt(X + Y);
        return (float)polarCoordinateX;
        }
         private static void calculateAirTime(Scanner input) {
        double total;
        double ang;
        double vini;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Calculate Air Time");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter Initial Speed--> ");
        vini=Entrada.nextFloat();
        
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter Angle--> ");
        ang=Entrada.nextDouble();
        total=(((2*vini)*Math.sin(ang))/9.8);
        
        System.out.println("****************** RESPUESTA ********************");
        System.out.println("total = (((2 *" + vini+ ") * Math.sin(" + ang + "))/9.8)");
        System.out.println("Time in the Air-->" + total + "S");
        System.out.println();
    }    
         private static void calculateDisplacement(Scanner input) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Calculate Displacement");
        System.out.println("Formula: x = vo*t + 1/2 a * t^2 ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter vo--> ");
        double velocidad = lector.nextDouble();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter t--> ");
        double time = lector.nextDouble();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Enter a-->");
        double aceleration = lector.nextDouble();
        double resultado = ((velocidad * time) + (aceleration / 2) * (time * time));
        System.out.println(" ");
        System.out.println("****************** RESPUESTA ********************");
        System.out.println("x = " + velocidad + "*" + time + " + 1/2 *" + aceleration + " * " + time + "^2");
        System.out.println("x = " + resultado);
        System.out.println("************************************************");
}
         
}
