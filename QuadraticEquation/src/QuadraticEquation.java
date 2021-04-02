import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4 * a * c;
    }
    public void displayEquation(){
        System.out.println("Your equation is: "+this.a+" x^2 + "+this.b+" x + "+this.c+"= 0");
    }
    public void displayRoots(){
        if (this.getDiscriminant() < 0) System.out.println("The equation has no solution!");
        else if (this.getDiscriminant() == 0) System.out.println("The equation have 1 root: "+ -b/(2*a));
            else System.out.println("The equation have 2 roots is: "+ (-b+Math.pow(this.getDiscriminant(),0.5))/(2*a) + " and: "+  (-b-Math.pow(this.getDiscriminant(),0.5))/(2*a));
    }

    public static void main(String[] args) {
        System.out.println("Enter a, b, c: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation equa1 = new QuadraticEquation(a,b,c);
        equa1.displayEquation();
        equa1.displayRoots();
    }


}
