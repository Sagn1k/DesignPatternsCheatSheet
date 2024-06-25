package in.mesagnik.creational.abstractFactory;

public class PersonalLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
