package pegazus;
import java.util.Scanner;
/**
 *
 * @author Rodrigo Soria
 */
public class PEGAZUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        double result;
        
        Scanner input = new Scanner(System.in);

        boolean mainLoop = true;
        int option;

        do {
            option = readOptionfromMenu();

            switch (option) {

                case 1:
                    System.out.println(" Enter Side1 -> " + " m ");
                    number1 = input.nextFloat();
                    System.out.println(" Enter Side2 -> " + " m ");
                    number2 = input.nextFloat();
                    System.out.println(" Enter Side3 -> " + " m ");
                    number3 = input.nextFloat();
                      
                    perimeter = takeOutThePerimeterOfPlot(number1, number2, number3);
                    System.out.println(" Perimeter of  Plot is --> " + perimeter + " m ");
                    break;

                case 2:
                    System.out.println(" Enter length Of Terrain -> " + " m ");
                    equivalentdistances = input.nextFloat();
                    System.out.println(" Enter Terrain Width -> " + " m ");
                    terrainWidth = input.nextFloat();
                    area = calculateTheAreaOfSurface(equivalentdistances, terrainWidth);
                    System.out.println(" Area of Surface -->" + area + " m ^2 ");
                    break;

                case 3:
                    System.out.println(" Amplitude -> " + " km ");
                    amplitude = input.nextFloat();
                    System.out.println(" Time of varation -> " + " s ");
                    timevariation = input.nextFloat();
                    magnitude = calculateMagnitudeOfAnEarthquake(amplitude, timevariation);
                    System.out.println(" Magnitude of an Earthquake " + magnitude + " Grados en la escala de Richter ");
                    break;

                case 4:
                    System.out.println(" Wave Lenght -> " + " km ");
                    waveheight = input.nextFloat();
                    System.out.println(" Life time of Wave -> " + " s ");
                    reacWheight = input.nextFloat();
                    amplitude1 = calculateWaveRange(waveheight, reacWheight);
                     System.out.println(" Tidal Range " + amplitude1);
                    break;
                case 5:
                    System.out.println(" insert temperature in °C -> ");
                    celsius = input.nextDouble();
                    temperature = takeOutTheTemperatureCalculator(celsius);
                    System.out.println(" The temperature in " + temperature + " °k ");
                    break;
                case 6:
                    System.out.println(" Enter the final Speed -> " + " m/s ");
                    finalSpeed = input.nextFloat();
                    System.out.println(" Enter the initilVelocity -> " + " m/s ");
                    initialVelocity = input.nextFloat();
                    System.out.println(" Enter the time -> " + " s ");
                    time = input.nextFloat();
                    aceleration = calculateAcceleration(finalSpeed, initialVelocity, time);
                    System.out.println(" The aceleration is " + aceleration + " m/s^2 ");
                    break;
                case 7:
                    System.out.println(" Enter the specific Gravity -> ");
                    specificGravity = input.nextFloat();
                    System.out.println(" Enter the water weight -> " + "N/(m)^3");
                    weightW = input.nextFloat();
                    System.out.println(" Enter the rock Volume -> " + "m^2");
                    rockVolume = input.nextFloat();
                    weightR = calculateTheWeightOfaRock( rockVolume,specificGravity, weightW);
                    System.out.println(" The Rock Weight " + weightR + " N/m ");
                    break;
                case 8:
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("Calculate Displacement");
                    System.out.println("Formula: x = vo*t + 1/2 a * t^2 ");
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("Enter vo--> " + "m/s");
                    speed = input.nextDouble();
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("Enter t--> " + "s");
                    time2 = input.nextDouble();
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    System.out.println("Enter a-->" + "m/s^2");
                    aceleration2 = input.nextDouble();
                    result = calculateRiverDisplacement(speed, time2, aceleration2);
                    System.out.println("** RESPUESTA ****");
                    System.out.println("x = " + speed + "*" + time2 + " + 1/2 *" + aceleration2 + " * " + time2 + "^2");
                    System.out.println("x = " + result + " m/s ");
                    break;
                case 9:
                    System.out.println(" Enter the value of Applied Force -> " + "kg");
                    Force = input.nextDouble();
                    System.out.println(" Enter the Lenght of -> " + "m");
                    initialLength = input.nextDouble();
                    System.out.println(" Enter the Cross-sectional Area -> " + "m^2");
                    crossSectionalArea = input.nextDouble();
                    System.out.println(" Enter the value of Modulus of Elasticity -> " + "kg/cm^3");
                    modulusElasticity = input.nextDouble();

                    deformation = calculateDeformation(Force, initialLength, crossSectionalArea, modulusElasticity);
                    System.out.println(" The deformation value is -> " + Force + " * " + initialLength + " / "
                     + crossSectionalArea + " * " + modulusElasticity + " = " + deformation + " um/m 7"
                     + "");
                    break;
                case 10:
                    System.out.println(" Enter the Area of Deposit -> " + "acres");
                    reservoirArea = input.nextDouble();
                    System.out.println(" Enter the Depth of Deposit -> " + "km");
                    reservoirThickness = input.nextDouble();
                    System.out.println(" Enter the value of Porosity ø -> " + "%");
                    porosity = input.nextDouble();
                    System.out.println(" Enter the value of Volumetric Factor -> " + "m^3");
                    volumetricfactor = input.nextDouble();
                    System.out.println(" Enter the value of initial water saturation -> " + "%");
                    initialWaterSaturation = input.nextDouble();

                    poes = calculatePoes(reservoirArea, reservoirThickness, initialWaterSaturation, volumetricfactor);
                    System.out.println(" The POES is -> " + ((n + " * " + reservoirArea + " * " + reservoirThickness) + " * "
                    + ((n1 + " - " + initialWaterSaturation + "/" + n2))) + " / " + (volumetricfactor) + " = " + poes + " acres ");
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

    private static double takeOutThePerimeterOfPlot(double number1, double number2,
            double number3) {
        double perimeter;
        perimeter = number1 + number2 + number3;
        return perimeter;
    }

    private static double calculateTheAreaOfSurface(double equivalentdistances,
            double terrainWidth) {
        double area;
        area = equivalentdistances * terrainWidth;
        return area;
    }

    private static float calculateMagnitudeOfAnEarthquake(float amplitude,
            float timevariation) {
float magnitude;
        magnitude = (float) (Math.log10(amplitude) + 3 * Math.log10(8 * timevariation) - 2.85);
        return magnitude;
    }

    private static float calculateWaveRange(float waveheight,
            float reacWheight) {
        float amplitude1;
        amplitude1 = waveheight - reacWheight;
       return amplitude1;
    }

    private static double takeOutTheTemperatureCalculator(double celsius
            ) {
        double temperature;

        temperature = celsius + 273.15;
       return temperature;
    }

    public static double calculateAcceleration(double finalSpeed, double initialVelocity,
            double time) {
        double aceleration;
        aceleration = (finalSpeed - initialVelocity) / time;

        return aceleration;
    }

    private static double calculateTheWeightOfaRock( double specificGravity,
            double weightW, double rockVolume) {
        double weightR;
        weightR = specificGravity * weightW * rockVolume;
       return weightR;

    }

    private static double calculateRiverDisplacement(double speed, double time2, double aceleration2) {

        double result;
        result = ((speed * time2) + (aceleration2 / 2) * (time2 * time2));
        return result;
        

    }

    private static double calculateDeformation(double Force, double initialLength,
            double crossSectionalArea, double modulusElasticity) {
        double deformation;
        deformation = (Force * initialLength) / (crossSectionalArea * modulusElasticity);
        return deformation;

    }

    private static double calculatePoes(double reservoirArea, double reservoirThickness,
            double initialWaterSaturation, double volumetricfactor) {
        double n = 7758;
        double n1 = 1;
        double n2 = 100;
        double poes;
        poes = ((n * reservoirArea * reservoirThickness)
                * (n1 - (initialWaterSaturation / n2))) / (volumetricfactor);
        return poes;
    }

    private static int readOptionfromMenu() {
        int option;
        Scanner input = new Scanner(System.in);
        printMenu();
        option = input.nextInt();
        return option;
    }

    private static void printMenu() {
        System.out.println(" ========= PEGAZUS =======");
        System.out.println("1. -> Perimeter of  Plot ");
        System.out.println("2. -> Area of Surface");
        System.out.println("3. -> Magnitude of an Earthquake");
        System.out.println("4. -> Wave Range");
        System.out.println("5. -> Temperature calculator");
        System.out.println("6. -> Calculate the River Acceleration ");
        System.out.println("7. -> calculate The Weight Of a Rock");
        System.out.println("8. -> Calculate River Displacement -> ");
        System.out.println("9. -> Deformation of material ");
        System.out.println("10. -> Calculate Oil on Site ");
        System.out.println("11. -> Exit");
        System.out.println(" Enter your menu option --> ");
    }

}
