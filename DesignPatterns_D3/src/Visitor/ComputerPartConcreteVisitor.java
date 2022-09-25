package Visitor;

public class ComputerPartConcreteVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visiting Keyboard: " + keyboard.getModelName());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visiting mouse: " + mouse.getModelName());
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Visiting computer: " + computer.getBrandName());
    }
}
