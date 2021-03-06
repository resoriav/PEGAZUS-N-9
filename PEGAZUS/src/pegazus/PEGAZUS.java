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
                    double perimeter = 0;
                    double equivalentdistances;
                    double terrainWidth;
                    double area = 0;
                    float amplitude;
                    float timevariation;
                    float magnitude = 0;
                    float waveheight;
                    float reacWheight;
                    float amplitude1 = 0;
                    double celsius;
                    double temperature = 0;
                    double finalSpeed;
                    double initialVelocity;
                    double time;
                    double aceleration = 0;
                    double weightR = 0;
                    double specificGravity;
                    double weightW;
                    double rockVolume;
                    double speed;
                    double time2;
                    double aceleration2;
                    double n = 7758;
                    double n1 = 1;
                    double n2 = 100;
                    double reservoirArea;
                    double reservoirThickness;
                    double porosity;
                    double volumetricfactor;
                    double initialWaterSaturation;
                    double poes;
                    double deformation;
                    double Force;
                    double initialLength;
                    double crossSectionalArea;
                    double modulusElasticity;  
               
             switch (option) {

                case 1:
                     System.out.println(" Enter Side1 -> " + " m ");
                     number1 = input.nextFloat();
                     System.out.println(" Enter Side2 -> " + " m ");
                     number2 = input.nextFloat();
                     System.out.println(" Enter Side3 -> " + " m ");
                     number3 = input.nextFloat();
                     takeOutThePerimeterOfPlot( number1, number2, number3, perimeter);
                     break;
                
                case 2:
                  System.out.println(" Enter length Of Terrain -> " + " m ");
                  equivalentdistances = input.nextFloat();
                  System.out.println(" Enter Terrain Width -> " + " m ");
                  terrainWidth = input.nextFloat();
                    calculateTheAreaOfSurface(equivalentdistances,terrainWidth, area);
                    break;
               
                case 3:
                   System.out.println(" Amplitude -> " + " km ");
                   amplitude = input.nextFloat();
                   System.out.println(" Time of varation -> " + " s ");
                   timevariation = input.nextFloat();
                    calculateMagnitudeOfAnEarthquake(amplitude, timevariation, magnitude);
                    break;
               
                case 4:
                     System.out.println(" Wave Lenght -> " + " km ");
                     waveheight = input.nextFloat();
                     System.out.println(" Life time of Wave -> " + " s ");
                     reacWheight = input.nextFloat();
                     calculateWaveRange( waveheight, reacWheight, amplitude1);
                    break;
                case 5 :
                    System.out.println(" insert temperature in °C -> ");
                    celsius = input.nextDouble();
                    takeOutTheTemperatureCalculator( celsius, temperature);
                    break;
