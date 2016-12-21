/**
 * TransactionTypeFareOverridesFareOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TransactionTypeFareOverridesFareOverride  implements java.io.Serializable {
    /* Specify vendors to include and exclude from the response. */
    private org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] vendorPref;

    /* This is a place holder for additional elements. */
    private java.lang.String TPA_Extensions;

    private java.lang.String fareType;  // attribute

    private java.lang.String pseudoCityCode;  // attribute

    private java.lang.String corporateID;  // attribute

    private java.lang.String callable;  // attribute

    public TransactionTypeFareOverridesFareOverride() {
    }

    public TransactionTypeFareOverridesFareOverride(
           org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] vendorPref,
           java.lang.String TPA_Extensions,
           java.lang.String fareType,
           java.lang.String pseudoCityCode,
           java.lang.String corporateID,
           java.lang.String callable) {
           this.vendorPref = vendorPref;
           this.TPA_Extensions = TPA_Extensions;
           this.fareType = fareType;
           this.pseudoCityCode = pseudoCityCode;
           this.corporateID = corporateID;
           this.callable = callable;
    }


    /**
     * Gets the vendorPref value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @return vendorPref   * Specify vendors to include and exclude from the response.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] getVendorPref() {
        return vendorPref;
    }


    /**
     * Sets the vendorPref value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @param vendorPref   * Specify vendors to include and exclude from the response.
     */
    public void setVendorPref(org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] vendorPref) {
        this.vendorPref = vendorPref;
    }

    public org.opentravel.www.OTA._2003._05.CompanyNamePrefType getVendorPref(int i) {
        return this.vendorPref[i];
    }

    public void setVendorPref(int i, org.opentravel.www.OTA._2003._05.CompanyNamePrefType _value) {
        this.vendorPref[i] = _value;
    }


    /**
     * Gets the TPA_Extensions value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @return TPA_Extensions   * This is a place holder for additional elements.
     */
    public java.lang.String getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @param TPA_Extensions   * This is a place holder for additional elements.
     */
    public void setTPA_Extensions(java.lang.String TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the fareType value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @return fareType
     */
    public java.lang.String getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String fareType) {
        this.fareType = fareType;
    }


    /**
     * Gets the pseudoCityCode value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @return pseudoCityCode
     */
    public java.lang.String getPseudoCityCode() {
        return pseudoCityCode;
    }


    /**
     * Sets the pseudoCityCode value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @param pseudoCityCode
     */
    public void setPseudoCityCode(java.lang.String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }


    /**
     * Gets the corporateID value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @return corporateID
     */
    public java.lang.String getCorporateID() {
        return corporateID;
    }


    /**
     * Sets the corporateID value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @param corporateID
     */
    public void setCorporateID(java.lang.String corporateID) {
        this.corporateID = corporateID;
    }


    /**
     * Gets the callable value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @return callable
     */
    public java.lang.String getCallable() {
        return callable;
    }


    /**
     * Sets the callable value for this TransactionTypeFareOverridesFareOverride.
     * 
     * @param callable
     */
    public void setCallable(java.lang.String callable) {
        this.callable = callable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionTypeFareOverridesFareOverride)) return false;
        TransactionTypeFareOverridesFareOverride other = (TransactionTypeFareOverridesFareOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorPref==null && other.getVendorPref()==null) || 
             (this.vendorPref!=null &&
              java.util.Arrays.equals(this.vendorPref, other.getVendorPref()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              this.fareType.equals(other.getFareType()))) &&
            ((this.pseudoCityCode==null && other.getPseudoCityCode()==null) || 
             (this.pseudoCityCode!=null &&
              this.pseudoCityCode.equals(other.getPseudoCityCode()))) &&
            ((this.corporateID==null && other.getCorporateID()==null) || 
             (this.corporateID!=null &&
              this.corporateID.equals(other.getCorporateID()))) &&
            ((this.callable==null && other.getCallable()==null) || 
             (this.callable!=null &&
              this.callable.equals(other.getCallable())));
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
        if (getVendorPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getFareType() != null) {
            _hashCode += getFareType().hashCode();
        }
        if (getPseudoCityCode() != null) {
            _hashCode += getPseudoCityCode().hashCode();
        }
        if (getCorporateID() != null) {
            _hashCode += getCorporateID().hashCode();
        }
        if (getCallable() != null) {
            _hashCode += getCallable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionTypeFareOverridesFareOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>FareOverrides>FareOverride"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pseudoCityCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PseudoCityCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("corporateID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CorporateID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("callable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Callable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VendorPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNamePrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
