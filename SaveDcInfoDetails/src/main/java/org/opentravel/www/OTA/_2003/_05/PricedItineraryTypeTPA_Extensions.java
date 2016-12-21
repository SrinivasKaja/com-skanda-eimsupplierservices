/**
 * PricedItineraryTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PricedItineraryTypeTPA_Extensions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFares[] additionalFares;

    /* Populated if an Ops rule has been hit. */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOps ops;

    /* The source of the itinerary */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsItinSource itinSource;

    /* Additional information for Value Bucket sorting */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValueBucket valueBucket;

    /* Issuing airline whose numeric airline code is reflected in
     * the electronic transaction for the flight/value coupon(s).The Validating
     * Carrier shall be the controlling and authorising entity for Electronic
     * Ticketing transactions.. */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValidatingCarrier validatingCarrier;

    /* Sum of AirItineraryPricingInfo/TPA_Extensions/UnflownPrice */
    private org.opentravel.www.OTA._2003._05.UnflownPriceType unflownPrice;

    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsDiversitySwapper diversitySwapper;

    /* Information on problems that occurred while processing this
     * itinerary. */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsFailed failed;

    public PricedItineraryTypeTPA_Extensions() {
    }

    public PricedItineraryTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFares[] additionalFares,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOps ops,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsItinSource itinSource,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValueBucket valueBucket,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValidatingCarrier validatingCarrier,
           org.opentravel.www.OTA._2003._05.UnflownPriceType unflownPrice,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsDiversitySwapper diversitySwapper,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsFailed failed) {
           this.additionalFares = additionalFares;
           this.ops = ops;
           this.itinSource = itinSource;
           this.valueBucket = valueBucket;
           this.validatingCarrier = validatingCarrier;
           this.unflownPrice = unflownPrice;
           this.diversitySwapper = diversitySwapper;
           this.failed = failed;
    }


    /**
     * Gets the additionalFares value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return additionalFares
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFares[] getAdditionalFares() {
        return additionalFares;
    }


    /**
     * Sets the additionalFares value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param additionalFares
     */
    public void setAdditionalFares(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFares[] additionalFares) {
        this.additionalFares = additionalFares;
    }

    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFares getAdditionalFares(int i) {
        return this.additionalFares[i];
    }

    public void setAdditionalFares(int i, org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFares _value) {
        this.additionalFares[i] = _value;
    }


    /**
     * Gets the ops value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return ops   * Populated if an Ops rule has been hit.
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOps getOps() {
        return ops;
    }


    /**
     * Sets the ops value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param ops   * Populated if an Ops rule has been hit.
     */
    public void setOps(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsOps ops) {
        this.ops = ops;
    }


    /**
     * Gets the itinSource value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return itinSource   * The source of the itinerary
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsItinSource getItinSource() {
        return itinSource;
    }


    /**
     * Sets the itinSource value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param itinSource   * The source of the itinerary
     */
    public void setItinSource(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsItinSource itinSource) {
        this.itinSource = itinSource;
    }


    /**
     * Gets the valueBucket value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return valueBucket   * Additional information for Value Bucket sorting
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValueBucket getValueBucket() {
        return valueBucket;
    }


    /**
     * Sets the valueBucket value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param valueBucket   * Additional information for Value Bucket sorting
     */
    public void setValueBucket(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValueBucket valueBucket) {
        this.valueBucket = valueBucket;
    }


    /**
     * Gets the validatingCarrier value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return validatingCarrier   * Issuing airline whose numeric airline code is reflected in
     * the electronic transaction for the flight/value coupon(s).The Validating
     * Carrier shall be the controlling and authorising entity for Electronic
     * Ticketing transactions..
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValidatingCarrier getValidatingCarrier() {
        return validatingCarrier;
    }


    /**
     * Sets the validatingCarrier value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param validatingCarrier   * Issuing airline whose numeric airline code is reflected in
     * the electronic transaction for the flight/value coupon(s).The Validating
     * Carrier shall be the controlling and authorising entity for Electronic
     * Ticketing transactions..
     */
    public void setValidatingCarrier(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsValidatingCarrier validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }


    /**
     * Gets the unflownPrice value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return unflownPrice   * Sum of AirItineraryPricingInfo/TPA_Extensions/UnflownPrice
     */
    public org.opentravel.www.OTA._2003._05.UnflownPriceType getUnflownPrice() {
        return unflownPrice;
    }


    /**
     * Sets the unflownPrice value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param unflownPrice   * Sum of AirItineraryPricingInfo/TPA_Extensions/UnflownPrice
     */
    public void setUnflownPrice(org.opentravel.www.OTA._2003._05.UnflownPriceType unflownPrice) {
        this.unflownPrice = unflownPrice;
    }


    /**
     * Gets the diversitySwapper value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return diversitySwapper
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsDiversitySwapper getDiversitySwapper() {
        return diversitySwapper;
    }


    /**
     * Sets the diversitySwapper value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param diversitySwapper
     */
    public void setDiversitySwapper(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsDiversitySwapper diversitySwapper) {
        this.diversitySwapper = diversitySwapper;
    }


    /**
     * Gets the failed value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @return failed   * Information on problems that occurred while processing this
     * itinerary.
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsFailed getFailed() {
        return failed;
    }


    /**
     * Sets the failed value for this PricedItineraryTypeTPA_Extensions.
     * 
     * @param failed   * Information on problems that occurred while processing this
     * itinerary.
     */
    public void setFailed(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsFailed failed) {
        this.failed = failed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricedItineraryTypeTPA_Extensions)) return false;
        PricedItineraryTypeTPA_Extensions other = (PricedItineraryTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalFares==null && other.getAdditionalFares()==null) || 
             (this.additionalFares!=null &&
              java.util.Arrays.equals(this.additionalFares, other.getAdditionalFares()))) &&
            ((this.ops==null && other.getOps()==null) || 
             (this.ops!=null &&
              this.ops.equals(other.getOps()))) &&
            ((this.itinSource==null && other.getItinSource()==null) || 
             (this.itinSource!=null &&
              this.itinSource.equals(other.getItinSource()))) &&
            ((this.valueBucket==null && other.getValueBucket()==null) || 
             (this.valueBucket!=null &&
              this.valueBucket.equals(other.getValueBucket()))) &&
            ((this.validatingCarrier==null && other.getValidatingCarrier()==null) || 
             (this.validatingCarrier!=null &&
              this.validatingCarrier.equals(other.getValidatingCarrier()))) &&
            ((this.unflownPrice==null && other.getUnflownPrice()==null) || 
             (this.unflownPrice!=null &&
              this.unflownPrice.equals(other.getUnflownPrice()))) &&
            ((this.diversitySwapper==null && other.getDiversitySwapper()==null) || 
             (this.diversitySwapper!=null &&
              this.diversitySwapper.equals(other.getDiversitySwapper()))) &&
            ((this.failed==null && other.getFailed()==null) || 
             (this.failed!=null &&
              this.failed.equals(other.getFailed())));
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
        if (getAdditionalFares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalFares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalFares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOps() != null) {
            _hashCode += getOps().hashCode();
        }
        if (getItinSource() != null) {
            _hashCode += getItinSource().hashCode();
        }
        if (getValueBucket() != null) {
            _hashCode += getValueBucket().hashCode();
        }
        if (getValidatingCarrier() != null) {
            _hashCode += getValidatingCarrier().hashCode();
        }
        if (getUnflownPrice() != null) {
            _hashCode += getUnflownPrice().hashCode();
        }
        if (getDiversitySwapper() != null) {
            _hashCode += getDiversitySwapper().hashCode();
        }
        if (getFailed() != null) {
            _hashCode += getFailed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricedItineraryTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PricedItineraryType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdditionalFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>AdditionalFares"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Ops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>Ops"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itinSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItinSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>ItinSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueBucket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValueBucket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>ValueBucket"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>ValidatingCarrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unflownPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UnflownPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UnflownPriceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diversitySwapper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiversitySwapper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>DiversitySwapper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Failed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>Failed"));
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
