package Visitor;

public class Mouse implements ComputerPart{
    private String modelName;

    public Mouse(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return this.modelName;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
