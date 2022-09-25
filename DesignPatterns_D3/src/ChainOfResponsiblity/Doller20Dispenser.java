package ChainOfResponsiblity;

public class Doller20Dispenser implements DispenseChain{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency moneyAmount) {
        if(moneyAmount.getAmount() >= 20) {
            int numberOfNotes = moneyAmount.getAmount() / 20;
            int remainder = moneyAmount.getAmount() % 20;

            System.out.println("Dispensing " + numberOfNotes + " 20$ notes");

            if(remainder != 0) {
                this.nextChain.dispense(new Currency(remainder));
            }
        }else {
            this.nextChain.dispense(moneyAmount);
        }
    }
}
