/**
 * ExchangeSettingsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeSettingsType  implements java.io.Serializable {
    private java.lang.Boolean repriceCurrentItin;  // attribute

    private java.lang.Boolean attachExchangeInfo;  // attribute

    private org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeReissueExchange reissueExchange;  // attribute

    private java.lang.Boolean brandedResults;  // attribute

    private java.lang.Long MIPTimeoutThreshold;  // attribute

    private org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeRequestType requestType;  // attribute

    public ExchangeSettingsType() {
    }

    public ExchangeSettingsType(
           java.lang.Boolean repriceCurrentItin,
           java.lang.Boolean attachExchangeInfo,
           org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeReissueExchange reissueExchange,
           java.lang.Boolean brandedResults,
           java.lang.Long MIPTimeoutThreshold,
           org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeRequestType requestType) {
           this.repriceCurrentItin = repriceCurrentItin;
           this.attachExchangeInfo = attachExchangeInfo;
           this.reissueExchange = reissueExchange;
           this.brandedResults = brandedResults;
           this.MIPTimeoutThreshold = MIPTimeoutThreshold;
           this.requestType = requestType;
    }


    /**
     * Gets the repriceCurrentItin value for this ExchangeSettingsType.
     * 
     * @return repriceCurrentItin
     */
    public java.lang.Boolean getRepriceCurrentItin() {
        return repriceCurrentItin;
    }


    /**
     * Sets the repriceCurrentItin value for this ExchangeSettingsType.
     * 
     * @param repriceCurrentItin
     */
    public void setRepriceCurrentItin(java.lang.Boolean repriceCurrentItin) {
        this.repriceCurrentItin = repriceCurrentItin;
    }


    /**
     * Gets the attachExchangeInfo value for this ExchangeSettingsType.
     * 
     * @return attachExchangeInfo
     */
    public java.lang.Boolean getAttachExchangeInfo() {
        return attachExchangeInfo;
    }


    /**
     * Sets the attachExchangeInfo value for this ExchangeSettingsType.
     * 
     * @param attachExchangeInfo
     */
    public void setAttachExchangeInfo(java.lang.Boolean attachExchangeInfo) {
        this.attachExchangeInfo = attachExchangeInfo;
    }


    /**
     * Gets the reissueExchange value for this ExchangeSettingsType.
     * 
     * @return reissueExchange
     */
    public org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeReissueExchange getReissueExchange() {
        return reissueExchange;
    }


    /**
     * Sets the reissueExchange value for this ExchangeSettingsType.
     * 
     * @param reissueExchange
     */
    public void setReissueExchange(org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeReissueExchange reissueExchange) {
        this.reissueExchange = reissueExchange;
    }


    /**
     * Gets the brandedResults value for this ExchangeSettingsType.
     * 
     * @return brandedResults
     */
    public java.lang.Boolean getBrandedResults() {
        return brandedResults;
    }


    /**
     * Sets the brandedResults value for this ExchangeSettingsType.
     * 
     * @param brandedResults
     */
    public void setBrandedResults(java.lang.Boolean brandedResults) {
        this.brandedResults = brandedResults;
    }


    /**
     * Gets the MIPTimeoutThreshold value for this ExchangeSettingsType.
     * 
     * @return MIPTimeoutThreshold
     */
    public java.lang.Long getMIPTimeoutThreshold() {
        return MIPTimeoutThreshold;
    }


    /**
     * Sets the MIPTimeoutThreshold value for this ExchangeSettingsType.
     * 
     * @param MIPTimeoutThreshold
     */
    public void setMIPTimeoutThreshold(java.lang.Long MIPTimeoutThreshold) {
        this.MIPTimeoutThreshold = MIPTimeoutThreshold;
    }


    /**
     * Gets the requestType value for this ExchangeSettingsType.
     * 
     * @return requestType
     */
    public org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeRequestType getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this ExchangeSettingsType.
     * 
     * @param requestType
     */
    public void setRequestType(org.opentravel.www.OTA._2003._05.ExchangeSettingsTypeRequestType requestType) {
        this.requestType = requestType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeSettingsType)) return false;
        ExchangeSettingsType other = (ExchangeSettingsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repriceCurrentItin==null && other.getRepriceCurrentItin()==null) || 
             (this.repriceCurrentItin!=null &&
              this.repriceCurrentItin.equals(other.getRepriceCurrentItin()))) &&
            ((this.attachExchangeInfo==null && other.getAttachExchangeInfo()==null) || 
             (this.attachExchangeInfo!=null &&
              this.attachExchangeInfo.equals(other.getAttachExchangeInfo()))) &&
            ((this.reissueExchange==null && other.getReissueExchange()==null) || 
             (this.reissueExchange!=null &&
              this.reissueExchange.equals(other.getReissueExchange()))) &&
            ((this.brandedResults==null && other.getBrandedResults()==null) || 
             (this.brandedResults!=null &&
              this.brandedResults.equals(other.getBrandedResults()))) &&
            ((this.MIPTimeoutThreshold==null && other.getMIPTimeoutThreshold()==null) || 
             (this.MIPTimeoutThreshold!=null &&
              this.MIPTimeoutThreshold.equals(other.getMIPTimeoutThreshold()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType())));
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
        if (getRepriceCurrentItin() != null) {
            _hashCode += getRepriceCurrentItin().hashCode();
        }
        if (getAttachExchangeInfo() != null) {
            _hashCode += getAttachExchangeInfo().hashCode();
        }
        if (getReissueExchange() != null) {
            _hashCode += getReissueExchange().hashCode();
        }
        if (getBrandedResults() != null) {
            _hashCode += getBrandedResults().hashCode();
        }
        if (getMIPTimeoutThreshold() != null) {
            _hashCode += getMIPTimeoutThreshold().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeSettingsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeSettingsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("repriceCurrentItin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RepriceCurrentItin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attachExchangeInfo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AttachExchangeInfo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueExchange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueExchange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExchangeSettingsType>ReissueExchange"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandedResults");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandedResults"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MIPTimeoutThreshold");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MIPTimeoutThreshold"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requestType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RequestType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExchangeSettingsType>RequestType"));
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
