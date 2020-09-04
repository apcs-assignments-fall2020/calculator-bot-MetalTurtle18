import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        return (a + b + c) - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        return (Math.abs(a) >= Math.abs(b)) ? a : b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to use median, magnitude, or pythagoras? ");
        switch (scan.next().toLowerCase()) {
            case "median":
                System.out.println("Enter three numbers one at a time: ");
                int a;
                int b;
                int c;
                try { a = scan.nextInt(); } catch (Exception e) { System.out.println("That is not a number!"); break;}
                try { b = scan.nextInt(); } catch (Exception e) { System.out.println("That is not a number!"); break;}
                try { c = scan.nextInt(); } catch (Exception e) { System.out.println("That is not a number!"); break;}
                System.out.println("Median: " + median(a, b, c));
                break;
            case "magnitude":
                System.out.println("Enter two numbers one at a time: ");
                int d;
                int f;
                try { d = scan.nextInt(); } catch (Exception e) { System.out.println("That is not a number!"); break;}
                try { f = scan.nextInt(); } catch (Exception e) { System.out.println("That is not a number!"); break;}
                System.out.println("Magnitude: " + magnitude(d, f));
                break;
            case "pythagoras":
                System.out.println("Enter two numbers one at a time: ");
                int g;
                int h;
                try { g = scan.nextInt(); } catch (Exception e) { System.out.println("That is not a number!"); break;}
                try { h = scan.nextInt(); } catch (Exception e) { System.out.println("That is not a number!"); break;}
                System.out.println("Hypotenuse: " + pythagoras(g, h));
                break;
            default:
                System.out.println("That is not an option!");
                break;
        }
    }
}
