/**
 * FareType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Holds a base fare, tax, total and currency information on a price
 */
public class FareType  implements java.io.Serializable {
    /* Price of the inventory excluding taxes and fees. */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare;

    /* Non-refundable base fare amount */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType nonRefundableBaseFare;

    /* Fare construction total amount. */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType fareConstruction;

    /* Price of the inventory excluding taxes and fees in the payable
     * currency. */
    private org.opentravel.www.OTA._2003._05.FareTypeEquivFare equivFare;

    /* This is a collection of Taxes */
    private org.opentravel.www.OTA._2003._05.FareTypeTaxes taxes;

    /* This is a collection of Fees */
    private org.opentravel.www.OTA._2003._05.AirFeeType[] fees;

    /* This is a collection of ob Fees */
    private org.opentravel.www.OTA._2003._05.OBFeeType[] OBFees;

    private org.opentravel.www.OTA._2003._05.RateOfExchangeType rateOfExchange;

    private org.opentravel.www.OTA._2003._05.CurrencyConversionsType currencyConversions;

    /* The total price that the passenger would pay (includes fare,
     * taxes, fees) */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare;

    /* Reissue information */
    private org.opentravel.www.OTA._2003._05.ReissueInfoType[] reissueInfoList;

    /* Penalties information */
    private org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly[][] penaltiesInfo;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_Extensions TPA_Extensions;

    private java.lang.Boolean negotiatedFare;  // attribute

    private java.lang.String negotiatedFareCode;  // attribute

    public FareType() {
    }

    public FareType(
           org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType nonRefundableBaseFare,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType fareConstruction,
           org.opentravel.www.OTA._2003._05.FareTypeEquivFare equivFare,
           org.opentravel.www.OTA._2003._05.FareTypeTaxes taxes,
           org.opentravel.www.OTA._2003._05.AirFeeType[] fees,
           org.opentravel.www.OTA._2003._05.OBFeeType[] OBFees,
           org.opentravel.www.OTA._2003._05.RateOfExchangeType rateOfExchange,
           org.opentravel.www.OTA._2003._05.CurrencyConversionsType currencyConversions,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare,
           org.opentravel.www.OTA._2003._05.ReissueInfoType[] reissueInfoList,
           org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly[][] penaltiesInfo,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_Extensions TPA_Extensions,
           java.lang.Boolean negotiatedFare,
           java.lang.String negotiatedFareCode) {
           this.baseFare = baseFare;
           this.nonRefundableBaseFare = nonRefundableBaseFare;
           this.fareConstruction = fareConstruction;
           this.equivFare = equivFare;
           this.taxes = taxes;
           this.fees = fees;
           this.OBFees = OBFees;
           this.rateOfExchange = rateOfExchange;
           this.currencyConversions = currencyConversions;
           this.totalFare = totalFare;
           this.reissueInfoList = reissueInfoList;
           this.penaltiesInfo = penaltiesInfo;
           this.TPA_Extensions = TPA_Extensions;
           this.negotiatedFare = negotiatedFare;
           this.negotiatedFareCode = negotiatedFareCode;
    }


    /**
     * Gets the baseFare value for this FareType.
     * 
     * @return baseFare   * Price of the inventory excluding taxes and fees.
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getBaseFare() {
        return baseFare;
    }


    /**
     * Sets the baseFare value for this FareType.
     * 
     * @param baseFare   * Price of the inventory excluding taxes and fees.
     */
    public void setBaseFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare) {
        this.baseFare = baseFare;
    }


    /**
     * Gets the nonRefundableBaseFare value for this FareType.
     * 
     * @return nonRefundableBaseFare   * Non-refundable base fare amount
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getNonRefundableBaseFare() {
        return nonRefundableBaseFare;
    }


    /**
     * Sets the nonRefundableBaseFare value for this FareType.
     * 
     * @param nonRefundableBaseFare   * Non-refundable base fare amount
     */
    public void setNonRefundableBaseFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType nonRefundableBaseFare) {
        this.nonRefundableBaseFare = nonRefundableBaseFare;
    }


    /**
     * Gets the fareConstruction value for this FareType.
     * 
     * @return fareConstruction   * Fare construction total amount.
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getFareConstruction() {
        return fareConstruction;
    }


    /**
     * Sets the fareConstruction value for this FareType.
     * 
     * @param fareConstruction   * Fare construction total amount.
     */
    public void setFareConstruction(org.opentravel.www.OTA._2003._05.CurrencyAmountType fareConstruction) {
        this.fareConstruction = fareConstruction;
    }


    /**
     * Gets the equivFare value for this FareType.
     * 
     * @return equivFare   * Price of the inventory excluding taxes and fees in the payable
     * currency.
     */
    public org.opentravel.www.OTA._2003._05.FareTypeEquivFare getEquivFare() {
        return equivFare;
    }


    /**
     * Sets the equivFare value for this FareType.
     * 
     * @param equivFare   * Price of the inventory excluding taxes and fees in the payable
     * currency.
     */
    public void setEquivFare(org.opentravel.www.OTA._2003._05.FareTypeEquivFare equivFare) {
        this.equivFare = equivFare;
    }


    /**
     * Gets the taxes value for this FareType.
     * 
     * @return taxes   * This is a collection of Taxes
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTaxes getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this FareType.
     * 
     * @param taxes   * This is a collection of Taxes
     */
    public void setTaxes(org.opentravel.www.OTA._2003._05.FareTypeTaxes taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the fees value for this FareType.
     * 
     * @return fees   * This is a collection of Fees
     */
    public org.opentravel.www.OTA._2003._05.AirFeeType[] getFees() {
        return fees;
    }


    /**
     * Sets the fees value for this FareType.
     * 
     * @param fees   * This is a collection of Fees
     */
    public void setFees(org.opentravel.www.OTA._2003._05.AirFeeType[] fees) {
        this.fees = fees;
    }


    /**
     * Gets the OBFees value for this FareType.
     * 
     * @return OBFees   * This is a collection of ob Fees
     */
    public org.opentravel.www.OTA._2003._05.OBFeeType[] getOBFees() {
        return OBFees;
    }


    /**
     * Sets the OBFees value for this FareType.
     * 
     * @param OBFees   * This is a collection of ob Fees
     */
    public void setOBFees(org.opentravel.www.OTA._2003._05.OBFeeType[] OBFees) {
        this.OBFees = OBFees;
    }


    /**
     * Gets the rateOfExchange value for this FareType.
     * 
     * @return rateOfExchange
     */
    public org.opentravel.www.OTA._2003._05.RateOfExchangeType getRateOfExchange() {
        return rateOfExchange;
    }


    /**
     * Sets the rateOfExchange value for this FareType.
     * 
     * @param rateOfExchange
     */
    public void setRateOfExchange(org.opentravel.www.OTA._2003._05.RateOfExchangeType rateOfExchange) {
        this.rateOfExchange = rateOfExchange;
    }


    /**
     * Gets the currencyConversions value for this FareType.
     * 
     * @return currencyConversions
     */
    public org.opentravel.www.OTA._2003._05.CurrencyConversionsType getCurrencyConversions() {
        return currencyConversions;
    }


    /**
     * Sets the currencyConversions value for this FareType.
     * 
     * @param currencyConversions
     */
    public void setCurrencyConversions(org.opentravel.www.OTA._2003._05.CurrencyConversionsType currencyConversions) {
        this.currencyConversions = currencyConversions;
    }


    /**
     * Gets the totalFare value for this FareType.
     * 
     * @return totalFare   * The total price that the passenger would pay (includes fare,
     * taxes, fees)
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getTotalFare() {
        return totalFare;
    }


    /**
     * Sets the totalFare value for this FareType.
     * 
     * @param totalFare   * The total price that the passenger would pay (includes fare,
     * taxes, fees)
     */
    public void setTotalFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare) {
        this.totalFare = totalFare;
    }


    /**
     * Gets the reissueInfoList value for this FareType.
     * 
     * @return reissueInfoList   * Reissue information
     */
    public org.opentravel.www.OTA._2003._05.ReissueInfoType[] getReissueInfoList() {
        return reissueInfoList;
    }


    /**
     * Sets the reissueInfoList value for this FareType.
     * 
     * @param reissueInfoList   * Reissue information
     */
    public void setReissueInfoList(org.opentravel.www.OTA._2003._05.ReissueInfoType[] reissueInfoList) {
        this.reissueInfoList = reissueInfoList;
    }


    /**
     * Gets the penaltiesInfo value for this FareType.
     * 
     * @return penaltiesInfo   * Penalties information
     */
    public org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly[][] getPenaltiesInfo() {
        return penaltiesInfo;
    }


    /**
     * Sets the penaltiesInfo value for this FareType.
     * 
     * @param penaltiesInfo   * Penalties information
     */
    public void setPenaltiesInfo(org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly[][] penaltiesInfo) {
        this.penaltiesInfo = penaltiesInfo;
    }


    /**
     * Gets the TPA_Extensions value for this FareType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this FareType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.FareTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the negotiatedFare value for this FareType.
     * 
     * @return negotiatedFare
     */
    public java.lang.Boolean getNegotiatedFare() {
        return negotiatedFare;
    }


    /**
     * Sets the negotiatedFare value for this FareType.
     * 
     * @param negotiatedFare
     */
    public void setNegotiatedFare(java.lang.Boolean negotiatedFare) {
        this.negotiatedFare = negotiatedFare;
    }


    /**
     * Gets the negotiatedFareCode value for this FareType.
     * 
     * @return negotiatedFareCode
     */
    public java.lang.String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }


    /**
     * Sets the negotiatedFareCode value for this FareType.
     * 
     * @param negotiatedFareCode
     */
    public void setNegotiatedFareCode(java.lang.String negotiatedFareCode) {
        this.negotiatedFareCode = negotiatedFareCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareType)) return false;
        FareType other = (FareType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseFare==null && other.getBaseFare()==null) || 
             (this.baseFare!=null &&
              this.baseFare.equals(other.getBaseFare()))) &&
            ((this.nonRefundableBaseFare==null && other.getNonRefundableBaseFare()==null) || 
             (this.nonRefundableBaseFare!=null &&
              this.nonRefundableBaseFare.equals(other.getNonRefundableBaseFare()))) &&
            ((this.fareConstruction==null && other.getFareConstruction()==null) || 
             (this.fareConstruction!=null &&
              this.fareConstruction.equals(other.getFareConstruction()))) &&
            ((this.equivFare==null && other.getEquivFare()==null) || 
             (this.equivFare!=null &&
              this.equivFare.equals(other.getEquivFare()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              this.taxes.equals(other.getTaxes()))) &&
            ((this.fees==null && other.getFees()==null) || 
             (this.fees!=null &&
              java.util.Arrays.equals(this.fees, other.getFees()))) &&
            ((this.OBFees==null && other.getOBFees()==null) || 
             (this.OBFees!=null &&
              java.util.Arrays.equals(this.OBFees, other.getOBFees()))) &&
            ((this.rateOfExchange==null && other.getRateOfExchange()==null) || 
             (this.rateOfExchange!=null &&
              this.rateOfExchange.equals(other.getRateOfExchange()))) &&
            ((this.currencyConversions==null && other.getCurrencyConversions()==null) || 
             (this.currencyConversions!=null &&
              this.currencyConversions.equals(other.getCurrencyConversions()))) &&
            ((this.totalFare==null && other.getTotalFare()==null) || 
             (this.totalFare!=null &&
              this.totalFare.equals(other.getTotalFare()))) &&
            ((this.reissueInfoList==null && other.getReissueInfoList()==null) || 
             (this.reissueInfoList!=null &&
              java.util.Arrays.equals(this.reissueInfoList, other.getReissueInfoList()))) &&
            ((this.penaltiesInfo==null && other.getPenaltiesInfo()==null) || 
             (this.penaltiesInfo!=null &&
              java.util.Arrays.equals(this.penaltiesInfo, other.getPenaltiesInfo()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.negotiatedFare==null && other.getNegotiatedFare()==null) || 
             (this.negotiatedFare!=null &&
              this.negotiatedFare.equals(other.getNegotiatedFare()))) &&
            ((this.negotiatedFareCode==null && other.getNegotiatedFareCode()==null) || 
             (this.negotiatedFareCode!=null &&
              this.negotiatedFareCode.equals(other.getNegotiatedFareCode())));
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
        if (getBaseFare() != null) {
            _hashCode += getBaseFare().hashCode();
        }
        if (getNonRefundableBaseFare() != null) {
            _hashCode += getNonRefundableBaseFare().hashCode();
        }
        if (getFareConstruction() != null) {
            _hashCode += getFareConstruction().hashCode();
        }
        if (getEquivFare() != null) {
            _hashCode += getEquivFare().hashCode();
        }
        if (getTaxes() != null) {
            _hashCode += getTaxes().hashCode();
        }
        if (getFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOBFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOBFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOBFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRateOfExchange() != null) {
            _hashCode += getRateOfExchange().hashCode();
        }
        if (getCurrencyConversions() != null) {
            _hashCode += getCurrencyConversions().hashCode();
        }
        if (getTotalFare() != null) {
            _hashCode += getTotalFare().hashCode();
        }
        if (getReissueInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReissueInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReissueInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPenaltiesInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPenaltiesInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPenaltiesInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getNegotiatedFare() != null) {
            _hashCode += getNegotiatedFare().hashCode();
        }
        if (getNegotiatedFareCode() != null) {
            _hashCode += getNegotiatedFareCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("negotiatedFare");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NegotiatedFare"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("negotiatedFareCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NegotiatedFareCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonRefundableBaseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NonRefundableBaseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareConstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareConstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equivFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquivFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>EquivFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>Taxes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Fees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirFeeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Fee"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OBFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OBFeeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OBFee"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateOfExchange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RateOfExchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RateOfExchangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyConversions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyConversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyConversionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reissueInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReissueInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReissueInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReissueInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penaltiesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PenaltiesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FareType>PenaltiesInfo>Penalty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Penalty"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>TPA_Extensions"));
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
