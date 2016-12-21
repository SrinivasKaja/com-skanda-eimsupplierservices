/**
 * ConnectionTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ConnectionTime  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger min;  // attribute

    private org.apache.axis.types.NonNegativeInteger max;  // attribute

    private java.lang.String excludedConnectionBegin;  // attribute

    private java.lang.String excludedConnectionEnd;  // attribute

    private java.lang.Boolean enableExcludedConnection;  // attribute

    public ConnectionTime() {
    }

    public ConnectionTime(
           org.apache.axis.types.NonNegativeInteger min,
           org.apache.axis.types.NonNegativeInteger max,
           java.lang.String excludedConnectionBegin,
           java.lang.String excludedConnectionEnd,
           java.lang.Boolean enableExcludedConnection) {
           this.min = min;
           this.max = max;
           this.excludedConnectionBegin = excludedConnectionBegin;
           this.excludedConnectionEnd = excludedConnectionEnd;
           this.enableExcludedConnection = enableExcludedConnection;
    }


    /**
     * Gets the min value for this ConnectionTime.
     * 
     * @return min
     */
    public org.apache.axis.types.NonNegativeInteger getMin() {
        return min;
    }


    /**
     * Sets the min value for this ConnectionTime.
     * 
     * @param min
     */
    public void setMin(org.apache.axis.types.NonNegativeInteger min) {
        this.min = min;
    }


    /**
     * Gets the max value for this ConnectionTime.
     * 
     * @return max
     */
    public org.apache.axis.types.NonNegativeInteger getMax() {
        return max;
    }


    /**
     * Sets the max value for this ConnectionTime.
     * 
     * @param max
     */
    public void setMax(org.apache.axis.types.NonNegativeInteger max) {
        this.max = max;
    }


    /**
     * Gets the excludedConnectionBegin value for this ConnectionTime.
     * 
     * @return excludedConnectionBegin
     */
    public java.lang.String getExcludedConnectionBegin() {
        return excludedConnectionBegin;
    }


    /**
     * Sets the excludedConnectionBegin value for this ConnectionTime.
     * 
     * @param excludedConnectionBegin
     */
    public void setExcludedConnectionBegin(java.lang.String excludedConnectionBegin) {
        this.excludedConnectionBegin = excludedConnectionBegin;
    }


    /**
     * Gets the excludedConnectionEnd value for this ConnectionTime.
     * 
     * @return excludedConnectionEnd
     */
    public java.lang.String getExcludedConnectionEnd() {
        return excludedConnectionEnd;
    }


    /**
     * Sets the excludedConnectionEnd value for this ConnectionTime.
     * 
     * @param excludedConnectionEnd
     */
    public void setExcludedConnectionEnd(java.lang.String excludedConnectionEnd) {
        this.excludedConnectionEnd = excludedConnectionEnd;
    }


    /**
     * Gets the enableExcludedConnection value for this ConnectionTime.
     * 
     * @return enableExcludedConnection
     */
    public java.lang.Boolean getEnableExcludedConnection() {
        return enableExcludedConnection;
    }


    /**
     * Sets the enableExcludedConnection value for this ConnectionTime.
     * 
     * @param enableExcludedConnection
     */
    public void setEnableExcludedConnection(java.lang.Boolean enableExcludedConnection) {
        this.enableExcludedConnection = enableExcludedConnection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectionTime)) return false;
        ConnectionTime other = (ConnectionTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.excludedConnectionBegin==null && other.getExcludedConnectionBegin()==null) || 
             (this.excludedConnectionBegin!=null &&
              this.excludedConnectionBegin.equals(other.getExcludedConnectionBegin()))) &&
            ((this.excludedConnectionEnd==null && other.getExcludedConnectionEnd()==null) || 
             (this.excludedConnectionEnd!=null &&
              this.excludedConnectionEnd.equals(other.getExcludedConnectionEnd()))) &&
            ((this.enableExcludedConnection==null && other.getEnableExcludedConnection()==null) || 
             (this.enableExcludedConnection!=null &&
              this.enableExcludedConnection.equals(other.getEnableExcludedConnection())));
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
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        if (getExcludedConnectionBegin() != null) {
            _hashCode += getExcludedConnectionBegin().hashCode();
        }
        if (getExcludedConnectionEnd() != null) {
            _hashCode += getExcludedConnectionEnd().hashCode();
        }
        if (getEnableExcludedConnection() != null) {
            _hashCode += getEnableExcludedConnection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectionTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionTime"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("min");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Min"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("max");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Max"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("excludedConnectionBegin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExcludedConnectionBegin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowBoundaryType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("excludedConnectionEnd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExcludedConnectionEnd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowBoundaryType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("enableExcludedConnection");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EnableExcludedConnection"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
