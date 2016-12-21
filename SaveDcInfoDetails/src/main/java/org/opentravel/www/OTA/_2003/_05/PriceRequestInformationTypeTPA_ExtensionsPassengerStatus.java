/**
 * PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsPassengerStatus  implements java.io.Serializable {
    private java.lang.String stateCode;

    private java.lang.String countryCode;

    private java.lang.String cityCode;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatusType type;  // attribute

    public PriceRequestInformationTypeTPA_ExtensionsPassengerStatus() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsPassengerStatus(
           java.lang.String stateCode,
           java.lang.String countryCode,
           java.lang.String cityCode,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatusType type) {
           this.stateCode = stateCode;
           this.countryCode = countryCode;
           this.cityCode = cityCode;
           this.type = type;
    }


    /**
     * Gets the stateCode value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @return stateCode
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @param stateCode
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the countryCode value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the cityCode value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the type value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @return type
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatusType getType() {
        return type;
    }


    /**
     * Sets the type value for this PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.
     * 
     * @param type
     */
    public void setType(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatusType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsPassengerStatus)) return false;
        PriceRequestInformationTypeTPA_ExtensionsPassengerStatus other = (PriceRequestInformationTypeTPA_ExtensionsPassengerStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsPassengerStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PassengerStatus"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>PassengerStatus>Type"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CityCode"));
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
