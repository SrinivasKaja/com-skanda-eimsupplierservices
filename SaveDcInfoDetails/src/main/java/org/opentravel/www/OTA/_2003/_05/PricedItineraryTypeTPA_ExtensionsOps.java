/**
 * PricedItineraryTypeTPA_ExtensionsOps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PricedItineraryTypeTPA_ExtensionsOps  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOpsFareTypesFareType[] fareTypes;

    private org.apache.axis.types.NonNegativeInteger actionCode;  // attribute

    public PricedItineraryTypeTPA_ExtensionsOps() {
    }

    public PricedItineraryTypeTPA_ExtensionsOps(
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOpsFareTypesFareType[] fareTypes,
           org.apache.axis.types.NonNegativeInteger actionCode) {
           this.fareTypes = fareTypes;
           this.actionCode = actionCode;
    }


    /**
     * Gets the fareTypes value for this PricedItineraryTypeTPA_ExtensionsOps.
     * 
     * @return fareTypes
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOpsFareTypesFareType[] getFareTypes() {
        return fareTypes;
    }


    /**
     * Sets the fareTypes value for this PricedItineraryTypeTPA_ExtensionsOps.
     * 
     * @param fareTypes
     */
    public void setFareTypes(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOpsFareTypesFareType[] fareTypes) {
        this.fareTypes = fareTypes;
    }


    /**
     * Gets the actionCode value for this PricedItineraryTypeTPA_ExtensionsOps.
     * 
     * @return actionCode
     */
    public org.apache.axis.types.NonNegativeInteger getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this PricedItineraryTypeTPA_ExtensionsOps.
     * 
     * @param actionCode
     */
    public void setActionCode(org.apache.axis.types.NonNegativeInteger actionCode) {
        this.actionCode = actionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricedItineraryTypeTPA_ExtensionsOps)) return false;
        PricedItineraryTypeTPA_ExtensionsOps other = (PricedItineraryTypeTPA_ExtensionsOps) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fareTypes==null && other.getFareTypes()==null) || 
             (this.fareTypes!=null &&
              java.util.Arrays.equals(this.fareTypes, other.getFareTypes()))) &&
            ((this.actionCode==null && other.getActionCode()==null) || 
             (this.actionCode!=null &&
              this.actionCode.equals(other.getActionCode())));
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
        if (getFareTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActionCode() != null) {
            _hashCode += getActionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricedItineraryTypeTPA_ExtensionsOps.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>Ops"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actionCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ActionCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PricedItineraryType>TPA_Extensions>Ops>FareTypes>FareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareType"));
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
