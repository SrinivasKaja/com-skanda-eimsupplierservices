/**
 * AirTaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Defines the data fields available for air tax.
 */
public class AirTaxType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String taxCode;  // attribute

    private java.math.BigDecimal amount;  // attribute

    private java.lang.String currencyCode;  // attribute

    private org.apache.axis.types.NonNegativeInteger decimalPlaces;  // attribute

    private java.lang.String carrierCode;  // attribute

    private double minAmount;  // attribute

    private double maxAmount;  // attribute

    private java.lang.String minMaxCurrency;  // attribute

    private double rateUsed;  // attribute

    private java.lang.String stationCode;  // attribute

    private java.lang.String reissueTaxType;  // attribute

    private boolean reissueRestrictionApplies;  // attribute

    private boolean reissueTaxRefundable;  // attribute

    private boolean applyToReissue;  // attribute

    private double reissueMaxAmount;  // attribute

    private java.lang.String reissueCurrency;  // attribute

    private double publishedAmount;  // attribute

    private java.lang.String publishedCurrency;  // attribute

    public AirTaxType() {
    }

    // Simple Types must have a String constructor
    public AirTaxType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this AirTaxType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this AirTaxType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the taxCode value for this AirTaxType.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this AirTaxType.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the amount value for this AirTaxType.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AirTaxType.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyCode value for this AirTaxType.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this AirTaxType.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the decimalPlaces value for this AirTaxType.
     * 
     * @return decimalPlaces
     */
    public org.apache.axis.types.NonNegativeInteger getDecimalPlaces() {
        return decimalPlaces;
    }


    /**
     * Sets the decimalPlaces value for this AirTaxType.
     * 
     * @param decimalPlaces
     */
    public void setDecimalPlaces(org.apache.axis.types.NonNegativeInteger decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }


    /**
     * Gets the carrierCode value for this AirTaxType.
     * 
     * @return carrierCode
     */
    public java.lang.String getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this AirTaxType.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(java.lang.String carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the minAmount value for this AirTaxType.
     * 
     * @return minAmount
     */
    public double getMinAmount() {
        return minAmount;
    }


    /**
     * Sets the minAmount value for this AirTaxType.
     * 
     * @param minAmount
     */
    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }


    /**
     * Gets the maxAmount value for this AirTaxType.
     * 
     * @return maxAmount
     */
    public double getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this AirTaxType.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the minMaxCurrency value for this AirTaxType.
     * 
     * @return minMaxCurrency
     */
    public java.lang.String getMinMaxCurrency() {
        return minMaxCurrency;
    }


    /**
     * Sets the minMaxCurrency value for this AirTaxType.
     * 
     * @param minMaxCurrency
     */
    public void setMinMaxCurrency(java.lang.String minMaxCurrency) {
        this.minMaxCurrency = minMaxCurrency;
    }


    /**
     * Gets the rateUsed value for this AirTaxType.
     * 
     * @return rateUsed
     */
    public double getRateUsed() {
        return rateUsed;
    }


    /**
     * Sets the rateUsed value for this AirTaxType.
     * 
     * @param rateUsed
     */
    public void setRateUsed(double rateUsed) {
        this.rateUsed = rateUsed;
    }


    /**
     * Gets the stationCode value for this AirTaxType.
     * 
     * @return stationCode
     */
    public java.lang.String getStationCode() {
        return stationCode;
    }


    /**
     * Sets the stationCode value for this AirTaxType.
     * 
     * @param stationCode
     */
    public void setStationCode(java.lang.String stationCode) {
        this.stationCode = stationCode;
    }


    /**
     * Gets the reissueTaxType value for this AirTaxType.
     * 
     * @return reissueTaxType
     */
    public java.lang.String getReissueTaxType() {
        return reissueTaxType;
    }


    /**
     * Sets the reissueTaxType value for this AirTaxType.
     * 
     * @param reissueTaxType
     */
    public void setReissueTaxType(java.lang.String reissueTaxType) {
        this.reissueTaxType = reissueTaxType;
    }


    /**
     * Gets the reissueRestrictionApplies value for this AirTaxType.
     * 
     * @return reissueRestrictionApplies
     */
    public boolean isReissueRestrictionApplies() {
        return reissueRestrictionApplies;
    }


    /**
     * Sets the reissueRestrictionApplies value for this AirTaxType.
     * 
     * @param reissueRestrictionApplies
     */
    public void setReissueRestrictionApplies(boolean reissueRestrictionApplies) {
        this.reissueRestrictionApplies = reissueRestrictionApplies;
    }


    /**
     * Gets the reissueTaxRefundable value for this AirTaxType.
     * 
     * @return reissueTaxRefundable
     */
    public boolean isReissueTaxRefundable() {
        return reissueTaxRefundable;
    }


    /**
     * Sets the reissueTaxRefundable value for this AirTaxType.
     * 
     * @param reissueTaxRefundable
     */
    public void setReissueTaxRefundable(boolean reissueTaxRefundable) {
        this.reissueTaxRefundable = reissueTaxRefundable;
    }


    /**
     * Gets the applyToReissue value for this AirTaxType.
     * 
     * @return applyToReissue
     */
    public boolean isApplyToReissue() {
        return applyToReissue;
    }


    /**
     * Sets the applyToReissue value for this AirTaxType.
     * 
     * @param applyToReissue
     */
    public void setApplyToReissue(boolean applyToReissue) {
        this.applyToReissue = applyToReissue;
    }


    /**
     * Gets the reissueMaxAmount value for this AirTaxType.
     * 
     * @return reissueMaxAmount
     */
    public double getReissueMaxAmount() {
        return reissueMaxAmount;
    }


    /**
     * Sets the reissueMaxAmount value for this AirTaxType.
     * 
     * @param reissueMaxAmount
     */
    public void setReissueMaxAmount(double reissueMaxAmount) {
        this.reissueMaxAmount = reissueMaxAmount;
    }


    /**
     * Gets the reissueCurrency value for this AirTaxType.
     * 
     * @return reissueCurrency
     */
    public java.lang.String getReissueCurrency() {
        return reissueCurrency;
    }


    /**
     * Sets the reissueCurrency value for this AirTaxType.
     * 
     * @param reissueCurrency
     */
    public void setReissueCurrency(java.lang.String reissueCurrency) {
        this.reissueCurrency = reissueCurrency;
    }


    /**
     * Gets the publishedAmount value for this AirTaxType.
     * 
     * @return publishedAmount
     */
    public double getPublishedAmount() {
        return publishedAmount;
    }


    /**
     * Sets the publishedAmount value for this AirTaxType.
     * 
     * @param publishedAmount
     */
    public void setPublishedAmount(double publishedAmount) {
        this.publishedAmount = publishedAmount;
    }


    /**
     * Gets the publishedCurrency value for this AirTaxType.
     * 
     * @return publishedCurrency
     */
    public java.lang.String getPublishedCurrency() {
        return publishedCurrency;
    }


    /**
     * Sets the publishedCurrency value for this AirTaxType.
     * 
     * @param publishedCurrency
     */
    public void setPublishedCurrency(java.lang.String publishedCurrency) {
        this.publishedCurrency = publishedCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirTaxType)) return false;
        AirTaxType other = (AirTaxType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.decimalPlaces==null && other.getDecimalPlaces()==null) || 
             (this.decimalPlaces!=null &&
              this.decimalPlaces.equals(other.getDecimalPlaces()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            this.minAmount == other.getMinAmount() &&
            this.maxAmount == other.getMaxAmount() &&
            ((this.minMaxCurrency==null && other.getMinMaxCurrency()==null) || 
             (this.minMaxCurrency!=null &&
              this.minMaxCurrency.equals(other.getMinMaxCurrency()))) &&
            this.rateUsed == other.getRateUsed() &&
            ((this.stationCode==null && other.getStationCode()==null) || 
             (this.stationCode!=null &&
              this.stationCode.equals(other.getStationCode()))) &&
            ((this.reissueTaxType==null && other.getReissueTaxType()==null) || 
             (this.reissueTaxType!=null &&
              this.reissueTaxType.equals(other.getReissueTaxType()))) &&
            this.reissueRestrictionApplies == other.isReissueRestrictionApplies() &&
            this.reissueTaxRefundable == other.isReissueTaxRefundable() &&
            this.applyToReissue == other.isApplyToReissue() &&
            this.reissueMaxAmount == other.getReissueMaxAmount() &&
            ((this.reissueCurrency==null && other.getReissueCurrency()==null) || 
             (this.reissueCurrency!=null &&
              this.reissueCurrency.equals(other.getReissueCurrency()))) &&
            this.publishedAmount == other.getPublishedAmount() &&
            ((this.publishedCurrency==null && other.getPublishedCurrency()==null) || 
             (this.publishedCurrency!=null &&
              this.publishedCurrency.equals(other.getPublishedCurrency())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
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
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        _hashCode += new Double(getMinAmount()).hashCode();
        _hashCode += new Double(getMaxAmount()).hashCode();
        if (getMinMaxCurrency() != null) {
            _hashCode += getMinMaxCurrency().hashCode();
        }
        _hashCode += new Double(getRateUsed()).hashCode();
        if (getStationCode() != null) {
            _hashCode += getStationCode().hashCode();
        }
        if (getReissueTaxType() != null) {
            _hashCode += getReissueTaxType().hashCode();
        }
        _hashCode += (isReissueRestrictionApplies() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReissueTaxRefundable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApplyToReissue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getReissueMaxAmount()).hashCode();
        if (getReissueCurrency() != null) {
            _hashCode += getReissueCurrency().hashCode();
        }
        _hashCode += new Double(getPublishedAmount()).hashCode();
        if (getPublishedCurrency() != null) {
            _hashCode += getPublishedCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirTaxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTaxType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("taxCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TaxCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
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
        attrField.setFieldName("carrierCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CarrierCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minMaxCurrency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinMaxCurrency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rateUsed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RateUsed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stationCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StationCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueTaxType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueTaxType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ReissueTaxType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueRestrictionApplies");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueRestrictionApplies"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueTaxRefundable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueTaxRefundable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("applyToReissue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ApplyToReissue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueMaxAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueMaxAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueCurrency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueCurrency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("publishedAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PublishedAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("publishedCurrency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PublishedCurrency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
