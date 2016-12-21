/**
 * OTA_AirLowFareSearchRSTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRSTPA_Extensions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder[] airlineOrderList;

    public OTA_AirLowFareSearchRSTPA_Extensions() {
    }

    public OTA_AirLowFareSearchRSTPA_Extensions(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder[] airlineOrderList) {
           this.airlineOrderList = airlineOrderList;
    }


    /**
     * Gets the airlineOrderList value for this OTA_AirLowFareSearchRSTPA_Extensions.
     * 
     * @return airlineOrderList
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder[] getAirlineOrderList() {
        return airlineOrderList;
    }


    /**
     * Sets the airlineOrderList value for this OTA_AirLowFareSearchRSTPA_Extensions.
     * 
     * @param airlineOrderList
     */
    public void setAirlineOrderList(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder[] airlineOrderList) {
        this.airlineOrderList = airlineOrderList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRSTPA_Extensions)) return false;
        OTA_AirLowFareSearchRSTPA_Extensions other = (OTA_AirLowFareSearchRSTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlineOrderList==null && other.getAirlineOrderList()==null) || 
             (this.airlineOrderList!=null &&
              java.util.Arrays.equals(this.airlineOrderList, other.getAirlineOrderList())));
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
        if (getAirlineOrderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAirlineOrderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAirlineOrderList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRSTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineOrderList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineOrderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>TPA_Extensions>AirlineOrderList>AirlineOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineOrder"));
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
