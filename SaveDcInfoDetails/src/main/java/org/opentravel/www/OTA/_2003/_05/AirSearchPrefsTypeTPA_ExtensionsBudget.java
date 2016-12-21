/**
 * AirSearchPrefsTypeTPA_ExtensionsBudget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsBudget  implements java.io.Serializable {
    private java.lang.Object minimumPrice;  // attribute

    private java.lang.Object maximumPrice;  // attribute

    private java.lang.String relativePriceThreshold;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsBudget() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsBudget(
           java.lang.Object minimumPrice,
           java.lang.Object maximumPrice,
           java.lang.String relativePriceThreshold) {
           this.minimumPrice = minimumPrice;
           this.maximumPrice = maximumPrice;
           this.relativePriceThreshold = relativePriceThreshold;
    }


    /**
     * Gets the minimumPrice value for this AirSearchPrefsTypeTPA_ExtensionsBudget.
     * 
     * @return minimumPrice
     */
    public java.lang.Object getMinimumPrice() {
        return minimumPrice;
    }


    /**
     * Sets the minimumPrice value for this AirSearchPrefsTypeTPA_ExtensionsBudget.
     * 
     * @param minimumPrice
     */
    public void setMinimumPrice(java.lang.Object minimumPrice) {
        this.minimumPrice = minimumPrice;
    }


    /**
     * Gets the maximumPrice value for this AirSearchPrefsTypeTPA_ExtensionsBudget.
     * 
     * @return maximumPrice
     */
    public java.lang.Object getMaximumPrice() {
        return maximumPrice;
    }


    /**
     * Sets the maximumPrice value for this AirSearchPrefsTypeTPA_ExtensionsBudget.
     * 
     * @param maximumPrice
     */
    public void setMaximumPrice(java.lang.Object maximumPrice) {
        this.maximumPrice = maximumPrice;
    }


    /**
     * Gets the relativePriceThreshold value for this AirSearchPrefsTypeTPA_ExtensionsBudget.
     * 
     * @return relativePriceThreshold
     */
    public java.lang.String getRelativePriceThreshold() {
        return relativePriceThreshold;
    }


    /**
     * Sets the relativePriceThreshold value for this AirSearchPrefsTypeTPA_ExtensionsBudget.
     * 
     * @param relativePriceThreshold
     */
    public void setRelativePriceThreshold(java.lang.String relativePriceThreshold) {
        this.relativePriceThreshold = relativePriceThreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsBudget)) return false;
        AirSearchPrefsTypeTPA_ExtensionsBudget other = (AirSearchPrefsTypeTPA_ExtensionsBudget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minimumPrice==null && other.getMinimumPrice()==null) || 
             (this.minimumPrice!=null &&
              this.minimumPrice.equals(other.getMinimumPrice()))) &&
            ((this.maximumPrice==null && other.getMaximumPrice()==null) || 
             (this.maximumPrice!=null &&
              this.maximumPrice.equals(other.getMaximumPrice()))) &&
            ((this.relativePriceThreshold==null && other.getRelativePriceThreshold()==null) || 
             (this.relativePriceThreshold!=null &&
              this.relativePriceThreshold.equals(other.getRelativePriceThreshold())));
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
        if (getMinimumPrice() != null) {
            _hashCode += getMinimumPrice().hashCode();
        }
        if (getMaximumPrice() != null) {
            _hashCode += getMaximumPrice().hashCode();
        }
        if (getRelativePriceThreshold() != null) {
            _hashCode += getRelativePriceThreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsBudget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>Budget"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minimumPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinimumPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maximumPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaximumPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("relativePriceThreshold");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RelativePriceThreshold"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SignedCountOrPercentage"));
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
