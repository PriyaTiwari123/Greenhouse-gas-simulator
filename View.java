/**
 * The view class belongs to the package lab4.
 */
package lab4;

/**
 * Swing and awt are imported to allow for the building of GUI components of the assignment.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * View class that allows for the graphical interface.
 */
public class View {
    /**
     * Declares JFrame, Jpanel, Jlabel, Jtextfield, and Jbutton variables for the input and the output fields.
     */
    private JFrame jFrame;
    private JPanel input, output;
    private JLabel monthlyPayment, principal, interestRate, monthlyPay, totalInterest, totalInterestPrincipal, interestPrincipalRatio, interestPerYear, interestPerMonth, amortization;
    private JTextField monthlyPaymentInput, monthlyField, principalInput, interestRateInput, totalInterestField, totalInterestPrincipalField, interestPrincipalRatioField, interestPerYearField, interestPerMonthField, amortizationField;
    private JButton button;

    /**
     * Constructor for the view class that creates the GUI component of the calculator.
     * Creates the frame for the GUI, and sets input and output panel, and calculate button.
     */
    public View() {
        jFrame = new JFrame();
        jFrame.setSize(800, 800);
        jFrame.setTitle(("Mortgage Calculator"));

        input = new JPanel();
        input.setLayout(new GridLayout(3, 2));
        jFrame.add(input, BorderLayout.CENTER);

        monthlyPayment = new JLabel("Enter monthly payments (amortization expressed in months).");
        monthlyPaymentInput = new JTextField();
        principal = new JLabel(" Enter Total principal");
        principalInput = new JTextField();
        interestRate = new JLabel(" Enter annual interest rate");
        interestRateInput = new JTextField();

        input.add(monthlyPayment);
        input.add(monthlyPaymentInput);
        input.add(principal);
        input.add(principalInput);
        input.add(interestRate);
        input.add(interestRateInput);

        button = new JButton("Calculate");

        output = new JPanel();
        output.setLayout(new GridLayout(7, 2));
        monthlyPay = new JLabel("Blended monthly payment (principal + interest):");
        monthlyField = new JTextField();
        monthlyField.setEditable(false);
        totalInterest = new JLabel("Total interest:");
        totalInterestField = new JTextField();
        totalInterestField.setEditable(false);
        totalInterestPrincipal = new JLabel(" Total interest and principal;");
        totalInterestPrincipalField = new JTextField();
        totalInterestPrincipalField.setEditable(false);
        interestPrincipalRatio = new JLabel("Interest/principal ratio:");
        interestPrincipalRatioField = new JTextField();
        interestPrincipalRatioField.setEditable(false);
        interestPerYear = new JLabel("Average interest paid per year:");
        interestPerYearField = new JTextField();
        interestPerYearField.setEditable(false);
        interestPerMonth = new JLabel("Average interest paid per month:");
        interestPerMonthField = new JTextField();
        interestPerMonthField.setEditable(false);
        amortization = new JLabel(" Amortization in years:");
        amortizationField = new JTextField();
        amortizationField.setEditable(false);

        output.add(monthlyPay);
        output.add(monthlyField);
        output.add(totalInterest);
        output.add(totalInterestField);
        output.add(totalInterestPrincipal);
        output.add(totalInterestPrincipalField);
        output.add(interestPrincipalRatio);
        output.add(interestPrincipalRatioField);
        output.add(interestPerYear);
        output.add(interestPerYearField);
        output.add(interestPerMonth);
        output.add(interestPerMonthField);
        output.add(amortization);
        output.add(amortizationField);

        jFrame.getContentPane().add(input, BorderLayout.PAGE_START);
        jFrame.getContentPane().add(button, BorderLayout.CENTER);
        jFrame.getContentPane().add(output, BorderLayout.PAGE_END);

        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    /**
     * Obtains the value inputed by user for the monthly payment field.
     * @return numbers of monthly payment value.
     */
    public String getMonthlyPayment() {
        return monthlyPaymentInput.getText();
    }

    /**
     * obtains the value inputted by user for the principal field.
     * @return the principal amount.
     */
    public String getPrincipal() {
        return principalInput.getText();
    }

    /**
     * Obtains the value inputted by user for the interest rate field.
     * @return the annual interest rate.
     */
    public String getInterestRate() {
        return interestRateInput.getText();
    }

    /**
     * Outputs the payment value for the Blended payment on GUI.
     * @param payment
     */
    public void setBlendedPayment(double payment) {
        monthlyField.setText(String.valueOf(payment));
    }

    /**
     * Outputs the payment value for the Total interest paid over the length of mortgate on GUI.
     * @param interest
     */
    public void setTotalInterest(double interest) {
        totalInterestField.setText(String.valueOf(interest));
    }

    /**
     * Outputs the payment value for the total interest and principal on GUI.
     * @param total
     */
    public void setTotalInterestPrincipal(double total) {
        totalInterestPrincipalField.setText(String.valueOf(total));
    }

    /**
     * Outputs the annual interest to principal ratio on GUI.
     * @param total
     */
    public void setInterestPrincipalRatio(double total) {
        interestPrincipalRatioField.setText(String.valueOf(total));
    }

    /**
     * Outputs the average interest per year on GUI.
     * @param interest
     */
    public void setInterestPerYear(double interest) {
        interestPerYearField.setText(String.valueOf(interest));
    }

    /**
     * Outputs the average interest per month on GUI.
     * @param interest
     */
    public void setInterestPerMonth(double interest) {
        interestPerMonthField.setText(String.valueOf(interest));
    }

    /**
     * Outputs the amortization in years on GUI.
     * @param amortization
     */
    public void setAmortization(double amortization) {
        amortizationField.setText(String.valueOf(amortization));
    }

    /**
     * Adds an action listener to the calculate button.
     * @param listener
     */
    public void addCalculatorListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}