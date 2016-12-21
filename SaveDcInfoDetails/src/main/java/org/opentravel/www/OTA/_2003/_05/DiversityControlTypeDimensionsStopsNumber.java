/**
 * DiversityControlTypeDimensionsStopsNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DiversityControlTypeDimensionsStopsNumber  implements java.io.Serializable {
    private java.math.BigInteger weight;  // attribute

    public DiversityControlTypeDimensionsStopsNumber() {
    }

    public DiversityControlTypeDimensionsStopsNumber(
           java.math.BigInteger weight) {
           this.weight = weight;
    }


    /**
     * Gets the weight value for this DiversityControlTypeDimensionsStopsNumber.
     * 
     * @return weight
     */
    public java.math.BigInteger getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this DiversityControlTypeDimensionsStopsNumber.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigInteger weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversityControlTypeDimensionsStopsNumber)) return false;
        DiversityControlTypeDimensionsStopsNumber other = (DiversityControlTypeDimensionsStopsNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight())));
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
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversityControlTypeDimensionsStopsNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>StopsNumber"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Weight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SumWeight"));
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
