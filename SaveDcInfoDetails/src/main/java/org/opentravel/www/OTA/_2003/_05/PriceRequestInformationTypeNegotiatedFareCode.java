/**
 * PriceRequestInformationTypeNegotiatedFareCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeNegotiatedFareCode  implements java.io.Serializable, org.apache.axis.encoding.MixedContentType {
    /* This element indicates the supplier associated with a negotiated
     * fare code. */
    private org.opentravel.www.OTA._2003._05.CompanyNameType[] supplier;

    /* This is a place holder for additional elements. */
    private java.lang.String TPA_Extensions;

    private org.apache.axis.message.MessageElement [] _any;  // attribute

    private java.lang.String code;  // attribute

    private java.lang.String codeContext;  // attribute

    private org.apache.axis.types.URI URI;  // attribute

    private java.math.BigInteger quantity;  // attribute

    private java.lang.String secondaryCode;  // attribute

    private java.lang.String supplierCode;  // attribute

    public PriceRequestInformationTypeNegotiatedFareCode() {
    }

    public PriceRequestInformationTypeNegotiatedFareCode(
           org.opentravel.www.OTA._2003._05.CompanyNameType[] supplier,
           java.lang.String TPA_Extensions,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String code,
           java.lang.String codeContext,
           org.apache.axis.types.URI URI,
           java.math.BigInteger quantity,
           java.lang.String secondaryCode,
           java.lang.String supplierCode) {
           this.supplier = supplier;
           this.TPA_Extensions = TPA_Extensions;
           this._any = _any;
           this.code = code;
           this.codeContext = codeContext;
           this.URI = URI;
           this.quantity = quantity;
           this.secondaryCode = secondaryCode;
           this.supplierCode = supplierCode;
    }


    /**
     * Gets the supplier value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return supplier   * This element indicates the supplier associated with a negotiated
     * fare code.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNameType[] getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param supplier   * This element indicates the supplier associated with a negotiated
     * fare code.
     */
    public void setSupplier(org.opentravel.www.OTA._2003._05.CompanyNameType[] supplier) {
        this.supplier = supplier;
    }

    public org.opentravel.www.OTA._2003._05.CompanyNameType getSupplier(int i) {
        return this.supplier[i];
    }

    public void setSupplier(int i, org.opentravel.www.OTA._2003._05.CompanyNameType _value) {
        this.supplier[i] = _value;
    }


    /**
     * Gets the TPA_Extensions value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return TPA_Extensions   * This is a place holder for additional elements.
     */
    public java.lang.String getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param TPA_Extensions   * This is a place holder for additional elements.
     */
    public void setTPA_Extensions(java.lang.String TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the _any value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the code value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the codeContext value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return codeContext
     */
    public java.lang.String getCodeContext() {
        return codeContext;
    }


    /**
     * Sets the codeContext value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param codeContext
     */
    public void setCodeContext(java.lang.String codeContext) {
        this.codeContext = codeContext;
    }


    /**
     * Gets the URI value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return URI
     */
    public org.apache.axis.types.URI getURI() {
        return URI;
    }


    /**
     * Sets the URI value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param URI
     */
    public void setURI(org.apache.axis.types.URI URI) {
        this.URI = URI;
    }


    /**
     * Gets the quantity value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return quantity
     */
    public java.math.BigInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigInteger quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the secondaryCode value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return secondaryCode
     */
    public java.lang.String getSecondaryCode() {
        return secondaryCode;
    }


    /**
     * Sets the secondaryCode value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param secondaryCode
     */
    public void setSecondaryCode(java.lang.String secondaryCode) {
        this.secondaryCode = secondaryCode;
    }


    /**
     * Gets the supplierCode value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @return supplierCode
     */
    public java.lang.String getSupplierCode() {
        return supplierCode;
    }


    /**
     * Sets the supplierCode value for this PriceRequestInformationTypeNegotiatedFareCode.
     * 
     * @param supplierCode
     */
    public void setSupplierCode(java.lang.String supplierCode) {
        this.supplierCode = supplierCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeNegotiatedFareCode)) return false;
        PriceRequestInformationTypeNegotiatedFareCode other = (PriceRequestInformationTypeNegotiatedFareCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              java.util.Arrays.equals(this.supplier, other.getSupplier()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
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
              this.quantity.equals(other.getQuantity()))) &&
            ((this.secondaryCode==null && other.getSecondaryCode()==null) || 
             (this.secondaryCode!=null &&
              this.secondaryCode.equals(other.getSecondaryCode()))) &&
            ((this.supplierCode==null && other.getSupplierCode()==null) || 
             (this.supplierCode!=null &&
              this.supplierCode.equals(other.getSupplierCode())));
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
        if (getSupplier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupplier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupplier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getSecondaryCode() != null) {
            _hashCode += getSecondaryCode().hashCode();
        }
        if (getSupplierCode() != null) {
            _hashCode += getSupplierCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeNegotiatedFareCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>NegotiatedFareCode"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CorporateIDType"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("secondaryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SecondaryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("supplierCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SupplierCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType"));
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
