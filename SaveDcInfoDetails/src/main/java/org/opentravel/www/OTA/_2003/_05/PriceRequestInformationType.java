/**
 * PriceRequestInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Identify pricing source, if negotiated fares are requested and
 * if it is a reprice request.
 */
public class PriceRequestInformationType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeNegotiatedFareCode negotiatedFareCode;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeAccountCode accountCode;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_Extensions TPA_Extensions;

    private org.opentravel.www.OTA._2003._05.FareQualifier fareQualifier;  // attribute

    private boolean negotiatedFaresOnly;  // attribute

    private java.lang.String currencyCode;  // attribute

    private org.opentravel.www.OTA._2003._05.RequestPricingSourceType pricingSource;  // attribute

    private java.lang.Boolean reprice;  // attribute

    private java.lang.Boolean processThruFaresOnly;  // attribute

    private java.util.Date purchaseDate;  // attribute

    private java.lang.String purchaseTime;  // attribute

    private java.lang.Boolean netFaresUsed;  // attribute

    public PriceRequestInformationType() {
    }

    public PriceRequestInformationType(
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeNegotiatedFareCode negotiatedFareCode,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeAccountCode accountCode,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_Extensions TPA_Extensions,
           org.opentravel.www.OTA._2003._05.FareQualifier fareQualifier,
           boolean negotiatedFaresOnly,
           java.lang.String currencyCode,
           org.opentravel.www.OTA._2003._05.RequestPricingSourceType pricingSource,
           java.lang.Boolean reprice,
           java.lang.Boolean processThruFaresOnly,
           java.util.Date purchaseDate,
           java.lang.String purchaseTime,
           java.lang.Boolean netFaresUsed) {
           this.negotiatedFareCode = negotiatedFareCode;
           this.accountCode = accountCode;
           this.TPA_Extensions = TPA_Extensions;
           this.fareQualifier = fareQualifier;
           this.negotiatedFaresOnly = negotiatedFaresOnly;
           this.currencyCode = currencyCode;
           this.pricingSource = pricingSource;
           this.reprice = reprice;
           this.processThruFaresOnly = processThruFaresOnly;
           this.purchaseDate = purchaseDate;
           this.purchaseTime = purchaseTime;
           this.netFaresUsed = netFaresUsed;
    }


    /**
     * Gets the negotiatedFareCode value for this PriceRequestInformationType.
     * 
     * @return negotiatedFareCode
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeNegotiatedFareCode getNegotiatedFareCode() {
        return negotiatedFareCode;
    }


    /**
     * Sets the negotiatedFareCode value for this PriceRequestInformationType.
     * 
     * @param negotiatedFareCode
     */
    public void setNegotiatedFareCode(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeNegotiatedFareCode negotiatedFareCode) {
        this.negotiatedFareCode = negotiatedFareCode;
    }


    /**
     * Gets the accountCode value for this PriceRequestInformationType.
     * 
     * @return accountCode
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeAccountCode getAccountCode() {
        return accountCode;
    }


    /**
     * Sets the accountCode value for this PriceRequestInformationType.
     * 
     * @param accountCode
     */
    public void setAccountCode(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeAccountCode accountCode) {
        this.accountCode = accountCode;
    }


    /**
     * Gets the TPA_Extensions value for this PriceRequestInformationType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this PriceRequestInformationType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the fareQualifier value for this PriceRequestInformationType.
     * 
     * @return fareQualifier
     */
    public org.opentravel.www.OTA._2003._05.FareQualifier getFareQualifier() {
        return fareQualifier;
    }


    /**
     * Sets the fareQualifier value for this PriceRequestInformationType.
     * 
     * @param fareQualifier
     */
    public void setFareQualifier(org.opentravel.www.OTA._2003._05.FareQualifier fareQualifier) {
        this.fareQualifier = fareQualifier;
    }


    /**
     * Gets the negotiatedFaresOnly value for this PriceRequestInformationType.
     * 
     * @return negotiatedFaresOnly
     */
    public boolean isNegotiatedFaresOnly() {
        return negotiatedFaresOnly;
    }


    /**
     * Sets the negotiatedFaresOnly value for this PriceRequestInformationType.
     * 
     * @param negotiatedFaresOnly
     */
    public void setNegotiatedFaresOnly(boolean negotiatedFaresOnly) {
        this.negotiatedFaresOnly = negotiatedFaresOnly;
    }


    /**
     * Gets the currencyCode value for this PriceRequestInformationType.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this PriceRequestInformationType.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the pricingSource value for this PriceRequestInformationType.
     * 
     * @return pricingSource
     */
    public org.opentravel.www.OTA._2003._05.RequestPricingSourceType getPricingSource() {
        return pricingSource;
    }


    /**
     * Sets the pricingSource value for this PriceRequestInformationType.
     * 
     * @param pricingSource
     */
    public void setPricingSource(org.opentravel.www.OTA._2003._05.RequestPricingSourceType pricingSource) {
        this.pricingSource = pricingSource;
    }


    /**
     * Gets the reprice value for this PriceRequestInformationType.
     * 
     * @return reprice
     */
    public java.lang.Boolean getReprice() {
        return reprice;
    }


    /**
     * Sets the reprice value for this PriceRequestInformationType.
     * 
     * @param reprice
     */
    public void setReprice(java.lang.Boolean reprice) {
        this.reprice = reprice;
    }


    /**
     * Gets the processThruFaresOnly value for this PriceRequestInformationType.
     * 
     * @return processThruFaresOnly
     */
    public java.lang.Boolean getProcessThruFaresOnly() {
        return processThruFaresOnly;
    }


    /**
     * Sets the processThruFaresOnly value for this PriceRequestInformationType.
     * 
     * @param processThruFaresOnly
     */
    public void setProcessThruFaresOnly(java.lang.Boolean processThruFaresOnly) {
        this.processThruFaresOnly = processThruFaresOnly;
    }


    /**
     * Gets the purchaseDate value for this PriceRequestInformationType.
     * 
     * @return purchaseDate
     */
    public java.util.Date getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this PriceRequestInformationType.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(java.util.Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the purchaseTime value for this PriceRequestInformationType.
     * 
     * @return purchaseTime
     */
    public java.lang.String getPurchaseTime() {
        return purchaseTime;
    }


    /**
     * Sets the purchaseTime value for this PriceRequestInformationType.
     * 
     * @param purchaseTime
     */
    public void setPurchaseTime(java.lang.String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }


    /**
     * Gets the netFaresUsed value for this PriceRequestInformationType.
     * 
     * @return netFaresUsed
     */
    public java.lang.Boolean getNetFaresUsed() {
        return netFaresUsed;
    }


    /**
     * Sets the netFaresUsed value for this PriceRequestInformationType.
     * 
     * @param netFaresUsed
     */
    public void setNetFaresUsed(java.lang.Boolean netFaresUsed) {
        this.netFaresUsed = netFaresUsed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationType)) return false;
        PriceRequestInformationType other = (PriceRequestInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.negotiatedFareCode==null && other.getNegotiatedFareCode()==null) || 
             (this.negotiatedFareCode!=null &&
              this.negotiatedFareCode.equals(other.getNegotiatedFareCode()))) &&
            ((this.accountCode==null && other.getAccountCode()==null) || 
             (this.accountCode!=null &&
              this.accountCode.equals(other.getAccountCode()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.fareQualifier==null && other.getFareQualifier()==null) || 
             (this.fareQualifier!=null &&
              this.fareQualifier.equals(other.getFareQualifier()))) &&
            this.negotiatedFaresOnly == other.isNegotiatedFaresOnly() &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.pricingSource==null && other.getPricingSource()==null) || 
             (this.pricingSource!=null &&
              this.pricingSource.equals(other.getPricingSource()))) &&
            ((this.reprice==null && other.getReprice()==null) || 
             (this.reprice!=null &&
              this.reprice.equals(other.getReprice()))) &&
            ((this.processThruFaresOnly==null && other.getProcessThruFaresOnly()==null) || 
             (this.processThruFaresOnly!=null &&
              this.processThruFaresOnly.equals(other.getProcessThruFaresOnly()))) &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate()))) &&
            ((this.purchaseTime==null && other.getPurchaseTime()==null) || 
             (this.purchaseTime!=null &&
              this.purchaseTime.equals(other.getPurchaseTime()))) &&
            ((this.netFaresUsed==null && other.getNetFaresUsed()==null) || 
             (this.netFaresUsed!=null &&
              this.netFaresUsed.equals(other.getNetFaresUsed())));
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
        if (getNegotiatedFareCode() != null) {
            _hashCode += getNegotiatedFareCode().hashCode();
        }
        if (getAccountCode() != null) {
            _hashCode += getAccountCode().hashCode();
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getFareQualifier() != null) {
            _hashCode += getFareQualifier().hashCode();
        }
        _hashCode += (isNegotiatedFaresOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getPricingSource() != null) {
            _hashCode += getPricingSource().hashCode();
        }
        if (getReprice() != null) {
            _hashCode += getReprice().hashCode();
        }
        if (getProcessThruFaresOnly() != null) {
            _hashCode += getProcessThruFaresOnly().hashCode();
        }
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        if (getPurchaseTime() != null) {
            _hashCode += getPurchaseTime().hashCode();
        }
        if (getNetFaresUsed() != null) {
            _hashCode += getNetFaresUsed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PriceRequestInformationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareQualifier"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("negotiatedFaresOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NegotiatedFaresOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currencyCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CurrencyCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pricingSource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PricingSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestPricingSourceType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reprice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Reprice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("processThruFaresOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProcessThruFaresOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("purchaseDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PurchaseDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("purchaseTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PurchaseTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("netFaresUsed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NetFaresUsed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedFareCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NegotiatedFareCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>NegotiatedFareCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AccountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>AccountCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>TPA_Extensions"));
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
