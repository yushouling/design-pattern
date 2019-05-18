import com.ysl.design.bridge.BridgeFrom;
import com.ysl.design.bridge.BridgeTarget;
import com.ysl.design.bridge.left.TargetB2;
import com.ysl.design.bridge.right.FromA1;

/**
 * 桥接模式
 */
public class App {
    public static void main(String[] args) {
        BridgeFrom bridgeFrom = new FromA1();
        BridgeTarget bridgeTarget = bridgeFrom.bridgeTarget;
        // FIXME 这个模式这种写法不对
        bridgeFrom.from();
        bridgeTarget = new TargetB2();
        bridgeTarget.target();
    }
}
