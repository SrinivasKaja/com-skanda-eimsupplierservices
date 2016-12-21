/**
 * TelephoneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Construct for holding a telephone number.
 */
public class TelephoneType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd;  // attribute

    private java.lang.String phoneLocationType;  // attribute

    private java.lang.String phoneTechType;  // attribute

    private java.lang.String countryAccessCode;  // attribute

    private java.lang.String areaCityCode;  // attribute

    private java.lang.String phoneNumber;  // attribute

    private java.lang.String extension;  // attribute

    private java.lang.String PIN;  // attribute

    private java.lang.Boolean formattedInd;  // attribute

    public TelephoneType() {
    }

    public TelephoneType(
           org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd,
           org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd,
           java.lang.String phoneLocationType,
           java.lang.String phoneTechType,
           java.lang.String countryAccessCode,
           java.lang.String areaCityCode,
           java.lang.String phoneNumber,
           java.lang.String extension,
           java.lang.String PIN,
           java.lang.Boolean formattedInd) {
           this.shareSynchInd = shareSynchInd;
           this.shareMarketInd = shareMarketInd;
           this.phoneLocationType = phoneLocationType;
           this.phoneTechType = phoneTechType;
           this.countryAccessCode = countryAccessCode;
           this.areaCityCode = areaCityCode;
           this.phoneNumber = phoneNumber;
           this.extension = extension;
           this.PIN = PIN;
           this.formattedInd = formattedInd;
    }


    /**
     * Gets the shareSynchInd value for this TelephoneType.
     * 
     * @return shareSynchInd
     */
    public org.opentravel.www.OTA._2003._05.ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }


    /**
     * Sets the shareSynchInd value for this TelephoneType.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }


    /**
     * Gets the shareMarketInd value for this TelephoneType.
     * 
     * @return shareMarketInd
     */
    public org.opentravel.www.OTA._2003._05.ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }


    /**
     * Sets the shareMarketInd value for this TelephoneType.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }


    /**
     * Gets the phoneLocationType value for this TelephoneType.
     * 
     * @return phoneLocationType
     */
    public java.lang.String getPhoneLocationType() {
        return phoneLocationType;
    }


    /**
     * Sets the phoneLocationType value for this TelephoneType.
     * 
     * @param phoneLocationType
     */
    public void setPhoneLocationType(java.lang.String phoneLocationType) {
        this.phoneLocationType = phoneLocationType;
    }


    /**
     * Gets the phoneTechType value for this TelephoneType.
     * 
     * @return phoneTechType
     */
    public java.lang.String getPhoneTechType() {
        return phoneTechType;
    }


    /**
     * Sets the phoneTechType value for this TelephoneType.
     * 
     * @param phoneTechType
     */
    public void setPhoneTechType(java.lang.String phoneTechType) {
        this.phoneTechType = phoneTechType;
    }


    /**
     * Gets the countryAccessCode value for this TelephoneType.
     * 
     * @return countryAccessCode
     */
    public java.lang.String getCountryAccessCode() {
        return countryAccessCode;
    }


    /**
     * Sets the countryAccessCode value for this TelephoneType.
     * 
     * @param countryAccessCode
     */
    public void setCountryAccessCode(java.lang.String countryAccessCode) {
        this.countryAccessCode = countryAccessCode;
    }


    /**
     * Gets the areaCityCode value for this TelephoneType.
     * 
     * @return areaCityCode
     */
    public java.lang.String getAreaCityCode() {
        return areaCityCode;
    }


    /**
     * Sets the areaCityCode value for this TelephoneType.
     * 
     * @param areaCityCode
     */
    public void setAreaCityCode(java.lang.String areaCityCode) {
        this.areaCityCode = areaCityCode;
    }


    /**
     * Gets the phoneNumber value for this TelephoneType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this TelephoneType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the extension value for this TelephoneType.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this TelephoneType.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the PIN value for this TelephoneType.
     * 
     * @return PIN
     */
    public java.lang.String getPIN() {
        return PIN;
    }


    /**
     * Sets the PIN value for this TelephoneType.
     * 
     * @param PIN
     */
    public void setPIN(java.lang.String PIN) {
        this.PIN = PIN;
    }


    /**
     * Gets the formattedInd value for this TelephoneType.
     * 
     * @return formattedInd
     */
    public java.lang.Boolean getFormattedInd() {
        return formattedInd;
    }


    /**
     * Sets the formattedInd value for this TelephoneType.
     * 
     * @param formattedInd
     */
    public void setFormattedInd(java.lang.Boolean formattedInd) {
        this.formattedInd = formattedInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephoneType)) return false;
        TelephoneType other = (TelephoneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shareSynchInd==null && other.getShareSynchInd()==null) || 
             (this.shareSynchInd!=null &&
              this.shareSynchInd.equals(other.getShareSynchInd()))) &&
            ((this.shareMarketInd==null && other.getShareMarketInd()==null) || 
             (this.shareMarketInd!=null &&
              this.shareMarketInd.equals(other.getShareMarketInd()))) &&
            ((this.phoneLocationType==null && other.getPhoneLocationType()==null) || 
             (this.phoneLocationType!=null &&
              this.phoneLocationType.equals(other.getPhoneLocationType()))) &&
            ((this.phoneTechType==null && other.getPhoneTechType()==null) || 
             (this.phoneTechType!=null &&
              this.phoneTechType.equals(other.getPhoneTechType()))) &&
            ((this.countryAccessCode==null && other.getCountryAccessCode()==null) || 
             (this.countryAccessCode!=null &&
              this.countryAccessCode.equals(other.getCountryAccessCode()))) &&
            ((this.areaCityCode==null && other.getAreaCityCode()==null) || 
             (this.areaCityCode!=null &&
              this.areaCityCode.equals(other.getAreaCityCode()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.PIN==null && other.getPIN()==null) || 
             (this.PIN!=null &&
              this.PIN.equals(other.getPIN()))) &&
            ((this.formattedInd==null && other.getFormattedInd()==null) || 
             (this.formattedInd!=null &&
              this.formattedInd.equals(other.getFormattedInd())));
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
        if (getPhoneLocationType() != null) {
            _hashCode += getPhoneLocationType().hashCode();
        }
        if (getPhoneTechType() != null) {
            _hashCode += getPhoneTechType().hashCode();
        }
        if (getCountryAccessCode() != null) {
            _hashCode += getCountryAccessCode().hashCode();
        }
        if (getAreaCityCode() != null) {
            _hashCode += getAreaCityCode().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getPIN() != null) {
            _hashCode += getPIN().hashCode();
        }
        if (getFormattedInd() != null) {
            _hashCode += getFormattedInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephoneType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TelephoneType"));
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
        attrField.setFieldName("phoneLocationType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PhoneLocationType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("phoneTechType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PhoneTechType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("countryAccessCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CountryAccessCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("areaCityCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AreaCityCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("phoneNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PhoneNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("extension");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Extension"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to5"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("PIN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PIN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("formattedInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FormattedInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
