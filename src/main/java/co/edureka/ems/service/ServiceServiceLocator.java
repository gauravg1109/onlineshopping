/**
 * ServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka.ems.service;

public class ServiceServiceLocator extends org.apache.axis.client.Service implements co.edureka.ems.service.ServiceService {

    public ServiceServiceLocator() {
    }


    public ServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for service
    private java.lang.String service_address = "http://localhost:8080/creditCard/services/service";

    public java.lang.String getserviceAddress() {
        return service_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String serviceWSDDServiceName = "service";

    public java.lang.String getserviceWSDDServiceName() {
        return serviceWSDDServiceName;
    }

    public void setserviceWSDDServiceName(java.lang.String name) {
        serviceWSDDServiceName = name;
    }

    public co.edureka.ems.service.Service getservice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(service_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getservice(endpoint);
    }

    public co.edureka.ems.service.Service getservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.edureka.ems.service.ServiceSoapBindingStub _stub = new co.edureka.ems.service.ServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getserviceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setserviceEndpointAddress(java.lang.String address) {
        service_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.edureka.ems.service.Service.class.isAssignableFrom(serviceEndpointInterface)) {
                co.edureka.ems.service.ServiceSoapBindingStub _stub = new co.edureka.ems.service.ServiceSoapBindingStub(new java.net.URL(service_address), this);
                _stub.setPortName(getserviceWSDDServiceName());
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
        if ("service".equals(inputPortName)) {
            return getservice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ems.edureka.co", "serviceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ems.edureka.co", "service"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("service".equals(portName)) {
            setserviceEndpointAddress(address);
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
