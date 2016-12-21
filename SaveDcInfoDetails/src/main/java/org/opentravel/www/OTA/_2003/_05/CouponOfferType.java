/**
 * CouponOfferType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Not used.
 */
public class CouponOfferType  implements java.io.Serializable {
    private java.lang.Object promo_id;  // attribute

    private java.lang.Object corp_id;  // attribute

    private java.lang.Object headline;  // attribute

    private java.lang.Object discount_pctg;  // attribute

    public CouponOfferType() {
    }

    public CouponOfferType(
           java.lang.Object promo_id,
           java.lang.Object corp_id,
           java.lang.Object headline,
           java.lang.Object discount_pctg) {
           this.promo_id = promo_id;
           this.corp_id = corp_id;
           this.headline = headline;
           this.discount_pctg = discount_pctg;
    }


    /**
     * Gets the promo_id value for this CouponOfferType.
     * 
     * @return promo_id
     */
    public java.lang.Object getPromo_id() {
        return promo_id;
    }


    /**
     * Sets the promo_id value for this CouponOfferType.
     * 
     * @param promo_id
     */
    public void setPromo_id(java.lang.Object promo_id) {
        this.promo_id = promo_id;
    }


    /**
     * Gets the corp_id value for this CouponOfferType.
     * 
     * @return corp_id
     */
    public java.lang.Object getCorp_id() {
        return corp_id;
    }


    /**
     * Sets the corp_id value for this CouponOfferType.
     * 
     * @param corp_id
     */
    public void setCorp_id(java.lang.Object corp_id) {
        this.corp_id = corp_id;
    }


    /**
     * Gets the headline value for this CouponOfferType.
     * 
     * @return headline
     */
    public java.lang.Object getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this CouponOfferType.
     * 
     * @param headline
     */
    public void setHeadline(java.lang.Object headline) {
        this.headline = headline;
    }


    /**
     * Gets the discount_pctg value for this CouponOfferType.
     * 
     * @return discount_pctg
     */
    public java.lang.Object getDiscount_pctg() {
        return discount_pctg;
    }


    /**
     * Sets the discount_pctg value for this CouponOfferType.
     * 
     * @param discount_pctg
     */
    public void setDiscount_pctg(java.lang.Object discount_pctg) {
        this.discount_pctg = discount_pctg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CouponOfferType)) return false;
        CouponOfferType other = (CouponOfferType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promo_id==null && other.getPromo_id()==null) || 
             (this.promo_id!=null &&
              this.promo_id.equals(other.getPromo_id()))) &&
            ((this.corp_id==null && other.getCorp_id()==null) || 
             (this.corp_id!=null &&
              this.corp_id.equals(other.getCorp_id()))) &&
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.discount_pctg==null && other.getDiscount_pctg()==null) || 
             (this.discount_pctg!=null &&
              this.discount_pctg.equals(other.getDiscount_pctg())));
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
        if (getPromo_id() != null) {
            _hashCode += getPromo_id().hashCode();
        }
        if (getCorp_id() != null) {
            _hashCode += getCorp_id().hashCode();
        }
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getDiscount_pctg() != null) {
            _hashCode += getDiscount_pctg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CouponOfferType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CouponOfferType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("promo_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "promo_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("corp_id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "corp_id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("headline");
        attrField.setXmlName(new javax.xml.namespace.QName("", "headline"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("discount_pctg");
        attrField.setXmlName(new javax.xml.namespace.QName("", "discount_pctg"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
