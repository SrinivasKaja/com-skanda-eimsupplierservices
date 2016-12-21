/**
 * ConnectionTypeConnectionLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ConnectionTypeConnectionLocation  extends org.opentravel.www.OTA._2003._05.RequestLocationType  implements java.io.Serializable {
    private java.lang.Boolean inclusive;  // attribute

    private org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel;  // attribute

    private org.apache.axis.types.NonNegativeInteger minChangeTime;  // attribute

    private org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocationConnectionInfo connectionInfo;  // attribute

    public ConnectionTypeConnectionLocation() {
    }

    // Simple Types must have a String constructor
    public ConnectionTypeConnectionLocation(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the inclusive value for this ConnectionTypeConnectionLocation.
     * 
     * @return inclusive
     */
    public java.lang.Boolean getInclusive() {
        return inclusive;
    }


    /**
     * Sets the inclusive value for this ConnectionTypeConnectionLocation.
     * 
     * @param inclusive
     */
    public void setInclusive(java.lang.Boolean inclusive) {
        this.inclusive = inclusive;
    }


    /**
     * Gets the preferLevel value for this ConnectionTypeConnectionLocation.
     * 
     * @return preferLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferLevel() {
        return preferLevel;
    }


    /**
     * Sets the preferLevel value for this ConnectionTypeConnectionLocation.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }


    /**
     * Gets the minChangeTime value for this ConnectionTypeConnectionLocation.
     * 
     * @return minChangeTime
     */
    public org.apache.axis.types.NonNegativeInteger getMinChangeTime() {
        return minChangeTime;
    }


    /**
     * Sets the minChangeTime value for this ConnectionTypeConnectionLocation.
     * 
     * @param minChangeTime
     */
    public void setMinChangeTime(org.apache.axis.types.NonNegativeInteger minChangeTime) {
        this.minChangeTime = minChangeTime;
    }


    /**
     * Gets the connectionInfo value for this ConnectionTypeConnectionLocation.
     * 
     * @return connectionInfo
     */
    public org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocationConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }


    /**
     * Sets the connectionInfo value for this ConnectionTypeConnectionLocation.
     * 
     * @param connectionInfo
     */
    public void setConnectionInfo(org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocationConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectionTypeConnectionLocation)) return false;
        ConnectionTypeConnectionLocation other = (ConnectionTypeConnectionLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.inclusive==null && other.getInclusive()==null) || 
             (this.inclusive!=null &&
              this.inclusive.equals(other.getInclusive()))) &&
            ((this.preferLevel==null && other.getPreferLevel()==null) || 
             (this.preferLevel!=null &&
              this.preferLevel.equals(other.getPreferLevel()))) &&
            ((this.minChangeTime==null && other.getMinChangeTime()==null) || 
             (this.minChangeTime!=null &&
              this.minChangeTime.equals(other.getMinChangeTime()))) &&
            ((this.connectionInfo==null && other.getConnectionInfo()==null) || 
             (this.connectionInfo!=null &&
              this.connectionInfo.equals(other.getConnectionInfo())));
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
        if (getInclusive() != null) {
            _hashCode += getInclusive().hashCode();
        }
        if (getPreferLevel() != null) {
            _hashCode += getPreferLevel().hashCode();
        }
        if (getMinChangeTime() != null) {
            _hashCode += getMinChangeTime().hashCode();
        }
        if (getConnectionInfo() != null) {
            _hashCode += getConnectionInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectionTypeConnectionLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionType>ConnectionLocation"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("inclusive");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Inclusive"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preferLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreferLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minChangeTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinChangeTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("connectionInfo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConnectionInfo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ConnectionType>ConnectionLocation>ConnectionInfo"));
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
