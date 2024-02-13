/**
 * Controller class belongs to the lab4 package
 */
package lab4;

/**
 * Imports awt library for the building of the GUI for this assignemnt.
 */

import java.awt.event.*;

/**
 * Controller class that controls and connects the view and model class for the GUI to function properly.
 */
public class Controller {
    /**
     * Instantiates 2 private instance variable.
     */
    private final View gui;
    private final Model calculator;

    /**
     * Constructor for the Controller class.
     * @param gui
     * @param calculator
     */
    public Controller(View gui, Model calculator){
        this.gui = gui;
        this.calculator = calculator;

        gui.addCalculatorListener(new CalculatorListener());
    }

    /**
     * This class implements the ActionListener interface.
     * This class also interacts between the GUI and the calculator.
     * It receives the inputted values from the View class, which it then passes to the controller to be processed.
     * The controller then returns the calculated value to this class to be passed on to the View class to be displayed on the interface.
     */
    class CalculatorListener implements ActionListener{
        /**
         * This method gets activated when the user clicks the calculate button, displayed on the interface.
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            int inputMonthly = Integer.parseInt(gui.getMonthlyPayment());
            double inputPrincipal = Double.parseDouble(gui.getPrincipal());
            double inputInterest = Double.parseDouble(gui.getInterestRate());
            calculator.setMonthlyPayment(inputMonthly);
            calculator.setPrincipal(inputPrincipal);
            calculator.setInterestRate(inputInterest);
            gui.setBlendedPayment(calculator.getcalBlended());
            gui.setTotalInterest(calculator.getcalTotalInterest());
            gui.setTotalInterestPrincipal(calculator.getTotalInterstPrincipal());
            gui.setInterestPrincipalRatio(calculator.getInterstPrincipalratio());
            gui.setInterestPerYear(calculator.getavgInterstYear());
            gui.setInterestPerMonth(calculator.getavgInterstMonth());
            gui.setAmortization(calculator.getamortization());
        }
    }

    /**
     * Runs the controller class.
     * @param args
     */
    public static void main(String[] args){
        View view  = new View();
        Model calculator = new Model();
        Controller control = new Controller(view, calculator);
        control.run();
    }
    private void run() {
    }
}
