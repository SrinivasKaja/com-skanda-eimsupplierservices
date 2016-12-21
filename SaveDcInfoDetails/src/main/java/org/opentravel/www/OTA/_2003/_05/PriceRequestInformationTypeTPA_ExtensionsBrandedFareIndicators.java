/**
 * PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicatorsReturnCheapestUnbrandedFare returnCheapestUnbrandedFare;

    private java.lang.Boolean singleBrandedFare;  // attribute

    private java.lang.Boolean multipleBrandedFares;  // attribute

    public PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators(
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicatorsReturnCheapestUnbrandedFare returnCheapestUnbrandedFare,
           java.lang.Boolean singleBrandedFare,
           java.lang.Boolean multipleBrandedFares) {
           this.returnCheapestUnbrandedFare = returnCheapestUnbrandedFare;
           this.singleBrandedFare = singleBrandedFare;
           this.multipleBrandedFares = multipleBrandedFares;
    }


    /**
     * Gets the returnCheapestUnbrandedFare value for this PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.
     * 
     * @return returnCheapestUnbrandedFare
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicatorsReturnCheapestUnbrandedFare getReturnCheapestUnbrandedFare() {
        return returnCheapestUnbrandedFare;
    }


    /**
     * Sets the returnCheapestUnbrandedFare value for this PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.
     * 
     * @param returnCheapestUnbrandedFare
     */
    public void setReturnCheapestUnbrandedFare(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicatorsReturnCheapestUnbrandedFare returnCheapestUnbrandedFare) {
        this.returnCheapestUnbrandedFare = returnCheapestUnbrandedFare;
    }


    /**
     * Gets the singleBrandedFare value for this PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.
     * 
     * @return singleBrandedFare
     */
    public java.lang.Boolean getSingleBrandedFare() {
        return singleBrandedFare;
    }


    /**
     * Sets the singleBrandedFare value for this PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.
     * 
     * @param singleBrandedFare
     */
    public void setSingleBrandedFare(java.lang.Boolean singleBrandedFare) {
        this.singleBrandedFare = singleBrandedFare;
    }


    /**
     * Gets the multipleBrandedFares value for this PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.
     * 
     * @return multipleBrandedFares
     */
    public java.lang.Boolean getMultipleBrandedFares() {
        return multipleBrandedFares;
    }


    /**
     * Sets the multipleBrandedFares value for this PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.
     * 
     * @param multipleBrandedFares
     */
    public void setMultipleBrandedFares(java.lang.Boolean multipleBrandedFares) {
        this.multipleBrandedFares = multipleBrandedFares;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators)) return false;
        PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators other = (PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnCheapestUnbrandedFare==null && other.getReturnCheapestUnbrandedFare()==null) || 
             (this.returnCheapestUnbrandedFare!=null &&
              this.returnCheapestUnbrandedFare.equals(other.getReturnCheapestUnbrandedFare()))) &&
            ((this.singleBrandedFare==null && other.getSingleBrandedFare()==null) || 
             (this.singleBrandedFare!=null &&
              this.singleBrandedFare.equals(other.getSingleBrandedFare()))) &&
            ((this.multipleBrandedFares==null && other.getMultipleBrandedFares()==null) || 
             (this.multipleBrandedFares!=null &&
              this.multipleBrandedFares.equals(other.getMultipleBrandedFares())));
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
        if (getReturnCheapestUnbrandedFare() != null) {
            _hashCode += getReturnCheapestUnbrandedFare().hashCode();
        }
        if (getSingleBrandedFare() != null) {
            _hashCode += getSingleBrandedFare().hashCode();
        }
        if (getMultipleBrandedFares() != null) {
            _hashCode += getMultipleBrandedFares().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>BrandedFareIndicators"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("singleBrandedFare");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SingleBrandedFare"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("multipleBrandedFares");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MultipleBrandedFares"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCheapestUnbrandedFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReturnCheapestUnbrandedFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>BrandedFareIndicators>ReturnCheapestUnbrandedFare"));
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
