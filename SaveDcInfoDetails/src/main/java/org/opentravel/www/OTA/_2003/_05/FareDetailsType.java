/**
 * FareDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * You don't need to specify all of these attributes for a given flight.
 * 				For some of them it is sufficient to be specified in the last
 * flight of a given fare component.
 * 				For details, see notes below --- the attributes are annotated
 * with ,,last Flight in Fare Component''.
 */
public class FareDetailsType  implements java.io.Serializable {
    private short componentNo;  // attribute

    private java.lang.String basisCode;  // attribute

    private java.math.BigDecimal amount;  // attribute

    private java.lang.String vendor;  // attribute

    private java.lang.String sourceVendor;  // attribute

    private java.lang.String tariff;  // attribute

    private java.lang.String ruleNumber;  // attribute

    private org.apache.axis.types.Token brandID;  // attribute

    private int programID;  // attribute

    public FareDetailsType() {
    }

    public FareDetailsType(
           short componentNo,
           java.lang.String basisCode,
           java.math.BigDecimal amount,
           java.lang.String vendor,
           java.lang.String sourceVendor,
           java.lang.String tariff,
           java.lang.String ruleNumber,
           org.apache.axis.types.Token brandID,
           int programID) {
           this.componentNo = componentNo;
           this.basisCode = basisCode;
           this.amount = amount;
           this.vendor = vendor;
           this.sourceVendor = sourceVendor;
           this.tariff = tariff;
           this.ruleNumber = ruleNumber;
           this.brandID = brandID;
           this.programID = programID;
    }


    /**
     * Gets the componentNo value for this FareDetailsType.
     * 
     * @return componentNo
     */
    public short getComponentNo() {
        return componentNo;
    }


    /**
     * Sets the componentNo value for this FareDetailsType.
     * 
     * @param componentNo
     */
    public void setComponentNo(short componentNo) {
        this.componentNo = componentNo;
    }


    /**
     * Gets the basisCode value for this FareDetailsType.
     * 
     * @return basisCode
     */
    public java.lang.String getBasisCode() {
        return basisCode;
    }


    /**
     * Sets the basisCode value for this FareDetailsType.
     * 
     * @param basisCode
     */
    public void setBasisCode(java.lang.String basisCode) {
        this.basisCode = basisCode;
    }


    /**
     * Gets the amount value for this FareDetailsType.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FareDetailsType.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the vendor value for this FareDetailsType.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this FareDetailsType.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the sourceVendor value for this FareDetailsType.
     * 
     * @return sourceVendor
     */
    public java.lang.String getSourceVendor() {
        return sourceVendor;
    }


    /**
     * Sets the sourceVendor value for this FareDetailsType.
     * 
     * @param sourceVendor
     */
    public void setSourceVendor(java.lang.String sourceVendor) {
        this.sourceVendor = sourceVendor;
    }


    /**
     * Gets the tariff value for this FareDetailsType.
     * 
     * @return tariff
     */
    public java.lang.String getTariff() {
        return tariff;
    }


    /**
     * Sets the tariff value for this FareDetailsType.
     * 
     * @param tariff
     */
    public void setTariff(java.lang.String tariff) {
        this.tariff = tariff;
    }


    /**
     * Gets the ruleNumber value for this FareDetailsType.
     * 
     * @return ruleNumber
     */
    public java.lang.String getRuleNumber() {
        return ruleNumber;
    }


    /**
     * Sets the ruleNumber value for this FareDetailsType.
     * 
     * @param ruleNumber
     */
    public void setRuleNumber(java.lang.String ruleNumber) {
        this.ruleNumber = ruleNumber;
    }


    /**
     * Gets the brandID value for this FareDetailsType.
     * 
     * @return brandID
     */
    public org.apache.axis.types.Token getBrandID() {
        return brandID;
    }


    /**
     * Sets the brandID value for this FareDetailsType.
     * 
     * @param brandID
     */
    public void setBrandID(org.apache.axis.types.Token brandID) {
        this.brandID = brandID;
    }


    /**
     * Gets the programID value for this FareDetailsType.
     * 
     * @return programID
     */
    public int getProgramID() {
        return programID;
    }


    /**
     * Sets the programID value for this FareDetailsType.
     * 
     * @param programID
     */
    public void setProgramID(int programID) {
        this.programID = programID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareDetailsType)) return false;
        FareDetailsType other = (FareDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.componentNo == other.getComponentNo() &&
            ((this.basisCode==null && other.getBasisCode()==null) || 
             (this.basisCode!=null &&
              this.basisCode.equals(other.getBasisCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.sourceVendor==null && other.getSourceVendor()==null) || 
             (this.sourceVendor!=null &&
              this.sourceVendor.equals(other.getSourceVendor()))) &&
            ((this.tariff==null && other.getTariff()==null) || 
             (this.tariff!=null &&
              this.tariff.equals(other.getTariff()))) &&
            ((this.ruleNumber==null && other.getRuleNumber()==null) || 
             (this.ruleNumber!=null &&
              this.ruleNumber.equals(other.getRuleNumber()))) &&
            ((this.brandID==null && other.getBrandID()==null) || 
             (this.brandID!=null &&
              this.brandID.equals(other.getBrandID()))) &&
            this.programID == other.getProgramID();
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
        _hashCode += getComponentNo();
        if (getBasisCode() != null) {
            _hashCode += getBasisCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getSourceVendor() != null) {
            _hashCode += getSourceVendor().hashCode();
        }
        if (getTariff() != null) {
            _hashCode += getTariff().hashCode();
        }
        if (getRuleNumber() != null) {
            _hashCode += getRuleNumber().hashCode();
        }
        if (getBrandID() != null) {
            _hashCode += getBrandID().hashCode();
        }
        _hashCode += getProgramID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareDetailsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("componentNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ComponentNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("basisCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BasisCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareBasisCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("amount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("vendor");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Vendor"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sourceVendor");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SourceVendor"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tariff");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Tariff"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ruleNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RuleNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BrandID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
