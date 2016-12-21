/**
 * VoluntaryChangesTypePenalty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class VoluntaryChangesTypePenalty  implements java.io.Serializable {
    private java.lang.String penaltyType;  // attribute

    private java.lang.String departureStatus;  // attribute

    private java.math.BigDecimal amount;  // attribute

    private java.lang.String currencyCode;  // attribute

    private org.apache.axis.types.NonNegativeInteger decimalPlaces;  // attribute

    private java.math.BigDecimal percent;  // attribute

    public VoluntaryChangesTypePenalty() {
    }

    public VoluntaryChangesTypePenalty(
           java.lang.String penaltyType,
           java.lang.String departureStatus,
           java.math.BigDecimal amount,
           java.lang.String currencyCode,
           org.apache.axis.types.NonNegativeInteger decimalPlaces,
           java.math.BigDecimal percent) {
           this.penaltyType = penaltyType;
           this.departureStatus = departureStatus;
           this.amount = amount;
           this.currencyCode = currencyCode;
           this.decimalPlaces = decimalPlaces;
           this.percent = percent;
    }


    /**
     * Gets the penaltyType value for this VoluntaryChangesTypePenalty.
     * 
     * @return penaltyType
     */
    public java.lang.String getPenaltyType() {
        return penaltyType;
    }


    /**
     * Sets the penaltyType value for this VoluntaryChangesTypePenalty.
     * 
     * @param penaltyType
     */
    public void setPenaltyType(java.lang.String penaltyType) {
        this.penaltyType = penaltyType;
    }


    /**
     * Gets the departureStatus value for this VoluntaryChangesTypePenalty.
     * 
     * @return departureStatus
     */
    public java.lang.String getDepartureStatus() {
        return departureStatus;
    }


    /**
     * Sets the departureStatus value for this VoluntaryChangesTypePenalty.
     * 
     * @param departureStatus
     */
    public void setDepartureStatus(java.lang.String departureStatus) {
        this.departureStatus = departureStatus;
    }


    /**
     * Gets the amount value for this VoluntaryChangesTypePenalty.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VoluntaryChangesTypePenalty.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyCode value for this VoluntaryChangesTypePenalty.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this VoluntaryChangesTypePenalty.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the decimalPlaces value for this VoluntaryChangesTypePenalty.
     * 
     * @return decimalPlaces
     */
    public org.apache.axis.types.NonNegativeInteger getDecimalPlaces() {
        return decimalPlaces;
    }


    /**
     * Sets the decimalPlaces value for this VoluntaryChangesTypePenalty.
     * 
     * @param decimalPlaces
     */
    public void setDecimalPlaces(org.apache.axis.types.NonNegativeInteger decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }


    /**
     * Gets the percent value for this VoluntaryChangesTypePenalty.
     * 
     * @return percent
     */
    public java.math.BigDecimal getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this VoluntaryChangesTypePenalty.
     * 
     * @param percent
     */
    public void setPercent(java.math.BigDecimal percent) {
        this.percent = percent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoluntaryChangesTypePenalty)) return false;
        VoluntaryChangesTypePenalty other = (VoluntaryChangesTypePenalty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.penaltyType==null && other.getPenaltyType()==null) || 
             (this.penaltyType!=null &&
              this.penaltyType.equals(other.getPenaltyType()))) &&
            ((this.departureStatus==null && other.getDepartureStatus()==null) || 
             (this.departureStatus!=null &&
              this.departureStatus.equals(other.getDepartureStatus()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.decimalPlaces==null && other.getDecimalPlaces()==null) || 
             (this.decimalPlaces!=null &&
              this.decimalPlaces.equals(other.getDecimalPlaces()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent())));
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
        if (getPenaltyType() != null) {
            _hashCode += getPenaltyType().hashCode();
        }
        if (getDepartureStatus() != null) {
            _hashCode += getDepartureStatus().hashCode();
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
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoluntaryChangesTypePenalty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">VoluntaryChangesType>Penalty"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("penaltyType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PenaltyType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        attrField.setFieldName("percent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Percent"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Percentage"));
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
