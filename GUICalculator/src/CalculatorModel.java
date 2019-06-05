public class CalculatorModel {
	
	    // Holds the value of the computation of the two numbers entered in the view
	    private double calculationValue;
	    
	    //Add two numbers
	    public void addTwoNumbers(double numberOne, double numberTwo){

	        calculationValue = numberOne + numberTwo;

	    }
	  //Subtract two numbers
	    public void subtractwoNumbers(double numberOne, double numberTwo){

	        calculationValue = numberOne - numberTwo;

	    }
	  //Multiply two numbers
	    public void multiplyTwoNumbers(double numberOne, double numberTwo){

	        calculationValue = numberOne * numberTwo;

	    }
	  //Divide two numbers
	    public void dividTwoNumbers(double numberOne, double numberTwo){

	        calculationValue = numberOne / numberTwo;

	    }
	    
	    //Display result of computation
	    public double getCalculationValue(){
	        return (double)calculationValue;

	    }

	}