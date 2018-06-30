import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        long long0 = org.apache.activemq.broker.BrokerService.DEFAULT_START_TIMEOUT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 600000L + "'", long0 == 600000L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.QUEUE_QUALIFIED_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "queue://" + "'", str0.equals("queue://"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.IS_DLQ;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isDLQ" + "'", str0.equals("isDLQ"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = org.apache.activemq.broker.BrokerService.BROKER_VERSION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "${project.version}" + "'", str0.equals("${project.version}"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        byte byte0 = org.apache.activemq.command.ConnectionInfo.DATA_STRUCTURE_TYPE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 3 + "'", byte0 == (byte) 3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        org.apache.activemq.command.ActiveMQTempDestination activeMQTempDestination4 = null;
        try {
            activeMQConnection0.deleteTempDestination(activeMQTempDestination4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_BROKER_BIND_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tcp://localhost:61616" + "'", str0.equals("tcp://localhost:61616"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.security.SecurityContext securityContext2 = null;
        connectionContext1.setSecurityContext(securityContext2);
        connectionContext1.setInRecoveryMode(false);
        org.apache.activemq.security.SecurityContext securityContext6 = null;
        connectionContext1.setSecurityContext(securityContext6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.net.URI uRI2 = null;
        try {
            org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory3 = new org.apache.activemq.ActiveMQConnectionFactory("", "${project.version}", uRI2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        byte[] byteArray2 = new byte[] {};
        org.apache.activemq.util.ByteSequence byteSequence5 = new org.apache.activemq.util.ByteSequence(byteArray2, (int) ' ', (int) 'a');
        try {
            java.lang.Object obj6 = openWireFormat1.unmarshal(byteSequence5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
        }
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        try {
            org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid version: 32, could not load org.apache.activemq.openwire.v32.MarshallerFactory");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        byte[] byteArray0 = new byte[] {};
        org.apache.activemq.util.ByteSequence byteSequence3 = new org.apache.activemq.util.ByteSequence(byteArray0, (int) ' ', (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        byteSequence3.data = byteArray8;
        int int10 = byteSequence3.length;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.TEMP_DESTINATION_NAME_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ID:" + "'", str0.equals("ID:"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        try {
            javax.jms.QueueSession queueSession6 = activeMQConnection0.createQueueSession(true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        boolean boolean3 = activeMQConnection0.isMessagePrioritySupported();
        org.apache.activemq.command.ProducerId producerId4 = null;
        org.apache.activemq.ActiveMQMessageProducer activeMQMessageProducer5 = null;
        try {
            activeMQConnection0.addProducer(producerId4, activeMQMessageProducer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        try {
            org.apache.activemq.transport.TransportServer transportServer2 = transportConnector1.getServer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must specify either a server or uri property");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection("");
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException; message: Could not create Transport. Reason: java.io.IOException: Transport not scheme specified: []");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(connectionInfo0);
        boolean boolean2 = connectionContext1.isProducerFlowControl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        org.apache.activemq.command.ConsumerId consumerId4 = null;
        org.apache.activemq.ActiveMQDispatcher activeMQDispatcher5 = null;
        try {
            activeMQConnection0.addDispatcher(consumerId4, activeMQDispatcher5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        byte[] byteArray0 = new byte[] {};
        org.apache.activemq.util.ByteSequence byteSequence3 = new org.apache.activemq.util.ByteSequence(byteArray0, (int) ' ', (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        byteSequence3.data = byteArray8;
        int int10 = byteSequence3.remaining();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65 + "'", int10 == 65);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection("isDLQ");
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException; message: Could not create Transport. Reason: java.io.IOException: Transport not scheme specified: [isDLQ]");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        org.apache.activemq.transport.discovery.DiscoveryAgent discoveryAgent2 = null;
        transportConnector1.setDiscoveryAgent(discoveryAgent2);
        try {
            java.util.LinkedList<java.lang.String> strList4 = transportConnector1.getPeerBrokers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        long long1 = activeMQConnection0.getConsumerFailoverRedeliveryWaitPeriod();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        boolean boolean4 = connectionContext3.isNetworkConnection();
        try {
            boolean boolean5 = openWireFormat1.equals((java.lang.Object) connectionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.activemq.broker.ConnectionContext cannot be cast to org.apache.activemq.openwire.OpenWireFormat");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        try {
            activeMQConnection0.onCommand((java.lang.Object) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.base/java.lang.Byte cannot be cast to org.apache.activemq.command.Command");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean boolean1 = activeMQConnection0.isCheckForDuplicates();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        java.io.DataInput dataInput2 = null;
        try {
            org.apache.activemq.command.DataStructure dataStructure3 = openWireFormat1.looseUnmarshalNestedObject(dataInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str0 = org.apache.activemq.broker.BrokerService.DEFAULT_BROKER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "localhost" + "'", str0.equals("localhost"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        byte byte0 = org.apache.activemq.command.ActiveMQDestination.TEMP_MASK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 4 + "'", byte0 == (byte) 4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        activeMQConnection0.setNestedMapAndListEnabled(true);
        int int7 = activeMQConnection0.getProtocolVersion();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        boolean boolean7 = activeMQConnection0.isTransactedIndividualAck();
        boolean boolean8 = activeMQConnection0.isStarted();
        org.apache.activemq.command.ConsumerId consumerId9 = null;
        org.apache.activemq.ActiveMQDispatcher activeMQDispatcher10 = null;
        try {
            activeMQConnection0.addDispatcher(consumerId9, activeMQDispatcher10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        boolean boolean2 = connectionContext1.isNetworkConnection();
        boolean boolean3 = connectionContext1.isProducerFlowControl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        org.apache.activemq.command.Endpoint endpoint3 = null;
        connectionInfo0.setFrom(endpoint3);
        boolean boolean5 = connectionInfo0.isConnectionControl();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setWarnAboutUnstartedConnectionTimeout((long) (byte) 100);
        boolean boolean5 = activeMQConnection0.isStatsEnabled();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        try {
            org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory3 = new org.apache.activemq.ActiveMQConnectionFactory("", "tcp://localhost:61616", "ID:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid broker URI: ID:");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        byte[] byteArray0 = new byte[] {};
        org.apache.activemq.util.ByteSequence byteSequence3 = new org.apache.activemq.util.ByteSequence(byteArray0, (int) ' ', (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        byteSequence3.data = byteArray8;
        try {
            byteSequence3.compact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.security.SecurityContext securityContext2 = null;
        connectionContext1.setSecurityContext(securityContext2);
        connectionContext1.setClientMaster(true);
        org.apache.activemq.transaction.Transaction transaction6 = connectionContext1.getTransaction();
        connectionContext1.setInRecoveryMode(false);
        org.junit.Assert.assertNull(transaction6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = openWireFormat1.copy();
        boolean boolean4 = openWireFormat3.isStackTraceEnabled();
        java.io.DataInput dataInput5 = null;
        try {
            java.lang.Object obj6 = openWireFormat3.doUnmarshal(dataInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(openWireFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout((int) '#');
        org.apache.activemq.management.JMSConnectionStatsImpl jMSConnectionStatsImpl3 = activeMQConnection0.getConnectionStats();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(jMSConnectionStatsImpl3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.transaction.Transaction transaction4 = connectionContext3.getTransaction();
        java.lang.Object obj5 = connectionContext3.getLongTermStoreContext();
        org.apache.activemq.security.SecurityContext securityContext6 = connectionContext3.getSecurityContext();
        org.apache.activemq.broker.Broker broker7 = null;
        connectionContext3.setBroker(broker7);
        org.apache.activemq.security.MessageAuthorizationPolicy messageAuthorizationPolicy9 = connectionContext3.getMessageAuthorizationPolicy();
        org.apache.activemq.command.ProducerInfo producerInfo10 = null;
        org.apache.activemq.command.ActiveMQQueue activeMQQueue12 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        try {
            brokerFilter1.fastProducer(connectionContext3, producerInfo10, (org.apache.activemq.command.ActiveMQDestination) activeMQQueue12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(transaction4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(securityContext6);
        org.junit.Assert.assertNull(messageAuthorizationPolicy9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        boolean boolean4 = connectionContext3.isNetworkConnection();
        org.apache.activemq.command.TransactionId transactionId5 = null;
        try {
            brokerFilter1.forgetTransaction(connectionContext3, transactionId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        boolean boolean4 = connectionContext3.isNetworkConnection();
        org.apache.activemq.command.SessionInfo sessionInfo5 = null;
        try {
            brokerFilter1.removeSession(connectionContext3, sessionInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.security.SecurityContext securityContext2 = null;
        connectionContext1.setSecurityContext(securityContext2);
        org.apache.activemq.broker.Broker broker4 = connectionContext1.getBroker();
        org.junit.Assert.assertNull(broker4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        activeMQConnection0.stop();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str0 = org.apache.activemq.broker.BrokerService.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "61616" + "'", str0.equals("61616"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        activeMQConnection0.changeUserInfo("isDLQ", "ID:");
        boolean boolean8 = activeMQConnection0.isCheckForDuplicates();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        boolean boolean7 = activeMQConnection0.isTransactedIndividualAck();
        boolean boolean8 = activeMQConnection0.isMessagePrioritySupported();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy9 = activeMQConnection0.getRedeliveryPolicy();
        int int10 = activeMQConnection0.getCloseTimeout();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(redeliveryPolicy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15000 + "'", int10 == 15000);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        try {
            brokerFilter1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        activeMQConnection0.setUseAsyncSend(false);
        boolean boolean4 = activeMQConnection0.isDispatchAsync();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setDisableAsyncDispatch(true);
        org.junit.Assert.assertNull(uRI2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        boolean boolean3 = connectionInfo0.isFailoverReconnect();
        boolean boolean4 = connectionInfo0.isConsumerControl();
        connectionInfo0.setFailoverReconnect(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        boolean boolean7 = activeMQConnection0.isTransactedIndividualAck();
        boolean boolean8 = activeMQConnection0.isStarted();
        activeMQConnection0.setCheckForDuplicates(false);
        activeMQConnection0.setMessagePrioritySupported(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        byte byte2 = connectionInfo0.getDataStructureType();
        org.apache.activemq.command.ConnectionId connectionId3 = connectionInfo0.getConnectionId();
        connectionInfo0.setClientIp("tcp://localhost:61616");
        org.apache.activemq.command.BrokerId[] brokerIdArray6 = connectionInfo0.getBrokerPath();
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
        org.junit.Assert.assertNull(connectionId3);
        org.junit.Assert.assertNull(brokerIdArray6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        boolean boolean3 = transportConnector1.isUpdateClusterClients();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue1 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties2 = null;
        activeMQQueue1.buildFromProperties(properties2);
        java.io.ObjectInput objectInput4 = null;
        try {
            activeMQQueue1.readExternal(objectInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        boolean boolean3 = brokerService0.isDeleteAllMessagesOnStartup();
        brokerService0.incrementCurrentConnections();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        openWireFormat1.setTcpNoDelayEnabled(false);
        org.apache.activemq.command.ConnectionInfo connectionInfo4 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo5 = connectionInfo4.copy();
        org.apache.activemq.command.Endpoint endpoint6 = connectionInfo4.getFrom();
        java.io.DataOutput dataOutput7 = null;
        org.apache.activemq.openwire.BooleanStream booleanStream8 = null;
        try {
            openWireFormat1.tightMarshalNestedObject2((org.apache.activemq.command.DataStructure) connectionInfo4, dataOutput7, booleanStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(connectionInfo5);
        org.junit.Assert.assertNull(endpoint6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap5 = activeMQConnection0.getRedeliveryPolicyMap();
        activeMQConnection0.setWatchTopicAdvisories(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.broker.Connection connection2 = null;
        org.apache.activemq.command.BrokerInfo brokerInfo3 = null;
        try {
            brokerFilter1.addBroker(connection2, brokerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.transaction.Transaction transaction4 = connectionContext3.getTransaction();
        java.lang.Object obj5 = connectionContext3.getLongTermStoreContext();
        org.apache.activemq.security.SecurityContext securityContext6 = connectionContext3.getSecurityContext();
        org.apache.activemq.broker.Broker broker7 = null;
        connectionContext3.setBroker(broker7);
        org.apache.activemq.security.SecurityContext securityContext9 = connectionContext3.getSecurityContext();
        org.apache.activemq.command.ConnectionInfo connectionInfo10 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo11 = connectionInfo10.copy();
        byte byte12 = connectionInfo10.getDataStructureType();
        org.apache.activemq.command.ConnectionId connectionId13 = connectionInfo10.getConnectionId();
        java.lang.Throwable throwable14 = null;
        try {
            brokerFilter1.removeConnection(connectionContext3, connectionInfo10, throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(transaction4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(securityContext6);
        org.junit.Assert.assertNull(securityContext9);
        org.junit.Assert.assertNotNull(connectionInfo11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 3 + "'", byte12 == (byte) 3);
        org.junit.Assert.assertNull(connectionId13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.security.SecurityContext securityContext4 = null;
        connectionContext3.setSecurityContext(securityContext4);
        connectionContext3.setClientMaster(true);
        org.apache.activemq.broker.region.MessageReference messageReference8 = null;
        try {
            brokerFilter1.messageDelivered(connectionContext3, messageReference8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        org.apache.activemq.command.ConnectionId connectionId3 = null;
        connectionContext1.setConnectionId(connectionId3);
        org.junit.Assert.assertNull(transaction2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        org.apache.activemq.state.CommandVisitor commandVisitor2 = null;
        try {
            org.apache.activemq.command.Response response3 = connectionInfo1.visit(commandVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(connectionInfo1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.TEMP_QUEUE_QUALIFED_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "temp-queue://" + "'", str0.equals("temp-queue://"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.command.ActiveMQQueue activeMQQueue2 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties3 = null;
        activeMQQueue2.buildFromProperties(properties3);
        activeMQQueue2.setDLQ(true);
        try {
            brokerService0.removeDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Status MBean could not be registered in JMX: org.apache.activemq:type=Broker,brokerName=localhost,service=Health");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        openWireFormat1.setCacheEnabled(true);
        org.apache.activemq.command.WireFormatInfo wireFormatInfo5 = null;
        try {
            openWireFormat1.renegotiateWireFormat(wireFormatInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Wireformat cannot not be renegotiated.");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.command.MessageDispatch messageDispatch2 = null;
        try {
            brokerFilter1.preProcessDispatch(messageDispatch2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.security.SecurityContext securityContext2 = null;
        connectionContext1.setSecurityContext(securityContext2);
        connectionContext1.setClientMaster(true);
        org.apache.activemq.transaction.Transaction transaction6 = connectionContext1.getTransaction();
        org.apache.activemq.transport.TransportServer transportServer7 = null;
        org.apache.activemq.broker.TransportConnector transportConnector8 = new org.apache.activemq.broker.TransportConnector(transportServer7);
        java.net.URI uRI9 = transportConnector8.getConnectUri();
        connectionContext1.setConnector((org.apache.activemq.broker.Connector) transportConnector8);
        org.apache.activemq.command.WireFormatInfo wireFormatInfo11 = null;
        connectionContext1.setWireFormatInfo(wireFormatInfo11);
        org.junit.Assert.assertNull(transaction6);
        org.junit.Assert.assertNull(uRI9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.broker.Broker broker2 = null;
        connectionContext1.setBroker(broker2);
        org.apache.activemq.broker.Connector connector4 = connectionContext1.getConnector();
        boolean boolean5 = connectionContext1.isProducerFlowControl();
        org.junit.Assert.assertNull(connector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        activeMQConnection0.setNestedMapAndListEnabled(true);
        long long7 = activeMQConnection0.getOptimizedAckScheduledAckInterval();
        org.apache.activemq.command.ActiveMQTempDestination activeMQTempDestination8 = null;
        try {
            activeMQConnection0.deleteTempDestination(activeMQTempDestination8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.transaction.Transaction transaction4 = connectionContext3.getTransaction();
        java.lang.Object obj5 = connectionContext3.getLongTermStoreContext();
        org.apache.activemq.security.SecurityContext securityContext6 = connectionContext3.getSecurityContext();
        org.apache.activemq.broker.Broker broker7 = null;
        connectionContext3.setBroker(broker7);
        org.apache.activemq.security.SecurityContext securityContext9 = connectionContext3.getSecurityContext();
        org.apache.activemq.command.TransactionId transactionId10 = null;
        try {
            brokerFilter1.commitTransaction(connectionContext3, transactionId10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(transaction4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(securityContext6);
        org.junit.Assert.assertNull(securityContext9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        org.apache.activemq.command.ConnectionInfo connectionInfo2 = new org.apache.activemq.command.ConnectionInfo();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        java.lang.String str4 = connectionInfo2.toString(strMap3);
        connectionInfo0.setTransportContext((java.lang.Object) connectionInfo2);
        connectionInfo0.setClientMaster(true);
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}" + "'", str4.equals("ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        org.apache.activemq.transport.discovery.DiscoveryAgent discoveryAgent2 = null;
        transportConnector1.setDiscoveryAgent(discoveryAgent2);
        try {
            boolean boolean4 = transportConnector1.isAllowLinkStealing();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.broker.Broker broker4 = null;
        connectionContext3.setBroker(broker4);
        connectionContext3.setReconnect(false);
        org.apache.activemq.command.ActiveMQQueue activeMQQueue9 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties10 = null;
        activeMQQueue9.buildFromProperties(properties10);
        try {
            brokerFilter1.removeDestination(connectionContext3, (org.apache.activemq.command.ActiveMQDestination) activeMQQueue9, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.activemq.command.UnresolvedDestinationTransformer unresolvedDestinationTransformer0 = org.apache.activemq.command.ActiveMQDestination.getUnresolvableDestinationTransformer();
        org.apache.activemq.command.ActiveMQDestination.setUnresolvableDestinationTransformer(unresolvedDestinationTransformer0);
        org.junit.Assert.assertNotNull(unresolvedDestinationTransformer0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.transaction.Transaction transaction4 = connectionContext3.getTransaction();
        java.lang.Object obj5 = connectionContext3.getLongTermStoreContext();
        org.apache.activemq.broker.region.MessageReference messageReference6 = null;
        boolean boolean7 = connectionContext3.isAllowedToConsume(messageReference6);
        org.apache.activemq.command.SessionInfo sessionInfo8 = null;
        try {
            brokerFilter1.addSession(connectionContext3, sessionInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(transaction4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.broker.region.MessageReference messageReference3 = null;
        org.apache.activemq.broker.region.Subscription subscription4 = null;
        java.lang.Throwable throwable5 = null;
        try {
            boolean boolean6 = brokerFilter1.sendToDeadLetterQueue(connectionContext2, messageReference3, subscription4, throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        java.lang.Object obj3 = connectionContext1.getLongTermStoreContext();
        connectionContext1.setClientId("tcp://localhost:61616");
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.security.SecurityContext securityContext4 = null;
        connectionContext3.setSecurityContext(securityContext4);
        connectionContext3.setClientMaster(true);
        org.apache.activemq.transaction.Transaction transaction8 = connectionContext3.getTransaction();
        org.apache.activemq.command.ConnectionInfo connectionInfo9 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo9.setBrokerMasterConnector(true);
        connectionInfo9.setManageable(true);
        try {
            brokerFilter1.addConnection(connectionContext3, connectionInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(transaction8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.security.SecurityContext securityContext2 = null;
        connectionContext1.setSecurityContext(securityContext2);
        connectionContext1.setClientMaster(true);
        org.apache.activemq.transaction.Transaction transaction6 = connectionContext1.getTransaction();
        org.apache.activemq.transport.TransportServer transportServer7 = null;
        org.apache.activemq.broker.TransportConnector transportConnector8 = new org.apache.activemq.broker.TransportConnector(transportServer7);
        java.net.URI uRI9 = transportConnector8.getConnectUri();
        connectionContext1.setConnector((org.apache.activemq.broker.Connector) transportConnector8);
        boolean boolean11 = connectionContext1.isClientMaster();
        org.junit.Assert.assertNull(transaction6);
        org.junit.Assert.assertNull(uRI9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        try {
            java.net.URI uRI2 = brokerFilter1.getVmConnectorURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.command.MessageDispatchNotification messageDispatchNotification2 = null;
        try {
            brokerFilter1.processDispatchNotification(messageDispatchNotification2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        byte[] byteArray0 = new byte[] {};
        org.apache.activemq.util.ByteSequence byteSequence3 = new org.apache.activemq.util.ByteSequence(byteArray0, (int) ' ', (int) 'a');
        org.apache.activemq.util.ByteSequence byteSequence4 = new org.apache.activemq.util.ByteSequence(byteArray0);
        byteSequence4.setOffset(65);
        byteSequence4.setOffset((int) (byte) 4);
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        boolean boolean3 = connectionInfo0.isFailoverReconnect();
        boolean boolean4 = connectionInfo0.isConsumerControl();
        java.lang.String str5 = connectionInfo0.getClientId();
        connectionInfo0.setClientId("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = openWireFormat1.copy();
        int int4 = openWireFormat1.getVersion();
        boolean boolean5 = openWireFormat1.isCacheEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(openWireFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = openWireFormat1.copy();
        java.lang.String str4 = openWireFormat1.toString();
        try {
            openWireFormat1.setVersion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid version: 0, could not load org.apache.activemq.openwire.v0.MarshallerFactory");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(openWireFormat3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "OpenWireFormat{version=1, cacheEnabled=false, stackTraceEnabled=false, tightEncodingEnabled=false, sizePrefixDisabled=false, maxFrameSize=9223372036854775807}" + "'", str4.equals("OpenWireFormat{version=1, cacheEnabled=false, stackTraceEnabled=false, tightEncodingEnabled=false, sizePrefixDisabled=false, maxFrameSize=9223372036854775807}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.command.ConnectionInfo connectionInfo6 = activeMQConnection0.getConnectionInfo();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(connectionInfo6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setResponseRequired(false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap5 = activeMQConnection0.getRedeliveryPolicyMap();
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap6 = activeMQConnection0.getRedeliveryPolicyMap();
        activeMQConnection0.transportInterupted();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap5);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.Runnable[] runnableArray3 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList4 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList4, runnableArray3);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList4);
        javax.management.ObjectName objectName7 = brokerService0.getBrokerObjectName();
        org.junit.Assert.assertNotNull(runnableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectName7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.activemq.broker.ConnectionContext connectionContext0 = new org.apache.activemq.broker.ConnectionContext();
        org.apache.activemq.broker.Connection connection1 = null;
        connectionContext0.setConnection(connection1);
        org.apache.activemq.broker.Connection connection3 = connectionContext0.getConnection();
        org.junit.Assert.assertNull(connection3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        boolean boolean3 = brokerService0.isDeleteAllMessagesOnStartup();
        org.apache.activemq.network.jms.JmsConnector[] jmsConnectorArray4 = brokerService0.getJmsBridgeConnectors();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jmsConnectorArray4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.broker.Broker broker4 = null;
        connectionContext3.setBroker(broker4);
        org.apache.activemq.broker.region.MessageReference messageReference6 = null;
        org.apache.activemq.broker.region.Subscription subscription7 = null;
        java.lang.Throwable throwable8 = null;
        try {
            boolean boolean9 = brokerFilter1.sendToDeadLetterQueue(connectionContext3, messageReference6, subscription7, throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isStackTraceEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        connectionInfo0.setResponseRequired(false);
        boolean boolean5 = connectionInfo0.isMessageDispatch();
        org.apache.activemq.command.Endpoint endpoint6 = null;
        connectionInfo0.setTo(endpoint6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.util.ServiceStopper serviceStopper1 = null;
        brokerService0.stopAllConnectors(serviceStopper1);
        int int3 = brokerService0.getTaskRunnerPriority();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setNetworkConnectorStartAsync(false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        org.apache.activemq.security.SecurityContext securityContext3 = null;
        connectionContext1.setSecurityContext(securityContext3);
        org.junit.Assert.assertNull(transaction2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte[] byteArray0 = new byte[] {};
        org.apache.activemq.util.ByteSequence byteSequence3 = new org.apache.activemq.util.ByteSequence(byteArray0, (int) ' ', (int) 'a');
        org.apache.activemq.util.ByteSequence byteSequence6 = new org.apache.activemq.util.ByteSequence(byteArray0, 65, 65);
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        boolean boolean7 = activeMQConnection0.isTransactedIndividualAck();
        org.apache.activemq.management.StatsImpl statsImpl8 = activeMQConnection0.getStats();
        org.apache.activemq.ActiveMQConnection activeMQConnection9 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer10 = null;
        activeMQConnection9.setTransformer(messageTransformer10);
        activeMQConnection9.setOptimizedMessageDispatch(true);
        boolean boolean14 = activeMQConnection9.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener15 = activeMQConnection9.getClientInternalExceptionListener();
        boolean boolean16 = activeMQConnection9.isTransactedIndividualAck();
        boolean boolean17 = activeMQConnection9.isMessagePrioritySupported();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy18 = activeMQConnection9.getRedeliveryPolicy();
        activeMQConnection0.setRedeliveryPolicy(redeliveryPolicy18);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(statsImpl8);
        org.junit.Assert.assertNotNull(activeMQConnection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(redeliveryPolicy18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = activeMQConnection0.getRejectedTaskHandler();
        boolean boolean4 = activeMQConnection0.isDisableTimeStampsByDefault();
        activeMQConnection0.setCheckForDuplicates(true);
        activeMQConnection0.setCopyMessageOnSend(true);
        org.apache.activemq.command.ConsumerId consumerId9 = null;
        try {
            boolean boolean10 = activeMQConnection0.hasDispatcher(consumerId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        org.apache.activemq.broker.region.ConnectorStatistics connectorStatistics2 = transportConnector1.getStatistics();
        java.net.URI uRI3 = transportConnector1.getUri();
        org.junit.Assert.assertNotNull(connectorStatistics2);
        org.junit.Assert.assertNull(uRI3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setWatchTopicAdvisories(false);
        org.apache.activemq.transport.Transport transport5 = activeMQConnection0.getTransport();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(transport5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.broker.Broker broker2 = null;
        connectionContext1.setBroker(broker2);
        org.apache.activemq.broker.Connector connector4 = connectionContext1.getConnector();
        java.lang.String str5 = connectionContext1.getClientId();
        boolean boolean6 = connectionContext1.isInTransaction();
        org.junit.Assert.assertNull(connector4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        int int6 = transportConnector1.getMaximumConsumersAllowedPerConnection();
        transportConnector1.setDisableAsyncDispatch(true);
        org.apache.activemq.broker.TransportConnection transportConnection9 = null;
        transportConnector1.onStarted(transportConnection9);
        org.apache.activemq.security.MessageAuthorizationPolicy messageAuthorizationPolicy11 = transportConnector1.getMessageAuthorizationPolicy();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(messageAuthorizationPolicy11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.broker.Connection connection2 = null;
        org.apache.activemq.command.BrokerInfo brokerInfo3 = null;
        try {
            brokerFilter1.removeBroker(connection2, brokerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue1 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties2 = null;
        activeMQQueue1.buildFromProperties(properties2);
        activeMQQueue1.setDLQ(true);
        org.apache.activemq.command.ConnectionInfo connectionInfo6 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.broker.ConnectionContext connectionContext7 = new org.apache.activemq.broker.ConnectionContext(connectionInfo6);
        connectionInfo6.setPassword("queue://");
        int int10 = activeMQQueue1.compareTo((java.lang.Object) "queue://");
        java.util.Properties properties11 = null;
        activeMQQueue1.setProperties(properties11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.command.ActiveMQQueue activeMQQueue3 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        org.apache.activemq.command.ActiveMQDestination[] activeMQDestinationArray4 = activeMQQueue3.getCompositeDestinations();
        try {
            java.util.Map<org.apache.activemq.command.ActiveMQDestination, org.apache.activemq.broker.region.Destination> activeMQDestinationMap5 = brokerFilter1.getDestinationMap((org.apache.activemq.command.ActiveMQDestination) activeMQQueue3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(activeMQDestinationArray4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        org.apache.activemq.thread.Scheduler scheduler3 = brokerService1.getScheduler();
        org.apache.activemq.usage.SystemUsage systemUsage4 = brokerService1.getConsumerSystemUsage();
        java.net.URI uRI5 = null;
        try {
            org.apache.activemq.network.NetworkConnector networkConnector6 = brokerService1.addNetworkConnector(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(scheduler3);
        org.junit.Assert.assertNotNull(systemUsage4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = brokerService0.getTransportConnectorURIsAsMap();
        org.apache.activemq.broker.BrokerService brokerService6 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap7 = brokerService6.getDestinationPolicy();
        java.io.File file8 = brokerService6.getBrokerDataDirectory();
        brokerService0.setDataDirectoryFile(file8);
        int int10 = brokerService0.getDiskUsageCheckRegrowThreshold();
        int int11 = brokerService0.getPersistenceThreadPriority();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(policyMap7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.activemq.command.ActiveMQDestination activeMQDestination2 = org.apache.activemq.command.ActiveMQDestination.createDestination("isDLQ", (byte) 1);
        org.apache.activemq.command.ActiveMQDestination activeMQDestination3 = org.apache.activemq.command.ActiveMQDestination.transform((javax.jms.Destination) activeMQDestination2);
        java.lang.String str4 = activeMQDestination3.getDestinationTypeAsString();
        org.junit.Assert.assertNotNull(activeMQDestination2);
        org.junit.Assert.assertNotNull(activeMQDestination3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Queue" + "'", str4.equals("Queue"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        byte byte0 = org.apache.activemq.command.ActiveMQDestination.TEMP_TOPIC_TYPE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 6 + "'", byte0 == (byte) 6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        org.apache.activemq.command.ActiveMQQueue activeMQQueue4 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties5 = null;
        activeMQQueue4.buildFromProperties(properties5);
        boolean boolean7 = brokerService0.shouldRecordVirtualDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue4);
        org.apache.activemq.broker.BrokerService brokerService8 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService9 = new org.apache.activemq.broker.BrokerService();
        brokerService8.addService((org.apache.activemq.Service) brokerService9);
        brokerService8.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = brokerService8.getTransportConnectorURIsAsMap();
        org.apache.activemq.broker.BrokerService brokerService14 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap15 = brokerService14.getDestinationPolicy();
        java.io.File file16 = brokerService14.getBrokerDataDirectory();
        brokerService8.setDataDirectoryFile(file16);
        brokerService0.setDataDirectoryFile(file16);
        org.apache.activemq.transport.TransportServer transportServer19 = null;
        org.apache.activemq.broker.TransportConnector transportConnector20 = new org.apache.activemq.broker.TransportConnector(transportServer19);
        java.net.URI uRI21 = transportConnector20.getConnectUri();
        java.net.URI uRI22 = transportConnector20.getUri();
        try {
            org.apache.activemq.broker.TransportConnector transportConnector23 = brokerService0.startTransportConnector(transportConnector20);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Transport Connector could not be registered in JMX: java.lang.NullPointerException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(policyMap15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull(uRI21);
        org.junit.Assert.assertNull(uRI22);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        try {
            boolean boolean2 = brokerFilter1.isFaultTolerantConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerContext brokerContext1 = null;
        brokerService0.setBrokerContext(brokerContext1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = openWireFormat1.copy();
        openWireFormat1.setTcpNoDelayEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(openWireFormat3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue1 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.lang.String str2 = activeMQQueue1.getQueueName();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination3 = org.apache.activemq.command.ActiveMQDestination.transform((javax.jms.Destination) activeMQQueue1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(activeMQDestination3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue1 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.lang.String str2 = activeMQQueue1.getQueueName();
        java.lang.String[] strArray3 = activeMQQueue1.getDestinationPaths();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        org.apache.activemq.thread.Scheduler scheduler3 = brokerService1.getScheduler();
        org.apache.activemq.usage.SystemUsage systemUsage4 = brokerService1.getConsumerSystemUsage();
        boolean boolean5 = brokerService1.isCacheTempDestinations();
        org.junit.Assert.assertNotNull(scheduler3);
        org.junit.Assert.assertNotNull(systemUsage4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        activeMQConnection0.setUseAsyncSend(false);
        activeMQConnection0.setNonBlockingRedelivery(false);
        boolean boolean6 = activeMQConnection0.isTransportFailed();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        java.lang.Object obj3 = connectionContext1.getLongTermStoreContext();
        org.apache.activemq.security.SecurityContext securityContext4 = connectionContext1.getSecurityContext();
        connectionContext1.setClientId("61616");
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(securityContext4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.transaction.Transaction transaction4 = connectionContext3.getTransaction();
        java.lang.Object obj5 = connectionContext3.getLongTermStoreContext();
        org.apache.activemq.broker.region.MessageReference messageReference6 = null;
        boolean boolean7 = connectionContext3.isAllowedToConsume(messageReference6);
        boolean boolean8 = connectionContext3.isNetworkConnection();
        org.apache.activemq.broker.region.Destination destination9 = null;
        org.apache.activemq.broker.region.Subscription subscription10 = null;
        try {
            brokerFilter1.slowConsumer(connectionContext3, destination9, subscription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(transaction4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        brokerService0.setPersistenceThreadPriority(0);
        boolean boolean5 = brokerService0.isStopped();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        boolean boolean3 = connectionInfo0.isFailoverReconnect();
        java.lang.String str4 = connectionInfo0.getClientIp();
        org.apache.activemq.command.Endpoint endpoint5 = null;
        connectionInfo0.setFrom(endpoint5);
        boolean boolean7 = connectionInfo0.isClientMaster();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = brokerService0.getTransportConnectorURIsAsMap();
        org.apache.activemq.broker.BrokerService brokerService6 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap7 = brokerService6.getDestinationPolicy();
        java.io.File file8 = brokerService6.getBrokerDataDirectory();
        brokerService0.setDataDirectoryFile(file8);
        int int10 = brokerService0.getDiskUsageCheckRegrowThreshold();
        int int11 = brokerService0.getTaskRunnerPriority();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(policyMap7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        int int6 = transportConnector1.getMaximumConsumersAllowedPerConnection();
        org.apache.activemq.command.BrokerInfo brokerInfo7 = null;
        try {
            transportConnector1.removePeerBroker(brokerInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = activeMQConnection0.getRejectedTaskHandler();
        boolean boolean4 = activeMQConnection0.isUseAsyncSend();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        org.apache.activemq.broker.BrokerPlugin[] brokerPluginArray3 = brokerService0.getPlugins();
        org.junit.Assert.assertNull(brokerPluginArray3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        brokerService0.incrementCurrentConnections();
        org.apache.activemq.usage.SystemUsage systemUsage3 = brokerService0.getConsumerSystemUsage();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(systemUsage3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue0 = new org.apache.activemq.command.ActiveMQQueue();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        org.apache.activemq.command.BrokerId[] brokerIdArray2 = connectionInfo1.getBrokerPath();
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertNull(brokerIdArray2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.net.URI uRI0 = null;
        try {
            org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory1 = new org.apache.activemq.ActiveMQConnectionFactory(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        boolean boolean3 = brokerService0.isUseAuthenticatedPrincipalForJMSXUserID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        org.apache.activemq.MessageTransformer messageTransformer2 = activeMQConnection0.getTransformer();
        boolean boolean3 = activeMQConnection0.isCopyMessageOnSend();
        boolean boolean4 = activeMQConnection0.isDispatchAsync();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(messageTransformer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        boolean boolean7 = activeMQConnection0.isTransactedIndividualAck();
        boolean boolean8 = activeMQConnection0.isNonBlockingRedelivery();
        activeMQConnection0.setOptimizeAcknowledgeTimeOut((long) (byte) 1);
        org.apache.activemq.management.JMSConnectionStatsImpl jMSConnectionStatsImpl11 = activeMQConnection0.getConnectionStats();
        long long12 = activeMQConnection0.getOptimizeAcknowledgeTimeOut();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jMSConnectionStatsImpl11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean4 = openWireFormat3.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat5 = openWireFormat3.copy();
        int int6 = openWireFormat3.getVersion();
        java.io.DataOutput dataOutput7 = null;
        try {
            openWireFormat1.marshal((java.lang.Object) openWireFormat3, dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.activemq.openwire.OpenWireFormat cannot be cast to org.apache.activemq.command.DataStructure");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(openWireFormat5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        java.lang.Object obj3 = connectionContext1.getLongTermStoreContext();
        org.apache.activemq.security.SecurityContext securityContext4 = connectionContext1.getSecurityContext();
        org.apache.activemq.broker.Broker broker5 = null;
        connectionContext1.setBroker(broker5);
        org.apache.activemq.security.MessageAuthorizationPolicy messageAuthorizationPolicy7 = connectionContext1.getMessageAuthorizationPolicy();
        org.apache.activemq.state.ConnectionState connectionState8 = null;
        connectionContext1.setConnectionState(connectionState8);
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(securityContext4);
        org.junit.Assert.assertNull(messageAuthorizationPolicy7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.transaction.Transaction transaction4 = connectionContext3.getTransaction();
        java.lang.Object obj5 = connectionContext3.getLongTermStoreContext();
        org.apache.activemq.broker.region.MessageReference messageReference6 = null;
        boolean boolean7 = connectionContext3.isAllowedToConsume(messageReference6);
        org.apache.activemq.command.TransactionId transactionId8 = null;
        try {
            brokerFilter1.forgetTransaction(connectionContext3, transactionId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(transaction4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.Runnable[] runnableArray3 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList4 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList4, runnableArray3);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList4);
        long long7 = brokerService0.getOfflineDurableSubscriberTimeout();
        org.junit.Assert.assertNotNull(runnableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.util.ServiceStopper serviceStopper1 = null;
        brokerService0.stopAllConnectors(serviceStopper1);
        org.apache.activemq.broker.BrokerPlugin[] brokerPluginArray3 = brokerService0.getPlugins();
        org.junit.Assert.assertNull(brokerPluginArray3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        boolean boolean3 = brokerService0.isDeleteAllMessagesOnStartup();
        long long4 = brokerService0.getWaitForSlaveTimeout();
        brokerService0.setBrokerName("ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}");
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        try {
            org.apache.activemq.store.PListStore pListStore2 = brokerFilter1.getTempDataStore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        long long0 = org.apache.activemq.openwire.OpenWireFormat.DEFAULT_MAX_FRAME_SIZE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 9223372036854775807L + "'", long0 == 9223372036854775807L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        org.apache.activemq.command.BrokerInfo brokerInfo3 = null;
        transportConnector1.setBrokerInfo(brokerInfo3);
        org.apache.activemq.security.MessageAuthorizationPolicy messageAuthorizationPolicy5 = transportConnector1.getMessageAuthorizationPolicy();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertNull(messageAuthorizationPolicy5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.Runnable[] runnableArray3 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList4 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList4, runnableArray3);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList4);
        java.util.List<org.apache.activemq.broker.TransportConnector> transportConnectorList7 = brokerService0.getTransportConnectors();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}", "${project.version}", "OpenWireFormat{version=1, cacheEnabled=false, stackTraceEnabled=false, tightEncodingEnabled=false, sizePrefixDisabled=false, maxFrameSize=9223372036854775807}", "hi!", "ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}", "ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}", "hi!", "OpenWireFormat{version=1, cacheEnabled=false, stackTraceEnabled=false, tightEncodingEnabled=false, sizePrefixDisabled=false, maxFrameSize=9223372036854775807}", "Queue", "ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}", "temp-queue://", "61616" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        try {
            brokerService0.setProxyConnectors((java.util.List<java.lang.String>) strList22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.base/java.lang.String cannot be cast to org.apache.activemq.proxy.ProxyConnector");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(runnableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(transportConnectorList7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = openWireFormat1.copy();
        org.apache.activemq.command.DataStructure dataStructure4 = null;
        java.lang.Short short5 = openWireFormat1.getMarshallCacheIndex(dataStructure4);
        org.apache.activemq.openwire.OpenWireFormat openWireFormat6 = openWireFormat1.copy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(openWireFormat3);
        org.junit.Assert.assertNull(short5);
        org.junit.Assert.assertNotNull(openWireFormat6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap3 = null;
        activeMQConnection0.setRedeliveryPolicyMap(redeliveryPolicyMap3);
        activeMQConnection0.setTransactedIndividualAck(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        java.util.List<java.lang.String> strList7 = activeMQConnection0.getTrustedPackages();
        activeMQConnection0.setCloseTimeout((int) (byte) 4);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        int int6 = transportConnector1.getMaximumConsumersAllowedPerConnection();
        transportConnector1.setDisableAsyncDispatch(true);
        org.apache.activemq.broker.TransportConnection transportConnection9 = null;
        transportConnector1.onStarted(transportConnection9);
        org.apache.activemq.transport.TransportServer transportServer11 = null;
        transportConnector1.setServer(transportServer11);
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        byte byte2 = connectionInfo0.getDataStructureType();
        org.apache.activemq.command.ConnectionId connectionId3 = connectionInfo0.getConnectionId();
        connectionInfo0.setClientIp("tcp://localhost:61616");
        java.lang.String str6 = connectionInfo0.getPassword();
        connectionInfo0.setClientId("hi!");
        byte byte9 = connectionInfo0.getDataStructureType();
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
        org.junit.Assert.assertNull(connectionId3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        org.apache.activemq.broker.TransportConnection transportConnection6 = null;
        transportConnector1.onStarted(transportConnection6);
        org.apache.activemq.broker.Broker broker8 = transportConnector1.getBroker();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertNull(broker8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.command.BrokerInfo brokerInfo2 = null;
        try {
            brokerFilter1.networkBridgeStopped(brokerInfo2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        java.lang.String str3 = brokerService0.getDefaultSocketURIString();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        boolean boolean2 = connectionContext1.isNetworkConnection();
        org.apache.activemq.security.MessageAuthorizationPolicy messageAuthorizationPolicy3 = null;
        connectionContext1.setMessageAuthorizationPolicy(messageAuthorizationPolicy3);
        org.apache.activemq.transaction.Transaction transaction5 = null;
        connectionContext1.setTransaction(transaction5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        org.apache.activemq.MessageTransformer messageTransformer2 = activeMQConnection0.getTransformer();
        activeMQConnection0.setDispatchAsync(false);
        activeMQConnection0.setDisableTimeStampsByDefault(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(messageTransformer2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        boolean boolean4 = activeMQConnection0.isNonBlockingRedelivery();
        activeMQConnection0.setMaxThreadPoolSize((int) (short) 10);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.Runnable[] runnableArray3 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList4 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList4, runnableArray3);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList4);
        org.apache.activemq.broker.TransportConnector transportConnector8 = brokerService0.getTransportConnectorByName("61616");
        brokerService0.setProducerSystemUsagePortion(10);
        org.junit.Assert.assertNotNull(runnableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transportConnector8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        boolean boolean2 = connectionContext1.isNetworkConnection();
        java.util.concurrent.ConcurrentMap<org.apache.activemq.command.TransactionId, org.apache.activemq.transaction.Transaction> transactionIdMap3 = connectionContext1.getTransactions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(transactionIdMap3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap3 = null;
        activeMQConnection0.setRedeliveryPolicyMap(redeliveryPolicyMap3);
        javax.jms.ConnectionMetaData connectionMetaData5 = activeMQConnection0.getMetaData();
        java.lang.Throwable throwable6 = null;
        activeMQConnection0.onClientInternalException(throwable6);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionMetaData5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        java.lang.Object obj3 = connectionContext1.getLongTermStoreContext();
        org.apache.activemq.security.SecurityContext securityContext4 = connectionContext1.getSecurityContext();
        org.apache.activemq.broker.Broker broker5 = null;
        connectionContext1.setBroker(broker5);
        org.apache.activemq.security.MessageAuthorizationPolicy messageAuthorizationPolicy7 = connectionContext1.getMessageAuthorizationPolicy();
        java.lang.String str8 = connectionContext1.getUserName();
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(securityContext4);
        org.junit.Assert.assertNull(messageAuthorizationPolicy7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        org.apache.activemq.MessageTransformer messageTransformer2 = activeMQConnection0.getTransformer();
        activeMQConnection0.setDispatchAsync(false);
        boolean boolean5 = activeMQConnection0.isUseAsyncSend();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(messageTransformer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        byte byte0 = org.apache.activemq.command.ActiveMQQueue.DATA_STRUCTURE_TYPE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 100 + "'", byte0 == (byte) 100);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        boolean boolean4 = activeMQConnection0.isNonBlockingRedelivery();
        boolean boolean5 = activeMQConnection0.isWatchTopicAdvisories();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        java.lang.Object obj3 = connectionContext1.getLongTermStoreContext();
        org.apache.activemq.broker.region.MessageReference messageReference4 = null;
        boolean boolean5 = connectionContext1.isAllowedToConsume(messageReference4);
        org.apache.activemq.transport.TransportServer transportServer6 = null;
        org.apache.activemq.broker.TransportConnector transportConnector7 = new org.apache.activemq.broker.TransportConnector(transportServer6);
        java.net.URI uRI8 = transportConnector7.getUri();
        java.lang.String str9 = transportConnector7.toString();
        boolean boolean10 = transportConnector7.isDisableAsyncDispatch();
        connectionContext1.setConnector((org.apache.activemq.broker.Connector) transportConnector7);
        java.net.URI uRI12 = null;
        transportConnector7.setUri(uRI12);
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(uRI8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = activeMQConnection0.getRejectedTaskHandler();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy4 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy4);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        boolean boolean3 = brokerService0.isDeleteAllMessagesOnStartup();
        long long4 = brokerService0.getWaitForSlaveTimeout();
        int int5 = brokerService0.getMaxPurgedDestinationsPerSweep();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.io.File file5 = brokerService0.getTmpDataDirectory();
        org.junit.Assert.assertNotNull(file5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.activemq.util.ByteSequence byteSequence0 = new org.apache.activemq.util.ByteSequence();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        java.util.concurrent.CopyOnWriteArrayList<org.apache.activemq.broker.TransportConnection> transportConnectionList4 = transportConnector1.getConnections();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertNotNull(transportConnectionList4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        brokerService0.incrementCurrentConnections();
        java.lang.String[] strArray3 = brokerService0.getNetworkConnectorURIs();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        org.apache.activemq.command.Endpoint endpoint3 = null;
        connectionInfo0.setFrom(endpoint3);
        boolean boolean5 = connectionInfo0.isClientMaster();
        connectionInfo0.setClientIp("queue://");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap3 = null;
        activeMQConnection0.setRedeliveryPolicyMap(redeliveryPolicyMap3);
        activeMQConnection0.close();
        activeMQConnection0.setTransactedIndividualAck(true);
        boolean boolean8 = activeMQConnection0.isCheckForDuplicates();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue1 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.lang.String str2 = activeMQQueue1.getQueueName();
        org.apache.activemq.command.ConnectionInfo connectionInfo3 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.Endpoint endpoint4 = connectionInfo3.getFrom();
        java.lang.String str5 = connectionInfo3.getClientIp();
        boolean boolean6 = activeMQQueue1.equals((java.lang.Object) connectionInfo3);
        connectionInfo3.setPassword("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNull(endpoint4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.broker.ProducerBrokerExchange producerBrokerExchange2 = null;
        org.apache.activemq.command.Message message3 = null;
        try {
            brokerFilter1.send(producerBrokerExchange2, message3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.net.URI uRI3 = transportConnector1.getConnectUri();
        org.apache.activemq.broker.region.ConnectorStatistics connectorStatistics4 = transportConnector1.getStatistics();
        java.net.URI uRI5 = transportConnector1.getDiscoveryUri();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertNotNull(connectorStatistics4);
        org.junit.Assert.assertNull(uRI5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        brokerService0.setPersistenceThreadPriority(0);
        long long5 = brokerService0.getWaitForSlaveTimeout();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        boolean boolean2 = brokerService0.isUseVirtualDestSubs();
        brokerService0.masterFailed();
        try {
            org.apache.activemq.broker.TransportConnector transportConnector5 = brokerService0.addConnector("ID:");
            org.junit.Assert.fail("Expected exception of type java.net.URISyntaxException; message: Expected scheme-specific part at index 3: ID:");
        } catch (java.net.URISyntaxException e) {
        }
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        boolean boolean3 = connectionInfo0.isFailoverReconnect();
        boolean boolean4 = connectionInfo0.isConsumerControl();
        connectionInfo0.setUserName("61616");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        org.apache.activemq.broker.BrokerService brokerService2 = transportConnector1.getBrokerService();
        int int3 = transportConnector1.getMaximumProducersAllowedPerConnection();
        org.junit.Assert.assertNull(brokerService2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        org.apache.activemq.command.Endpoint endpoint2 = connectionInfo0.getFrom();
        connectionInfo0.setClientIp("ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}");
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertNull(endpoint2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        boolean boolean7 = activeMQConnection0.isTransactedIndividualAck();
        boolean boolean8 = activeMQConnection0.isNonBlockingRedelivery();
        boolean boolean9 = activeMQConnection0.isCopyMessageOnSend();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        boolean boolean5 = brokerService0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap2 = brokerService1.getDestinationPolicy();
        java.io.File file3 = brokerService1.getBrokerDataDirectory();
        brokerService0.setSchedulerDirectoryFile(file3);
        org.junit.Assert.assertNull(policyMap2);
        org.junit.Assert.assertNotNull(file3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        boolean boolean4 = connectionContext3.isNetworkConnection();
        connectionContext3.setReconnect(true);
        org.apache.activemq.command.RemoveSubscriptionInfo removeSubscriptionInfo7 = null;
        try {
            brokerFilter1.removeSubscription(connectionContext3, removeSubscriptionInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        activeMQConnection0.setUseAsyncSend(false);
        activeMQConnection0.setNonBlockingRedelivery(false);
        int int6 = activeMQConnection0.getMaxThreadPoolSize();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        java.util.List<java.lang.String> strList7 = activeMQConnection0.getTrustedPackages();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory8 = activeMQConnection0.getSessionTaskRunner();
        boolean boolean9 = activeMQConnection0.isUseAsyncSend();
        javax.jms.ExceptionListener exceptionListener10 = activeMQConnection0.getExceptionListener();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(taskRunnerFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(exceptionListener10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        org.apache.activemq.thread.Scheduler scheduler3 = brokerService1.getScheduler();
        boolean boolean4 = brokerService1.isSplitSystemUsageForProducersConsumers();
        java.util.List<org.apache.activemq.proxy.ProxyConnector> proxyConnectorList5 = brokerService1.getProxyConnectors();
        org.junit.Assert.assertNotNull(scheduler3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(proxyConnectorList5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int int0 = org.apache.activemq.openwire.OpenWireFormat.DEFAULT_LEGACY_VERSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = brokerService0.getTransportConnectorURIsAsMap();
        org.apache.activemq.broker.region.DestinationFactory destinationFactory6 = null;
        brokerService0.setDestinationFactory(destinationFactory6);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        activeMQConnection0.setNestedMapAndListEnabled(true);
        long long7 = activeMQConnection0.getOptimizedAckScheduledAckInterval();
        int int8 = activeMQConnection0.getCloseTimeout();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        byte byte2 = connectionInfo0.getDataStructureType();
        org.apache.activemq.command.ConnectionId connectionId3 = connectionInfo0.getConnectionId();
        byte byte4 = connectionInfo0.getDataStructureType();
        connectionInfo0.setClientId("");
        org.apache.activemq.command.ConnectionId connectionId7 = connectionInfo0.getConnectionId();
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
        org.junit.Assert.assertNull(connectionId3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 3 + "'", byte4 == (byte) 3);
        org.junit.Assert.assertNull(connectionId7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap5 = activeMQConnection0.getRedeliveryPolicyMap();
        activeMQConnection0.setAuditDepth((int) (byte) 10);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        org.apache.activemq.command.ConnectionId connectionId3 = connectionContext1.getConnectionId();
        java.lang.String str4 = connectionContext1.getUserName();
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(connectionId3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        boolean boolean3 = activeMQConnection0.isMessagePrioritySupported();
        long long4 = activeMQConnection0.getConsumerFailoverRedeliveryWaitPeriod();
        boolean boolean5 = activeMQConnection0.isExclusiveConsumer();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        int int6 = transportConnector1.getMaximumConsumersAllowedPerConnection();
        transportConnector1.setUpdateClusterClientsOnRemove(true);
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        try {
            brokerFilter1.reapplyInterceptor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat0 = new org.apache.activemq.openwire.OpenWireFormat();
        openWireFormat0.setStackTraceEnabled(false);
        java.io.DataInput dataInput3 = null;
        try {
            java.lang.Object obj4 = openWireFormat0.unmarshal(dataInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = activeMQConnection0.getRejectedTaskHandler();
        org.apache.activemq.command.ActiveMQTempDestination activeMQTempDestination4 = null;
        try {
            activeMQConnection0.deleteTempDestination(activeMQTempDestination4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE = (byte) 1;
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        long long5 = activeMQConnection0.getWarnAboutUnstartedConnectionTimeout();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 500L + "'", long5 == 500L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.broker.region.MessageReference messageReference2 = null;
        try {
            boolean boolean3 = brokerFilter1.isExpired(messageReference2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        activeMQConnection0.setNestedMapAndListEnabled(true);
        activeMQConnection0.setRmIdFromConnectionId(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.Runnable[] runnableArray3 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList4 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList4, runnableArray3);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = brokerService0.getTransportConnectorURIsAsMap();
        org.junit.Assert.assertNotNull(runnableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        brokerService0.setPersistenceThreadPriority(0);
        brokerService0.setDiskUsageCheckRegrowThreshold((int) (byte) 100);
        brokerService0.setUseMirroredQueues(true);
        org.apache.activemq.network.NetworkConnector networkConnector9 = null;
        try {
            javax.management.ObjectName objectName10 = brokerService0.createNetworkConnectorObjectName(networkConnector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.broker.Broker broker4 = null;
        connectionContext3.setBroker(broker4);
        connectionContext3.setReconnect(false);
        org.apache.activemq.broker.Broker broker8 = connectionContext3.getBroker();
        org.apache.activemq.command.TransactionId transactionId9 = null;
        try {
            int int10 = brokerFilter1.prepareTransaction(connectionContext3, transactionId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(broker8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        org.apache.activemq.broker.Broker broker3 = brokerService0.getRegionBroker();
        org.junit.Assert.assertNull(broker3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        boolean boolean3 = brokerService0.isDeleteAllMessagesOnStartup();
        org.apache.activemq.usage.SystemUsage systemUsage4 = brokerService0.getConsumerSystemUsage();
        int int5 = brokerService0.getTaskRunnerPriority();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(systemUsage4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        boolean boolean3 = brokerService0.isUseVirtualDestSubsOnCreation();
        brokerService0.setWaitForSlave(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue1 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties2 = null;
        activeMQQueue1.buildFromProperties(properties2);
        java.lang.String str4 = activeMQQueue1.getQueueName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.Endpoint endpoint1 = connectionInfo0.getFrom();
        connectionInfo0.setResponseRequired(false);
        org.junit.Assert.assertNull(endpoint1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        org.apache.activemq.broker.TransportConnection transportConnection6 = null;
        transportConnector1.onStarted(transportConnection6);
        java.net.URI uRI8 = transportConnector1.getDiscoveryUri();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertNull(uRI8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap3 = null;
        activeMQConnection0.setRedeliveryPolicyMap(redeliveryPolicyMap3);
        activeMQConnection0.setUseAsyncSend(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        boolean boolean7 = activeMQConnection0.isTransactedIndividualAck();
        boolean boolean8 = activeMQConnection0.isStarted();
        activeMQConnection0.setCheckForDuplicates(false);
        activeMQConnection0.setSendTimeout((int) (byte) 3);
        boolean boolean13 = activeMQConnection0.isStarted();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = brokerService0.getTransportConnectorURIsAsMap();
        org.apache.activemq.broker.BrokerService brokerService6 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap7 = brokerService6.getDestinationPolicy();
        java.io.File file8 = brokerService6.getBrokerDataDirectory();
        brokerService0.setDataDirectoryFile(file8);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        org.apache.activemq.broker.scheduler.JobSchedulerStore jobSchedulerStore12 = brokerService0.getJobSchedulerStore();
        boolean boolean13 = brokerService0.isStartAsync();
        org.apache.activemq.network.jms.JmsConnector jmsConnector14 = null;
        try {
            org.apache.activemq.network.jms.JmsConnector jmsConnector15 = brokerService0.addJmsConnector(jmsConnector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(policyMap7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull(jobSchedulerStore12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        boolean boolean3 = brokerService0.isDeleteAllMessagesOnStartup();
        long long4 = brokerService0.getWaitForSlaveTimeout();
        org.apache.activemq.network.jms.JmsConnector jmsConnector5 = null;
        try {
            org.apache.activemq.network.jms.JmsConnector jmsConnector6 = brokerService0.addJmsConnector(jmsConnector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 600000L + "'", long4 == 600000L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        int int6 = transportConnector1.getMaximumConsumersAllowedPerConnection();
        transportConnector1.setDisableAsyncDispatch(true);
        org.apache.activemq.broker.TransportConnection transportConnection9 = null;
        transportConnector1.onStarted(transportConnection9);
        transportConnector1.setName("");
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.util.ServiceStopper serviceStopper1 = null;
        brokerService0.stopAllConnectors(serviceStopper1);
        org.apache.activemq.network.jms.JmsConnector jmsConnector3 = null;
        try {
            org.apache.activemq.network.jms.JmsConnector jmsConnector4 = brokerService0.addJmsConnector(jmsConnector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext2 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext3 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext2);
        org.apache.activemq.security.SecurityContext securityContext4 = null;
        connectionContext3.setSecurityContext(securityContext4);
        connectionContext3.setInRecoveryMode(false);
        org.apache.activemq.command.WireFormatInfo wireFormatInfo8 = connectionContext3.getWireFormatInfo();
        org.apache.activemq.broker.region.Destination destination9 = null;
        org.apache.activemq.broker.region.Subscription subscription10 = null;
        try {
            brokerFilter1.slowConsumer(connectionContext3, destination9, subscription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(wireFormatInfo8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = brokerService0.getTransportConnectorURIsAsMap();
        org.apache.activemq.broker.BrokerService brokerService6 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap7 = brokerService6.getDestinationPolicy();
        java.io.File file8 = brokerService6.getBrokerDataDirectory();
        brokerService0.setDataDirectoryFile(file8);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        brokerService0.masterFailed();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(policyMap7);
        org.junit.Assert.assertNotNull(file8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        java.lang.Object obj3 = connectionContext1.getLongTermStoreContext();
        org.apache.activemq.broker.region.MessageReference messageReference4 = null;
        boolean boolean5 = connectionContext1.isAllowedToConsume(messageReference4);
        connectionContext1.setReconnect(false);
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext8 = connectionContext1.getMessageEvaluationContext();
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(messageEvaluationContext8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        org.apache.activemq.command.ActiveMQQueue activeMQQueue4 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties5 = null;
        activeMQQueue4.buildFromProperties(properties5);
        boolean boolean7 = brokerService0.shouldRecordVirtualDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue4);
        brokerService0.setAdvisorySupport(false);
        try {
            brokerService0.stopGracefully("temp-queue://", "", 0L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: connectorName and queueName cannot be null and timeout should be >0 for stopGracefully.");
        } catch (java.lang.Exception e) {
        }
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        brokerService0.setPersistenceThreadPriority(0);
        brokerService0.setDiskUsageCheckRegrowThreshold((int) (byte) 100);
        brokerService0.setUseMirroredQueues(true);
        java.io.IOException iOException9 = null;
        brokerService0.handleIOException(iOException9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        boolean boolean3 = brokerService0.isKeepDurableSubsActive();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.transport.TransportServer transportServer1 = null;
        org.apache.activemq.broker.TransportConnector transportConnector2 = brokerService0.addConnector(transportServer1);
        org.junit.Assert.assertNotNull(transportConnector2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        int int6 = transportConnector1.getMaximumConsumersAllowedPerConnection();
        transportConnector1.setDisableAsyncDispatch(true);
        int int9 = transportConnector1.getMaximumProducersAllowedPerConnection();
        org.apache.activemq.ActiveMQConnection activeMQConnection10 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer11 = null;
        activeMQConnection10.setTransformer(messageTransformer11);
        activeMQConnection10.setOptimizedMessageDispatch(true);
        boolean boolean15 = activeMQConnection10.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener16 = activeMQConnection10.getClientInternalExceptionListener();
        java.util.List<java.lang.String> strList17 = activeMQConnection10.getTrustedPackages();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory18 = activeMQConnection10.getSessionTaskRunner();
        transportConnector1.setTaskRunnerFactory(taskRunnerFactory18);
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(activeMQConnection10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(taskRunnerFactory18);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.broker.Broker broker2 = null;
        connectionContext1.setBroker(broker2);
        java.util.concurrent.ConcurrentMap<org.apache.activemq.command.TransactionId, org.apache.activemq.transaction.Transaction> transactionIdMap4 = null;
        connectionContext1.setTransactions(transactionIdMap4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.Runnable[] runnableArray3 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList4 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList4, runnableArray3);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList4);
        org.apache.activemq.broker.TransportConnector transportConnector8 = brokerService0.getTransportConnectorByName("61616");
        org.apache.activemq.broker.jmx.ManagementContext managementContext9 = null;
        brokerService0.setManagementContext(managementContext9);
        org.junit.Assert.assertNotNull(runnableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(transportConnector8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        org.apache.activemq.store.PersistenceAdapter persistenceAdapter3 = null;
        brokerService0.setPersistenceAdapter(persistenceAdapter3);
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        org.apache.activemq.command.ActiveMQQueue activeMQQueue4 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties5 = null;
        activeMQQueue4.buildFromProperties(properties5);
        boolean boolean7 = brokerService0.shouldRecordVirtualDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue4);
        brokerService0.setAdvisorySupport(false);
        brokerService0.setTaskRunnerPriority(100);
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        java.lang.String str5 = activeMQConnection0.getClientID();
        boolean boolean6 = activeMQConnection0.isDispatchAsync();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        boolean boolean5 = brokerService0.isStopped();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer2 = null;
        activeMQConnection1.setTransformer(messageTransformer2);
        activeMQConnection1.setOptimizedMessageDispatch(true);
        boolean boolean6 = activeMQConnection1.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener7 = activeMQConnection1.getClientInternalExceptionListener();
        java.util.List<java.lang.String> strList8 = activeMQConnection1.getTrustedPackages();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory9 = activeMQConnection1.getSessionTaskRunner();
        brokerService0.setPersistenceTaskRunnerFactory(taskRunnerFactory9);
        brokerService0.setSplitSystemUsageForProducersConsumers(false);
        org.junit.Assert.assertNotNull(activeMQConnection1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(taskRunnerFactory9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.activemq.command.ActiveMQQueue activeMQQueue1 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        org.apache.activemq.command.ActiveMQDestination[] activeMQDestinationArray2 = activeMQQueue1.getCompositeDestinations();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination3 = org.apache.activemq.command.ActiveMQDestination.transform((javax.jms.Destination) activeMQQueue1);
        byte byte4 = activeMQQueue1.getDestinationType();
        org.junit.Assert.assertNull(activeMQDestinationArray2);
        org.junit.Assert.assertNotNull(activeMQDestination3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        org.apache.activemq.command.ActiveMQQueue activeMQQueue4 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties5 = null;
        activeMQQueue4.buildFromProperties(properties5);
        boolean boolean7 = brokerService0.shouldRecordVirtualDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue4);
        org.apache.activemq.broker.BrokerService brokerService8 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService9 = new org.apache.activemq.broker.BrokerService();
        brokerService8.addService((org.apache.activemq.Service) brokerService9);
        brokerService8.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = brokerService8.getTransportConnectorURIsAsMap();
        org.apache.activemq.broker.BrokerService brokerService14 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap15 = brokerService14.getDestinationPolicy();
        java.io.File file16 = brokerService14.getBrokerDataDirectory();
        brokerService8.setDataDirectoryFile(file16);
        brokerService0.setDataDirectoryFile(file16);
        java.lang.Runnable[] runnableArray19 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList20 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList20, runnableArray19);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList20);
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(policyMap15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(runnableArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy1 = activeMQConnection0.getBlobTransferPolicy();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer3 = null;
        activeMQConnection2.setTransformer(messageTransformer3);
        activeMQConnection2.setWatchTopicAdvisories(false);
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(blobTransferPolicy1);
        org.junit.Assert.assertNotNull(activeMQConnection2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        org.apache.activemq.broker.TransportConnection transportConnection6 = null;
        transportConnector1.onStarted(transportConnection6);
        transportConnector1.setAuditNetworkProducers(false);
        org.apache.activemq.broker.BrokerService brokerService10 = transportConnector1.getBrokerService();
        transportConnector1.setMaximumProducersAllowedPerConnection(35);
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertNull(brokerService10);
    }
}
