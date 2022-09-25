package Strategy;

public class AdditionStrategy implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
