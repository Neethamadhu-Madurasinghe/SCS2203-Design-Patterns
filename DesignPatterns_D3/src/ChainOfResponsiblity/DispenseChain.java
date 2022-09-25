package ChainOfResponsiblity;

public interface DispenseChain {
    public void setNextChain(DispenseChain nextChain);
    public void dispense(Currency moneyAmount);
}
