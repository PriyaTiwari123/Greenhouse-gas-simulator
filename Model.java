/**
 * The Model class belongs to the lab4 package.
 */
package lab4;

/**
 * Model class that is responsible for the calculation component of the assignment.
 */
public class Model {
    /**
     * Initialization of variables that represents the inputted value by the user.
     */
    private int monthlyPayment;
    private double principal;
    private double interest;

    /**
     * Constructor for the Model class.
     */
    public Model(){}

    /**
     * Sets the inputted value to the instance variable.
     * @param monthlyPayment
     */
    public void setMonthlyPayment(int monthlyPayment){
        this.monthlyPayment = monthlyPayment;
    }

    /**
     * Sets the inputted value to the instance variable.
     * @param principal
     */
    public void setPrincipal(double principal){
        this.principal = principal;
    }

    /**
     * Sets the inputted value to the instance variable.
     * @param interest
     */
    public void setInterestRate (double interest){
        this.interest = interest;
    }

    /**
     * Calculates the blended payment value and returns it.
     * @return the blended payment value.
     */
    public double getcalBlended (){
        double monthlyInterest = getInterestFactor();
        double v = (principal * monthlyInterest) / (1 - Math.pow((1 + monthlyInterest), (-monthlyPayment)));
        return v;
    }

    /**
     * Calculates the interest factor.
     * @return the interest factor value.
     */
    public double getInterestFactor(){
        double r = (interest/100);
        double c = 2;
        double p = 12.0;
        double i1 = (c / p);
        double rate = r/c;
        double i = Math.pow(1+rate, i1) -1;
        return i;
    }

    /**
     * Calculates and returns the total interest paid over the length of mortgage.
     * @return the total interest over the length of mortgage value.
     */
    public double getcalTotalInterest (){
        double i = (getcalBlended()* monthlyPayment) -principal ;
        return i;
    }

    /**
     * Calculates and returns the total interest and principal of the mortgage.
     * @return the total interest and principal.
     */
    public double getTotalInterstPrincipal(){
        double tP = getcalBlended() * monthlyPayment;
        return tP;
    }

    /**
     * Calculates and returns the interest and principal ratio.
     * @return the value of the annual interest and principal ratio.
     */
    public double getInterstPrincipalratio(){
        double tot = getcalTotalInterest()/principal;
        return tot;
    }

    /**
     * Calculates and returns the average interest paid over year.
     * @return the value of average interest paid over year.
     */
    public double getavgInterstYear(){
        double m = monthlyPayment/12.0;
        double avgY = getcalTotalInterest() / m; // do we need to multiply this by 12?
        return avgY;
    }

    /**
     * Calculates and returns the average interest paid over month.
     * @return the value of average interest paid over month.
     */
    public double getavgInterstMonth(){
        double avgM = getcalTotalInterest() / (double) monthlyPayment;
        return avgM;
    }

    /**
     * Calculates and returns the amortization value in years.
     * @return the amortization value.
     */
    public double getamortization(){
        double y = (double) monthlyPayment / 12.0;
        return y;
    }
}
