package ChainOfResponsiblity;

public class Doller50Dispnenser implements DispenseChain{
//    nextChain or nextHandler
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency moneyAmount) {
        if(moneyAmount.getAmount() >= 50) {
            int numberOfNotes = moneyAmount.getAmount() / 50;
            int remainder = moneyAmount.getAmount() % 50;

            System.out.println("Dispensing " + numberOfNotes + " 50$ notes");
            if(remainder != 0) {
                this.nextChain.dispense(new Currency(remainder));
            }
        }else {
            this.nextChain.dispense(moneyAmount);
        }
    }
}
