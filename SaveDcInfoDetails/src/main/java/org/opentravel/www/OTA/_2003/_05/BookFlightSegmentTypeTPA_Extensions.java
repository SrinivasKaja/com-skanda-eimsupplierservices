/**
 * BookFlightSegmentTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class BookFlightSegmentTypeTPA_Extensions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsETicket eTicket;

    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsDataElement dataElement;

    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsMessage message;

    public BookFlightSegmentTypeTPA_Extensions() {
    }

    public BookFlightSegmentTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsETicket eTicket,
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsDataElement dataElement,
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsMessage message) {
           this.eTicket = eTicket;
           this.dataElement = dataElement;
           this.message = message;
    }


    /**
     * Gets the eTicket value for this BookFlightSegmentTypeTPA_Extensions.
     * 
     * @return eTicket
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsETicket getETicket() {
        return eTicket;
    }


    /**
     * Sets the eTicket value for this BookFlightSegmentTypeTPA_Extensions.
     * 
     * @param eTicket
     */
    public void setETicket(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsETicket eTicket) {
        this.eTicket = eTicket;
    }


    /**
     * Gets the dataElement value for this BookFlightSegmentTypeTPA_Extensions.
     * 
     * @return dataElement
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsDataElement getDataElement() {
        return dataElement;
    }


    /**
     * Sets the dataElement value for this BookFlightSegmentTypeTPA_Extensions.
     * 
     * @param dataElement
     */
    public void setDataElement(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsDataElement dataElement) {
        this.dataElement = dataElement;
    }


    /**
     * Gets the message value for this BookFlightSegmentTypeTPA_Extensions.
     * 
     * @return message
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsMessage getMessage() {
        return message;
    }


    /**
     * Sets the message value for this BookFlightSegmentTypeTPA_Extensions.
     * 
     * @param message
     */
    public void setMessage(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_ExtensionsMessage message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookFlightSegmentTypeTPA_Extensions)) return false;
        BookFlightSegmentTypeTPA_Extensions other = (BookFlightSegmentTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eTicket==null && other.getETicket()==null) || 
             (this.eTicket!=null &&
              this.eTicket.equals(other.getETicket()))) &&
            ((this.dataElement==null && other.getDataElement()==null) || 
             (this.dataElement!=null &&
              this.dataElement.equals(other.getDataElement()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getETicket() != null) {
            _hashCode += getETicket().hashCode();
        }
        if (getDataElement() != null) {
            _hashCode += getDataElement().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookFlightSegmentTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ETicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "eTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>TPA_Extensions>eTicket"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataElement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DataElement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>TPA_Extensions>DataElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>TPA_Extensions>Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
