/**
 * DiversityControlTypeDimensionsCarrier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DiversityControlTypeDimensionsCarrier  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierDefault _default;

    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierOverride[] override;

    private java.math.BigInteger weight;  // attribute

    private boolean onlineIndicator;  // attribute

    public DiversityControlTypeDimensionsCarrier() {
    }

    public DiversityControlTypeDimensionsCarrier(
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierDefault _default,
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierOverride[] override,
           java.math.BigInteger weight,
           boolean onlineIndicator) {
           this._default = _default;
           this.override = override;
           this.weight = weight;
           this.onlineIndicator = onlineIndicator;
    }


    /**
     * Gets the _default value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @return _default
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierDefault get_default() {
        return _default;
    }


    /**
     * Sets the _default value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @param _default
     */
    public void set_default(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierDefault _default) {
        this._default = _default;
    }


    /**
     * Gets the override value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @return override
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierOverride[] getOverride() {
        return override;
    }


    /**
     * Sets the override value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @param override
     */
    public void setOverride(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierOverride[] override) {
        this.override = override;
    }

    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierOverride getOverride(int i) {
        return this.override[i];
    }

    public void setOverride(int i, org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrierOverride _value) {
        this.override[i] = _value;
    }


    /**
     * Gets the weight value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @return weight
     */
    public java.math.BigInteger getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigInteger weight) {
        this.weight = weight;
    }


    /**
     * Gets the onlineIndicator value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @return onlineIndicator
     */
    public boolean isOnlineIndicator() {
        return onlineIndicator;
    }


    /**
     * Sets the onlineIndicator value for this DiversityControlTypeDimensionsCarrier.
     * 
     * @param onlineIndicator
     */
    public void setOnlineIndicator(boolean onlineIndicator) {
        this.onlineIndicator = onlineIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversityControlTypeDimensionsCarrier)) return false;
        DiversityControlTypeDimensionsCarrier other = (DiversityControlTypeDimensionsCarrier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._default==null && other.get_default()==null) || 
             (this._default!=null &&
              this._default.equals(other.get_default()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              java.util.Arrays.equals(this.override, other.getOverride()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            this.onlineIndicator == other.isOnlineIndicator();
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
        if (get_default() != null) {
            _hashCode += get_default().hashCode();
        }
        if (getOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        _hashCode += (isOnlineIndicator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversityControlTypeDimensionsCarrier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>Carrier"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Weight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SumWeight"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("onlineIndicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OnlineIndicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>Carrier>Default"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>Carrier>Override"));
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
