/**
 * RoutingLegType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Definition of individual routing legs, at least one leg must be
 * present.
 */
public class RoutingLegType  implements java.io.Serializable {
    private java.lang.String[] inboundOutboundCarrier;

    private java.lang.String[] inboundCarrier;

    private java.lang.String[] outboundCarrier;

    private java.lang.String[] connectPoint;

    public RoutingLegType() {
    }

    public RoutingLegType(
           java.lang.String[] inboundOutboundCarrier,
           java.lang.String[] inboundCarrier,
           java.lang.String[] outboundCarrier,
           java.lang.String[] connectPoint) {
           this.inboundOutboundCarrier = inboundOutboundCarrier;
           this.inboundCarrier = inboundCarrier;
           this.outboundCarrier = outboundCarrier;
           this.connectPoint = connectPoint;
    }


    /**
     * Gets the inboundOutboundCarrier value for this RoutingLegType.
     * 
     * @return inboundOutboundCarrier
     */
    public java.lang.String[] getInboundOutboundCarrier() {
        return inboundOutboundCarrier;
    }


    /**
     * Sets the inboundOutboundCarrier value for this RoutingLegType.
     * 
     * @param inboundOutboundCarrier
     */
    public void setInboundOutboundCarrier(java.lang.String[] inboundOutboundCarrier) {
        this.inboundOutboundCarrier = inboundOutboundCarrier;
    }

    public java.lang.String getInboundOutboundCarrier(int i) {
        return this.inboundOutboundCarrier[i];
    }

    public void setInboundOutboundCarrier(int i, java.lang.String _value) {
        this.inboundOutboundCarrier[i] = _value;
    }


    /**
     * Gets the inboundCarrier value for this RoutingLegType.
     * 
     * @return inboundCarrier
     */
    public java.lang.String[] getInboundCarrier() {
        return inboundCarrier;
    }


    /**
     * Sets the inboundCarrier value for this RoutingLegType.
     * 
     * @param inboundCarrier
     */
    public void setInboundCarrier(java.lang.String[] inboundCarrier) {
        this.inboundCarrier = inboundCarrier;
    }

    public java.lang.String getInboundCarrier(int i) {
        return this.inboundCarrier[i];
    }

    public void setInboundCarrier(int i, java.lang.String _value) {
        this.inboundCarrier[i] = _value;
    }


    /**
     * Gets the outboundCarrier value for this RoutingLegType.
     * 
     * @return outboundCarrier
     */
    public java.lang.String[] getOutboundCarrier() {
        return outboundCarrier;
    }


    /**
     * Sets the outboundCarrier value for this RoutingLegType.
     * 
     * @param outboundCarrier
     */
    public void setOutboundCarrier(java.lang.String[] outboundCarrier) {
        this.outboundCarrier = outboundCarrier;
    }

    public java.lang.String getOutboundCarrier(int i) {
        return this.outboundCarrier[i];
    }

    public void setOutboundCarrier(int i, java.lang.String _value) {
        this.outboundCarrier[i] = _value;
    }


    /**
     * Gets the connectPoint value for this RoutingLegType.
     * 
     * @return connectPoint
     */
    public java.lang.String[] getConnectPoint() {
        return connectPoint;
    }


    /**
     * Sets the connectPoint value for this RoutingLegType.
     * 
     * @param connectPoint
     */
    public void setConnectPoint(java.lang.String[] connectPoint) {
        this.connectPoint = connectPoint;
    }

    public java.lang.String getConnectPoint(int i) {
        return this.connectPoint[i];
    }

    public void setConnectPoint(int i, java.lang.String _value) {
        this.connectPoint[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingLegType)) return false;
        RoutingLegType other = (RoutingLegType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inboundOutboundCarrier==null && other.getInboundOutboundCarrier()==null) || 
             (this.inboundOutboundCarrier!=null &&
              java.util.Arrays.equals(this.inboundOutboundCarrier, other.getInboundOutboundCarrier()))) &&
            ((this.inboundCarrier==null && other.getInboundCarrier()==null) || 
             (this.inboundCarrier!=null &&
              java.util.Arrays.equals(this.inboundCarrier, other.getInboundCarrier()))) &&
            ((this.outboundCarrier==null && other.getOutboundCarrier()==null) || 
             (this.outboundCarrier!=null &&
              java.util.Arrays.equals(this.outboundCarrier, other.getOutboundCarrier()))) &&
            ((this.connectPoint==null && other.getConnectPoint()==null) || 
             (this.connectPoint!=null &&
              java.util.Arrays.equals(this.connectPoint, other.getConnectPoint())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInboundOutboundCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInboundOutboundCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInboundOutboundCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInboundCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInboundCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInboundCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutboundCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutboundCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutboundCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnectPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingLegType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingLegType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundOutboundCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "InboundOutboundCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingAirlineCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "InboundCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingAirlineCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OutboundCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingAirlineCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingAirportCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
