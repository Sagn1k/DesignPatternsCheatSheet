package in.mesagnik.creational.abstractFactory;

public class EducationLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
