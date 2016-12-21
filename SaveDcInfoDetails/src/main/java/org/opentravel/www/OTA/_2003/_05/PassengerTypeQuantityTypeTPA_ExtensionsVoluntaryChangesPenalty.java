/**
 * PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyType type;  // attribute

    private java.lang.Boolean exclude;  // attribute

    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyApplication application;  // attribute

    private java.math.BigDecimal amount;  // attribute

    private java.lang.String currencyCode;  // attribute

    private org.apache.axis.types.NonNegativeInteger decimalPlaces;  // attribute

    public PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty() {
    }

    public PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty(
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyType type,
           java.lang.Boolean exclude,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyApplication application,
           java.math.BigDecimal amount,
           java.lang.String currencyCode,
           org.apache.axis.types.NonNegativeInteger decimalPlaces) {
           this.type = type;
           this.exclude = exclude;
           this.application = application;
           this.amount = amount;
           this.currencyCode = currencyCode;
           this.decimalPlaces = decimalPlaces;
    }


    /**
     * Gets the type value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @return type
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyType getType() {
        return type;
    }


    /**
     * Sets the type value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @param type
     */
    public void setType(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyType type) {
        this.type = type;
    }


    /**
     * Gets the exclude value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @return exclude
     */
    public java.lang.Boolean getExclude() {
        return exclude;
    }


    /**
     * Sets the exclude value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @param exclude
     */
    public void setExclude(java.lang.Boolean exclude) {
        this.exclude = exclude;
    }


    /**
     * Gets the application value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @return application
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyApplication getApplication() {
        return application;
    }


    /**
     * Sets the application value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @param application
     */
    public void setApplication(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenaltyApplication application) {
        this.application = application;
    }


    /**
     * Gets the amount value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyCode value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the decimalPlaces value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @return decimalPlaces
     */
    public org.apache.axis.types.NonNegativeInteger getDecimalPlaces() {
        return decimalPlaces;
    }


    /**
     * Sets the decimalPlaces value for this PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.
     * 
     * @param decimalPlaces
     */
    public void setDecimalPlaces(org.apache.axis.types.NonNegativeInteger decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty)) return false;
        PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty other = (PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.exclude==null && other.getExclude()==null) || 
             (this.exclude!=null &&
              this.exclude.equals(other.getExclude()))) &&
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.decimalPlaces==null && other.getDecimalPlaces()==null) || 
             (this.decimalPlaces!=null &&
              this.decimalPlaces.equals(other.getDecimalPlaces())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getExclude() != null) {
            _hashCode += getExclude().hashCode();
        }
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDecimalPlaces() != null) {
            _hashCode += getDecimalPlaces().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty>Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("exclude");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Exclude"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("application");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Application"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty>Application"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("amount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currencyCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CurrencyCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("decimalPlaces");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DecimalPlaces"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
