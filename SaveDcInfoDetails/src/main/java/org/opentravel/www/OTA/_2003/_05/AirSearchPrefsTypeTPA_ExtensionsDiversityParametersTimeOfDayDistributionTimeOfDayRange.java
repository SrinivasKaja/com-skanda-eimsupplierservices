/**
 * AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange  implements java.io.Serializable {
    private java.lang.String begin;  // attribute

    private java.lang.String end;  // attribute

    private org.apache.axis.types.UnsignedShort percentage;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange(
           java.lang.String begin,
           java.lang.String end,
           org.apache.axis.types.UnsignedShort percentage) {
           this.begin = begin;
           this.end = end;
           this.percentage = percentage;
    }


    /**
     * Gets the begin value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.
     * 
     * @return begin
     */
    public java.lang.String getBegin() {
        return begin;
    }


    /**
     * Sets the begin value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.
     * 
     * @param begin
     */
    public void setBegin(java.lang.String begin) {
        this.begin = begin;
    }


    /**
     * Gets the end value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.
     * 
     * @return end
     */
    public java.lang.String getEnd() {
        return end;
    }


    /**
     * Sets the end value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.
     * 
     * @param end
     */
    public void setEnd(java.lang.String end) {
        this.end = end;
    }


    /**
     * Gets the percentage value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.
     * 
     * @return percentage
     */
    public org.apache.axis.types.UnsignedShort getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.
     * 
     * @param percentage
     */
    public void setPercentage(org.apache.axis.types.UnsignedShort percentage) {
        this.percentage = percentage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange)) return false;
        AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange other = (AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange) obj;
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
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage())));
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
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>TimeOfDayDistribution>TimeOfDayRange"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("begin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Begin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowBoundaryType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("end");
        attrField.setXmlName(new javax.xml.namespace.QName("", "End"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowBoundaryType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("percentage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Percentage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PercentageType"));
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
