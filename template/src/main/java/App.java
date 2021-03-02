import com.ysl.design.bridge.design.template.way1.AbstractFactory;
import com.ysl.design.bridge.design.template.way1.impl.Bus;
import com.ysl.design.bridge.design.template.way1.impl.SUV;
import com.ysl.design.bridge.design.template.way2.VehicleTemplate;
import com.ysl.design.bridge.design.template.way2.impl.CarCreateCallback;
import com.ysl.design.bridge.design.template.way2.impl.PlaneCreateCallback;

/**
 * 模板方法模式
 */
public class App {
    public static void main(String[] args) {
        //way1Test();

        way2Test();
    }

    static void way1Test() {
        AbstractFactory suv = new SUV();
        suv.createCar();

        AbstractFactory bus = new Bus();
        bus.createCar();
    }

    static void way2Test() {
        VehicleTemplate factoryTemplate = new VehicleTemplate();

        factoryTemplate.createCar(new CarCreateCallback());

        factoryTemplate.createPlane(new PlaneCreateCallback());

        factoryTemplate.createCVN(null);
    }

}
