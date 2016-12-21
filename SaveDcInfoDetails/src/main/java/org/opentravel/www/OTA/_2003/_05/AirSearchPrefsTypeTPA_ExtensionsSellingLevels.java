/**
 * AirSearchPrefsTypeTPA_ExtensionsSellingLevels.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsSellingLevels  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsSellingLevelRules sellingLevelRules;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts showFareAmounts;

    public AirSearchPrefsTypeTPA_ExtensionsSellingLevels() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsSellingLevels(
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsSellingLevelRules sellingLevelRules,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts showFareAmounts) {
           this.sellingLevelRules = sellingLevelRules;
           this.showFareAmounts = showFareAmounts;
    }


    /**
     * Gets the sellingLevelRules value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevels.
     * 
     * @return sellingLevelRules
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsSellingLevelRules getSellingLevelRules() {
        return sellingLevelRules;
    }


    /**
     * Sets the sellingLevelRules value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevels.
     * 
     * @param sellingLevelRules
     */
    public void setSellingLevelRules(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsSellingLevelRules sellingLevelRules) {
        this.sellingLevelRules = sellingLevelRules;
    }


    /**
     * Gets the showFareAmounts value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevels.
     * 
     * @return showFareAmounts
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts getShowFareAmounts() {
        return showFareAmounts;
    }


    /**
     * Sets the showFareAmounts value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevels.
     * 
     * @param showFareAmounts
     */
    public void setShowFareAmounts(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts showFareAmounts) {
        this.showFareAmounts = showFareAmounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsSellingLevels)) return false;
        AirSearchPrefsTypeTPA_ExtensionsSellingLevels other = (AirSearchPrefsTypeTPA_ExtensionsSellingLevels) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellingLevelRules==null && other.getSellingLevelRules()==null) || 
             (this.sellingLevelRules!=null &&
              this.sellingLevelRules.equals(other.getSellingLevelRules()))) &&
            ((this.showFareAmounts==null && other.getShowFareAmounts()==null) || 
             (this.showFareAmounts!=null &&
              this.showFareAmounts.equals(other.getShowFareAmounts())));
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
        if (getSellingLevelRules() != null) {
            _hashCode += getSellingLevelRules().hashCode();
        }
        if (getShowFareAmounts() != null) {
            _hashCode += getShowFareAmounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsSellingLevels.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SellingLevels"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellingLevelRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingLevelRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>SellingLevels>SellingLevelRules"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showFareAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ShowFareAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>SellingLevels>ShowFareAmounts"));
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
