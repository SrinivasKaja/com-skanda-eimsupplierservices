/**
 * FareComponentBreakdownType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Fare Component Breakdown
 */
public class FareComponentBreakdownType  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort fareComponentReferenceID;  // attribute

    private java.math.BigDecimal fareComponentCommission;  // attribute

    private org.apache.axis.types.UnsignedLong ruleID;  // attribute

    private org.apache.axis.types.UnsignedLong programID;  // attribute

    private org.apache.axis.types.UnsignedLong contractID;  // attribute

    public FareComponentBreakdownType() {
    }

    public FareComponentBreakdownType(
           org.apache.axis.types.UnsignedShort fareComponentReferenceID,
           java.math.BigDecimal fareComponentCommission,
           org.apache.axis.types.UnsignedLong ruleID,
           org.apache.axis.types.UnsignedLong programID,
           org.apache.axis.types.UnsignedLong contractID) {
           this.fareComponentReferenceID = fareComponentReferenceID;
           this.fareComponentCommission = fareComponentCommission;
           this.ruleID = ruleID;
           this.programID = programID;
           this.contractID = contractID;
    }


    /**
     * Gets the fareComponentReferenceID value for this FareComponentBreakdownType.
     * 
     * @return fareComponentReferenceID
     */
    public org.apache.axis.types.UnsignedShort getFareComponentReferenceID() {
        return fareComponentReferenceID;
    }


    /**
     * Sets the fareComponentReferenceID value for this FareComponentBreakdownType.
     * 
     * @param fareComponentReferenceID
     */
    public void setFareComponentReferenceID(org.apache.axis.types.UnsignedShort fareComponentReferenceID) {
        this.fareComponentReferenceID = fareComponentReferenceID;
    }


    /**
     * Gets the fareComponentCommission value for this FareComponentBreakdownType.
     * 
     * @return fareComponentCommission
     */
    public java.math.BigDecimal getFareComponentCommission() {
        return fareComponentCommission;
    }


    /**
     * Sets the fareComponentCommission value for this FareComponentBreakdownType.
     * 
     * @param fareComponentCommission
     */
    public void setFareComponentCommission(java.math.BigDecimal fareComponentCommission) {
        this.fareComponentCommission = fareComponentCommission;
    }


    /**
     * Gets the ruleID value for this FareComponentBreakdownType.
     * 
     * @return ruleID
     */
    public org.apache.axis.types.UnsignedLong getRuleID() {
        return ruleID;
    }


    /**
     * Sets the ruleID value for this FareComponentBreakdownType.
     * 
     * @param ruleID
     */
    public void setRuleID(org.apache.axis.types.UnsignedLong ruleID) {
        this.ruleID = ruleID;
    }


    /**
     * Gets the programID value for this FareComponentBreakdownType.
     * 
     * @return programID
     */
    public org.apache.axis.types.UnsignedLong getProgramID() {
        return programID;
    }


    /**
     * Sets the programID value for this FareComponentBreakdownType.
     * 
     * @param programID
     */
    public void setProgramID(org.apache.axis.types.UnsignedLong programID) {
        this.programID = programID;
    }


    /**
     * Gets the contractID value for this FareComponentBreakdownType.
     * 
     * @return contractID
     */
    public org.apache.axis.types.UnsignedLong getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this FareComponentBreakdownType.
     * 
     * @param contractID
     */
    public void setContractID(org.apache.axis.types.UnsignedLong contractID) {
        this.contractID = contractID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareComponentBreakdownType)) return false;
        FareComponentBreakdownType other = (FareComponentBreakdownType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fareComponentReferenceID==null && other.getFareComponentReferenceID()==null) || 
             (this.fareComponentReferenceID!=null &&
              this.fareComponentReferenceID.equals(other.getFareComponentReferenceID()))) &&
            ((this.fareComponentCommission==null && other.getFareComponentCommission()==null) || 
             (this.fareComponentCommission!=null &&
              this.fareComponentCommission.equals(other.getFareComponentCommission()))) &&
            ((this.ruleID==null && other.getRuleID()==null) || 
             (this.ruleID!=null &&
              this.ruleID.equals(other.getRuleID()))) &&
            ((this.programID==null && other.getProgramID()==null) || 
             (this.programID!=null &&
              this.programID.equals(other.getProgramID()))) &&
            ((this.contractID==null && other.getContractID()==null) || 
             (this.contractID!=null &&
              this.contractID.equals(other.getContractID())));
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
        if (getFareComponentReferenceID() != null) {
            _hashCode += getFareComponentReferenceID().hashCode();
        }
        if (getFareComponentCommission() != null) {
            _hashCode += getFareComponentCommission().hashCode();
        }
        if (getRuleID() != null) {
            _hashCode += getRuleID().hashCode();
        }
        if (getProgramID() != null) {
            _hashCode += getProgramID().hashCode();
        }
        if (getContractID() != null) {
            _hashCode += getContractID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareComponentBreakdownType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentBreakdownType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareComponentReferenceID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareComponentReferenceID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareComponentCommission");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareComponentCommission"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ruleID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RuleID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contractID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ContractID"));
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
