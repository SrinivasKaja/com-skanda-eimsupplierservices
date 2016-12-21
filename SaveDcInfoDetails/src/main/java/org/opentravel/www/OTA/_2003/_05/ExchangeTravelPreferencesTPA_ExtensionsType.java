/**
 * ExchangeTravelPreferencesTPA_ExtensionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeTravelPreferencesTPA_ExtensionsType  implements java.io.Serializable {
    /* Exempt all taxes (/TE) */
    private org.opentravel.www.OTA._2003._05.ExemptAllTaxes exemptAllTaxes;

    /* Exempt all taxes and fees (/TN) */
    private org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees exemptAllTaxesAndFees;

    /* Specify Taxes (/TX) */
    private org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] taxes;

    /* Exempt Tax (/TE) */
    private org.opentravel.www.OTA._2003._05.TaxCodeType[] exemptTax;

    private java.lang.String settlementMethod;

    public ExchangeTravelPreferencesTPA_ExtensionsType() {
    }

    public ExchangeTravelPreferencesTPA_ExtensionsType(
           org.opentravel.www.OTA._2003._05.ExemptAllTaxes exemptAllTaxes,
           org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees exemptAllTaxesAndFees,
           org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] taxes,
           org.opentravel.www.OTA._2003._05.TaxCodeType[] exemptTax,
           java.lang.String settlementMethod) {
           this.exemptAllTaxes = exemptAllTaxes;
           this.exemptAllTaxesAndFees = exemptAllTaxesAndFees;
           this.taxes = taxes;
           this.exemptTax = exemptTax;
           this.settlementMethod = settlementMethod;
    }


    /**
     * Gets the exemptAllTaxes value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @return exemptAllTaxes   * Exempt all taxes (/TE)
     */
    public org.opentravel.www.OTA._2003._05.ExemptAllTaxes getExemptAllTaxes() {
        return exemptAllTaxes;
    }


    /**
     * Sets the exemptAllTaxes value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @param exemptAllTaxes   * Exempt all taxes (/TE)
     */
    public void setExemptAllTaxes(org.opentravel.www.OTA._2003._05.ExemptAllTaxes exemptAllTaxes) {
        this.exemptAllTaxes = exemptAllTaxes;
    }


    /**
     * Gets the exemptAllTaxesAndFees value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @return exemptAllTaxesAndFees   * Exempt all taxes and fees (/TN)
     */
    public org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees getExemptAllTaxesAndFees() {
        return exemptAllTaxesAndFees;
    }


    /**
     * Sets the exemptAllTaxesAndFees value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @param exemptAllTaxesAndFees   * Exempt all taxes and fees (/TN)
     */
    public void setExemptAllTaxesAndFees(org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees exemptAllTaxesAndFees) {
        this.exemptAllTaxesAndFees = exemptAllTaxesAndFees;
    }


    /**
     * Gets the taxes value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @return taxes   * Specify Taxes (/TX)
     */
    public org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @param taxes   * Specify Taxes (/TX)
     */
    public void setTaxes(org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the exemptTax value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @return exemptTax   * Exempt Tax (/TE)
     */
    public org.opentravel.www.OTA._2003._05.TaxCodeType[] getExemptTax() {
        return exemptTax;
    }


    /**
     * Sets the exemptTax value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @param exemptTax   * Exempt Tax (/TE)
     */
    public void setExemptTax(org.opentravel.www.OTA._2003._05.TaxCodeType[] exemptTax) {
        this.exemptTax = exemptTax;
    }

    public org.opentravel.www.OTA._2003._05.TaxCodeType getExemptTax(int i) {
        return this.exemptTax[i];
    }

    public void setExemptTax(int i, org.opentravel.www.OTA._2003._05.TaxCodeType _value) {
        this.exemptTax[i] = _value;
    }


    /**
     * Gets the settlementMethod value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @return settlementMethod
     */
    public java.lang.String getSettlementMethod() {
        return settlementMethod;
    }


    /**
     * Sets the settlementMethod value for this ExchangeTravelPreferencesTPA_ExtensionsType.
     * 
     * @param settlementMethod
     */
    public void setSettlementMethod(java.lang.String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeTravelPreferencesTPA_ExtensionsType)) return false;
        ExchangeTravelPreferencesTPA_ExtensionsType other = (ExchangeTravelPreferencesTPA_ExtensionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exemptAllTaxes==null && other.getExemptAllTaxes()==null) || 
             (this.exemptAllTaxes!=null &&
              this.exemptAllTaxes.equals(other.getExemptAllTaxes()))) &&
            ((this.exemptAllTaxesAndFees==null && other.getExemptAllTaxesAndFees()==null) || 
             (this.exemptAllTaxesAndFees!=null &&
              this.exemptAllTaxesAndFees.equals(other.getExemptAllTaxesAndFees()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.exemptTax==null && other.getExemptTax()==null) || 
             (this.exemptTax!=null &&
              java.util.Arrays.equals(this.exemptTax, other.getExemptTax()))) &&
            ((this.settlementMethod==null && other.getSettlementMethod()==null) || 
             (this.settlementMethod!=null &&
              this.settlementMethod.equals(other.getSettlementMethod())));
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
        if (getExemptAllTaxes() != null) {
            _hashCode += getExemptAllTaxes().hashCode();
        }
        if (getExemptAllTaxesAndFees() != null) {
            _hashCode += getExemptAllTaxesAndFees().hashCode();
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExemptTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExemptTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExemptTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSettlementMethod() != null) {
            _hashCode += getSettlementMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeTravelPreferencesTPA_ExtensionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeTravelPreferencesTPA_ExtensionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptAllTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExemptAllTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExemptAllTaxes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptAllTaxesAndFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExemptAllTaxesAndFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExemptAllTaxesAndFees"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TaxCodeAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tax"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExemptTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TaxCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SettlementMethod"));
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
