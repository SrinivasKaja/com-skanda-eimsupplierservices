/**
 * FareComponentTaxesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareComponentTaxesType  implements java.io.Serializable {
    /* A container for necessary data to describe one or more flight
     * segments. */
    private org.opentravel.www.OTA._2003._05.FareComponentTaxesTypeFlightSegment[] flightSegment;

    /* Any individual tax applied to the fare */
    private org.opentravel.www.OTA._2003._05.AirTaxType[] tax;

    public FareComponentTaxesType() {
    }

    public FareComponentTaxesType(
           org.opentravel.www.OTA._2003._05.FareComponentTaxesTypeFlightSegment[] flightSegment,
           org.opentravel.www.OTA._2003._05.AirTaxType[] tax) {
           this.flightSegment = flightSegment;
           this.tax = tax;
    }


    /**
     * Gets the flightSegment value for this FareComponentTaxesType.
     * 
     * @return flightSegment   * A container for necessary data to describe one or more flight
     * segments.
     */
    public org.opentravel.www.OTA._2003._05.FareComponentTaxesTypeFlightSegment[] getFlightSegment() {
        return flightSegment;
    }


    /**
     * Sets the flightSegment value for this FareComponentTaxesType.
     * 
     * @param flightSegment   * A container for necessary data to describe one or more flight
     * segments.
     */
    public void setFlightSegment(org.opentravel.www.OTA._2003._05.FareComponentTaxesTypeFlightSegment[] flightSegment) {
        this.flightSegment = flightSegment;
    }

    public org.opentravel.www.OTA._2003._05.FareComponentTaxesTypeFlightSegment getFlightSegment(int i) {
        return this.flightSegment[i];
    }

    public void setFlightSegment(int i, org.opentravel.www.OTA._2003._05.FareComponentTaxesTypeFlightSegment _value) {
        this.flightSegment[i] = _value;
    }


    /**
     * Gets the tax value for this FareComponentTaxesType.
     * 
     * @return tax   * Any individual tax applied to the fare
     */
    public org.opentravel.www.OTA._2003._05.AirTaxType[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this FareComponentTaxesType.
     * 
     * @param tax   * Any individual tax applied to the fare
     */
    public void setTax(org.opentravel.www.OTA._2003._05.AirTaxType[] tax) {
        this.tax = tax;
    }

    public org.opentravel.www.OTA._2003._05.AirTaxType getTax(int i) {
        return this.tax[i];
    }

    public void setTax(int i, org.opentravel.www.OTA._2003._05.AirTaxType _value) {
        this.tax[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareComponentTaxesType)) return false;
        FareComponentTaxesType other = (FareComponentTaxesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flightSegment==null && other.getFlightSegment()==null) || 
             (this.flightSegment!=null &&
              java.util.Arrays.equals(this.flightSegment, other.getFlightSegment()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              java.util.Arrays.equals(this.tax, other.getTax())));
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
        if (getFlightSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlightSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlightSegment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTax(), i);
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
        new org.apache.axis.description.TypeDesc(FareComponentTaxesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentTaxesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareComponentTaxesType>FlightSegment"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTaxType"));
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
