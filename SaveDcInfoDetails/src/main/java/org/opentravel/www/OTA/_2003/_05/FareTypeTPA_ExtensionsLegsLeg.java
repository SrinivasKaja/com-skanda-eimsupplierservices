/**
 * FareTypeTPA_ExtensionsLegsLeg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTPA_ExtensionsLegsLeg  implements java.io.Serializable {
    /* Price of the inventory excluding taxes and fees. */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare;

    /* Price of the inventory excluding taxes and fees in the payable
     * currency. */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegEquivFare equivFare;

    /* This is a collection of Taxes */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTaxes taxes;

    /* The total price that the passenger would pay (includes fare,
     * taxes, fees) */
    private org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare;

    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTotalMileage totalMileage;

    private java.lang.Integer number;  // attribute

    private java.lang.String fareStatus;  // attribute

    public FareTypeTPA_ExtensionsLegsLeg() {
    }

    public FareTypeTPA_ExtensionsLegsLeg(
           org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegEquivFare equivFare,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTaxes taxes,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTotalMileage totalMileage,
           java.lang.Integer number,
           java.lang.String fareStatus) {
           this.baseFare = baseFare;
           this.equivFare = equivFare;
           this.taxes = taxes;
           this.totalFare = totalFare;
           this.totalMileage = totalMileage;
           this.number = number;
           this.fareStatus = fareStatus;
    }


    /**
     * Gets the baseFare value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @return baseFare   * Price of the inventory excluding taxes and fees.
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getBaseFare() {
        return baseFare;
    }


    /**
     * Sets the baseFare value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @param baseFare   * Price of the inventory excluding taxes and fees.
     */
    public void setBaseFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare) {
        this.baseFare = baseFare;
    }


    /**
     * Gets the equivFare value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @return equivFare   * Price of the inventory excluding taxes and fees in the payable
     * currency.
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegEquivFare getEquivFare() {
        return equivFare;
    }


    /**
     * Sets the equivFare value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @param equivFare   * Price of the inventory excluding taxes and fees in the payable
     * currency.
     */
    public void setEquivFare(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegEquivFare equivFare) {
        this.equivFare = equivFare;
    }


    /**
     * Gets the taxes value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @return taxes   * This is a collection of Taxes
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTaxes getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @param taxes   * This is a collection of Taxes
     */
    public void setTaxes(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTaxes taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the totalFare value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @return totalFare   * The total price that the passenger would pay (includes fare,
     * taxes, fees)
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getTotalFare() {
        return totalFare;
    }


    /**
     * Sets the totalFare value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @param totalFare   * The total price that the passenger would pay (includes fare,
     * taxes, fees)
     */
    public void setTotalFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare) {
        this.totalFare = totalFare;
    }


    /**
     * Gets the totalMileage value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @return totalMileage
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTotalMileage getTotalMileage() {
        return totalMileage;
    }


    /**
     * Sets the totalMileage value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @param totalMileage
     */
    public void setTotalMileage(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLegTotalMileage totalMileage) {
        this.totalMileage = totalMileage;
    }


    /**
     * Gets the number value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @return number
     */
    public java.lang.Integer getNumber() {
        return number;
    }


    /**
     * Sets the number value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @param number
     */
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }


    /**
     * Gets the fareStatus value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @return fareStatus
     */
    public java.lang.String getFareStatus() {
        return fareStatus;
    }


    /**
     * Sets the fareStatus value for this FareTypeTPA_ExtensionsLegsLeg.
     * 
     * @param fareStatus
     */
    public void setFareStatus(java.lang.String fareStatus) {
        this.fareStatus = fareStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTPA_ExtensionsLegsLeg)) return false;
        FareTypeTPA_ExtensionsLegsLeg other = (FareTypeTPA_ExtensionsLegsLeg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseFare==null && other.getBaseFare()==null) || 
             (this.baseFare!=null &&
              this.baseFare.equals(other.getBaseFare()))) &&
            ((this.equivFare==null && other.getEquivFare()==null) || 
             (this.equivFare!=null &&
              this.equivFare.equals(other.getEquivFare()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              this.taxes.equals(other.getTaxes()))) &&
            ((this.totalFare==null && other.getTotalFare()==null) || 
             (this.totalFare!=null &&
              this.totalFare.equals(other.getTotalFare()))) &&
            ((this.totalMileage==null && other.getTotalMileage()==null) || 
             (this.totalMileage!=null &&
              this.totalMileage.equals(other.getTotalMileage()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.fareStatus==null && other.getFareStatus()==null) || 
             (this.fareStatus!=null &&
              this.fareStatus.equals(other.getFareStatus())));
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
        if (getBaseFare() != null) {
            _hashCode += getBaseFare().hashCode();
        }
        if (getEquivFare() != null) {
            _hashCode += getEquivFare().hashCode();
        }
        if (getTaxes() != null) {
            _hashCode += getTaxes().hashCode();
        }
        if (getTotalFare() != null) {
            _hashCode += getTotalFare().hashCode();
        }
        if (getTotalMileage() != null) {
            _hashCode += getTotalMileage().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getFareStatus() != null) {
            _hashCode += getFareStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTPA_ExtensionsLegsLeg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>Legs>Leg"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equivFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquivFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>Legs>Leg>EquivFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>Legs>Leg>Taxes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMileage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalMileage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>Legs>Leg>TotalMileage"));
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
