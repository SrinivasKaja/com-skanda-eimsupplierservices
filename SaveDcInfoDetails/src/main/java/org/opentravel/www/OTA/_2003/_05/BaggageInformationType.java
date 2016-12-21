/**
 * BaggageInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Information about baggage
 */
public class BaggageInformationType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.BaggageInformationTypeSegment[] segment;

    private org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowance allowance;

    public BaggageInformationType() {
    }

    public BaggageInformationType(
           org.opentravel.www.OTA._2003._05.BaggageInformationTypeSegment[] segment,
           org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowance allowance) {
           this.segment = segment;
           this.allowance = allowance;
    }


    /**
     * Gets the segment value for this BaggageInformationType.
     * 
     * @return segment
     */
    public org.opentravel.www.OTA._2003._05.BaggageInformationTypeSegment[] getSegment() {
        return segment;
    }


    /**
     * Sets the segment value for this BaggageInformationType.
     * 
     * @param segment
     */
    public void setSegment(org.opentravel.www.OTA._2003._05.BaggageInformationTypeSegment[] segment) {
        this.segment = segment;
    }

    public org.opentravel.www.OTA._2003._05.BaggageInformationTypeSegment getSegment(int i) {
        return this.segment[i];
    }

    public void setSegment(int i, org.opentravel.www.OTA._2003._05.BaggageInformationTypeSegment _value) {
        this.segment[i] = _value;
    }


    /**
     * Gets the allowance value for this BaggageInformationType.
     * 
     * @return allowance
     */
    public org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowance getAllowance() {
        return allowance;
    }


    /**
     * Sets the allowance value for this BaggageInformationType.
     * 
     * @param allowance
     */
    public void setAllowance(org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowance allowance) {
        this.allowance = allowance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaggageInformationType)) return false;
        BaggageInformationType other = (BaggageInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.segment==null && other.getSegment()==null) || 
             (this.segment!=null &&
              java.util.Arrays.equals(this.segment, other.getSegment()))) &&
            ((this.allowance==null && other.getAllowance()==null) || 
             (this.allowance!=null &&
              this.allowance.equals(other.getAllowance())));
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
        if (getSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowance() != null) {
            _hashCode += getAllowance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaggageInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BaggageInformationType>Segment"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Allowance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BaggageInformationType>Allowance"));
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
