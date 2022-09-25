package ChainOfResponsiblity;

public class ATMDispenceChain {
    private DispenseChain dispenseChain;

    public ATMDispenceChain() {
        this.dispenseChain = new Doller50Dispnenser();

        DispenseChain doller20Dispenser = new Doller20Dispenser();
        DispenseChain doller10Dispenser = new Doller10Dispenser();

        this.dispenseChain.setNextChain(doller20Dispenser);
        doller20Dispenser.setNextChain(doller10Dispenser);
    }

    public void dispense(Currency moneyAmount) {
        if(moneyAmount.getAmount() % 10 == 0) {
            this.dispenseChain.dispense(moneyAmount);
        }else {
            System.out.println("Money amount should be in multiple of 10");
        }

    }
}
