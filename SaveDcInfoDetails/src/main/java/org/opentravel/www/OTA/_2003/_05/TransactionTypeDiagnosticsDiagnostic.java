/**
 * TransactionTypeDiagnosticsDiagnostic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TransactionTypeDiagnosticsDiagnostic  implements java.io.Serializable {
    /* Name-value pairs to be used as arguments for the diagnostic. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnosticDiagnosticArgument[] diagnosticArgument;

    /* This is a place holder for additional elements. */
    private java.lang.String TPA_Extensions;

    private java.lang.String target;  // attribute

    private java.lang.String code;  // attribute

    public TransactionTypeDiagnosticsDiagnostic() {
    }

    public TransactionTypeDiagnosticsDiagnostic(
           org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnosticDiagnosticArgument[] diagnosticArgument,
           java.lang.String TPA_Extensions,
           java.lang.String target,
           java.lang.String code) {
           this.diagnosticArgument = diagnosticArgument;
           this.TPA_Extensions = TPA_Extensions;
           this.target = target;
           this.code = code;
    }


    /**
     * Gets the diagnosticArgument value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @return diagnosticArgument   * Name-value pairs to be used as arguments for the diagnostic.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnosticDiagnosticArgument[] getDiagnosticArgument() {
        return diagnosticArgument;
    }


    /**
     * Sets the diagnosticArgument value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @param diagnosticArgument   * Name-value pairs to be used as arguments for the diagnostic.
     */
    public void setDiagnosticArgument(org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnosticDiagnosticArgument[] diagnosticArgument) {
        this.diagnosticArgument = diagnosticArgument;
    }

    public org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnosticDiagnosticArgument getDiagnosticArgument(int i) {
        return this.diagnosticArgument[i];
    }

    public void setDiagnosticArgument(int i, org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnosticDiagnosticArgument _value) {
        this.diagnosticArgument[i] = _value;
    }


    /**
     * Gets the TPA_Extensions value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @return TPA_Extensions   * This is a place holder for additional elements.
     */
    public java.lang.String getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @param TPA_Extensions   * This is a place holder for additional elements.
     */
    public void setTPA_Extensions(java.lang.String TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the target value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the code value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this TransactionTypeDiagnosticsDiagnostic.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionTypeDiagnosticsDiagnostic)) return false;
        TransactionTypeDiagnosticsDiagnostic other = (TransactionTypeDiagnosticsDiagnostic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.diagnosticArgument==null && other.getDiagnosticArgument()==null) || 
             (this.diagnosticArgument!=null &&
              java.util.Arrays.equals(this.diagnosticArgument, other.getDiagnosticArgument()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode())));
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
        if (getDiagnosticArgument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnosticArgument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnosticArgument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionTypeDiagnosticsDiagnostic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>Diagnostics>Diagnostic"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("target");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Target"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiagnosticName"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticArgument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiagnosticArgument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>TransactionType>Diagnostics>Diagnostic>DiagnosticArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
