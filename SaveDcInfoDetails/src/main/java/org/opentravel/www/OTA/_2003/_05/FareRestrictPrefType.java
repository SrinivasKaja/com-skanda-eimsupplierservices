/**
 * FareRestrictPrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Identifies preferences for airfare restrictions acceptable or not
 * acceptable for a given travel situation.
 */
public class FareRestrictPrefType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel;  // attribute

    private java.lang.String fareRestriction;  // attribute

    public FareRestrictPrefType() {
    }

    public FareRestrictPrefType(
           org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel,
           java.lang.String fareRestriction) {
           this.preferLevel = preferLevel;
           this.fareRestriction = fareRestriction;
    }


    /**
     * Gets the preferLevel value for this FareRestrictPrefType.
     * 
     * @return preferLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferLevel() {
        return preferLevel;
    }


    /**
     * Sets the preferLevel value for this FareRestrictPrefType.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }


    /**
     * Gets the fareRestriction value for this FareRestrictPrefType.
     * 
     * @return fareRestriction
     */
    public java.lang.String getFareRestriction() {
        return fareRestriction;
    }


    /**
     * Sets the fareRestriction value for this FareRestrictPrefType.
     * 
     * @param fareRestriction
     */
    public void setFareRestriction(java.lang.String fareRestriction) {
        this.fareRestriction = fareRestriction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareRestrictPrefType)) return false;
        FareRestrictPrefType other = (FareRestrictPrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.preferLevel==null && other.getPreferLevel()==null) || 
             (this.preferLevel!=null &&
              this.preferLevel.equals(other.getPreferLevel()))) &&
            ((this.fareRestriction==null && other.getFareRestriction()==null) || 
             (this.fareRestriction!=null &&
              this.fareRestriction.equals(other.getFareRestriction())));
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
        if (getPreferLevel() != null) {
            _hashCode += getPreferLevel().hashCode();
        }
        if (getFareRestriction() != null) {
            _hashCode += getFareRestriction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareRestrictPrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareRestrictPrefType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preferLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreferLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareRestriction");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareRestriction"));
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
