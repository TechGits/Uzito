import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

JFrame frame = new JFrame("Hello World Java Swing");

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the Module code: ");
        String ModCode = scanner.next();

        System.out.print("Thanks. And how many components does " + ModCode + " have? : ");
        int numComp = scanner.nextInt();
       

        // Create arrays to store the component marks and weights
        double[] componentMarks = new double[numComp];
        double[] componentWeights = new double[numComp];

        // This sets up a loop that iteratats a how many component weights the user enters (based on numComp of course)

        for (int i = 0; i < numComp; i++) {
            System.out.print("Enter mark for component " + (i + 1) + ": ");
            componentMarks[i] = scanner.nextDouble();
        }

         // Let's now create an object, and call it 'studModMark'. The 'studModMark' object we're creating is an instance of the 'Module' class. In this case, the object is based on the user inputted number of compnent marks (numComp)

        Module studModMark = new Module(componentMarks);

      
        // This sets up a loop that iteratats a how many component weights the user enters (based on numComp of course)
        for (int i = 0; i < numComp; i++) {
            System.out.print("Enter weight for component " + (i + 1) + ": ");
            componentWeights[i] = scanner.nextDouble();
        }

        studModMark.setComponentWeights(componentWeights);

        // Call the calculateModMark() method and store the result in a variable
        double calculatedMark = studModMark.calculateModMark();

        System.out.println("Thank You. Your module mark for " + ModCode + " is: " + calculatedMark);
        
        scanner.close();
    }
         
}

class Module {
    // Instance variables to store component marks and weights
    private double[] componentMarks;
    private double[] componentWeights;

    // Constructor to initialize the component marks
    public Module(double... componentMarks) {
        this.componentMarks = componentMarks;
    }

    // Method to set the component weights
    public void setComponentWeights(double... componentWeights) {
        this.componentWeights = componentWeights;
    }

    // Method to calculate the module mark based on component marks and weights
    public double calculateModMark() {
        if (componentMarks.length != componentWeights.length) {
            throw new IllegalArgumentException("Component marks and weights must have the same length.");
        }

        double totalWeightedMarks = 0.0;
        double totalWeights = 0.0;

        for (int i = 0; i < componentMarks.length; i++) {
            totalWeightedMarks += componentMarks[i] * componentWeights[i];
            totalWeights += componentWeights[i];
        }

        return totalWeightedMarks / totalWeights;
    }
}
