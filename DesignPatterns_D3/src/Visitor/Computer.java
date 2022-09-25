package Visitor;
import java.util.ArrayList;
public class Computer implements ComputerPart{
    private ArrayList<ComputerPart> parts;
    private String brandName;

    public Computer() {
        this.parts = new ArrayList<ComputerPart>();
        this.parts.add(new Keyboard("Logitech"));
        this.parts.add(new Mouse("Steel Series"));

        this.brandName = "HP";
    }
    public String getBrandName() {
        return this.brandName;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part: parts) {
            part.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
