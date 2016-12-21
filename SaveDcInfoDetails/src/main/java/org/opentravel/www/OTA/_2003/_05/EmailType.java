/**
 * EmailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Electronic email addresses, in IETF specified format.
 */
public class EmailType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd;  // attribute

    private java.lang.Boolean defaultInd;  // attribute

    private java.lang.String emailType;  // attribute

    public EmailType() {
    }

    // Simple Types must have a String constructor
    public EmailType(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the shareSynchInd value for this EmailType.
     * 
     * @return shareSynchInd
     */
    public org.opentravel.www.OTA._2003._05.ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }


    /**
     * Sets the shareSynchInd value for this EmailType.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }


    /**
     * Gets the shareMarketInd value for this EmailType.
     * 
     * @return shareMarketInd
     */
    public org.opentravel.www.OTA._2003._05.ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }


    /**
     * Sets the shareMarketInd value for this EmailType.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }


    /**
     * Gets the defaultInd value for this EmailType.
     * 
     * @return defaultInd
     */
    public java.lang.Boolean getDefaultInd() {
        return defaultInd;
    }


    /**
     * Sets the defaultInd value for this EmailType.
     * 
     * @param defaultInd
     */
    public void setDefaultInd(java.lang.Boolean defaultInd) {
        this.defaultInd = defaultInd;
    }


    /**
     * Gets the emailType value for this EmailType.
     * 
     * @return emailType
     */
    public java.lang.String getEmailType() {
        return emailType;
    }


    /**
     * Sets the emailType value for this EmailType.
     * 
     * @param emailType
     */
    public void setEmailType(java.lang.String emailType) {
        this.emailType = emailType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailType)) return false;
        EmailType other = (EmailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.shareSynchInd==null && other.getShareSynchInd()==null) || 
             (this.shareSynchInd!=null &&
              this.shareSynchInd.equals(other.getShareSynchInd()))) &&
            ((this.shareMarketInd==null && other.getShareMarketInd()==null) || 
             (this.shareMarketInd!=null &&
              this.shareMarketInd.equals(other.getShareMarketInd()))) &&
            ((this.defaultInd==null && other.getDefaultInd()==null) || 
             (this.defaultInd!=null &&
              this.defaultInd.equals(other.getDefaultInd()))) &&
            ((this.emailType==null && other.getEmailType()==null) || 
             (this.emailType!=null &&
              this.emailType.equals(other.getEmailType())));
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
        if (getShareSynchInd() != null) {
            _hashCode += getShareSynchInd().hashCode();
        }
        if (getShareMarketInd() != null) {
            _hashCode += getShareMarketInd().hashCode();
        }
        if (getDefaultInd() != null) {
            _hashCode += getDefaultInd().hashCode();
        }
        if (getEmailType() != null) {
            _hashCode += getEmailType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EmailType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shareSynchInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShareSynchInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ShareSynchInd"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shareMarketInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShareMarketInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ShareMarketInd"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("defaultInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DefaultInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("emailType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EmailType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
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
