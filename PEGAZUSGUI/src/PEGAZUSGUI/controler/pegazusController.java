/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PEGAZUSGUI.controler;

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
    public double poes;
    public double result;
    public double aceleration;
    public double weightR;
    public double deformation;   
     
    public void takeOutThePerimeterOfPlot(double number1, double number2,
            double number3) {

        perimeter = number1 + number2 + number3;

    }

    public void calculateTheAreaOfSurface(double equivalentdistances,
            double terrainWidth) {

        area = equivalentdistances * terrainWidth;

    }

    public void calculateMagnitudeOfAnEarthquake(float amplitude, float timeVariation) {

        magnitude = (float) (Math.log10(amplitude) + 3 * Math.log10(8 * timeVariation) - 2.85);

    }

    public void calculateWaveRange(float waveHeight, float waveReach) {

        amplitude = (waveHeight + waveReach) / 30;

    }

    public void takeOutTheTemperatureCalculator(double temperatureCelsius) {

        temperature = temperatureCelsius + 273.15;

    }

    public void calculateTheWeightOfaRock(double specificGravity, double weightW, double rockVolume) {

        weightR = specificGravity * weightW * rockVolume;

    }

    public void calculateRiverDisplacement(double speed, double time2, double aceleration2) {

        result = ((speed * time2) + (aceleration2 / 2) * (time2 * time2));

    }

    public void calculateDeformation(double force, double initialLength,
            double crossSectionalArea, double modulusElasticity) {

        deformation = (force * initialLength) / (crossSectionalArea * modulusElasticity);
   
    }

    public void calculatePoes(double reservoirArea, double reservoirThickness,
            double initialWaterSaturation, double volumetricfactor, double porosity) {
        double n = 7758;
        double n1 = 1;
        double n2 = 100;
        poes = ((n * reservoirArea * reservoirThickness * porosity)
                * (n1 - (initialWaterSaturation / n2))) / (volumetricfactor);
    }

    public void calculateAcceleration(double finalSpeed, double initialVelocity, double time) {

        aceleration = (finalSpeed - initialVelocity) / time;
    }
}
