/**
 * Fare.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class Fare  extends org.opentravel.www.OTA._2003._05.FareDetailsType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.FareAdjustment adjustment;

    public Fare() {
    }

    public Fare(
           short componentNo,
           java.lang.String basisCode,
           java.math.BigDecimal amount,
           java.lang.String vendor,
           java.lang.String sourceVendor,
           java.lang.String tariff,
           java.lang.String ruleNumber,
           org.apache.axis.types.Token brandID,
           int programID,
           org.opentravel.www.OTA._2003._05.FareAdjustment adjustment) {
        super(
            componentNo,
            basisCode,
            amount,
            vendor,
            sourceVendor,
            tariff,
            ruleNumber,
            brandID,
            programID);
        this.adjustment = adjustment;
    }


    /**
     * Gets the adjustment value for this Fare.
     * 
     * @return adjustment
     */
    public org.opentravel.www.OTA._2003._05.FareAdjustment getAdjustment() {
        return adjustment;
    }


    /**
     * Sets the adjustment value for this Fare.
     * 
     * @param adjustment
     */
    public void setAdjustment(org.opentravel.www.OTA._2003._05.FareAdjustment adjustment) {
        this.adjustment = adjustment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fare)) return false;
        Fare other = (Fare) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adjustment==null && other.getAdjustment()==null) || 
             (this.adjustment!=null &&
              this.adjustment.equals(other.getAdjustment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdjustment() != null) {
            _hashCode += getAdjustment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fare.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Fare"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Adjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>Fare>Adjustment"));
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
