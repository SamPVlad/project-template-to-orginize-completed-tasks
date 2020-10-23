package conditional.operator;

import java.util.Scanner;

/*
 * Task:
 * Create a program that will ask the user about a solar system planet they want to visit.
 * And calculate the weight according to the user choose that they would have there.
 * The weight might be calculated using the following formula: weight = mass * surface gravity.
 * The "mass", "planet" should be asked from the user using Scanner class.
 * You MUST use only the different flavors of the "if" operator in this task.
 */

    public class WeightOnSolarSystemPlanets {
        public static void main(String[] args) {
            int m = 2;
            final double SURFACE_GRAVITY_ON_MERCURY = 0.155;
            final double SURFACE_GRAVITY_ON_VENUS = 0.8975;
            final double SURFACE_GRAVITY_ON_EARTH = 1.000;
            final double SURFACE_GRAVITY_ON_MOON = 0.1660;
            final double SURFACE_GRAVITY_ON_MARS = 0.3507;
            final double SURFACE_GRAVITY_ON_JUPITER = 2.5374;
            final double SURFACE_GRAVITY_ON_SATURN = 1.0677;
            final double SURFACE_GRAVITY_ON_URANUS = 0.8947;
            final double SURFACE_GRAVITY_ON_NEPTUNE = 1.1794;
            final double SURFACE_GRAVITY_ON_PLUTO = 0.0899;

            // your code here
            System.out.println("What solor system planet do you want to visit?" + System. lineSeparator() + 
                    "MERCURY, VENUS, EARTH, MOON, MARS, JUPITER, MARS, SATURN, URANUS, NEPTUNE, PLUTO" );
            Scanner scanner = new Scanner(System.in);
            String planet = (scanner.nextLine()).toUpperCase();

            System.out.println("What mass do you have?");
            Scanner scanner1 = new Scanner(System.in);
            double mass = scanner1.nextDouble();

            if (planet.equals("MERCURY"))    {
                double weight = mass * SURFACE_GRAVITY_ON_MERCURY;
                System.out.println("You weght on MERCURY " + weight);
                System.out.println();
            } else if (planet.equals("VENUS")) {
                double weight = mass * SURFACE_GRAVITY_ON_VENUS;
                System.out.println("You weght on VENUS " + weight);
            } else if (planet.equals("EARTH")) {
                double weight = mass * SURFACE_GRAVITY_ON_EARTH;
                System.out.println("You weght on EARTH " + weight);
            } else if (planet.equals("MERCURY")) {
                double weight = mass * SURFACE_GRAVITY_ON_MERCURY;
                System.out.println("You weght on MERCURY " + weight);
            } else if (planet.equals("MOON")) {
                double weight = mass * SURFACE_GRAVITY_ON_MOON;
                System.out.println("You weght on MOON " + weight);
            } else if (planet.equals("JUPITER")) {
                double weight = mass * SURFACE_GRAVITY_ON_JUPITER;
                System.out.println("You weght on JUPITER " + weight);
            } else if (planet.equals("MARS")) {
                double weight = mass * SURFACE_GRAVITY_ON_MARS;
                System.out.println("You weght on MARS " + weight);
            } else if (planet.equals("SATURN")) {
                double weight = mass * SURFACE_GRAVITY_ON_SATURN;
                System.out.println("You weght on SATURN " + weight);
            } else if (planet.equals("URANUS")) {
                double weight = mass * SURFACE_GRAVITY_ON_URANUS;
                System.out.println("You weght on URANUS " + weight);
            } else if (planet.equals("NEPTUNE")) {
                double weight = mass * SURFACE_GRAVITY_ON_NEPTUNE;
                System.out.println("You weght on NEPTUNE " + weight);
            } else if (planet.equals("PLUTO")) {
                double weight = mass * SURFACE_GRAVITY_ON_PLUTO;
                System.out.println("You weight on PLUTO " + weight);
            } else {
                System.out.println("Error. Try again!");
            }
        }
    }
  