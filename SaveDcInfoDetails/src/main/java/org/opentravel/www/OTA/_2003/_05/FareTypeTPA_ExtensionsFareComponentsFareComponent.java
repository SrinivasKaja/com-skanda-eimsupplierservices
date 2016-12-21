/**
 * FareTypeTPA_ExtensionsFareComponentsFareComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTPA_ExtensionsFareComponentsFareComponent  implements java.io.Serializable {
    /* Price of the inventory excluding taxes and fees. */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare;

    /* Price of the inventory excluding taxes and fees in the payable
     * currency. */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare equivFare;

    /* This is a collection of Taxes */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes taxes;

    /* The total price that the passenger would pay (includes fare,
     * taxes, fees) */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare;

    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentSegment[] segment;

    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail[] handlingMarkupDetail;

    /* Matched General Retailer Rule Code or Adjusted Selling Level
     * Retailer Rule Code */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule[] fareRetailerRule;

    private java.lang.String programID;  // attribute

    private java.lang.String programDescription;  // attribute

    private java.lang.String programSystemCode;  // attribute

    private java.lang.String brandID;  // attribute

    private java.lang.String brandName;  // attribute

    public FareTypeTPA_ExtensionsFareComponentsFareComponent() {
    }

    public FareTypeTPA_ExtensionsFareComponentsFareComponent(
           org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare equivFare,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes taxes,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentSegment[] segment,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail[] handlingMarkupDetail,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule[] fareRetailerRule,
           java.lang.String programID,
           java.lang.String programDescription,
           java.lang.String programSystemCode,
           java.lang.String brandID,
           java.lang.String brandName) {
           this.baseFare = baseFare;
           this.equivFare = equivFare;
           this.taxes = taxes;
           this.totalFare = totalFare;
           this.segment = segment;
           this.handlingMarkupDetail = handlingMarkupDetail;
           this.fareRetailerRule = fareRetailerRule;
           this.programID = programID;
           this.programDescription = programDescription;
           this.programSystemCode = programSystemCode;
           this.brandID = brandID;
           this.brandName = brandName;
    }


    /**
     * Gets the baseFare value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return baseFare   * Price of the inventory excluding taxes and fees.
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getBaseFare() {
        return baseFare;
    }


    /**
     * Sets the baseFare value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param baseFare   * Price of the inventory excluding taxes and fees.
     */
    public void setBaseFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare) {
        this.baseFare = baseFare;
    }


    /**
     * Gets the equivFare value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return equivFare   * Price of the inventory excluding taxes and fees in the payable
     * currency.
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare getEquivFare() {
        return equivFare;
    }


    /**
     * Sets the equivFare value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param equivFare   * Price of the inventory excluding taxes and fees in the payable
     * currency.
     */
    public void setEquivFare(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentEquivFare equivFare) {
        this.equivFare = equivFare;
    }


    /**
     * Gets the taxes value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return taxes   * This is a collection of Taxes
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param taxes   * This is a collection of Taxes
     */
    public void setTaxes(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the totalFare value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return totalFare   * The total price that the passenger would pay (includes fare,
     * taxes, fees)
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getTotalFare() {
        return totalFare;
    }


    /**
     * Sets the totalFare value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param totalFare   * The total price that the passenger would pay (includes fare,
     * taxes, fees)
     */
    public void setTotalFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare) {
        this.totalFare = totalFare;
    }


    /**
     * Gets the segment value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return segment
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentSegment[] getSegment() {
        return segment;
    }


    /**
     * Sets the segment value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param segment
     */
    public void setSegment(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentSegment[] segment) {
        this.segment = segment;
    }

    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentSegment getSegment(int i) {
        return this.segment[i];
    }

    public void setSegment(int i, org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentSegment _value) {
        this.segment[i] = _value;
    }


    /**
     * Gets the handlingMarkupDetail value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return handlingMarkupDetail
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail[] getHandlingMarkupDetail() {
        return handlingMarkupDetail;
    }


    /**
     * Sets the handlingMarkupDetail value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param handlingMarkupDetail
     */
    public void setHandlingMarkupDetail(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail[] handlingMarkupDetail) {
        this.handlingMarkupDetail = handlingMarkupDetail;
    }

    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail getHandlingMarkupDetail(int i) {
        return this.handlingMarkupDetail[i];
    }

    public void setHandlingMarkupDetail(int i, org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentHandlingMarkupDetail _value) {
        this.handlingMarkupDetail[i] = _value;
    }


    /**
     * Gets the fareRetailerRule value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return fareRetailerRule   * Matched General Retailer Rule Code or Adjusted Selling Level
     * Retailer Rule Code
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule[] getFareRetailerRule() {
        return fareRetailerRule;
    }


    /**
     * Sets the fareRetailerRule value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param fareRetailerRule   * Matched General Retailer Rule Code or Adjusted Selling Level
     * Retailer Rule Code
     */
    public void setFareRetailerRule(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule[] fareRetailerRule) {
        this.fareRetailerRule = fareRetailerRule;
    }

    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule getFareRetailerRule(int i) {
        return this.fareRetailerRule[i];
    }

    public void setFareRetailerRule(int i, org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule _value) {
        this.fareRetailerRule[i] = _value;
    }


    /**
     * Gets the programID value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return programID
     */
    public java.lang.String getProgramID() {
        return programID;
    }


    /**
     * Sets the programID value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param programID
     */
    public void setProgramID(java.lang.String programID) {
        this.programID = programID;
    }


    /**
     * Gets the programDescription value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return programDescription
     */
    public java.lang.String getProgramDescription() {
        return programDescription;
    }


    /**
     * Sets the programDescription value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param programDescription
     */
    public void setProgramDescription(java.lang.String programDescription) {
        this.programDescription = programDescription;
    }


    /**
     * Gets the programSystemCode value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return programSystemCode
     */
    public java.lang.String getProgramSystemCode() {
        return programSystemCode;
    }


    /**
     * Sets the programSystemCode value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param programSystemCode
     */
    public void setProgramSystemCode(java.lang.String programSystemCode) {
        this.programSystemCode = programSystemCode;
    }


    /**
     * Gets the brandID value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return brandID
     */
    public java.lang.String getBrandID() {
        return brandID;
    }


    /**
     * Sets the brandID value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param brandID
     */
    public void setBrandID(java.lang.String brandID) {
        this.brandID = brandID;
    }


    /**
     * Gets the brandName value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @return brandName
     */
    public java.lang.String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this FareTypeTPA_ExtensionsFareComponentsFareComponent.
     * 
     * @param brandName
     */
    public void setBrandName(java.lang.String brandName) {
        this.brandName = brandName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTPA_ExtensionsFareComponentsFareComponent)) return false;
        FareTypeTPA_ExtensionsFareComponentsFareComponent other = (FareTypeTPA_ExtensionsFareComponentsFareComponent) obj;
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
            ((this.equivFare==null && other.getEquivFare()==null) || 
             (this.equivFare!=null &&
              this.equivFare.equals(other.getEquivFare()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              this.taxes.equals(other.getTaxes()))) &&
            ((this.totalFare==null && other.getTotalFare()==null) || 
             (this.totalFare!=null &&
              this.totalFare.equals(other.getTotalFare()))) &&
            ((this.segment==null && other.getSegment()==null) || 
             (this.segment!=null &&
              java.util.Arrays.equals(this.segment, other.getSegment()))) &&
            ((this.handlingMarkupDetail==null && other.getHandlingMarkupDetail()==null) || 
             (this.handlingMarkupDetail!=null &&
              java.util.Arrays.equals(this.handlingMarkupDetail, other.getHandlingMarkupDetail()))) &&
            ((this.fareRetailerRule==null && other.getFareRetailerRule()==null) || 
             (this.fareRetailerRule!=null &&
              java.util.Arrays.equals(this.fareRetailerRule, other.getFareRetailerRule()))) &&
            ((this.programID==null && other.getProgramID()==null) || 
             (this.programID!=null &&
              this.programID.equals(other.getProgramID()))) &&
            ((this.programDescription==null && other.getProgramDescription()==null) || 
             (this.programDescription!=null &&
              this.programDescription.equals(other.getProgramDescription()))) &&
            ((this.programSystemCode==null && other.getProgramSystemCode()==null) || 
             (this.programSystemCode!=null &&
              this.programSystemCode.equals(other.getProgramSystemCode()))) &&
            ((this.brandID==null && other.getBrandID()==null) || 
             (this.brandID!=null &&
              this.brandID.equals(other.getBrandID()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName())));
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
        if (getEquivFare() != null) {
            _hashCode += getEquivFare().hashCode();
        }
        if (getTaxes() != null) {
            _hashCode += getTaxes().hashCode();
        }
        if (getTotalFare() != null) {
            _hashCode += getTotalFare().hashCode();
        }
        if (getSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHandlingMarkupDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHandlingMarkupDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHandlingMarkupDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFareRetailerRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareRetailerRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareRetailerRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProgramID() != null) {
            _hashCode += getProgramID().hashCode();
        }
        if (getProgramDescription() != null) {
            _hashCode += getProgramDescription().hashCode();
        }
        if (getProgramSystemCode() != null) {
            _hashCode += getProgramSystemCode().hashCode();
        }
        if (getBrandID() != null) {
            _hashCode += getBrandID().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTPA_ExtensionsFareComponentsFareComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>FareComponents>FareComponent"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programSystemCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramSystemCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equivFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquivFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>EquivFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>Taxes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>Segment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingMarkupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HandlingMarkupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>HandlingMarkupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareRetailerRule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareRetailerRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>FareRetailerRule"));
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
