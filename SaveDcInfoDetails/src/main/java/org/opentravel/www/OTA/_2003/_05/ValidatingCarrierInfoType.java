/**
 * ValidatingCarrierInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ValidatingCarrierInfoType  implements java.io.Serializable {
    /* Default validating carrier code */
    private org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeDefaultCountry[] _default;

    /* Alternate validating carrier code */
    private org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry[][] alternate;

    private java.lang.String settlementMethod;  // attribute

    private boolean newVcxProcess;  // attribute

    public ValidatingCarrierInfoType() {
    }

    public ValidatingCarrierInfoType(
           org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeDefaultCountry[] _default,
           org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry[][] alternate,
           java.lang.String settlementMethod,
           boolean newVcxProcess) {
           this._default = _default;
           this.alternate = alternate;
           this.settlementMethod = settlementMethod;
           this.newVcxProcess = newVcxProcess;
    }


    /**
     * Gets the _default value for this ValidatingCarrierInfoType.
     * 
     * @return _default   * Default validating carrier code
     */
    public org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeDefaultCountry[] get_default() {
        return _default;
    }


    /**
     * Sets the _default value for this ValidatingCarrierInfoType.
     * 
     * @param _default   * Default validating carrier code
     */
    public void set_default(org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeDefaultCountry[] _default) {
        this._default = _default;
    }


    /**
     * Gets the alternate value for this ValidatingCarrierInfoType.
     * 
     * @return alternate   * Alternate validating carrier code
     */
    public org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry[][] getAlternate() {
        return alternate;
    }


    /**
     * Sets the alternate value for this ValidatingCarrierInfoType.
     * 
     * @param alternate   * Alternate validating carrier code
     */
    public void setAlternate(org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry[][] alternate) {
        this.alternate = alternate;
    }

    public org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry[] getAlternate(int i) {
        return this.alternate[i];
    }

    public void setAlternate(int i, org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoTypeAlternateCountry[] _value) {
        this.alternate[i] = _value;
    }


    /**
     * Gets the settlementMethod value for this ValidatingCarrierInfoType.
     * 
     * @return settlementMethod
     */
    public java.lang.String getSettlementMethod() {
        return settlementMethod;
    }


    /**
     * Sets the settlementMethod value for this ValidatingCarrierInfoType.
     * 
     * @param settlementMethod
     */
    public void setSettlementMethod(java.lang.String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }


    /**
     * Gets the newVcxProcess value for this ValidatingCarrierInfoType.
     * 
     * @return newVcxProcess
     */
    public boolean isNewVcxProcess() {
        return newVcxProcess;
    }


    /**
     * Sets the newVcxProcess value for this ValidatingCarrierInfoType.
     * 
     * @param newVcxProcess
     */
    public void setNewVcxProcess(boolean newVcxProcess) {
        this.newVcxProcess = newVcxProcess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatingCarrierInfoType)) return false;
        ValidatingCarrierInfoType other = (ValidatingCarrierInfoType) obj;
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
              java.util.Arrays.equals(this._default, other.get_default()))) &&
            ((this.alternate==null && other.getAlternate()==null) || 
             (this.alternate!=null &&
              java.util.Arrays.equals(this.alternate, other.getAlternate()))) &&
            ((this.settlementMethod==null && other.getSettlementMethod()==null) || 
             (this.settlementMethod!=null &&
              this.settlementMethod.equals(other.getSettlementMethod()))) &&
            this.newVcxProcess == other.isNewVcxProcess();
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_default());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_default(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSettlementMethod() != null) {
            _hashCode += getSettlementMethod().hashCode();
        }
        _hashCode += (isNewVcxProcess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatingCarrierInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrierInfoType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("settlementMethod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SettlementMethod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("newVcxProcess");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NewVcxProcess"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ValidatingCarrierInfoType>Default>Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Country"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Alternate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ValidatingCarrierInfoType>Alternate"));
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
