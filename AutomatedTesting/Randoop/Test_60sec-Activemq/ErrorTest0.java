import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        openWireFormat1.setTcpNoDelayEnabled(false);
        org.apache.activemq.command.DataStructure dataStructure5 = openWireFormat1.getFromUnmarshallCache((short) (byte) 4);
    }
}

