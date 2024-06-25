package in.mesagnik.creational.abstractFactory;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bankName);
    public abstract Loan getLoan(String loan);
}
