/**
 * SideTripType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class SideTripType  implements java.io.Serializable {
    private java.lang.Short number;  // attribute

    private java.lang.Boolean start;  // attribute

    private java.lang.Boolean end;  // attribute

    public SideTripType() {
    }

    public SideTripType(
           java.lang.Short number,
           java.lang.Boolean start,
           java.lang.Boolean end) {
           this.number = number;
           this.start = start;
           this.end = end;
    }


    /**
     * Gets the number value for this SideTripType.
     * 
     * @return number
     */
    public java.lang.Short getNumber() {
        return number;
    }


    /**
     * Sets the number value for this SideTripType.
     * 
     * @param number
     */
    public void setNumber(java.lang.Short number) {
        this.number = number;
    }


    /**
     * Gets the start value for this SideTripType.
     * 
     * @return start
     */
    public java.lang.Boolean getStart() {
        return start;
    }


    /**
     * Sets the start value for this SideTripType.
     * 
     * @param start
     */
    public void setStart(java.lang.Boolean start) {
        this.start = start;
    }


    /**
     * Gets the end value for this SideTripType.
     * 
     * @return end
     */
    public java.lang.Boolean getEnd() {
        return end;
    }


    /**
     * Sets the end value for this SideTripType.
     * 
     * @param end
     */
    public void setEnd(java.lang.Boolean end) {
        this.end = end;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SideTripType)) return false;
        SideTripType other = (SideTripType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SideTripType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SideTripType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("start");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Start"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("end");
        attrField.setXmlName(new javax.xml.namespace.QName("", "End"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
