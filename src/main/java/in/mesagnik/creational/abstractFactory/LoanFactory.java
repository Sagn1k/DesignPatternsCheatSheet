package in.mesagnik.creational.abstractFactory;

public class LoanFactory extends AbstractFactory{

    public Bank getBank(String bankName) {
        return null;
    }

    public Loan getLoan(String loan) {
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Personal")){
            return new PersonalLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}
