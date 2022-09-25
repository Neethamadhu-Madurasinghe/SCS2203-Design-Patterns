package ChainOfResponsiblity;

public class Doller10Dispenser implements DispenseChain{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency moneyAmount) {
        if(moneyAmount.getAmount() >= 10) {
            int numberOfNotes = moneyAmount.getAmount() / 10;
            int remainder = moneyAmount.getAmount() % 10;

            System.out.println("Dispensing " + numberOfNotes + " 10$ notes");

            if(remainder != 0) {
                this.nextChain.dispense(new Currency(remainder));
            }

        }else {
            this.nextChain.dispense(moneyAmount);
        }
    }
}
