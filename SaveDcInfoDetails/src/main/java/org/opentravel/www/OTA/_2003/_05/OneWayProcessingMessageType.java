/**
 * OneWayProcessingMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OneWayProcessingMessageType  extends org.opentravel.www.OTA._2003._05.ProcessingMessageType  implements java.io.Serializable {
    private java.util.Date departureDate;  // attribute

    private java.lang.String departureAirport;  // attribute

    private java.lang.String arrivalAirport;  // attribute

    public OneWayProcessingMessageType() {
    }

    public OneWayProcessingMessageType(
           java.lang.String pricingSource,
           java.lang.String message,
           java.util.Date departureDate,
           java.lang.String departureAirport,
           java.lang.String arrivalAirport) {
        super(
            pricingSource,
            message);
        this.departureDate = departureDate;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }


    /**
     * Gets the departureDate value for this OneWayProcessingMessageType.
     * 
     * @return departureDate
     */
    public java.util.Date getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this OneWayProcessingMessageType.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Date departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the departureAirport value for this OneWayProcessingMessageType.
     * 
     * @return departureAirport
     */
    public java.lang.String getDepartureAirport() {
        return departureAirport;
    }


    /**
     * Sets the departureAirport value for this OneWayProcessingMessageType.
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(java.lang.String departureAirport) {
        this.departureAirport = departureAirport;
    }


    /**
     * Gets the arrivalAirport value for this OneWayProcessingMessageType.
     * 
     * @return arrivalAirport
     */
    public java.lang.String getArrivalAirport() {
        return arrivalAirport;
    }


    /**
     * Sets the arrivalAirport value for this OneWayProcessingMessageType.
     * 
     * @param arrivalAirport
     */
    public void setArrivalAirport(java.lang.String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OneWayProcessingMessageType)) return false;
        OneWayProcessingMessageType other = (OneWayProcessingMessageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.departureAirport==null && other.getDepartureAirport()==null) || 
             (this.departureAirport!=null &&
              this.departureAirport.equals(other.getDepartureAirport()))) &&
            ((this.arrivalAirport==null && other.getArrivalAirport()==null) || 
             (this.arrivalAirport!=null &&
              this.arrivalAirport.equals(other.getArrivalAirport())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getDepartureAirport() != null) {
            _hashCode += getDepartureAirport().hashCode();
        }
        if (getArrivalAirport() != null) {
            _hashCode += getArrivalAirport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OneWayProcessingMessageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureAirport");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureAirport"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("arrivalAirport");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ArrivalAirport"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
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
