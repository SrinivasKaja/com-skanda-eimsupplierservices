/**
 * AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer  implements java.io.Serializable {
    private java.lang.String promoID;  // attribute

    private java.lang.String corpID;  // attribute

    private java.lang.String contentID;  // attribute

    public AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer() {
    }

    public AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer(
           java.lang.String promoID,
           java.lang.String corpID,
           java.lang.String contentID) {
           this.promoID = promoID;
           this.corpID = corpID;
           this.contentID = contentID;
    }


    /**
     * Gets the promoID value for this AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.
     * 
     * @return promoID
     */
    public java.lang.String getPromoID() {
        return promoID;
    }


    /**
     * Sets the promoID value for this AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.
     * 
     * @param promoID
     */
    public void setPromoID(java.lang.String promoID) {
        this.promoID = promoID;
    }


    /**
     * Gets the corpID value for this AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.
     * 
     * @return corpID
     */
    public java.lang.String getCorpID() {
        return corpID;
    }


    /**
     * Sets the corpID value for this AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.
     * 
     * @param corpID
     */
    public void setCorpID(java.lang.String corpID) {
        this.corpID = corpID;
    }


    /**
     * Gets the contentID value for this AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.
     * 
     * @return contentID
     */
    public java.lang.String getContentID() {
        return contentID;
    }


    /**
     * Sets the contentID value for this AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.
     * 
     * @param contentID
     */
    public void setContentID(java.lang.String contentID) {
        this.contentID = contentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer)) return false;
        AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer other = (AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promoID==null && other.getPromoID()==null) || 
             (this.promoID!=null &&
              this.promoID.equals(other.getPromoID()))) &&
            ((this.corpID==null && other.getCorpID()==null) || 
             (this.corpID!=null &&
              this.corpID.equals(other.getCorpID()))) &&
            ((this.contentID==null && other.getContentID()==null) || 
             (this.contentID!=null &&
              this.contentID.equals(other.getContentID())));
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
        if (getPromoID() != null) {
            _hashCode += getPromoID().hashCode();
        }
        if (getCorpID() != null) {
            _hashCode += getCorpID().hashCode();
        }
        if (getContentID() != null) {
            _hashCode += getContentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>PromoOffer"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("promoID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PromoID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("corpID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CorpID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contentID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ContentID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
