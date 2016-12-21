/**
 * TicketDistribPrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Type of ticket distribution to be used with this collection of
 * preferences.
 */
public class TicketDistribPrefType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel;  // attribute

    private java.lang.String distribType;  // attribute

    private org.apache.axis.types.Duration ticketTime;  // attribute

    public TicketDistribPrefType() {
    }

    // Simple Types must have a String constructor
    public TicketDistribPrefType(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the preferLevel value for this TicketDistribPrefType.
     * 
     * @return preferLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferLevel() {
        return preferLevel;
    }


    /**
     * Sets the preferLevel value for this TicketDistribPrefType.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }


    /**
     * Gets the distribType value for this TicketDistribPrefType.
     * 
     * @return distribType
     */
    public java.lang.String getDistribType() {
        return distribType;
    }


    /**
     * Sets the distribType value for this TicketDistribPrefType.
     * 
     * @param distribType
     */
    public void setDistribType(java.lang.String distribType) {
        this.distribType = distribType;
    }


    /**
     * Gets the ticketTime value for this TicketDistribPrefType.
     * 
     * @return ticketTime
     */
    public org.apache.axis.types.Duration getTicketTime() {
        return ticketTime;
    }


    /**
     * Sets the ticketTime value for this TicketDistribPrefType.
     * 
     * @param ticketTime
     */
    public void setTicketTime(org.apache.axis.types.Duration ticketTime) {
        this.ticketTime = ticketTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketDistribPrefType)) return false;
        TicketDistribPrefType other = (TicketDistribPrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.preferLevel==null && other.getPreferLevel()==null) || 
             (this.preferLevel!=null &&
              this.preferLevel.equals(other.getPreferLevel()))) &&
            ((this.distribType==null && other.getDistribType()==null) || 
             (this.distribType!=null &&
              this.distribType.equals(other.getDistribType()))) &&
            ((this.ticketTime==null && other.getTicketTime()==null) || 
             (this.ticketTime!=null &&
              this.ticketTime.equals(other.getTicketTime())));
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
        if (getPreferLevel() != null) {
            _hashCode += getPreferLevel().hashCode();
        }
        if (getDistribType() != null) {
            _hashCode += getDistribType().hashCode();
        }
        if (getTicketTime() != null) {
            _hashCode += getTicketTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketDistribPrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketDistribPrefType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preferLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreferLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("distribType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DistribType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ticketTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TicketTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
