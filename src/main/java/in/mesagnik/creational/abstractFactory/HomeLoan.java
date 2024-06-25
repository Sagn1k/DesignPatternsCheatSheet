package in.mesagnik.creational.abstractFactory;

public class HomeLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
