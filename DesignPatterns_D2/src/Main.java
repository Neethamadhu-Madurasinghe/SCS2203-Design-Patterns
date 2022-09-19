import Adapter.*;
import Bridge.*;
import Composite.*;
import Decorator.*;
import Facade.*;
import FlyWeight.*;
import Proxy.*;

public class Main {
    public static void main(String[] args) {
        ProxyDemo();
    }

    public static void AdaptorDemo() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "abc.mp3");
        audioPlayer.play("vlc", "zyx.vlc");
        audioPlayer.play("mp4", "pqr.mp4");
        audioPlayer.play("wav", "efg.wav");
    }
    public static void BridgeDemo() {
        Triangle redTriangle = new Triangle(new RedColor());
        redTriangle.applyColor();

        Circle greenCircle = new Circle(new GreenColor());
        greenCircle.applyColor();
    }
    public static void CompositeDemo() {
        Box level0Box = new Box();

        Item level1Present1 = new Present(1000);
        Item level1Present2 = new Present(2000);
        Box level1Box1 = new Box();

        Item level2Present1 = new Present(100);
        Item level2Present2 = new Present(200);
        Box level2Box1 = new Box();

        Item level3Present1 = new Present(10);
        Item level3Present2 = new Present(20);

        level2Box1.addItem(level3Present1);
        level2Box1.addItem(level3Present2);

        level1Box1.addItem(level2Present1);
        level1Box1.addItem(level2Present2);
        level1Box1.addItem(level2Box1);

        level0Box.addItem(level1Present1);
        level0Box.addItem(level1Present2);
        level0Box.addItem(level1Box1);

        System.out.println(level0Box.getValue());
    }
    public static void DecoratorDemo() {
        LuxuryCar luxuryCar = new LuxuryCar(new BasicCar());
        SuperCar superCar = new SuperCar(new BasicCar());
        HyperCar hyperCar = new HyperCar(new SuperCar(new BasicCar()));

        luxuryCar.assemble();
        superCar.assemble();
        hyperCar.assemble();

    }
    public static void FacadeDemo() {
        String tableName = "ucscTable";

        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.PDF, tableName);

        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
    public static void FlyWeightDemo() {
        DrawingClient drawing = new DrawingClient(500, 600);

    }
    public static void ProxyDemo() {
        CommanndExecutorProxy executor = new CommanndExecutorProxy("saman", "450");
        try {
            executor.runCommand("cmd");
            executor.runCommand("rm cmd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

