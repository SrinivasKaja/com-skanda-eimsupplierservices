/**
 * BargainFinderMaxServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sabre.webservices.websvc;

public class BargainFinderMaxServiceLocator extends org.apache.axis.client.Service implements com.sabre.webservices.websvc.BargainFinderMaxService {

    public BargainFinderMaxServiceLocator() {
    }


    public BargainFinderMaxServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BargainFinderMaxServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BargainFinderMaxPortType
    private java.lang.String BargainFinderMaxPortType_address = "https://webservices.sabre.com";

    public java.lang.String getBargainFinderMaxPortTypeAddress() {
        return BargainFinderMaxPortType_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BargainFinderMaxPortTypeWSDDServiceName = "BargainFinderMaxPortType";

    public java.lang.String getBargainFinderMaxPortTypeWSDDServiceName() {
        return BargainFinderMaxPortTypeWSDDServiceName;
    }

    public void setBargainFinderMaxPortTypeWSDDServiceName(java.lang.String name) {
        BargainFinderMaxPortTypeWSDDServiceName = name;
    }

    public com.sabre.webservices.websvc.BargainFinderMaxPortType getBargainFinderMaxPortType() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BargainFinderMaxPortType_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBargainFinderMaxPortType(endpoint);
    }

    public com.sabre.webservices.websvc.BargainFinderMaxPortType getBargainFinderMaxPortType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sabre.webservices.websvc.BargainFinderMaxBindingStub _stub = new com.sabre.webservices.websvc.BargainFinderMaxBindingStub(portAddress, this);
            _stub.setPortName(getBargainFinderMaxPortTypeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBargainFinderMaxPortTypeEndpointAddress(java.lang.String address) {
        BargainFinderMaxPortType_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sabre.webservices.websvc.BargainFinderMaxPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sabre.webservices.websvc.BargainFinderMaxBindingStub _stub = new com.sabre.webservices.websvc.BargainFinderMaxBindingStub(new java.net.URL(BargainFinderMaxPortType_address), this);
                _stub.setPortName(getBargainFinderMaxPortTypeWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BargainFinderMaxPortType".equals(inputPortName)) {
            return getBargainFinderMaxPortType();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://webservices.sabre.com/websvc", "BargainFinderMaxService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://webservices.sabre.com/websvc", "BargainFinderMaxPortType"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BargainFinderMaxPortType".equals(portName)) {
            setBargainFinderMaxPortTypeEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
