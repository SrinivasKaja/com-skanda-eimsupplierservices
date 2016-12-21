/**
 * CompanyNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Identifies a company by name.
 */
public class CompanyNameType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String companyShortName;  // attribute

    private java.lang.String travelSector;  // attribute

    private java.lang.String code;  // attribute

    private java.lang.String codeContext;  // attribute

    public CompanyNameType() {
    }

    // Simple Types must have a String constructor
    public CompanyNameType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this CompanyNameType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this CompanyNameType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the companyShortName value for this CompanyNameType.
     * 
     * @return companyShortName
     */
    public java.lang.String getCompanyShortName() {
        return companyShortName;
    }


    /**
     * Sets the companyShortName value for this CompanyNameType.
     * 
     * @param companyShortName
     */
    public void setCompanyShortName(java.lang.String companyShortName) {
        this.companyShortName = companyShortName;
    }


    /**
     * Gets the travelSector value for this CompanyNameType.
     * 
     * @return travelSector
     */
    public java.lang.String getTravelSector() {
        return travelSector;
    }


    /**
     * Sets the travelSector value for this CompanyNameType.
     * 
     * @param travelSector
     */
    public void setTravelSector(java.lang.String travelSector) {
        this.travelSector = travelSector;
    }


    /**
     * Gets the code value for this CompanyNameType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this CompanyNameType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the codeContext value for this CompanyNameType.
     * 
     * @return codeContext
     */
    public java.lang.String getCodeContext() {
        return codeContext;
    }


    /**
     * Sets the codeContext value for this CompanyNameType.
     * 
     * @param codeContext
     */
    public void setCodeContext(java.lang.String codeContext) {
        this.codeContext = codeContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyNameType)) return false;
        CompanyNameType other = (CompanyNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.companyShortName==null && other.getCompanyShortName()==null) || 
             (this.companyShortName!=null &&
              this.companyShortName.equals(other.getCompanyShortName()))) &&
            ((this.travelSector==null && other.getTravelSector()==null) || 
             (this.travelSector!=null &&
              this.travelSector.equals(other.getTravelSector()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codeContext==null && other.getCodeContext()==null) || 
             (this.codeContext!=null &&
              this.codeContext.equals(other.getCodeContext())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getCompanyShortName() != null) {
            _hashCode += getCompanyShortName().hashCode();
        }
        if (getTravelSector() != null) {
            _hashCode += getTravelSector().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodeContext() != null) {
            _hashCode += getCodeContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("companyShortName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CompanyShortName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("travelSector");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TravelSector"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codeContext");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CodeContext"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
