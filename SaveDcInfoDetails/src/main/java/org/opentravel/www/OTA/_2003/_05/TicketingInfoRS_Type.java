/**
 * TicketingInfoRS_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Extends TicketingInfoType to provide an eTicketNumber.
 */
public class TicketingInfoRS_Type  implements java.io.Serializable {
    /* Open text field available for additional ticket information. */
    private org.opentravel.www.OTA._2003._05.FreeTextType[] ticketAdvisory;

    /* Place holder for additional elements. */
    private java.lang.String TPA_Extensions;

    private java.lang.String eTicketNumber;  // attribute

    private java.lang.String ticketTimeLimit;  // attribute

    private org.opentravel.www.OTA._2003._05.TicketType ticketType;  // attribute

    private org.opentravel.www.OTA._2003._05.ValidInterlineType validInterline;  // attribute

    public TicketingInfoRS_Type() {
    }

    public TicketingInfoRS_Type(
           org.opentravel.www.OTA._2003._05.FreeTextType[] ticketAdvisory,
           java.lang.String TPA_Extensions,
           java.lang.String eTicketNumber,
           java.lang.String ticketTimeLimit,
           org.opentravel.www.OTA._2003._05.TicketType ticketType,
           org.opentravel.www.OTA._2003._05.ValidInterlineType validInterline) {
           this.ticketAdvisory = ticketAdvisory;
           this.TPA_Extensions = TPA_Extensions;
           this.eTicketNumber = eTicketNumber;
           this.ticketTimeLimit = ticketTimeLimit;
           this.ticketType = ticketType;
           this.validInterline = validInterline;
    }


    /**
     * Gets the ticketAdvisory value for this TicketingInfoRS_Type.
     * 
     * @return ticketAdvisory   * Open text field available for additional ticket information.
     */
    public org.opentravel.www.OTA._2003._05.FreeTextType[] getTicketAdvisory() {
        return ticketAdvisory;
    }


    /**
     * Sets the ticketAdvisory value for this TicketingInfoRS_Type.
     * 
     * @param ticketAdvisory   * Open text field available for additional ticket information.
     */
    public void setTicketAdvisory(org.opentravel.www.OTA._2003._05.FreeTextType[] ticketAdvisory) {
        this.ticketAdvisory = ticketAdvisory;
    }

    public org.opentravel.www.OTA._2003._05.FreeTextType getTicketAdvisory(int i) {
        return this.ticketAdvisory[i];
    }

    public void setTicketAdvisory(int i, org.opentravel.www.OTA._2003._05.FreeTextType _value) {
        this.ticketAdvisory[i] = _value;
    }


    /**
     * Gets the TPA_Extensions value for this TicketingInfoRS_Type.
     * 
     * @return TPA_Extensions   * Place holder for additional elements.
     */
    public java.lang.String getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this TicketingInfoRS_Type.
     * 
     * @param TPA_Extensions   * Place holder for additional elements.
     */
    public void setTPA_Extensions(java.lang.String TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the eTicketNumber value for this TicketingInfoRS_Type.
     * 
     * @return eTicketNumber
     */
    public java.lang.String getETicketNumber() {
        return eTicketNumber;
    }


    /**
     * Sets the eTicketNumber value for this TicketingInfoRS_Type.
     * 
     * @param eTicketNumber
     */
    public void setETicketNumber(java.lang.String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }


    /**
     * Gets the ticketTimeLimit value for this TicketingInfoRS_Type.
     * 
     * @return ticketTimeLimit
     */
    public java.lang.String getTicketTimeLimit() {
        return ticketTimeLimit;
    }


    /**
     * Sets the ticketTimeLimit value for this TicketingInfoRS_Type.
     * 
     * @param ticketTimeLimit
     */
    public void setTicketTimeLimit(java.lang.String ticketTimeLimit) {
        this.ticketTimeLimit = ticketTimeLimit;
    }


    /**
     * Gets the ticketType value for this TicketingInfoRS_Type.
     * 
     * @return ticketType
     */
    public org.opentravel.www.OTA._2003._05.TicketType getTicketType() {
        return ticketType;
    }


    /**
     * Sets the ticketType value for this TicketingInfoRS_Type.
     * 
     * @param ticketType
     */
    public void setTicketType(org.opentravel.www.OTA._2003._05.TicketType ticketType) {
        this.ticketType = ticketType;
    }


    /**
     * Gets the validInterline value for this TicketingInfoRS_Type.
     * 
     * @return validInterline
     */
    public org.opentravel.www.OTA._2003._05.ValidInterlineType getValidInterline() {
        return validInterline;
    }


    /**
     * Sets the validInterline value for this TicketingInfoRS_Type.
     * 
     * @param validInterline
     */
    public void setValidInterline(org.opentravel.www.OTA._2003._05.ValidInterlineType validInterline) {
        this.validInterline = validInterline;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketingInfoRS_Type)) return false;
        TicketingInfoRS_Type other = (TicketingInfoRS_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticketAdvisory==null && other.getTicketAdvisory()==null) || 
             (this.ticketAdvisory!=null &&
              java.util.Arrays.equals(this.ticketAdvisory, other.getTicketAdvisory()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.eTicketNumber==null && other.getETicketNumber()==null) || 
             (this.eTicketNumber!=null &&
              this.eTicketNumber.equals(other.getETicketNumber()))) &&
            ((this.ticketTimeLimit==null && other.getTicketTimeLimit()==null) || 
             (this.ticketTimeLimit!=null &&
              this.ticketTimeLimit.equals(other.getTicketTimeLimit()))) &&
            ((this.ticketType==null && other.getTicketType()==null) || 
             (this.ticketType!=null &&
              this.ticketType.equals(other.getTicketType()))) &&
            ((this.validInterline==null && other.getValidInterline()==null) || 
             (this.validInterline!=null &&
              this.validInterline.equals(other.getValidInterline())));
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
        if (getTicketAdvisory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTicketAdvisory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTicketAdvisory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getETicketNumber() != null) {
            _hashCode += getETicketNumber().hashCode();
        }
        if (getTicketTimeLimit() != null) {
            _hashCode += getTicketTimeLimit().hashCode();
        }
        if (getTicketType() != null) {
            _hashCode += getTicketType().hashCode();
        }
        if (getValidInterline() != null) {
            _hashCode += getValidInterline().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketingInfoRS_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketingInfoRS_Type"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ETicketNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "eTicketNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaNumericStringLength1to14"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ticketTimeLimit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TicketTimeLimit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ticketType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TicketType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validInterline");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ValidInterline"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidInterlineType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketAdvisory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketAdvisory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FreeTextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
