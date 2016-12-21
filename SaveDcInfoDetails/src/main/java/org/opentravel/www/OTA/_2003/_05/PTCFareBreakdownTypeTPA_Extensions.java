/**
 * PTCFareBreakdownTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PTCFareBreakdownTypeTPA_Extensions  implements java.io.Serializable {
    /* Fare calculation line. */
    private org.opentravel.www.OTA._2003._05.FareCalcLineType fareCalcLine;

    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_ExtensionsFareType fareType;

    public PTCFareBreakdownTypeTPA_Extensions() {
    }

    public PTCFareBreakdownTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.FareCalcLineType fareCalcLine,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_ExtensionsFareType fareType) {
           this.fareCalcLine = fareCalcLine;
           this.fareType = fareType;
    }


    /**
     * Gets the fareCalcLine value for this PTCFareBreakdownTypeTPA_Extensions.
     * 
     * @return fareCalcLine   * Fare calculation line.
     */
    public org.opentravel.www.OTA._2003._05.FareCalcLineType getFareCalcLine() {
        return fareCalcLine;
    }


    /**
     * Sets the fareCalcLine value for this PTCFareBreakdownTypeTPA_Extensions.
     * 
     * @param fareCalcLine   * Fare calculation line.
     */
    public void setFareCalcLine(org.opentravel.www.OTA._2003._05.FareCalcLineType fareCalcLine) {
        this.fareCalcLine = fareCalcLine;
    }


    /**
     * Gets the fareType value for this PTCFareBreakdownTypeTPA_Extensions.
     * 
     * @return fareType
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_ExtensionsFareType getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this PTCFareBreakdownTypeTPA_Extensions.
     * 
     * @param fareType
     */
    public void setFareType(org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_ExtensionsFareType fareType) {
        this.fareType = fareType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PTCFareBreakdownTypeTPA_Extensions)) return false;
        PTCFareBreakdownTypeTPA_Extensions other = (PTCFareBreakdownTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fareCalcLine==null && other.getFareCalcLine()==null) || 
             (this.fareCalcLine!=null &&
              this.fareCalcLine.equals(other.getFareCalcLine()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              this.fareType.equals(other.getFareType())));
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
        if (getFareCalcLine() != null) {
            _hashCode += getFareCalcLine().hashCode();
        }
        if (getFareType() != null) {
            _hashCode += getFareType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PTCFareBreakdownTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareCalcLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareCalcLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareCalcLineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>TPA_Extensions>FareType"));
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
