/**
 * DiversityControlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * These parameters control how IntellSell should select itineraries
 * 				based not necessarily on cheapest price,
 * 				but also on other criteria that guarantee a diverse response.
 */
public class DiversityControlType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.DiversityControlTypeLowFareBucket lowFareBucket;

    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensions dimensions;

    public DiversityControlType() {
    }

    public DiversityControlType(
           org.opentravel.www.OTA._2003._05.DiversityControlTypeLowFareBucket lowFareBucket,
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensions dimensions) {
           this.lowFareBucket = lowFareBucket;
           this.dimensions = dimensions;
    }


    /**
     * Gets the lowFareBucket value for this DiversityControlType.
     * 
     * @return lowFareBucket
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeLowFareBucket getLowFareBucket() {
        return lowFareBucket;
    }


    /**
     * Sets the lowFareBucket value for this DiversityControlType.
     * 
     * @param lowFareBucket
     */
    public void setLowFareBucket(org.opentravel.www.OTA._2003._05.DiversityControlTypeLowFareBucket lowFareBucket) {
        this.lowFareBucket = lowFareBucket;
    }


    /**
     * Gets the dimensions value for this DiversityControlType.
     * 
     * @return dimensions
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this DiversityControlType.
     * 
     * @param dimensions
     */
    public void setDimensions(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensions dimensions) {
        this.dimensions = dimensions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversityControlType)) return false;
        DiversityControlType other = (DiversityControlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lowFareBucket==null && other.getLowFareBucket()==null) || 
             (this.lowFareBucket!=null &&
              this.lowFareBucket.equals(other.getLowFareBucket()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions())));
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
        if (getLowFareBucket() != null) {
            _hashCode += getLowFareBucket().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversityControlType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiversityControlType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowFareBucket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LowFareBucket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DiversityControlType>LowFareBucket"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DiversityControlType>Dimensions"));
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
