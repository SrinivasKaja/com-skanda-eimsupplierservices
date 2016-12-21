/**
 * AirItineraryPricingInfoTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeTPA_Extensions  implements java.io.Serializable {
    /* Indicates if different passenger types are booked in different
     * inventories. */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty divideInParty;

    /* Promotional offer */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer promoOffer;

    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsFareNote[] fareNote;

    /* Populated if  "Coupon Redemption" rule has been hit. This had
     * been developed for Travelocity but never used. */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoRedemption promoRedemption;

    /* Describes a rule that was hit. */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsRule[] rule;

    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups multipleTravelerGroups;

    /* Ancillary fee groups returned */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem[][] ancillaryFeeGroups;

    /* This is a collection of Leg Information */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment[][] legs;

    private org.opentravel.www.OTA._2003._05.UnflownPriceType unflownPrice;

    private org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoType[] validatingCarrier;

    public AirItineraryPricingInfoTypeTPA_Extensions() {
    }

    public AirItineraryPricingInfoTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty divideInParty,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer promoOffer,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsFareNote[] fareNote,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoRedemption promoRedemption,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsRule[] rule,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups multipleTravelerGroups,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem[][] ancillaryFeeGroups,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment[][] legs,
           org.opentravel.www.OTA._2003._05.UnflownPriceType unflownPrice,
           org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoType[] validatingCarrier) {
           this.divideInParty = divideInParty;
           this.promoOffer = promoOffer;
           this.fareNote = fareNote;
           this.promoRedemption = promoRedemption;
           this.rule = rule;
           this.multipleTravelerGroups = multipleTravelerGroups;
           this.ancillaryFeeGroups = ancillaryFeeGroups;
           this.legs = legs;
           this.unflownPrice = unflownPrice;
           this.validatingCarrier = validatingCarrier;
    }


    /**
     * Gets the divideInParty value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return divideInParty   * Indicates if different passenger types are booked in different
     * inventories.
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty getDivideInParty() {
        return divideInParty;
    }


    /**
     * Sets the divideInParty value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param divideInParty   * Indicates if different passenger types are booked in different
     * inventories.
     */
    public void setDivideInParty(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty divideInParty) {
        this.divideInParty = divideInParty;
    }


    /**
     * Gets the promoOffer value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return promoOffer   * Promotional offer
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer getPromoOffer() {
        return promoOffer;
    }


    /**
     * Sets the promoOffer value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param promoOffer   * Promotional offer
     */
    public void setPromoOffer(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoOffer promoOffer) {
        this.promoOffer = promoOffer;
    }


    /**
     * Gets the fareNote value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return fareNote
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsFareNote[] getFareNote() {
        return fareNote;
    }


    /**
     * Sets the fareNote value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param fareNote
     */
    public void setFareNote(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsFareNote[] fareNote) {
        this.fareNote = fareNote;
    }

    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsFareNote getFareNote(int i) {
        return this.fareNote[i];
    }

    public void setFareNote(int i, org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsFareNote _value) {
        this.fareNote[i] = _value;
    }


    /**
     * Gets the promoRedemption value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return promoRedemption   * Populated if  "Coupon Redemption" rule has been hit. This had
     * been developed for Travelocity but never used.
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoRedemption getPromoRedemption() {
        return promoRedemption;
    }


    /**
     * Sets the promoRedemption value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param promoRedemption   * Populated if  "Coupon Redemption" rule has been hit. This had
     * been developed for Travelocity but never used.
     */
    public void setPromoRedemption(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsPromoRedemption promoRedemption) {
        this.promoRedemption = promoRedemption;
    }


    /**
     * Gets the rule value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return rule   * Describes a rule that was hit.
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsRule[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param rule   * Describes a rule that was hit.
     */
    public void setRule(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsRule[] rule) {
        this.rule = rule;
    }

    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsRule getRule(int i) {
        return this.rule[i];
    }

    public void setRule(int i, org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsRule _value) {
        this.rule[i] = _value;
    }


    /**
     * Gets the multipleTravelerGroups value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return multipleTravelerGroups
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups getMultipleTravelerGroups() {
        return multipleTravelerGroups;
    }


    /**
     * Sets the multipleTravelerGroups value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param multipleTravelerGroups
     */
    public void setMultipleTravelerGroups(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups multipleTravelerGroups) {
        this.multipleTravelerGroups = multipleTravelerGroups;
    }


    /**
     * Gets the ancillaryFeeGroups value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return ancillaryFeeGroups   * Ancillary fee groups returned
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem[][] getAncillaryFeeGroups() {
        return ancillaryFeeGroups;
    }


    /**
     * Sets the ancillaryFeeGroups value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param ancillaryFeeGroups   * Ancillary fee groups returned
     */
    public void setAncillaryFeeGroups(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem[][] ancillaryFeeGroups) {
        this.ancillaryFeeGroups = ancillaryFeeGroups;
    }


    /**
     * Gets the legs value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return legs   * This is a collection of Leg Information
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment[][] getLegs() {
        return legs;
    }


    /**
     * Sets the legs value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param legs   * This is a collection of Leg Information
     */
    public void setLegs(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment[][] legs) {
        this.legs = legs;
    }


    /**
     * Gets the unflownPrice value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return unflownPrice
     */
    public org.opentravel.www.OTA._2003._05.UnflownPriceType getUnflownPrice() {
        return unflownPrice;
    }


    /**
     * Sets the unflownPrice value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param unflownPrice
     */
    public void setUnflownPrice(org.opentravel.www.OTA._2003._05.UnflownPriceType unflownPrice) {
        this.unflownPrice = unflownPrice;
    }


    /**
     * Gets the validatingCarrier value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @return validatingCarrier
     */
    public org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoType[] getValidatingCarrier() {
        return validatingCarrier;
    }


    /**
     * Sets the validatingCarrier value for this AirItineraryPricingInfoTypeTPA_Extensions.
     * 
     * @param validatingCarrier
     */
    public void setValidatingCarrier(org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoType[] validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    public org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoType getValidatingCarrier(int i) {
        return this.validatingCarrier[i];
    }

    public void setValidatingCarrier(int i, org.opentravel.www.OTA._2003._05.ValidatingCarrierInfoType _value) {
        this.validatingCarrier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeTPA_Extensions)) return false;
        AirItineraryPricingInfoTypeTPA_Extensions other = (AirItineraryPricingInfoTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.divideInParty==null && other.getDivideInParty()==null) || 
             (this.divideInParty!=null &&
              this.divideInParty.equals(other.getDivideInParty()))) &&
            ((this.promoOffer==null && other.getPromoOffer()==null) || 
             (this.promoOffer!=null &&
              this.promoOffer.equals(other.getPromoOffer()))) &&
            ((this.fareNote==null && other.getFareNote()==null) || 
             (this.fareNote!=null &&
              java.util.Arrays.equals(this.fareNote, other.getFareNote()))) &&
            ((this.promoRedemption==null && other.getPromoRedemption()==null) || 
             (this.promoRedemption!=null &&
              this.promoRedemption.equals(other.getPromoRedemption()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.multipleTravelerGroups==null && other.getMultipleTravelerGroups()==null) || 
             (this.multipleTravelerGroups!=null &&
              this.multipleTravelerGroups.equals(other.getMultipleTravelerGroups()))) &&
            ((this.ancillaryFeeGroups==null && other.getAncillaryFeeGroups()==null) || 
             (this.ancillaryFeeGroups!=null &&
              java.util.Arrays.equals(this.ancillaryFeeGroups, other.getAncillaryFeeGroups()))) &&
            ((this.legs==null && other.getLegs()==null) || 
             (this.legs!=null &&
              java.util.Arrays.equals(this.legs, other.getLegs()))) &&
            ((this.unflownPrice==null && other.getUnflownPrice()==null) || 
             (this.unflownPrice!=null &&
              this.unflownPrice.equals(other.getUnflownPrice()))) &&
            ((this.validatingCarrier==null && other.getValidatingCarrier()==null) || 
             (this.validatingCarrier!=null &&
              java.util.Arrays.equals(this.validatingCarrier, other.getValidatingCarrier())));
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
        if (getDivideInParty() != null) {
            _hashCode += getDivideInParty().hashCode();
        }
        if (getPromoOffer() != null) {
            _hashCode += getPromoOffer().hashCode();
        }
        if (getFareNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromoRedemption() != null) {
            _hashCode += getPromoRedemption().hashCode();
        }
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultipleTravelerGroups() != null) {
            _hashCode += getMultipleTravelerGroups().hashCode();
        }
        if (getAncillaryFeeGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAncillaryFeeGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAncillaryFeeGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnflownPrice() != null) {
            _hashCode += getUnflownPrice().hashCode();
        }
        if (getValidatingCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidatingCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidatingCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divideInParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DivideInParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>DivideInParty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoOffer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PromoOffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>PromoOffer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>FareNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoRedemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PromoRedemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>PromoRedemption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>Rule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleTravelerGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MultipleTravelerGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>MultipleTravelerGroups"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryFeeGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFeeGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirItineraryPricingInfoType>TPA_Extensions>AncillaryFeeGroups>AncillaryFeeGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFeeGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Legs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirItineraryPricingInfoType>TPA_Extensions>Legs>Leg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Leg"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unflownPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UnflownPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UnflownPriceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrierInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
