import com.ysl.design.bridge.design.template.AbstractCar;
import com.ysl.design.bridge.design.template.impl.Bus;
import com.ysl.design.bridge.design.template.impl.SUV;

/**
 * 模板方法模式
 */
public class App {
    public static void main(String[] args) {
        AbstractCar suv = new SUV();
        suv.createCar();

        AbstractCar bus = new Bus();
        bus.createCar();
    }
}
