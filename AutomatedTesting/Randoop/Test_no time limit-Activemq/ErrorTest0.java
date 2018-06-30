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

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.String str3 = brokerService0.getDefaultSocketURIString();
        boolean boolean5 = brokerService0.checkQueueSize("OpenWireFormat{version=1, cacheEnabled=false, stackTraceEnabled=false, tightEncodingEnabled=false, sizePrefixDisabled=false, maxFrameSize=9223372036854775807}");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        openWireFormat1.setStackTraceEnabled(false);
        org.apache.activemq.command.ConnectionInfo connectionInfo4 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.broker.ConnectionContext connectionContext5 = new org.apache.activemq.broker.ConnectionContext(connectionInfo4);
        boolean boolean6 = connectionInfo4.isShutdownInfo();
        java.lang.Short short7 = openWireFormat1.addToMarshallCache((org.apache.activemq.command.DataStructure) connectionInfo4);
    }
}

