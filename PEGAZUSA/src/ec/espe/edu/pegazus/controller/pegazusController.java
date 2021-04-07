/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.pegazus.controller;

/**
 *
 * @author Shirley
 */
public class pegazusController {
    public double perimeter;
    public double area;
    public double magnitude;
    public double amplitude;
    public double temperature;
    public void takeOutThePerimeterOfPlot(double number1, double number2,
        double number3) {
       
        perimeter = number1 + number2 + number3;
        
    }
     public void calculateTheAreaOfSurface(double equivalentdistances,
        double terrainWidth) {
      
        area = equivalentdistances * terrainWidth;
        
    }
    public void calculateMagnitudeOfAnEarthquake(float amplitude,float timeVariation) {
        
        magnitude = (float) (Math.log10(amplitude) + 3 * Math.log10(8 * timeVariation) - 2.85);
        
        
    }
     public void calculateWaveRange(float waveHeight,float waveReach) {
        
        amplitude = (waveHeight + waveReach)/30;
       
       
    }
     public void takeOutTheTemperatureCalculator(double temperatureCelsius) {
       

        temperature = temperatureCelsius + 273.15;
       
       
    }
     

}
