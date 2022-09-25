import ChainOfResponsiblity.*;
import Command.*;
import Iterator.*;
import Mediator.User;
import Observer.*;
import Visitor.*;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
        MediatorDemo();
    }

    public static void chainOfResponsibilityDemo() {
        ATMDispenceChain atmMachine = new ATMDispenceChain();

        atmMachine.dispense(new Currency(530));
    }
    public static void commandDemo() {
        Stock tesla = new Stock();
        Brocker brocker = new Brocker();

        brocker.takeOrder(new BuyStockCommand(tesla));
        brocker.takeOrder(new BuyStockCommand(tesla));
        brocker.takeOrder(new SellStockCommand(tesla));

        brocker.placeOrder();
    }
    public static void iteratorDemo() {
        CustomDataCollection ds = new CustomDataCollection();
        Iterator dsIt = ds.getIterator();

        while(dsIt.hasNext()) {
            System.out.println(dsIt.next());
        }
    }
    public static void visitorDemo() {
        Computer myComputer=  new Computer();
        ComputerPartConcreteVisitor computerPartConcreteVisitor = new ComputerPartConcreteVisitor();

        myComputer.accept(computerPartConcreteVisitor);
    }
    public static void ObserverDemo() {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        subject.setState(10);
        subject.setState(20);
    }
    public static void StrategyDemo() {
        Context context = new Context(new AdditionStrategy());
        System.out.println(context.executeStrategy(10, 15));

        context = new Context(new MutiplicationStrategy());
        System.out.println(context.executeStrategy(10, 15));

    }
    public static void MediatorDemo() {
        User user1 = new User("Saman");
        User user2 = new User("Chithral");

        user1.sendMessage("Hello everyone !");
        user2.sendMessage("Hello Saman");
    }
}