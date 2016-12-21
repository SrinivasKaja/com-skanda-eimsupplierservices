package com.sabre.webservices.websvc;

public class BargainFinderMaxPortTypeProxy implements com.sabre.webservices.websvc.BargainFinderMaxPortType {
  private String _endpoint = null;
  private com.sabre.webservices.websvc.BargainFinderMaxPortType bargainFinderMaxPortType = null;
  
  public BargainFinderMaxPortTypeProxy() {
    _initBargainFinderMaxPortTypeProxy();
  }
  
  public BargainFinderMaxPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initBargainFinderMaxPortTypeProxy();
  }
  
  private void _initBargainFinderMaxPortTypeProxy() {
    try {
      bargainFinderMaxPortType = (new com.sabre.webservices.websvc.BargainFinderMaxServiceLocator()).getBargainFinderMaxPortType();
      if (bargainFinderMaxPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bargainFinderMaxPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bargainFinderMaxPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bargainFinderMaxPortType != null)
      ((javax.xml.rpc.Stub)bargainFinderMaxPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sabre.webservices.websvc.BargainFinderMaxPortType getBargainFinderMaxPortType() {
    if (bargainFinderMaxPortType == null)
      _initBargainFinderMaxPortTypeProxy();
    return bargainFinderMaxPortType;
  }
  
  public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS bargainFinderMaxRQ(org.ebxml.www.namespaces.messageHeader.holders.MessageHeaderHolder header, org.xmlsoap.schemas.ws._2002._12.secext.holders.SecurityHolder header2, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQ body) throws java.rmi.RemoteException{
    if (bargainFinderMaxPortType == null)
      _initBargainFinderMaxPortTypeProxy();
    return bargainFinderMaxPortType.bargainFinderMaxRQ(header, header2, body);
  }
  
  
}