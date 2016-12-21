/**
 * ExchangeFareType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeFareType  implements java.io.Serializable {
    private java.math.BigDecimal baseFareAmount;  // attribute

    private java.math.BigDecimal nonRefundableAmount;  // attribute

    private java.lang.String baseFareCurrency;  // attribute

    private java.lang.String fareCalcCurrency;  // attribute

    private java.lang.String validatingCarrier;  // attribute

    private java.lang.Double ROE;  // attribute

    public ExchangeFareType() {
    }

    public ExchangeFareType(
           java.math.BigDecimal baseFareAmount,
           java.math.BigDecimal nonRefundableAmount,
           java.lang.String baseFareCurrency,
           java.lang.String fareCalcCurrency,
           java.lang.String validatingCarrier,
           java.lang.Double ROE) {
           this.baseFareAmount = baseFareAmount;
           this.nonRefundableAmount = nonRefundableAmount;
           this.baseFareCurrency = baseFareCurrency;
           this.fareCalcCurrency = fareCalcCurrency;
           this.validatingCarrier = validatingCarrier;
           this.ROE = ROE;
    }


    /**
     * Gets the baseFareAmount value for this ExchangeFareType.
     * 
     * @return baseFareAmount
     */
    public java.math.BigDecimal getBaseFareAmount() {
        return baseFareAmount;
    }


    /**
     * Sets the baseFareAmount value for this ExchangeFareType.
     * 
     * @param baseFareAmount
     */
    public void setBaseFareAmount(java.math.BigDecimal baseFareAmount) {
        this.baseFareAmount = baseFareAmount;
    }


    /**
     * Gets the nonRefundableAmount value for this ExchangeFareType.
     * 
     * @return nonRefundableAmount
     */
    public java.math.BigDecimal getNonRefundableAmount() {
        return nonRefundableAmount;
    }


    /**
     * Sets the nonRefundableAmount value for this ExchangeFareType.
     * 
     * @param nonRefundableAmount
     */
    public void setNonRefundableAmount(java.math.BigDecimal nonRefundableAmount) {
        this.nonRefundableAmount = nonRefundableAmount;
    }


    /**
     * Gets the baseFareCurrency value for this ExchangeFareType.
     * 
     * @return baseFareCurrency
     */
    public java.lang.String getBaseFareCurrency() {
        return baseFareCurrency;
    }


    /**
     * Sets the baseFareCurrency value for this ExchangeFareType.
     * 
     * @param baseFareCurrency
     */
    public void setBaseFareCurrency(java.lang.String baseFareCurrency) {
        this.baseFareCurrency = baseFareCurrency;
    }


    /**
     * Gets the fareCalcCurrency value for this ExchangeFareType.
     * 
     * @return fareCalcCurrency
     */
    public java.lang.String getFareCalcCurrency() {
        return fareCalcCurrency;
    }


    /**
     * Sets the fareCalcCurrency value for this ExchangeFareType.
     * 
     * @param fareCalcCurrency
     */
    public void setFareCalcCurrency(java.lang.String fareCalcCurrency) {
        this.fareCalcCurrency = fareCalcCurrency;
    }


    /**
     * Gets the validatingCarrier value for this ExchangeFareType.
     * 
     * @return validatingCarrier
     */
    public java.lang.String getValidatingCarrier() {
        return validatingCarrier;
    }


    /**
     * Sets the validatingCarrier value for this ExchangeFareType.
     * 
     * @param validatingCarrier
     */
    public void setValidatingCarrier(java.lang.String validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }


    /**
     * Gets the ROE value for this ExchangeFareType.
     * 
     * @return ROE
     */
    public java.lang.Double getROE() {
        return ROE;
    }


    /**
     * Sets the ROE value for this ExchangeFareType.
     * 
     * @param ROE
     */
    public void setROE(java.lang.Double ROE) {
        this.ROE = ROE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeFareType)) return false;
        ExchangeFareType other = (ExchangeFareType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseFareAmount==null && other.getBaseFareAmount()==null) || 
             (this.baseFareAmount!=null &&
              this.baseFareAmount.equals(other.getBaseFareAmount()))) &&
            ((this.nonRefundableAmount==null && other.getNonRefundableAmount()==null) || 
             (this.nonRefundableAmount!=null &&
              this.nonRefundableAmount.equals(other.getNonRefundableAmount()))) &&
            ((this.baseFareCurrency==null && other.getBaseFareCurrency()==null) || 
             (this.baseFareCurrency!=null &&
              this.baseFareCurrency.equals(other.getBaseFareCurrency()))) &&
            ((this.fareCalcCurrency==null && other.getFareCalcCurrency()==null) || 
             (this.fareCalcCurrency!=null &&
              this.fareCalcCurrency.equals(other.getFareCalcCurrency()))) &&
            ((this.validatingCarrier==null && other.getValidatingCarrier()==null) || 
             (this.validatingCarrier!=null &&
              this.validatingCarrier.equals(other.getValidatingCarrier()))) &&
            ((this.ROE==null && other.getROE()==null) || 
             (this.ROE!=null &&
              this.ROE.equals(other.getROE())));
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
        if (getBaseFareAmount() != null) {
            _hashCode += getBaseFareAmount().hashCode();
        }
        if (getNonRefundableAmount() != null) {
            _hashCode += getNonRefundableAmount().hashCode();
        }
        if (getBaseFareCurrency() != null) {
            _hashCode += getBaseFareCurrency().hashCode();
        }
        if (getFareCalcCurrency() != null) {
            _hashCode += getFareCalcCurrency().hashCode();
        }
        if (getValidatingCarrier() != null) {
            _hashCode += getValidatingCarrier().hashCode();
        }
        if (getROE() != null) {
            _hashCode += getROE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeFareType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeFareType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("baseFareAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BaseFareAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nonRefundableAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NonRefundableAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("baseFareCurrency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BaseFareCurrency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareCalcCurrency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareCalcCurrency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validatingCarrier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ValidatingCarrier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ROE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ROE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
