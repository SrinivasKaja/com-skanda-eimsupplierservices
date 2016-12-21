/**
 * DiversityControlTypeDimensionsTimeOfDayDistributionRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Either all Range elements shall contain attribute Options or none.
 * 																Ranges shall not overlap.
 */
public class DiversityControlTypeDimensionsTimeOfDayDistributionRange  implements java.io.Serializable {
    private java.lang.String begin;  // attribute

    private java.lang.String end;  // attribute

    private java.lang.String options;  // attribute

    public DiversityControlTypeDimensionsTimeOfDayDistributionRange() {
    }

    public DiversityControlTypeDimensionsTimeOfDayDistributionRange(
           java.lang.String begin,
           java.lang.String end,
           java.lang.String options) {
           this.begin = begin;
           this.end = end;
           this.options = options;
    }


    /**
     * Gets the begin value for this DiversityControlTypeDimensionsTimeOfDayDistributionRange.
     * 
     * @return begin
     */
    public java.lang.String getBegin() {
        return begin;
    }


    /**
     * Sets the begin value for this DiversityControlTypeDimensionsTimeOfDayDistributionRange.
     * 
     * @param begin
     */
    public void setBegin(java.lang.String begin) {
        this.begin = begin;
    }


    /**
     * Gets the end value for this DiversityControlTypeDimensionsTimeOfDayDistributionRange.
     * 
     * @return end
     */
    public java.lang.String getEnd() {
        return end;
    }


    /**
     * Sets the end value for this DiversityControlTypeDimensionsTimeOfDayDistributionRange.
     * 
     * @param end
     */
    public void setEnd(java.lang.String end) {
        this.end = end;
    }


    /**
     * Gets the options value for this DiversityControlTypeDimensionsTimeOfDayDistributionRange.
     * 
     * @return options
     */
    public java.lang.String getOptions() {
        return options;
    }


    /**
     * Sets the options value for this DiversityControlTypeDimensionsTimeOfDayDistributionRange.
     * 
     * @param options
     */
    public void setOptions(java.lang.String options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversityControlTypeDimensionsTimeOfDayDistributionRange)) return false;
        DiversityControlTypeDimensionsTimeOfDayDistributionRange other = (DiversityControlTypeDimensionsTimeOfDayDistributionRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.begin==null && other.getBegin()==null) || 
             (this.begin!=null &&
              this.begin.equals(other.getBegin()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getBegin() != null) {
            _hashCode += getBegin().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversityControlTypeDimensionsTimeOfDayDistributionRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>DiversityControlType>Dimensions>TimeOfDay>Distribution>Range"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("begin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Begin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HH_MM"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("end");
        attrField.setXmlName(new javax.xml.namespace.QName("", "End"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HH_MM"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("options");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Options"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountOrPercentage"));
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
