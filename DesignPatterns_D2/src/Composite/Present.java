package Composite;

public class Present implements Item{
    private int value;

    public Present(int value) {
        this.value = value;
    }
    @Override
    public int getValue() {
        return this.value;
    }
}
