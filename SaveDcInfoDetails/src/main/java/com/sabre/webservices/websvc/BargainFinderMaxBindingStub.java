/**
 * BargainFinderMaxBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sabre.webservices.websvc;

public class BargainFinderMaxBindingStub extends org.apache.axis.client.Stub implements com.sabre.webservices.websvc.BargainFinderMaxPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BargainFinderMaxRQ");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "MessageHeader"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">MessageHeader"), org.ebxml.www.namespaces.messageHeader.MessageHeader.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "Security"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", ">Security"), org.xmlsoap.schemas.ws._2002._12.secext.Security.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_AirLowFareSearchRQ"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OTA_AirLowFareSearchRQ"), org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQ.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OTA_AirLowFareSearchRS"));
        oper.setReturnClass(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_AirLowFareSearchRS"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public BargainFinderMaxBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BargainFinderMaxBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BargainFinderMaxBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
        addBindings6();
        addBindings7();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", ">mustUnderstand");
            cachedSerQNames.add(qName);
            cls = boolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.soap.envelope.Body.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "detail");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.soap.envelope.Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "encodingStyle");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.soap.envelope.Envelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.soap.envelope.Fault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.soap.envelope.Header.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", ">>Security>UsernameToken");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.ws._2002._12.secext.SecurityUsernameToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", ">Security");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.ws._2002._12.secext.Security.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Acknowledgment");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.Acknowledgment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">AckRequested");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.AckRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Description");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.Description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Error");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">ErrorList");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.ErrorList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">From");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.From.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Manifest");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.Manifest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">MessageData");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.MessageData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">MessageHeader");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.MessageHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">MessageOrder");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.MessageOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">PartyId");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.PartyId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Reference");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.Reference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Schema");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.Schema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Service");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">StatusRequest");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.StatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">StatusResponse");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.StatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">SyncReply");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.SyncReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">To");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.To.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "messageStatus.type");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.MessageStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "sequenceNumber.type");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.SequenceNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "severity.type");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.SeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "status.type");
            cachedSerQNames.add(qName);
            cls = org.ebxml.www.namespaces.messageHeader.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>>OTA_AirLowFareSearchRQ>Leg>Destinations>Destination>Carriers>ExcludeVendorPref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriersExcludeVendorPref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>>OTA_AirLowFareSearchRQ>Leg>Origins>Origin>Carriers>ExcludeVendorPref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOriginCarriersExcludeVendorPref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>FareType>TPA_Extensions>FareComponents>FareComponent>FareRetailerRule>Code");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>FareType>TPA_Extensions>FareComponents>FareComponent>FareRetailerRule>TransactionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>Leg>Destinations>Destination>Carriers");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>Leg>Origins>Origin>Carriers");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOriginCarriers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities>AlternateLocation>LocationCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities>SpecifiedLocation>LocationCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences>VendorPref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries>BrandedOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries>SimpleOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRS>DepartedItineraries>OneWayItineraries>BrandedOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRS>DepartedItineraries>OneWayItineraries>SimpleOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRS>SoldOutItineraries>OneWayItineraries>BrandedOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRS>SoldOutItineraries>OneWayItineraries>SimpleOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>Cabin");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>FareNote");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>Meal");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsMeal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>Rule");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>SeatsRemaining");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>TPA_Extensions>AncillaryFeeGroups>AncillaryFeeGroup>AncillaryFeeItem");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>TPA_Extensions>Legs>Leg>Segment");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>TimeOfDayDistribution>TimeOfDayRange");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>DiversityControlType>Dimensions>TimeOfDay>Distribution>Range");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTimeOfDayDistributionRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>EquivFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>FareRetailerRule");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>HandlingMarkupDetail");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>Segment");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>Taxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>Legs>Leg>EquivFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegEquivFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>Legs>Leg>Taxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTaxes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>Legs>Leg>TotalMileage");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTotalMileage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Carriers>ExcludeVendorPref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriersExcludeVendorPref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>DepartureDateTime>WeekDays");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Destinations>Destination");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestination.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Origins>Origin");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOrigin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities>AlternateLocation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesAlternateLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities>SpecifiedLocation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesSpecifiedLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>MessagingDetails>MDRSubset");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMessagingDetailsMDRSubset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>MultiTicket>DisplayPolicy");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicketDisplayPolicy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries>BrandedOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesBrandedOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries>SimpleOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItinerariesSimpleOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>AvailableItineraries>PricedItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ComplexProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ComplexProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>DepartedItineraries>OneWayItineraries>BrandedOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItinerariesOneWayItinerariesBrandedOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>DepartedItineraries>OneWayItineraries>SimpleOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItinerariesOneWayItinerariesSimpleOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>DepartedItineraries>PricedItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ComplexProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ComplexProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>OneWayItineraries>BrandedOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>OneWayItineraries>SimpleOneWayItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>SoldOutItineraries>OneWayItineraries>BrandedOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesOneWayItinerariesBrandedOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>SoldOutItineraries>OneWayItineraries>SimpleOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesOneWayItinerariesSimpleOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>SoldOutItineraries>PricedItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ComplexProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ComplexProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>TPA_Extensions>AirlineOrderList>AirlineOrder");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty>Application");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty>Type");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PricedItineraryType>TPA_Extensions>Ops>FareTypes>FareType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOpsFareTypesFareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PriceRequestInformationType>TPA_Extensions>Priority>DirectFlights>Priority");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PriceRequestInformationType>TPA_Extensions>Priority>Price>Priority");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PriceRequestInformationType>TPA_Extensions>Priority>Time>Priority");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PriceRequestInformationType>TPA_Extensions>Priority>Vendor>Priority");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PTCFareBreakdownType>FareInfos>FareInfo>TPA_Extensions>Cabin");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsCabin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PTCFareBreakdownType>FareInfos>FareInfo>TPA_Extensions>FareNote");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsFareNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PTCFareBreakdownType>FareInfos>FareInfo>TPA_Extensions>Meal");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsMeal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PTCFareBreakdownType>FareInfos>FareInfo>TPA_Extensions>Rule");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PTCFareBreakdownType>FareInfos>FareInfo>TPA_Extensions>SeatsRemaining");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsSeatsRemaining.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfoTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirItineraryPricingInfoType>TPA_Extensions>AncillaryFeeGroups>AncillaryFeeGroup");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>TPA_Extensions>AncillaryFeeGroups>AncillaryFeeGroup>AncillaryFeeItem");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFeeItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirItineraryPricingInfoType>TPA_Extensions>Legs>Leg");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>TPA_Extensions>Legs>Leg>Segment");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Segment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ContentType>Type");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsContentTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>CountryPref>PreferLevel");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>AdditionalNonStopsNumber");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>InboundOutboundPairing");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>TimeOfDayDistribution");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>TimeOfDayDistribution>TimeOfDayRange");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOfDayRange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>Weightings");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ExcludeVendorPref>Code");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>NumTripsWithRouting>Number");
            cachedSerQNames.add(qName);
            cls = short.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>SellingLevels>SellingLevelRules");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsSellingLevelRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>SellingLevels>ShowFareAmounts");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>Carrier");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>Country");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>IETValidation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckIETValidation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>SettlementValidation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>Carrier>Default");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierDefault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>Carrier>Override");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>OperatingDuplicate>PreferredCarrier");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsOperatingDuplicatePreferredCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>TimeOfDay>Distribution");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTimeOfDayDistributionRange[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>DiversityControlType>Dimensions>TimeOfDay>Distribution>Range");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Range");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>PenaltiesInfo>Penalty>Applicability");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyApplicability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>PenaltiesInfo>Penalty>Cat16TextOnly");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>PenaltiesInfo>Penalty>Type");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>Taxes>LegsTaxes>LegTaxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirTaxType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTaxType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tax");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>FareComponents>FareComponent");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>Legs>Leg");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FlexibleFaresType>FareParameters>PassengerType>Code");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPassengerTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Cabin");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCabin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Carriers");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>DepartureDateTime");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDepartureDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Destinations");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestination[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Destinations>Destination");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Destination");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Origins");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOrigin[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Origins>Origin");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Origin");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>OriginDestinationInformation>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportMileage");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateDatesProcessing");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>ItineraryCache");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>MessagingDetails");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMessagingDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>MultiTicket");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>Partitions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsPartitions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>ReservationData");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsReservationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>SplitTaxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>AvailableItineraries>OneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>AvailableItineraries>PricedItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItinerariesPricedItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>DepartedItineraries>OneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItinerariesOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>DepartedItineraries>PricedItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItinerariesPricedItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>OneWayItineraries>BrandedOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSOneWayItinerariesBrandedOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>OneWayItineraries>SimpleOneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>PricedItineraries>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ComplexProcessingMessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ComplexProcessingMessageType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>SoldOutItineraries>OneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>SoldOutItineraries>PricedItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesPricedItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>TPA_Extensions>AirlineOrderList");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>TPA_Extensions>AirlineOrderList>AirlineOrder");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineOrder");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Match");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PricedItineraryType>TPA_Extensions>AdditionalFares>AirItineraryPricingInfo");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PricedItineraryType>TPA_Extensions>Ops>FareTypes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOpsFareTypesFareType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PricedItineraryType>TPA_Extensions>Ops>FareTypes>FareType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>BrandedFareIndicators>ReturnCheapestUnbrandedFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicatorsReturnCheapestUnbrandedFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>CustomerType>Value");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCustomerTypeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>MinMaxStay");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsMinMaxStay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>RefundPenalty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRefundPenalty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>ResTicketing");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsResTicketing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>RetainFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRetainFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>TravelPolicy");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsTravelPolicy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>PassengerStatus>Type");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>DirectFlights");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityDirectFlights.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>Price");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>Time");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>Vendor");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PTCFareBreakdownType>FareBasisCodes>FareBasisCode>BookingCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PTCFareBreakdownType>FareBasisCodes>FareBasisCode>PrivateFareType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PTCFareBreakdownType>FareInfos>FareInfo>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfoTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>TicketPricingType>OriginDestinationOptions>OriginDestinationOption>FlightSegment");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>TransactionType>Diagnostics>Diagnostic>DiagnosticArgument");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnosticDiagnosticArgument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>FareInfos>FareInfo");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>AncillaryFeeGroups");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirItineraryPricingInfoType>TPA_Extensions>AncillaryFeeGroups>AncillaryFeeGroup");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFeeGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>DivideInParty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>FareNote");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsFareNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>Legs");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirItineraryPricingInfoType>TPA_Extensions>Legs>Leg");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Leg");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>MultipleTravelerGroups");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>PromoOffer");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>PromoRedemption");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoRedemption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>Rule");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>AncillaryFees>AncillaryFeeGroup");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>SpanishFamilyDiscount>Level");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscountLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AdditionalFareLimit");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAdditionalFareLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AircraftTypePenalty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAircraftTypePenalty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AirServiceOnly");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAirServiceOnly.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AlternateAirportPenalty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAlternateAirportPenalty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>avsPenaltyCrrs");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAvsPenaltyCrrs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>Budget");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsBudget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ContentType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>CountryPref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsCountryPref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>depPenaltyInUSD");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDepPenaltyInUSD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>DiversityParameters");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>DomesticLayoverTime");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDomesticLayoverTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>durPenaltyInUSD");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDurPenaltyInUSD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ExcludeCallDirectCarriers");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeCallDirectCarriers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ExcludeVendorPref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeVendorPref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>FareAmountThreshold");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareAmountThreshold.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>FareFocusRules");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareFocusRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>FlightRepeatLimit");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFlightRepeatLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>fltOptLFSReuseLimitForAVS");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForAVS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>fltOptLFSReuseLimitForNonAVS");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForNonAVS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>fltOptMustPriceReuseLimit");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptMustPriceReuseLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ItineraryNumberThreshold");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsItineraryNumberThreshold.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>JetServiceOnly");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsJetServiceOnly.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>LongConnectPoints");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>LongConnectTime");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxAllowedLFSOveragePerCrrPercent");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedLFSOveragePerCrrPercent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxAllowedMustPriceOveragePerCrr");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedMustPriceOveragePerCrr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOf2PlusStpSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOf2PlusStpSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOfNonStpInrlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpInrlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOfNonStpOnlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpOnlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOfSingleStpOnlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfSingleStpOnlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>MaxPrice");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxRelFareLvlOfxForCnx");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForCnx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxRelFareLvlOfxForNonStp");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForNonStp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>minAllowedOveragePerCrr");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>minAllowedOveragePerCrrPercent");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrrPercent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>MultiAirportCodes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMultiAirportCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfLowFareSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfLowFareSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPrice2PlusStpSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPrice2PlusStpSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceInrlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceInrlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStp1StpInrlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpInrlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStp1StpOnlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpOnlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStpInrlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpInrlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStpOnlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpOnlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceOnlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceOnlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceSStopOnlSol");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceSStopOnlSol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>NumTripsWithRouting");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumTripsWithRouting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>OptionsPerDatePairList");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OptionsPerDatePairType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OptionsPerDatePairType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OptionsPerDatePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SameConnectionAirportOnly");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameConnectionAirportOnly.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SameOriginAirportOnly");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameOriginAirportOnly.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SameTurnaroundAirportOnly");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameTurnaroundAirportOnly.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SellingLevels");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>stpPenaltyInUSD");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsStpPenaltyInUSD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>targetMinNumOfLFSOnlSolPerCrr");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSOnlSolPerCrr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>targetMinNumOfLFSTotOnlSolPercent");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSTotOnlSolPercent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>TicketingSumOfLocals");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTicketingSumOfLocals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>TripType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTripType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>upperBoundLFSFactor");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundLFSFactor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>upperBoundMustPriceFactorForNonStp");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNonStp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>upperBoundMustPriceFactorForNotNonStp");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNotNonStp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BaggageInformationType>Allowance>Unit");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowanceUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>StopAirports>StopAirport");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeStopAirportsStopAirport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>TPA_Extensions>DataElement");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsDataElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>TPA_Extensions>eTicket");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsETicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>TPA_Extensions>Message");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ConnectionType>ConnectionLocation>ConnectionInfo");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocationConnectionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>Carrier");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>InboundOutboundPairing");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsInboundOutboundPairing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>OperatingDuplicate");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsOperatingDuplicatePreferredCarrier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>OperatingDuplicate>PreferredCarrier");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferredCarrier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>StopsNumber");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsStopsNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>TimeOfDay");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTimeOfDayDistributionRange[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>TimeOfDay>Distribution");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Distribution");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>TravelTime");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTravelTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>Fare>Adjustment");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>PenaltiesInfo>Penalty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>PenaltiesInfo>Penalty>Cat16TextOnly");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Cat16TextOnly");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>Taxes>FareComponentsTaxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareComponentTaxesType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentTaxesType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentTaxes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>Taxes>LegsTaxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirTaxType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>Taxes>LegsTaxes>LegTaxes");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LegTaxes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>TPA_Extensions>CommissionData");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareComponentBreakdownType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VCCInformationType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VCCInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>TPA_Extensions>FareComponents");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>FareComponents>FareComponent");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>TPA_Extensions>Legs");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLeg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>Legs>Leg");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Leg");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>TPA_Extensions>SellingFareDataList");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.HandlingMarkupSummaryType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingFareDataType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingFareData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>AccountCode");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersAccountCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>Cabin");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCabin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>CorporateID");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCorporateID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>ExcludeRestricted");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersExcludeRestricted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>MinMaxStay");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersMinMaxStay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>NegotiatedFaresOnly");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersNegotiatedFaresOnly.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>PassengerType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPassengerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>PrivateFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPrivateFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>PublicFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPublicFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>RefundPenalty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersRefundPenalty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>ResTicketing");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersResTicketing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>XOFares");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersXOFares.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>Leg");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>OriginDestinationInformation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>AvailableItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>DepartedItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>OneWayItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSOneWayItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>PricedItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSPricedItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>SoldOutItineraries");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItineraries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>Age");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsAge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>BirthDate");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsBirthDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>State");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>TotalNumber");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsTotalNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Penalty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>AdditionalFares");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFares.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>DiversitySwapper");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsDiversitySwapper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>Failed");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>ItinSource");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsItinSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>Ops");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>ValidatingCarrier");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValidatingCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>ValueBucket");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValueBucket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>BrandedFareIndicators");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Currency");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>CustomerType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCustomerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>ETicketableOverride");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsETicketableOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>FareAdjustment");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>FareBreaksAtLegs");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareBreaksAtLegs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>IATAFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIATAFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Indicators");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicators.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>MultipleTravelerGroups");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>OBFees");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsOBFees.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PassengerStatus");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Priority");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PrivateFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPrivateFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PublicFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPublicFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>UseReducedConstructions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsUseReducedConstructions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>WebFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsWebFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>Endorsements>Endorsement");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsementsEndorsement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>FareBasisCodes>FareBasisCode");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareBasisCodesFareBasisCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>FareInfos>FareInfo");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>TPA_Extensions>FareType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_ExtensionsFareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ReissueInfoType>ChangeFees>ChangeFee");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFeesChangeFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>RetailerRulesType>RetailerRule>Code");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>SegmentType>Code");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SegmentTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>StayRestrictionsType>MaximumStay>ReturnType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStayReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TicketPricingType>OriginDestinationOptions>OriginDestinationOption");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>TicketPricingType>OriginDestinationOptions>OriginDestinationOption>FlightSegment");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightSegment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TicketPricingType>TPA_Extensions>ValidatingCarrier");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_ExtensionsValidatingCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>Diagnostics>Diagnostic");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnostic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>FareOverrides>FareOverride");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeFareOverridesFareOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelDateTimeType>DepartureDates>LengthOfStay");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelDateTimeType>DepartureDates>LengthOfStayRange");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStayRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelerInfoSummary_TPA_ExtensionsType>TravelerRating>FrequentFlyer");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelerInfoSummary_TPA_ExtensionsType>TravelerRating>Score");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ValidatingCarrierInfoType>Alternate>Country");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ValidatingCarrierInfoType>Default>Country");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeDefaultCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AccountingCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AdvResTicketingType>AdvReservation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvReservation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AdvResTicketingType>AdvTicketing");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvTicketing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>FareInfos");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>FareInfos>FareInfo");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>PrivateFareType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>PTC_FareBreakdowns");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PTCFareBreakdownType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PTC_FareBreakdown");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>SpanishFamilyDiscountIndicator");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryType>OriginDestinationOptions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOptionType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirlineChannelCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>AncillaryFees");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>AncillaryFees>AncillaryFeeGroup");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFeeGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>FareRestrictPref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFareRestrictPref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>FrequentFlyer");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFrequentFlyer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>SpanishFamilyDiscount");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirTravelerType>FlightSegmentRPHs");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightSegmentRPH");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirTravelerType>ProfileRef");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirTravelerTypeProfileRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AllianceType>Code");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AlternateTime");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AlternateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BaggageInformationType>Allowance");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BaggageInformationType>Segment");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BaggageInformationTypeSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>ArrivalTimeZone");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeArrivalTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>DepartureTimeZone");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeDepartureTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>OnTimePerformance");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeOnTimePerformance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>StopAirports");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeStopAirportsStopAirport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>StopAirports>StopAirport");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StopAirport");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BrandID");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Token.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ComplexProcessingMessageType>Leg");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ComplexProcessingMessageTypeLeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionTime");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ConnectionTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionType>ConnectionLocation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">CurrencyConversionsType>Conversion");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CurrencyConversionsTypeConversion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DateFlexibility");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DateFlexibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Day");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.Day.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DaysRange");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DaysRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DefaultTicketingCarrier");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DepartureDaysType>Value");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DiversityControlType>Dimensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DiversityControlType>LowFareBucket");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlTypeLowFareBucket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">EchoToken");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.EchoToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExchangeSettingsType>ReissueExchange");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeReissueExchange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExchangeSettingsType>RequestType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExemptAllTaxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExemptAllTaxes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExemptAllTaxesAndFees");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Fare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.Fare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareComponentTaxesType>FlightSegment");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareComponentTaxesTypeFlightSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareMessagesType>Message");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareMessagesTypeMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareQualifier");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareQualifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>EquivFare");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeEquivFare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>Fees");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirFeeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirFeeType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Fee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>OBFees");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OBFeeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OBFeeType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OBFee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>PenaltiesInfo");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>PenaltiesInfo>Penalty");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Penalty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>ReissueInfoList");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ReissueInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReissueInfoType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReissueInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>Taxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTaxes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FlexibleFaresType>FareParameters");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FlightTypePrefType>MaxConnections");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlightTypePrefTypeMaxConnections.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Gender");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">InterlineIndicator");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.InterlineIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>Extras");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ItinTotalFareTypeExtras.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>ServiceFee");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ItinTotalFareTypeServiceFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>TotalMileage");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalMileage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>TotalWithExtras");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalWithExtras.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">MaxOneWayOptions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.MaxOneWayOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">MaxResponses");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.MaxResponses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">NumOneWayOptions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.NumOneWayOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">NumTripsType>Number");
            cachedSerQNames.add(qName);
            cls = short.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OfficeCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OnlineIndicator");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OnlineIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OriginDestinationInformationType>DestinationLocation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OriginDestinationInformationType>OriginLocation");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OTA_AirLowFareSearchRQ");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OTA_AirLowFareSearchRS");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PassengerTypeQuantityType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PersonalCityCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PricedItineraryType>AirItineraryPricingInfo");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeAirItineraryPricingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PricedItineraryType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>AccountCode");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeAccountCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>NegotiatedFareCode");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeNegotiatedFareCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>Endorsements");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>FareBasisCodes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareBasisCodesFareBasisCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>FareBasisCodes>FareBasisCode");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareBasisCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>FareInfos");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>FareInfos>FareInfo");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>PrivateFareType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>ReissueExchange");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeReissueExchange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ReissueExchange");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ReissueExchange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ReissueInfoType>ChangeFees");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFees.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ReissueTaxType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RequestLocationType>AirportsGroup");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RequestLocationType>LocationCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RetailerRulesType>RetailerRule");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RetailerRulesTypeRetailerRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RuleInfoType>ResTicketingRules");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RuleInfoTypeResTicketingRules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SegmentType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SegmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ShareMarketInd");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ShareMarketInd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ShareSynchInd");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ShareSynchInd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SingleVendorInd");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SingleVendorInd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SisterDestinationMileage");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SisterDestinationMileage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SisterOriginMileage");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SisterOriginMileage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">StateProvType>StateCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">StayRestrictionsType>MaximumStay");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">StayRestrictionsType>MinimumStay");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMinimumStay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Target");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.Target.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TaxCodeType>TaxCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Taxes");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TaxCodeAmountType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TaxCodeAmountType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tax");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TicketPricingType>OriginDestinationOptions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TicketPricingType>OriginDestinationOptions>OriginDestinationOption");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TicketPricingType>TPA_Extensions");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_Extensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TotalTravelTime");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TotalTravelTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionStatusCode");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ATSETest");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeATSETest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>AvailableLevel");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeAvailableLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>Branch");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeBranch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ClientSessionID");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeClientSessionID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>CompressResponse");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeCompressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>Diagnostics");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnostic[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>Diagnostics>Diagnostic");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Diagnostic");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>FareOverrides");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeFareOverridesFareOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>FareOverrides>FareOverride");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareOverride");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>PurchaseType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypePurchaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>RequestType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ResponseSorting");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeResponseSorting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>SabreAth");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeSabreAth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ServiceTag");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeServiceTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>SubagentData");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeSubagentData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>TranID");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionTypeTranID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelDateTimeType>ArrivalDates");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelDateTimeType>DepartureDates");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelerCountType>Code");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerCountTypeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelerInfoSummary_TPA_ExtensionsType>TravelerRating");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ValidatingCarrierInfoType>Alternate");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ValidatingCarrierInfoType>Alternate>Country");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Country");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ValidatingCarrierInfoType>Default");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeDefaultCountry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ValidatingCarrierInfoType>Default>Country");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Country");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ValidatingCarrierType>Preference");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierTypePreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">VoluntaryChangesType>Penalty");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.VoluntaryChangesTypePenalty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ActionCodeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ActionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AddressType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvResTicketingType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AdvResTicketingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AgentDepartmentCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AgentFunctionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirFeeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirFeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryPricingInfoType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirItineraryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineLowestFaresType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirlineLowestFaresType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirlineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirportCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirportInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirportInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirSearchPrefsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirSearchPrefsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTaxType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTravelerType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirTravelerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTripType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AirTripType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AllianceType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AllianceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaNumericString");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaNumericStringLength1to14");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AltCitiesCombinationsLocationsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AltCitiesCombinationsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AltCitiesCombinationsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateDateLowestFaresType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AlternateDateLowestFaresType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateLocationLowestFaresType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AlternateLocationLowestFaresType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFeeGroupCodeList");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ApplyResidentDiscountType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ApplyResidentDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ARCNumberType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArunkType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ArunkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AwardShoppingType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.AwardShoppingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformationListType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BaggageInformationType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformationType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BaggageInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BillingActionCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BillingInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BillingInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookFlightSegmentType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookingChannelType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookingChannelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookingClassPrefType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookingClassPrefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BoolTFType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BrandType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BrandType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CabinPrefType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CabinPrefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CabinType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CabinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CachePartitionGroupType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CachePartitionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CachePartitionType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Partition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CachePartitionType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CachePartitionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCodeOrEmpty");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CarrierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CharacterType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ClassOfServiceType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNamePrefType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CompanyNamePrefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CompanyNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ComplexProcessingMessageType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ComplexProcessingMessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionType>ConnectionLocation");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CorporateIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountOrPercentage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountryNameType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CountryNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CouponOfferType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CouponOfferType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CurrencyAmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyConversionsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CurrencyConversionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CustLoyaltyType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.CustLoyaltyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DateOrDateTimeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DateOrDateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DateRangeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DateRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DateTimeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDaysType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DepartureDaysType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureOrArrival");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DepartureOrArrival.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiagnosticName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiversityControlType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DiversityControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DocumentType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.DocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EmailType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.EmailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquipmentType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.EquipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquipmentTypePref");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.EquipmentTypePref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ErrorsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ErrorType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ErrorType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ErrorType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeAirSearchPrefsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeAirSearchPrefsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeFareType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeFareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeOriginDestinationFlightType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationFlightType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeOriginDestinationInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangePOSType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangePOSType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeSettingsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeSettingsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeSourceType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeTPA_ExtensionsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeTPA_ExtensionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeTravelPreferencesTPA_ExtensionsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeTravelPreferencesTPA_ExtensionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ExchangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareBasisCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareCalcLineType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareCalcLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentBreakdownType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareComponentBreakdownType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentTaxesType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareComponentTaxesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareDetailsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareDirectionality");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareDirectionality.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareGroupType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfoType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareMessagesType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareMessagesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareOptionalDetailsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareOptionalDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareRestrictPrefType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareRestrictPrefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareTypeNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlexibleFaresType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParameters[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FlexibleFaresType>FareParameters");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareParameters");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightNumberType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightStopsAsConnectionsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlightStopsAsConnectionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightTypePrefType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlightTypePrefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightTypeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FlightTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FloatSignedCountOrPercentage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FreeTextType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FreeTextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "GlobalDateTimeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.GlobalDateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "GoverningCarrierOverrideType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.GoverningCarrierOverrideType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HandlingMarkupSummaryType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.HandlingMarkupSummaryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HH_MM");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeVendorPrefType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.IncludeVendorPrefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IntDateTime");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IntelliSellRequestType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "InterlineBrandsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BrandType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BrandType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Brand");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IntPercentage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateOptTimeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateTimeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellWeekDaysType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISO3166");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItinTotalFareType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ItinTotalFareType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "JumpCabinLogicType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.JumpCabinLogicType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "KeepSameCabinType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.KeepSameCabinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LnIATAType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MessageClassType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.MessageClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MileageDisplayType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.MileageDisplayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NbrOrBooleanType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.NbrOrBooleanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0To10Type");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to4");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to72");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to9");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to999");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric1to99");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric1to999");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to8");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumTripsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.NumTripsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OBFeeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OBFeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OCFeeCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OCFeeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OCFeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings6() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OperatingAirlineType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OperatingAirlineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OptionsPerDatePairType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OptionsPerDatePairType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationFlightType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OriginDestinationFlightType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OriginDestinationInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOptionType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.BookFlightSegmentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookFlightSegmentType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightSegment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OutboundOrInbound");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OutboundOrInbound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OverrideDateTimeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.OverrideDateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PartitionIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PartitionNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantityType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PCCType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Percentage");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PercentageType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PersonNameType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PersonNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PlusUpType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PlusUpType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PointOfSaleOverrideType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PointOfSaleOverrideType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PointOfTicketingOverrideType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PointOfTicketingOverrideType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PollingStatusType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PollingStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "POS_Type");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SourceType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SourceType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Source");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PositionType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PreferLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItinerariesType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItineraryType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItinerary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItineraryType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PricedItineraryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PriceRequestInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PriceRequestInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricingSubSourceType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessageType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ProcessingMessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PTCFareBreakdownType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.PTCFareBreakdownType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RateOfExchangeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RateOfExchangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReissueInfoType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ReissueInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RequestLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestPricingSourceType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RequestPricingSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReservationStatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReservationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ReservationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseLocationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ResponseLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponsePricingSourceType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RetailerRulesType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RetailerRulesTypeRetailerRule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RetailerRulesType>RetailerRule");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RetailerRule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingAirlineCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingAirportCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingDefinitionType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RoutingLegType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingLegType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingLeg");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingLegType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RoutingLegType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RuleInfoType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.RuleInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SeatStatusSimType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SeatStatusSimType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingFareDataType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.HandlingMarkupSummaryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HandlingMarkupSummaryType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HandlingMarkupSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ServiceNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ServiceTagType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SettlementMethodType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SideTripType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SideTripType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SignedCountOrPercentage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SourceBookingChannelType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SourceBookingChannelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SourceType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StateCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StateProvType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.StateProvType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayRestrictionsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.StayRestrictionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayUnitType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.StayUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StreetNmbrType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.StreetNmbrType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength0to64");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to128");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to20");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SuccessType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SumWeight");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SurchargesType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.SurchargesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TaxCodeAmountType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TaxCodeAmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TaxCodeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TaxCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TelephoneType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TelephoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketDistribPrefType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketDistribPrefType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketingInfoRS_Type");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketPricingType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketPricingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketsPricingType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketPricingType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketPricingType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Ticket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TicketType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TimeOrDateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowBoundaryType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TransactionType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TransactionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelDateTimeType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelDateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerCountType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerCountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfoSummary_TPA_ExtensionsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelerInfoSummary_TPA_ExtensionsType>TravelerRating");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerRating");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfoSummaryType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerRefNumberType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.TravelerRefNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UnflownPriceType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.UnflownPriceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UniqueID_Type");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.UniqueID_Type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaLength1to2");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaLength1to2WithSpace");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaLength1to3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaNumericLength2to3");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaNumericLength3to5");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrierInfoType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrierPreferLevelType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierPreferLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrierType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidatingCarrierTypePreference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ValidatingCarrierType>Preference");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Preference");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidInterlineType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.ValidInterlineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VCCInformationType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.FareComponentBreakdownType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentBreakdownType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentBreakdown");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VoluntaryChangesType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.VoluntaryChangesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings7() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "WarningsType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.WarningType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "WarningType");
            qName2 = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Warning");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "WarningType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.WarningType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "XOFaresType");
            cachedSerQNames.add(qName);
            cls = org.opentravel.www.OTA._2003._05.XOFaresType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">show");
            cachedSerQNames.add(qName);
            cls = org.w3.www._1999.xlink.Show.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">type");
            cachedSerQNames.add(qName);
            cls = org.w3.www._1999.xlink.Type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.CanonicalizationMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "CryptoBinary");
            cachedSerQNames.add(qName);
            cls = byte[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.DigestMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DigestValueType");
            cachedSerQNames.add(qName);
            cls = byte[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.DSAKeyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLengthType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfoType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.KeyInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "KeyValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.KeyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "ManifestType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.ReferenceType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "ObjectType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.ObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "PGPDataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.PGPDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "ReferenceType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.ReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.RetrievalMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.RSAKeyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignatureMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignaturePropertiesType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignaturePropertyType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignaturePropertyType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignaturePropertyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignatureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignatureValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfoType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignedInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SPKIDataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SPKIDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "TransformsType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.TransformType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "TransformType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.TransformType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509DataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.X509DataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerialType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.X509IssuerSerialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS bargainFinderMaxRQ(org.ebxml.www.namespaces.messageHeader.holders.MessageHeaderHolder header, org.xmlsoap.schemas.ws._2002._12.secext.holders.SecurityHolder header2, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQ body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BargainFinderMaxRQ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BargainFinderMaxRQ"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header.value, header2.value, body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                header.value = (org.ebxml.www.namespaces.messageHeader.MessageHeader) _output.get(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "MessageHeader"));
            } catch (java.lang.Exception _exception) {
                header.value = (org.ebxml.www.namespaces.messageHeader.MessageHeader) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "MessageHeader")), org.ebxml.www.namespaces.messageHeader.MessageHeader.class);
            }
            try {
                header2.value = (org.xmlsoap.schemas.ws._2002._12.secext.Security) _output.get(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "Security"));
            } catch (java.lang.Exception _exception) {
                header2.value = (org.xmlsoap.schemas.ws._2002._12.secext.Security) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "Security")), org.xmlsoap.schemas.ws._2002._12.secext.Security.class);
            }
            try {
                return (org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS) org.apache.axis.utils.JavaUtils.convert(_resp, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
