public class Module {
    // First, we'l add our attributes - the modules' individual components:
    String ModCode; 
    double comp1;
    double comp2;
    double comp3;
    double comp4;
    double comp5;
    double comp6;
    double comp7;
// And the modules' component weightings:
    double pc1;
    double pc2;
    double pc3;
    double pc4;
    double pc5;
    double pc6;
    double pc7;
    
    // Other attributes
    double calcMark;
       
    // This is our constructor (function)
    Module(double comp1, double comp2, double comp3, double comp4, double comp5, double comp6, double comp7, double pc1, double pc2, double pc3, double pc4, double pc5, double pc6, double pc7) {

        this.comp1 = comp1;
        this.comp2 = comp2;
        this.comp3 = comp3;
        this.comp4 = comp4;
        this.comp5 = comp5;
        this.comp6 = comp6;
        this.comp7 = comp7;

    // Set the component weightings (per cent) from the constructor arguments
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pc4 = pc4;
        this.pc5 = pc5;
        this.pc6 = pc6;
        this.pc7 = pc7;

            }

 // These are our methods (instance behaviors). This method (instance behavior) calculates the module marks.
 double calculateModMark() {
    // Calculate the module mark and store it in the class-level variable calcMark
    calcMark = (comp1 * pc1) + (comp2 * pc2) + (comp3 * pc3) + (comp4 * pc4) + (comp5 * pc5) + (comp6 * pc6) + (comp7 * pc7);
    return calcMark;
    
}


    }