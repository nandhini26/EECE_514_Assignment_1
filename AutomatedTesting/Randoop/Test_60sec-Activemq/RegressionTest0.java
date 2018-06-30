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
        org.apache.activemq.command.UnresolvedDestinationTransformer unresolvedDestinationTransformer0 = org.apache.activemq.command.ActiveMQDestination.getUnresolvableDestinationTransformer();
        org.junit.Assert.assertNotNull(unresolvedDestinationTransformer0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        long long0 = org.apache.activemq.broker.BrokerService.DEFAULT_START_TIMEOUT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 600000L + "'", long0 == 600000L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.QUEUE_QUALIFIED_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "queue://" + "'", str0.equals("queue://"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.IS_DLQ;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isDLQ" + "'", str0.equals("isDLQ"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setClientId("isDLQ");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.activemq.broker.BrokerService.BROKER_VERSION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "${project.version}" + "'", str0.equals("${project.version}"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        byte byte0 = org.apache.activemq.command.ConnectionInfo.DATA_STRUCTURE_TYPE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 3 + "'", byte0 == (byte) 3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_BROKER_BIND_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tcp://localhost:61616" + "'", str0.equals("tcp://localhost:61616"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.security.SecurityContext securityContext2 = null;
        connectionContext1.setSecurityContext(securityContext2);
        connectionContext1.setInRecoveryMode(false);
        org.apache.activemq.security.SecurityContext securityContext6 = null;
        connectionContext1.setSecurityContext(securityContext6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.activemq.broker.ConnectionContext connectionContext0 = new org.apache.activemq.broker.ConnectionContext();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        boolean boolean2 = connectionContext1.isNetworkConnection();
        connectionContext1.setReconnect(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.net.URI uRI2 = null;
        try {
            org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory3 = new org.apache.activemq.ActiveMQConnectionFactory("", "${project.version}", uRI2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        try {
            org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid version: 32, could not load org.apache.activemq.openwire.v32.MarshallerFactory");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.TEMP_DESTINATION_NAME_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ID:" + "'", str0.equals("ID:"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        byte byte2 = connectionInfo0.getDataStructureType();
        org.apache.activemq.command.ConnectionId connectionId3 = connectionInfo0.getConnectionId();
        byte byte4 = connectionInfo0.getDataStructureType();
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
        org.junit.Assert.assertNull(connectionId3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 3 + "'", byte4 == (byte) 3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        org.apache.activemq.command.ConnectionId connectionId3 = connectionContext1.getConnectionId();
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(connectionId3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        openWireFormat1.setStackTraceEnabled(false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap5 = activeMQConnection0.getRedeliveryPolicyMap();
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap6 = activeMQConnection0.getRedeliveryPolicyMap();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap5);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.Endpoint endpoint1 = connectionInfo0.getFrom();
        java.lang.String str2 = connectionInfo0.getClientIp();
        org.junit.Assert.assertNull(endpoint1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        try {
            org.apache.activemq.transport.TransportServer transportServer2 = transportConnector1.getServer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must specify either a server or uri property");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection("");
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException; message: Could not create Transport. Reason: java.io.IOException: Transport not scheme specified: []");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.broker.Broker broker2 = null;
        connectionContext1.setBroker(broker2);
        connectionContext1.setReconnect(false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(connectionInfo0);
        boolean boolean2 = connectionContext1.isProducerFlowControl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        activeMQConnection0.setUseAsyncSend(false);
        activeMQConnection0.setNonBlockingRedelivery(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        boolean boolean2 = connectionContext1.isNetworkConnection();
        org.apache.activemq.security.MessageAuthorizationPolicy messageAuthorizationPolicy3 = null;
        connectionContext1.setMessageAuthorizationPolicy(messageAuthorizationPolicy3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection("isDLQ");
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException; message: Could not create Transport. Reason: java.io.IOException: Transport not scheme specified: [isDLQ]");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        org.apache.activemq.broker.BrokerService brokerService2 = transportConnector1.getBrokerService();
        org.junit.Assert.assertNull(brokerService2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap3 = null;
        activeMQConnection0.setRedeliveryPolicyMap(redeliveryPolicyMap3);
        activeMQConnection0.close();
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        long long1 = activeMQConnection0.getConsumerFailoverRedeliveryWaitPeriod();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean boolean1 = activeMQConnection0.isCheckForDuplicates();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        boolean boolean3 = activeMQConnection0.isMessagePrioritySupported();
        long long4 = activeMQConnection0.getConsumerFailoverRedeliveryWaitPeriod();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        java.io.DataInput dataInput2 = null;
        try {
            org.apache.activemq.command.DataStructure dataStructure3 = openWireFormat1.looseUnmarshalNestedObject(dataInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str0 = org.apache.activemq.broker.BrokerService.DEFAULT_BROKER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "localhost" + "'", str0.equals("localhost"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        byte byte0 = org.apache.activemq.command.ActiveMQDestination.TEMP_MASK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 4 + "'", byte0 == (byte) 4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        org.apache.activemq.broker.region.ConnectorStatistics connectorStatistics2 = transportConnector1.getStatistics();
        org.junit.Assert.assertNotNull(connectorStatistics2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(connectionInfo0);
        connectionInfo0.setPassword("queue://");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        boolean boolean3 = connectionInfo0.isFailoverReconnect();
        java.lang.String str4 = connectionInfo0.getClientIp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        boolean boolean3 = activeMQConnection0.isDisableTimeStampsByDefault();
        activeMQConnection0.transportInterupted();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        org.apache.activemq.command.ConnectionInfo connectionInfo2 = new org.apache.activemq.command.ConnectionInfo();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        java.lang.String str4 = connectionInfo2.toString(strMap3);
        connectionInfo0.setTransportContext((java.lang.Object) connectionInfo2);
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}" + "'", str4.equals("ConnectionInfo {commandId = 0, responseRequired = false, connectionId = null, clientId = null, clientIp = null, userName = null, password = *****, brokerPath = null, brokerMasterConnector = false, manageable = false, clientMaster = true, faultTolerant = false, failoverReconnect = false}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        boolean boolean2 = connectionContext1.isNetworkConnection();
        boolean boolean3 = connectionContext1.isProducerFlowControl();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = openWireFormat1.copy();
        int int4 = openWireFormat1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(openWireFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        org.apache.activemq.command.Endpoint endpoint3 = null;
        connectionInfo0.setFrom(endpoint3);
        boolean boolean5 = connectionInfo0.isConnectionControl();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setWarnAboutUnstartedConnectionTimeout((long) (byte) 100);
        boolean boolean5 = activeMQConnection0.isStatsEnabled();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setWatchTopicAdvisories(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        org.apache.activemq.command.Endpoint endpoint3 = null;
        connectionInfo0.setFrom(endpoint3);
        boolean boolean5 = connectionInfo0.isClientMaster();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = connectionInfo0.copy();
        byte byte2 = connectionInfo0.getDataStructureType();
        org.apache.activemq.command.ConnectionId connectionId3 = connectionInfo0.getConnectionId();
        connectionInfo0.setClientIp("tcp://localhost:61616");
        java.lang.String str6 = connectionInfo0.getPassword();
        connectionInfo0.setClientId("hi!");
        org.junit.Assert.assertNotNull(connectionInfo1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
        org.junit.Assert.assertNull(connectionId3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        connectionInfo0.setManageable(true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        try {
            org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory3 = new org.apache.activemq.ActiveMQConnectionFactory("", "tcp://localhost:61616", "ID:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid broker URI: ID:");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout((int) '#');
        org.apache.activemq.management.JMSConnectionStatsImpl jMSConnectionStatsImpl3 = activeMQConnection0.getConnectionStats();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(jMSConnectionStatsImpl3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.activemq.command.ActiveMQDestination activeMQDestination2 = org.apache.activemq.command.ActiveMQDestination.createDestination("isDLQ", (byte) 1);
        org.apache.activemq.command.ActiveMQDestination activeMQDestination3 = org.apache.activemq.command.ActiveMQDestination.transform((javax.jms.Destination) activeMQDestination2);
        org.junit.Assert.assertNotNull(activeMQDestination2);
        org.junit.Assert.assertNotNull(activeMQDestination3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = activeMQConnection0.getRejectedTaskHandler();
        boolean boolean4 = activeMQConnection0.isDisableTimeStampsByDefault();
        activeMQConnection0.setCheckForDuplicates(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        boolean boolean4 = activeMQConnection0.isNonBlockingRedelivery();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        byte[] byteArray0 = new byte[] {};
        org.apache.activemq.util.ByteSequence byteSequence3 = new org.apache.activemq.util.ByteSequence(byteArray0, (int) ' ', (int) 'a');
        org.apache.activemq.util.ByteSequence byteSequence4 = new org.apache.activemq.util.ByteSequence(byteArray0);
        byteSequence4.setOffset(65);
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.security.SecurityContext securityContext2 = null;
        connectionContext1.setSecurityContext(securityContext2);
        org.apache.activemq.broker.Broker broker4 = connectionContext1.getBroker();
        org.junit.Assert.assertNull(broker4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        org.apache.activemq.MessageTransformer messageTransformer2 = activeMQConnection0.getTransformer();
        activeMQConnection0.setDispatchAsync(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(messageTransformer2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        activeMQConnection0.setNestedMapAndListEnabled(true);
        org.apache.activemq.command.ConnectionInfo connectionInfo7 = activeMQConnection0.getConnectionInfo();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionInfo7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str0 = org.apache.activemq.broker.BrokerService.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "61616" + "'", str0.equals("61616"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        org.apache.activemq.broker.TransportConnection transportConnection6 = null;
        transportConnector1.onStarted(transportConnection6);
        transportConnector1.setAuditNetworkProducers(false);
        org.junit.Assert.assertNull(uRI2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat0 = new org.apache.activemq.openwire.OpenWireFormat();
        openWireFormat0.setStackTraceEnabled(false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap5 = activeMQConnection0.getRedeliveryPolicyMap();
        activeMQConnection0.setOptimizedAckScheduledAckInterval((long) (short) 10);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.broker.BrokerFilter brokerFilter1 = new org.apache.activemq.broker.BrokerFilter(broker0);
        try {
            brokerFilter1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.Class<?> wildcardClass1 = activeMQConnection0.getClass();
        activeMQConnection0.setUseAsyncSend(false);
        boolean boolean4 = activeMQConnection0.isDispatchAsync();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.activemq.openwire.OpenWireFormat openWireFormat1 = new org.apache.activemq.openwire.OpenWireFormat((int) (short) 1);
        boolean boolean2 = openWireFormat1.isCacheEnabled();
        org.apache.activemq.openwire.OpenWireFormat openWireFormat3 = openWireFormat1.copy();
        java.lang.String str4 = openWireFormat1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(openWireFormat3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "OpenWireFormat{version=1, cacheEnabled=false, stackTraceEnabled=false, tightEncodingEnabled=false, sizePrefixDisabled=false, maxFrameSize=9223372036854775807}" + "'", str4.equals("OpenWireFormat{version=1, cacheEnabled=false, stackTraceEnabled=false, tightEncodingEnabled=false, sizePrefixDisabled=false, maxFrameSize=9223372036854775807}"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        java.lang.Object obj3 = connectionContext1.getLongTermStoreContext();
        org.apache.activemq.broker.region.MessageReference messageReference4 = null;
        boolean boolean5 = connectionContext1.isAllowedToConsume(messageReference4);
        boolean boolean6 = connectionContext1.isNetworkConnection();
        org.junit.Assert.assertNull(transaction2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setDisableAsyncDispatch(true);
        org.junit.Assert.assertNull(uRI2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setCloseTimeout((int) '#');
        java.lang.String str5 = activeMQConnection0.getClientID();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        boolean boolean3 = connectionInfo0.isFailoverReconnect();
        boolean boolean4 = connectionInfo0.isConsumerControl();
        connectionInfo0.setFailoverReconnect(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getConnectUri();
        java.net.URI uRI3 = transportConnector1.getUri();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertNull(uRI3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        boolean boolean3 = transportConnector1.isUpdateClusterClients();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.activemq.transport.TransportServer transportServer0 = null;
        org.apache.activemq.broker.TransportConnector transportConnector1 = new org.apache.activemq.broker.TransportConnector(transportServer0);
        java.net.URI uRI2 = transportConnector1.getUri();
        java.lang.String str3 = transportConnector1.toString();
        transportConnector1.setUpdateClusterClientsOnRemove(false);
        int int6 = transportConnector1.getMaximumConsumersAllowedPerConnection();
        transportConnector1.setDisableAsyncDispatch(true);
        int int9 = transportConnector1.getMaximumProducersAllowedPerConnection();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.util.ServiceStopper serviceStopper1 = null;
        brokerService0.stopAllConnectors(serviceStopper1);
        org.apache.activemq.command.ActiveMQQueue activeMQQueue4 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        org.apache.activemq.command.ActiveMQDestination[] activeMQDestinationArray5 = activeMQQueue4.getCompositeDestinations();
        brokerService0.removeDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue4);
        org.junit.Assert.assertNull(activeMQDestinationArray5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        boolean boolean2 = brokerService0.isUseVirtualDestSubs();
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.MessageTransformer messageTransformer1 = null;
        activeMQConnection0.setTransformer(messageTransformer1);
        activeMQConnection0.setOptimizedMessageDispatch(true);
        boolean boolean5 = activeMQConnection0.isClosed();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener6 = activeMQConnection0.getClientInternalExceptionListener();
        java.util.List<java.lang.String> strList7 = activeMQConnection0.getTrustedPackages();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory8 = activeMQConnection0.getSessionTaskRunner();
        boolean boolean9 = activeMQConnection0.isUseAsyncSend();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(clientInternalExceptionListener6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(taskRunnerFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        brokerService0.setRejectDurableConsumers(false);
        brokerService0.setPersistenceThreadPriority(0);
        brokerService0.setDiskUsageCheckRegrowThreshold((int) (byte) 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.activemq.filter.MessageEvaluationContext messageEvaluationContext0 = null;
        org.apache.activemq.broker.ConnectionContext connectionContext1 = new org.apache.activemq.broker.ConnectionContext(messageEvaluationContext0);
        org.apache.activemq.transaction.Transaction transaction2 = connectionContext1.getTransaction();
        org.apache.activemq.command.ConnectionId connectionId3 = null;
        connectionContext1.setConnectionId(connectionId3);
        org.junit.Assert.assertNull(transaction2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.region.policy.PolicyMap policyMap1 = brokerService0.getDestinationPolicy();
        java.io.File file2 = brokerService0.getBrokerDataDirectory();
        org.apache.activemq.command.ActiveMQQueue activeMQQueue4 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties5 = null;
        activeMQQueue4.buildFromProperties(properties5);
        boolean boolean7 = brokerService0.shouldRecordVirtualDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue4);
        org.junit.Assert.assertNull(policyMap1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str0 = org.apache.activemq.command.ActiveMQDestination.TEMP_QUEUE_QUALIFED_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "temp-queue://" + "'", str0.equals("temp-queue://"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        java.lang.Runnable[] runnableArray3 = new java.lang.Runnable[] {};
        java.util.ArrayList<java.lang.Runnable> runnableList4 = new java.util.ArrayList<java.lang.Runnable>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Runnable>) runnableList4, runnableArray3);
        brokerService0.setShutdownHooks((java.util.List<java.lang.Runnable>) runnableList4);
        org.junit.Assert.assertNotNull(runnableArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.broker.BrokerService brokerService1 = new org.apache.activemq.broker.BrokerService();
        brokerService0.addService((org.apache.activemq.Service) brokerService1);
        brokerService0.setUseAuthenticatedPrincipalForJMSXUserID(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = brokerService0.getTransportConnectorURIsAsMap();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.activemq.broker.BrokerService brokerService0 = new org.apache.activemq.broker.BrokerService();
        org.apache.activemq.command.ActiveMQQueue activeMQQueue2 = new org.apache.activemq.command.ActiveMQQueue("hi!");
        java.util.Properties properties3 = null;
        activeMQQueue2.buildFromProperties(properties3);
        activeMQQueue2.setDLQ(true);
        try {
            brokerService0.removeDestination((org.apache.activemq.command.ActiveMQDestination) activeMQQueue2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Status MBean could not be registered in JMX: org.apache.activemq:type=Broker,brokerName=localhost,service=Health");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.activemq.command.ConnectionInfo connectionInfo0 = new org.apache.activemq.command.ConnectionInfo();
        connectionInfo0.setBrokerMasterConnector(true);
        connectionInfo0.setResponseRequired(false);
        boolean boolean5 = connectionInfo0.isMessageDispatch();
        java.lang.Object obj6 = connectionInfo0.getTransportContext();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }
}

