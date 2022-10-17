/**
 * ServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka.ems.service;

public interface ServiceService extends javax.xml.rpc.Service {
    public java.lang.String getserviceAddress();

    public co.edureka.ems.service.Service getservice() throws javax.xml.rpc.ServiceException;

    public co.edureka.ems.service.Service getservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
