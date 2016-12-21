/**
 * ReissueInfoTypeChangeFeesChangeFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ReissueInfoTypeChangeFeesChangeFee  implements java.io.Serializable {
    private java.lang.Boolean highestChangeFee;  // attribute

    private java.math.BigDecimal amount;  // attribute

    private java.lang.String currencyCode;  // attribute

    private org.apache.axis.types.NonNegativeInteger decimalPlaces;  // attribute

    private java.lang.Boolean changeFeeWaived;  // attribute

    private java.lang.Boolean changeFeeNotApplicable;  // attribute

    public ReissueInfoTypeChangeFeesChangeFee() {
    }

    public ReissueInfoTypeChangeFeesChangeFee(
           java.lang.Boolean highestChangeFee,
           java.math.BigDecimal amount,
           java.lang.String currencyCode,
           org.apache.axis.types.NonNegativeInteger decimalPlaces,
           java.lang.Boolean changeFeeWaived,
           java.lang.Boolean changeFeeNotApplicable) {
           this.highestChangeFee = highestChangeFee;
           this.amount = amount;
           this.currencyCode = currencyCode;
           this.decimalPlaces = decimalPlaces;
           this.changeFeeWaived = changeFeeWaived;
           this.changeFeeNotApplicable = changeFeeNotApplicable;
    }


    /**
     * Gets the highestChangeFee value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @return highestChangeFee
     */
    public java.lang.Boolean getHighestChangeFee() {
        return highestChangeFee;
    }


    /**
     * Sets the highestChangeFee value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @param highestChangeFee
     */
    public void setHighestChangeFee(java.lang.Boolean highestChangeFee) {
        this.highestChangeFee = highestChangeFee;
    }


    /**
     * Gets the amount value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyCode value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the decimalPlaces value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @return decimalPlaces
     */
    public org.apache.axis.types.NonNegativeInteger getDecimalPlaces() {
        return decimalPlaces;
    }


    /**
     * Sets the decimalPlaces value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @param decimalPlaces
     */
    public void setDecimalPlaces(org.apache.axis.types.NonNegativeInteger decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }


    /**
     * Gets the changeFeeWaived value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @return changeFeeWaived
     */
    public java.lang.Boolean getChangeFeeWaived() {
        return changeFeeWaived;
    }


    /**
     * Sets the changeFeeWaived value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @param changeFeeWaived
     */
    public void setChangeFeeWaived(java.lang.Boolean changeFeeWaived) {
        this.changeFeeWaived = changeFeeWaived;
    }


    /**
     * Gets the changeFeeNotApplicable value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @return changeFeeNotApplicable
     */
    public java.lang.Boolean getChangeFeeNotApplicable() {
        return changeFeeNotApplicable;
    }


    /**
     * Sets the changeFeeNotApplicable value for this ReissueInfoTypeChangeFeesChangeFee.
     * 
     * @param changeFeeNotApplicable
     */
    public void setChangeFeeNotApplicable(java.lang.Boolean changeFeeNotApplicable) {
        this.changeFeeNotApplicable = changeFeeNotApplicable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReissueInfoTypeChangeFeesChangeFee)) return false;
        ReissueInfoTypeChangeFeesChangeFee other = (ReissueInfoTypeChangeFeesChangeFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestChangeFee==null && other.getHighestChangeFee()==null) || 
             (this.highestChangeFee!=null &&
              this.highestChangeFee.equals(other.getHighestChangeFee()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.decimalPlaces==null && other.getDecimalPlaces()==null) || 
             (this.decimalPlaces!=null &&
              this.decimalPlaces.equals(other.getDecimalPlaces()))) &&
            ((this.changeFeeWaived==null && other.getChangeFeeWaived()==null) || 
             (this.changeFeeWaived!=null &&
              this.changeFeeWaived.equals(other.getChangeFeeWaived()))) &&
            ((this.changeFeeNotApplicable==null && other.getChangeFeeNotApplicable()==null) || 
             (this.changeFeeNotApplicable!=null &&
              this.changeFeeNotApplicable.equals(other.getChangeFeeNotApplicable())));
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
        if (getHighestChangeFee() != null) {
            _hashCode += getHighestChangeFee().hashCode();
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
        if (getChangeFeeWaived() != null) {
            _hashCode += getChangeFeeWaived().hashCode();
        }
        if (getChangeFeeNotApplicable() != null) {
            _hashCode += getChangeFeeNotApplicable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReissueInfoTypeChangeFeesChangeFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ReissueInfoType>ChangeFees>ChangeFee"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("highestChangeFee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "HighestChangeFee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeFeeWaived");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChangeFeeWaived"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeFeeNotApplicable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChangeFeeNotApplicable"));
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
