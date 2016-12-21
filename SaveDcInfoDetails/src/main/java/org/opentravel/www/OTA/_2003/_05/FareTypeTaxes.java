/**
 * FareTypeTaxes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTaxes  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.FareComponentTaxesType[] fareComponentsTaxes;

    private org.opentravel.www.OTA._2003._05.AirTaxType[][] legsTaxes;

    /* Any individual tax applied to the fare */
    private org.opentravel.www.OTA._2003._05.AirTaxType[] tax;

    /* Total (summary) of taxes applied to the fare */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType totalTax;

    public FareTypeTaxes() {
    }

    public FareTypeTaxes(
           org.opentravel.www.OTA._2003._05.FareComponentTaxesType[] fareComponentsTaxes,
           org.opentravel.www.OTA._2003._05.AirTaxType[][] legsTaxes,
           org.opentravel.www.OTA._2003._05.AirTaxType[] tax,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType totalTax) {
           this.fareComponentsTaxes = fareComponentsTaxes;
           this.legsTaxes = legsTaxes;
           this.tax = tax;
           this.totalTax = totalTax;
    }


    /**
     * Gets the fareComponentsTaxes value for this FareTypeTaxes.
     * 
     * @return fareComponentsTaxes
     */
    public org.opentravel.www.OTA._2003._05.FareComponentTaxesType[] getFareComponentsTaxes() {
        return fareComponentsTaxes;
    }


    /**
     * Sets the fareComponentsTaxes value for this FareTypeTaxes.
     * 
     * @param fareComponentsTaxes
     */
    public void setFareComponentsTaxes(org.opentravel.www.OTA._2003._05.FareComponentTaxesType[] fareComponentsTaxes) {
        this.fareComponentsTaxes = fareComponentsTaxes;
    }


    /**
     * Gets the legsTaxes value for this FareTypeTaxes.
     * 
     * @return legsTaxes
     */
    public org.opentravel.www.OTA._2003._05.AirTaxType[][] getLegsTaxes() {
        return legsTaxes;
    }


    /**
     * Sets the legsTaxes value for this FareTypeTaxes.
     * 
     * @param legsTaxes
     */
    public void setLegsTaxes(org.opentravel.www.OTA._2003._05.AirTaxType[][] legsTaxes) {
        this.legsTaxes = legsTaxes;
    }


    /**
     * Gets the tax value for this FareTypeTaxes.
     * 
     * @return tax   * Any individual tax applied to the fare
     */
    public org.opentravel.www.OTA._2003._05.AirTaxType[] getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this FareTypeTaxes.
     * 
     * @param tax   * Any individual tax applied to the fare
     */
    public void setTax(org.opentravel.www.OTA._2003._05.AirTaxType[] tax) {
        this.tax = tax;
    }

    public org.opentravel.www.OTA._2003._05.AirTaxType getTax(int i) {
        return this.tax[i];
    }

    public void setTax(int i, org.opentravel.www.OTA._2003._05.AirTaxType _value) {
        this.tax[i] = _value;
    }


    /**
     * Gets the totalTax value for this FareTypeTaxes.
     * 
     * @return totalTax   * Total (summary) of taxes applied to the fare
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getTotalTax() {
        return totalTax;
    }


    /**
     * Sets the totalTax value for this FareTypeTaxes.
     * 
     * @param totalTax   * Total (summary) of taxes applied to the fare
     */
    public void setTotalTax(org.opentravel.www.OTA._2003._05.CurrencyAmountType totalTax) {
        this.totalTax = totalTax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTaxes)) return false;
        FareTypeTaxes other = (FareTypeTaxes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fareComponentsTaxes==null && other.getFareComponentsTaxes()==null) || 
             (this.fareComponentsTaxes!=null &&
              java.util.Arrays.equals(this.fareComponentsTaxes, other.getFareComponentsTaxes()))) &&
            ((this.legsTaxes==null && other.getLegsTaxes()==null) || 
             (this.legsTaxes!=null &&
              java.util.Arrays.equals(this.legsTaxes, other.getLegsTaxes()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              java.util.Arrays.equals(this.tax, other.getTax()))) &&
            ((this.totalTax==null && other.getTotalTax()==null) || 
             (this.totalTax!=null &&
              this.totalTax.equals(other.getTotalTax())));
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
        if (getFareComponentsTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareComponentsTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareComponentsTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegsTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegsTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegsTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalTax() != null) {
            _hashCode += getTotalTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTaxes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>Taxes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareComponentsTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentsTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentTaxesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponentTaxes"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legsTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LegsTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>Taxes>LegsTaxes>LegTaxes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LegTaxes"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTaxType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
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
