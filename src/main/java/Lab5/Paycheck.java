package Lab5;

public class Paycheck {
    private double fica;
    private double grossPay;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;
    private DateRange payPeriod;

    public Paycheck(double fica, double grossPay, double state, double local, double medicare, double socialSecurity, DateRange payPeriod){
        this.fica = fica;
        this.grossPay = grossPay;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.payPeriod = payPeriod;
    }

    @Override
    public String toString() {
        return "Paycheck{" +
                "fica=" + fica +
                ", grossPay=" + grossPay +
                ", state=" + state +
                ", local=" + local +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                ", payPeriod=" + payPeriod +
                '}';
    }
}
