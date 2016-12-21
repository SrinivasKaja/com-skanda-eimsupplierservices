/**
 * FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail  implements java.io.Serializable {
    private java.lang.String markupHandlingFeeAppID;  // attribute

    private java.lang.String markupTypeCode;  // attribute

    private java.math.BigDecimal fareAmountAfterMarkup;  // attribute

    private java.math.BigDecimal markupAmount;  // attribute

    private java.lang.String amountCurrency;  // attribute

    private java.lang.String markupRuleSourcePCC;  // attribute

    private org.apache.axis.types.UnsignedLong markupRuleItemNumber;  // attribute

    public FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail() {
    }

    public FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail(
           java.lang.String markupHandlingFeeAppID,
           java.lang.String markupTypeCode,
           java.math.BigDecimal fareAmountAfterMarkup,
           java.math.BigDecimal markupAmount,
           java.lang.String amountCurrency,
           java.lang.String markupRuleSourcePCC,
           org.apache.axis.types.UnsignedLong markupRuleItemNumber) {
           this.markupHandlingFeeAppID = markupHandlingFeeAppID;
           this.markupTypeCode = markupTypeCode;
           this.fareAmountAfterMarkup = fareAmountAfterMarkup;
           this.markupAmount = markupAmount;
           this.amountCurrency = amountCurrency;
           this.markupRuleSourcePCC = markupRuleSourcePCC;
           this.markupRuleItemNumber = markupRuleItemNumber;
    }


    /**
     * Gets the markupHandlingFeeAppID value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @return markupHandlingFeeAppID
     */
    public java.lang.String getMarkupHandlingFeeAppID() {
        return markupHandlingFeeAppID;
    }


    /**
     * Sets the markupHandlingFeeAppID value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @param markupHandlingFeeAppID
     */
    public void setMarkupHandlingFeeAppID(java.lang.String markupHandlingFeeAppID) {
        this.markupHandlingFeeAppID = markupHandlingFeeAppID;
    }


    /**
     * Gets the markupTypeCode value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @return markupTypeCode
     */
    public java.lang.String getMarkupTypeCode() {
        return markupTypeCode;
    }


    /**
     * Sets the markupTypeCode value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @param markupTypeCode
     */
    public void setMarkupTypeCode(java.lang.String markupTypeCode) {
        this.markupTypeCode = markupTypeCode;
    }


    /**
     * Gets the fareAmountAfterMarkup value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @return fareAmountAfterMarkup
     */
    public java.math.BigDecimal getFareAmountAfterMarkup() {
        return fareAmountAfterMarkup;
    }


    /**
     * Sets the fareAmountAfterMarkup value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @param fareAmountAfterMarkup
     */
    public void setFareAmountAfterMarkup(java.math.BigDecimal fareAmountAfterMarkup) {
        this.fareAmountAfterMarkup = fareAmountAfterMarkup;
    }


    /**
     * Gets the markupAmount value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @return markupAmount
     */
    public java.math.BigDecimal getMarkupAmount() {
        return markupAmount;
    }


    /**
     * Sets the markupAmount value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @param markupAmount
     */
    public void setMarkupAmount(java.math.BigDecimal markupAmount) {
        this.markupAmount = markupAmount;
    }


    /**
     * Gets the amountCurrency value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @return amountCurrency
     */
    public java.lang.String getAmountCurrency() {
        return amountCurrency;
    }


    /**
     * Sets the amountCurrency value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @param amountCurrency
     */
    public void setAmountCurrency(java.lang.String amountCurrency) {
        this.amountCurrency = amountCurrency;
    }


    /**
     * Gets the markupRuleSourcePCC value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @return markupRuleSourcePCC
     */
    public java.lang.String getMarkupRuleSourcePCC() {
        return markupRuleSourcePCC;
    }


    /**
     * Sets the markupRuleSourcePCC value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @param markupRuleSourcePCC
     */
    public void setMarkupRuleSourcePCC(java.lang.String markupRuleSourcePCC) {
        this.markupRuleSourcePCC = markupRuleSourcePCC;
    }


    /**
     * Gets the markupRuleItemNumber value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @return markupRuleItemNumber
     */
    public org.apache.axis.types.UnsignedLong getMarkupRuleItemNumber() {
        return markupRuleItemNumber;
    }


    /**
     * Sets the markupRuleItemNumber value for this FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.
     * 
     * @param markupRuleItemNumber
     */
    public void setMarkupRuleItemNumber(org.apache.axis.types.UnsignedLong markupRuleItemNumber) {
        this.markupRuleItemNumber = markupRuleItemNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail)) return false;
        FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail other = (FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.markupHandlingFeeAppID==null && other.getMarkupHandlingFeeAppID()==null) || 
             (this.markupHandlingFeeAppID!=null &&
              this.markupHandlingFeeAppID.equals(other.getMarkupHandlingFeeAppID()))) &&
            ((this.markupTypeCode==null && other.getMarkupTypeCode()==null) || 
             (this.markupTypeCode!=null &&
              this.markupTypeCode.equals(other.getMarkupTypeCode()))) &&
            ((this.fareAmountAfterMarkup==null && other.getFareAmountAfterMarkup()==null) || 
             (this.fareAmountAfterMarkup!=null &&
              this.fareAmountAfterMarkup.equals(other.getFareAmountAfterMarkup()))) &&
            ((this.markupAmount==null && other.getMarkupAmount()==null) || 
             (this.markupAmount!=null &&
              this.markupAmount.equals(other.getMarkupAmount()))) &&
            ((this.amountCurrency==null && other.getAmountCurrency()==null) || 
             (this.amountCurrency!=null &&
              this.amountCurrency.equals(other.getAmountCurrency()))) &&
            ((this.markupRuleSourcePCC==null && other.getMarkupRuleSourcePCC()==null) || 
             (this.markupRuleSourcePCC!=null &&
              this.markupRuleSourcePCC.equals(other.getMarkupRuleSourcePCC()))) &&
            ((this.markupRuleItemNumber==null && other.getMarkupRuleItemNumber()==null) || 
             (this.markupRuleItemNumber!=null &&
              this.markupRuleItemNumber.equals(other.getMarkupRuleItemNumber())));
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
        if (getMarkupHandlingFeeAppID() != null) {
            _hashCode += getMarkupHandlingFeeAppID().hashCode();
        }
        if (getMarkupTypeCode() != null) {
            _hashCode += getMarkupTypeCode().hashCode();
        }
        if (getFareAmountAfterMarkup() != null) {
            _hashCode += getFareAmountAfterMarkup().hashCode();
        }
        if (getMarkupAmount() != null) {
            _hashCode += getMarkupAmount().hashCode();
        }
        if (getAmountCurrency() != null) {
            _hashCode += getAmountCurrency().hashCode();
        }
        if (getMarkupRuleSourcePCC() != null) {
            _hashCode += getMarkupRuleSourcePCC().hashCode();
        }
        if (getMarkupRuleItemNumber() != null) {
            _hashCode += getMarkupRuleItemNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>HandlingMarkupDetail"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("markupHandlingFeeAppID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarkupHandlingFeeAppID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("markupTypeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarkupTypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareAmountAfterMarkup");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareAmountAfterMarkup"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("markupAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarkupAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("amountCurrency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AmountCurrency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("markupRuleSourcePCC");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarkupRuleSourcePCC"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PCCType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("markupRuleItemNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarkupRuleItemNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
