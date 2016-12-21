/**
 * TravelerCountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Defines the number of travelers of a specific type (e.g. a driver
 * type can be either one of: Adult, YoungDriver, YoungerDriver, or it
 * may be a code that is acceptable to both Trading Partners).
 */
public class TravelerCountType  implements java.io.Serializable {
    private java.math.BigInteger age;  // attribute

    private org.opentravel.www.OTA._2003._05.TravelerCountTypeCode code;  // attribute

    private java.lang.String codeContext;  // attribute

    private org.apache.axis.types.URI URI;  // attribute

    private java.math.BigInteger quantity;  // attribute

    public TravelerCountType() {
    }

    public TravelerCountType(
           java.math.BigInteger age,
           org.opentravel.www.OTA._2003._05.TravelerCountTypeCode code,
           java.lang.String codeContext,
           org.apache.axis.types.URI URI,
           java.math.BigInteger quantity) {
           this.age = age;
           this.code = code;
           this.codeContext = codeContext;
           this.URI = URI;
           this.quantity = quantity;
    }


    /**
     * Gets the age value for this TravelerCountType.
     * 
     * @return age
     */
    public java.math.BigInteger getAge() {
        return age;
    }


    /**
     * Sets the age value for this TravelerCountType.
     * 
     * @param age
     */
    public void setAge(java.math.BigInteger age) {
        this.age = age;
    }


    /**
     * Gets the code value for this TravelerCountType.
     * 
     * @return code
     */
    public org.opentravel.www.OTA._2003._05.TravelerCountTypeCode getCode() {
        return code;
    }


    /**
     * Sets the code value for this TravelerCountType.
     * 
     * @param code
     */
    public void setCode(org.opentravel.www.OTA._2003._05.TravelerCountTypeCode code) {
        this.code = code;
    }


    /**
     * Gets the codeContext value for this TravelerCountType.
     * 
     * @return codeContext
     */
    public java.lang.String getCodeContext() {
        return codeContext;
    }


    /**
     * Sets the codeContext value for this TravelerCountType.
     * 
     * @param codeContext
     */
    public void setCodeContext(java.lang.String codeContext) {
        this.codeContext = codeContext;
    }


    /**
     * Gets the URI value for this TravelerCountType.
     * 
     * @return URI
     */
    public org.apache.axis.types.URI getURI() {
        return URI;
    }


    /**
     * Sets the URI value for this TravelerCountType.
     * 
     * @param URI
     */
    public void setURI(org.apache.axis.types.URI URI) {
        this.URI = URI;
    }


    /**
     * Gets the quantity value for this TravelerCountType.
     * 
     * @return quantity
     */
    public java.math.BigInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TravelerCountType.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigInteger quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerCountType)) return false;
        TravelerCountType other = (TravelerCountType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codeContext==null && other.getCodeContext()==null) || 
             (this.codeContext!=null &&
              this.codeContext.equals(other.getCodeContext()))) &&
            ((this.URI==null && other.getURI()==null) || 
             (this.URI!=null &&
              this.URI.equals(other.getURI()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity())));
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
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodeContext() != null) {
            _hashCode += getCodeContext().hashCode();
        }
        if (getURI() != null) {
            _hashCode += getURI().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerCountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerCountType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("age");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Age"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to999"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelerCountType>Code"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codeContext");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CodeContext"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("URI");
        attrField.setXmlName(new javax.xml.namespace.QName("", "URI"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("quantity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric1to999"));
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
