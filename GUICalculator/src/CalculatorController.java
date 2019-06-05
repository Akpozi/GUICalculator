import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class CalculatorController {

	    private CalculatorView theView;

	    private CalculatorModel theModel;

	    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

	        this.theView = theView;

	        this.theModel = theModel;

	        // Instructs the View to execute the actionPerformed method
	        // in the addListener,subtractListener,multiplyListener and
	        //divideListener inner class respectively when ever either 
	        //+, -, *, / button is clicked

	        this.theView.addCalculateListener(new addListener());
	        this.theView.subCalculateListener(new subtractListener());
	        this.theView.mulCalculateListener(new multiplyListener());
	        this.theView.divCalculateListener(new divideListener());
	    }
	    
	 // Addition class
	    class addListener implements ActionListener{

	        public void actionPerformed(ActionEvent e) {

	        	double numberOne, numberTwo = 0;

	            // displayErrorMessage in case numbers are not entered properly
	            try{
	            	numberOne = theView.getFirstNumber();
	            	numberTwo = theView.getSecondNumber();
	                theModel.addTwoNumbers(numberOne, numberTwo);
	                theView.setCalcSolution(theModel.getCalculationValue());
	            }
	            catch(NumberFormatException ex){
	                System.out.println(ex);
	                theView.displayErrorMessage("Enter 2 Integers");
	            }
	        }
	    }
	    
	    //Subtract class
	    class subtractListener implements ActionListener{

	        public void actionPerformed(ActionEvent e) {

	        	double numberOne, numberTwo = 0;

	            // displayErrorMessage in case numbers are not entered properly
	            try{
	            	numberOne = theView.getFirstNumber();
	            	numberTwo = theView.getSecondNumber();
	                theModel.subtractwoNumbers(numberOne, numberTwo);
	                theView.setCalcSolution(theModel.getCalculationValue());
	            }
	            catch(NumberFormatException ex){
	                System.out.println(ex);
	                theView.displayErrorMessage("Enter 2 Integers");
	            }
	        }
	      }
	    
	    //Multiply class
	    class multiplyListener implements ActionListener{

	        public void actionPerformed(ActionEvent e) {

	        	double numberOne, numberTwo = 0;

	            // displayErrorMessage in case numbers are not entered properly
	            try{
	            	numberOne = theView.getFirstNumber();
	            	numberTwo = theView.getSecondNumber();
	                theModel.multiplyTwoNumbers(numberOne, numberTwo);
	                theView.setCalcSolution(theModel.getCalculationValue());
	            }

	            catch(NumberFormatException ex){
	                System.out.println(ex);
	                theView.displayErrorMessage("Enter 2 Integers");
	            }
	        }
	    }
	    
	  //Divide class
	    class divideListener implements ActionListener{

	        public void actionPerformed(ActionEvent e) {

	        	double numberOne, numberTwo = 0;

	            // displayErrorMessage in case numbers are not entered properly
	            try{
	            	numberOne = theView.getFirstNumber();
	            	numberTwo = theView.getSecondNumber();
	                theModel.dividTwoNumbers(numberOne, numberTwo);	               
	                theView.setCalcSolution(theModel.getCalculationValue());
	            }

	            catch(NumberFormatException ex){
	                System.out.println(ex);
	                theView.displayErrorMessage("Enter Two Integers");
	            }
	        }
	    }
	}