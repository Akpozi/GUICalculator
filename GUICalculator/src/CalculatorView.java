import java.awt.event.ActionListener;

//Using Swing for the program implementation-----
import javax.swing.*;

	@SuppressWarnings("serial")
	public class CalculatorView extends JFrame{

	    private JTextField numberOne  = new JTextField(10);
	    //private JLabel additionLabel = new JLabel("+");
	    //private JLabel subtractionLabel = new JLabel("-");
	    //private JLabel multiplicationLabel = new JLabel("*");
	    //private JLabel dividionLabel = new JLabel("/");
	    private JTextField numberTwo = new JTextField(10);
	    
	    //private JButton computeButton = new JButton("Compute");
	    private JButton addButton = new JButton("+");
	    private JButton subtractButton = new JButton("-");
	    private JButton multiplyButton = new JButton("*");
	    private JButton divideButton = new JButton("/");
	    private JTextField compSolution = new JTextField(10);

	    CalculatorView(){

	    	//Settings for the components starts--------
	        JPanel compPanel = new JPanel();
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(600, 100);
	        setResizable(false);

	        compPanel.add(numberOne);
	        //compPanel.add(additionLabel);
	        //compPanel.add(subtractionLabel);
	        //compPanel.add(multiplicationLabel);
	        //compPanel.add(dividionLabel);
	        compPanel.add(numberTwo);

	        //compPanel.add(computeButton);
	        compPanel.add(addButton);
	        compPanel.add(subtractButton);
	        compPanel.add(multiplyButton);
	        compPanel.add(divideButton);
	        compPanel.add(compSolution);
	        this.add(compPanel);

	        //Settings for the components ends--------
	    }

	    public double getFirstNumber(){

	        return Double.parseDouble(numberOne.getText());
	    }

	    public double getSecondNumber(){

	        return Double.parseDouble(numberTwo.getText());
	    }

	    public double getCalcSolution(){

	        return Double.parseDouble(compSolution.getText());
	    }

	    public void setCalcSolution(double d){

	    	compSolution.setText(Double.toString((double) d));
	    }

	    //If the either the +, -, *, / buttons is clicked execute a method
	    //in the Controller named actionPerformed for corresponding button

	    //Addition
	    void addCalculateListener(ActionListener listenForCalcButton){

	    	addButton.addActionListener(listenForCalcButton);
	    }
	    
	    //Subtraction
	    void subCalculateListener(ActionListener listenToCalcButton){

	    	subtractButton.addActionListener(listenToCalcButton);
	    }
	    
	    //Multiplication
	    void mulCalculateListener(ActionListener listen2CalcButton){

	    	multiplyButton.addActionListener(listen2CalcButton);
	    }
	    
	    //Division
	    void divCalculateListener(ActionListener listen4CalcButton){

	    	divideButton.addActionListener(listen4CalcButton);
	    }

	    //Open a pop-up window containing the error message passed
	    void displayErrorMessage(String errorMessage){

	        JOptionPane.showMessageDialog(this, errorMessage);
	    }
	}