package co.edureka.ems.service;

public class ServiceProxy implements co.edureka.ems.service.Service {
  private String _endpoint = null;
  private co.edureka.ems.service.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new co.edureka.ems.service.ServiceServiceLocator()).getservice();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edureka.ems.service.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public int getCardCvv() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getCardCvv();
  }
  
  public java.lang.String getCardName() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getCardName();
  }
  
  public long getCardNumber() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.getCardNumber();
  }
  
  
}