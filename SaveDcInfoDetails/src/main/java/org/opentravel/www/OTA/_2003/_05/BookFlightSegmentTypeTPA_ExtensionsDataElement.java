/**
 * BookFlightSegmentTypeTPA_ExtensionsDataElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class BookFlightSegmentTypeTPA_ExtensionsDataElement  implements java.io.Serializable {
    private java.lang.Boolean subjectToGovernmentApproval;  // attribute

    public BookFlightSegmentTypeTPA_ExtensionsDataElement() {
    }

    public BookFlightSegmentTypeTPA_ExtensionsDataElement(
           java.lang.Boolean subjectToGovernmentApproval) {
           this.subjectToGovernmentApproval = subjectToGovernmentApproval;
    }


    /**
     * Gets the subjectToGovernmentApproval value for this BookFlightSegmentTypeTPA_ExtensionsDataElement.
     * 
     * @return subjectToGovernmentApproval
     */
    public java.lang.Boolean getSubjectToGovernmentApproval() {
        return subjectToGovernmentApproval;
    }


    /**
     * Sets the subjectToGovernmentApproval value for this BookFlightSegmentTypeTPA_ExtensionsDataElement.
     * 
     * @param subjectToGovernmentApproval
     */
    public void setSubjectToGovernmentApproval(java.lang.Boolean subjectToGovernmentApproval) {
        this.subjectToGovernmentApproval = subjectToGovernmentApproval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookFlightSegmentTypeTPA_ExtensionsDataElement)) return false;
        BookFlightSegmentTypeTPA_ExtensionsDataElement other = (BookFlightSegmentTypeTPA_ExtensionsDataElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subjectToGovernmentApproval==null && other.getSubjectToGovernmentApproval()==null) || 
             (this.subjectToGovernmentApproval!=null &&
              this.subjectToGovernmentApproval.equals(other.getSubjectToGovernmentApproval())));
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
        if (getSubjectToGovernmentApproval() != null) {
            _hashCode += getSubjectToGovernmentApproval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookFlightSegmentTypeTPA_ExtensionsDataElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>TPA_Extensions>DataElement"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("subjectToGovernmentApproval");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SubjectToGovernmentApproval"));
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
