/**
 * ComplexProcessingMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ComplexProcessingMessageType  extends org.opentravel.www.OTA._2003._05.ProcessingMessageType  implements java.io.Serializable {
    /* Optional list of departure dates for each leg */
    private org.opentravel.www.OTA._2003._05.ComplexProcessingMessageTypeLeg[] leg;

    public ComplexProcessingMessageType() {
    }

    public ComplexProcessingMessageType(
           java.lang.String pricingSource,
           java.lang.String message,
           org.opentravel.www.OTA._2003._05.ComplexProcessingMessageTypeLeg[] leg) {
        super(
            pricingSource,
            message);
        this.leg = leg;
    }


    /**
     * Gets the leg value for this ComplexProcessingMessageType.
     * 
     * @return leg   * Optional list of departure dates for each leg
     */
    public org.opentravel.www.OTA._2003._05.ComplexProcessingMessageTypeLeg[] getLeg() {
        return leg;
    }


    /**
     * Sets the leg value for this ComplexProcessingMessageType.
     * 
     * @param leg   * Optional list of departure dates for each leg
     */
    public void setLeg(org.opentravel.www.OTA._2003._05.ComplexProcessingMessageTypeLeg[] leg) {
        this.leg = leg;
    }

    public org.opentravel.www.OTA._2003._05.ComplexProcessingMessageTypeLeg getLeg(int i) {
        return this.leg[i];
    }

    public void setLeg(int i, org.opentravel.www.OTA._2003._05.ComplexProcessingMessageTypeLeg _value) {
        this.leg[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplexProcessingMessageType)) return false;
        ComplexProcessingMessageType other = (ComplexProcessingMessageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.leg==null && other.getLeg()==null) || 
             (this.leg!=null &&
              java.util.Arrays.equals(this.leg, other.getLeg())));
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
        if (getLeg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeg(), i);
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
        new org.apache.axis.description.TypeDesc(ComplexProcessingMessageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ComplexProcessingMessageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Leg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ComplexProcessingMessageType>Leg"));
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
