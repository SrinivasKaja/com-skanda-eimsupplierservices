/**
 * AirSearchPrefsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Defines user preferences to be used in conducting a search.
 */
public class AirSearchPrefsType  implements java.io.Serializable {
    /* Specify vendors to include and exclude from the response. */
    private org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] vendorPref;

    /* Defines preferred flight characteristics to be used in a search. */
    private org.opentravel.www.OTA._2003._05.FlightTypePrefType flightTypePref;

    /* Constrains a fare search to those with restrictions that satisfy
     * user-imposed limitations. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFareRestrictPref[] fareRestrictPref;

    /* Defines preferred equipment profile(s) to be used in a search. */
    private org.opentravel.www.OTA._2003._05.EquipmentTypePref[] equipPref;

    /* Defines preferred cabin(s) to be used in a search. The Cabin
     * type specified in a OriginDestinationInformation/TPA_Extensions overrides
     * this Cabin type for that specific segment/leg. If a Cabin type is
     * not specified in a OriginDestinationInformation/TPA_Extensions the
     * cabin type in this element will be used as default cabin type for
     * that segment/leg. */
    private org.opentravel.www.OTA._2003._05.CabinPrefType[] cabinPref;

    /* Defines Distribution prefernces. */
    private org.opentravel.www.OTA._2003._05.TicketDistribPrefType[] ticketDistribPref;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_Extensions TPA_Extensions;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup[] ancillaryFees;

    /* Frequent Flyer Status Information */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFrequentFlyer[] frequentFlyer;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscount spanishFamilyDiscount;

    private org.opentravel.www.OTA._2003._05.BrandType[] interlineBrands;

    private java.lang.Boolean smokingAllowed;  // attribute

    private java.math.BigDecimal onTimeRate;  // attribute

    private java.lang.Boolean ETicketDesired;  // attribute

    private java.lang.Boolean validInterlineTicket;  // attribute

    private java.math.BigInteger maxStopsQuantity;  // attribute

    private java.lang.Boolean useAllFlights;  // attribute

    private java.lang.Boolean allFlightsData;  // attribute

    private java.lang.Boolean hybrid;  // attribute

    public AirSearchPrefsType() {
    }

    public AirSearchPrefsType(
           org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] vendorPref,
           org.opentravel.www.OTA._2003._05.FlightTypePrefType flightTypePref,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFareRestrictPref[] fareRestrictPref,
           org.opentravel.www.OTA._2003._05.EquipmentTypePref[] equipPref,
           org.opentravel.www.OTA._2003._05.CabinPrefType[] cabinPref,
           org.opentravel.www.OTA._2003._05.TicketDistribPrefType[] ticketDistribPref,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_Extensions TPA_Extensions,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup[] ancillaryFees,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFrequentFlyer[] frequentFlyer,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscount spanishFamilyDiscount,
           org.opentravel.www.OTA._2003._05.BrandType[] interlineBrands,
           java.lang.Boolean smokingAllowed,
           java.math.BigDecimal onTimeRate,
           java.lang.Boolean ETicketDesired,
           java.lang.Boolean validInterlineTicket,
           java.math.BigInteger maxStopsQuantity,
           java.lang.Boolean useAllFlights,
           java.lang.Boolean allFlightsData,
           java.lang.Boolean hybrid) {
           this.vendorPref = vendorPref;
           this.flightTypePref = flightTypePref;
           this.fareRestrictPref = fareRestrictPref;
           this.equipPref = equipPref;
           this.cabinPref = cabinPref;
           this.ticketDistribPref = ticketDistribPref;
           this.TPA_Extensions = TPA_Extensions;
           this.ancillaryFees = ancillaryFees;
           this.frequentFlyer = frequentFlyer;
           this.spanishFamilyDiscount = spanishFamilyDiscount;
           this.interlineBrands = interlineBrands;
           this.smokingAllowed = smokingAllowed;
           this.onTimeRate = onTimeRate;
           this.ETicketDesired = ETicketDesired;
           this.validInterlineTicket = validInterlineTicket;
           this.maxStopsQuantity = maxStopsQuantity;
           this.useAllFlights = useAllFlights;
           this.allFlightsData = allFlightsData;
           this.hybrid = hybrid;
    }


    /**
     * Gets the vendorPref value for this AirSearchPrefsType.
     * 
     * @return vendorPref   * Specify vendors to include and exclude from the response.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] getVendorPref() {
        return vendorPref;
    }


    /**
     * Sets the vendorPref value for this AirSearchPrefsType.
     * 
     * @param vendorPref   * Specify vendors to include and exclude from the response.
     */
    public void setVendorPref(org.opentravel.www.OTA._2003._05.CompanyNamePrefType[] vendorPref) {
        this.vendorPref = vendorPref;
    }

    public org.opentravel.www.OTA._2003._05.CompanyNamePrefType getVendorPref(int i) {
        return this.vendorPref[i];
    }

    public void setVendorPref(int i, org.opentravel.www.OTA._2003._05.CompanyNamePrefType _value) {
        this.vendorPref[i] = _value;
    }


    /**
     * Gets the flightTypePref value for this AirSearchPrefsType.
     * 
     * @return flightTypePref   * Defines preferred flight characteristics to be used in a search.
     */
    public org.opentravel.www.OTA._2003._05.FlightTypePrefType getFlightTypePref() {
        return flightTypePref;
    }


    /**
     * Sets the flightTypePref value for this AirSearchPrefsType.
     * 
     * @param flightTypePref   * Defines preferred flight characteristics to be used in a search.
     */
    public void setFlightTypePref(org.opentravel.www.OTA._2003._05.FlightTypePrefType flightTypePref) {
        this.flightTypePref = flightTypePref;
    }


    /**
     * Gets the fareRestrictPref value for this AirSearchPrefsType.
     * 
     * @return fareRestrictPref   * Constrains a fare search to those with restrictions that satisfy
     * user-imposed limitations.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFareRestrictPref[] getFareRestrictPref() {
        return fareRestrictPref;
    }


    /**
     * Sets the fareRestrictPref value for this AirSearchPrefsType.
     * 
     * @param fareRestrictPref   * Constrains a fare search to those with restrictions that satisfy
     * user-imposed limitations.
     */
    public void setFareRestrictPref(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFareRestrictPref[] fareRestrictPref) {
        this.fareRestrictPref = fareRestrictPref;
    }

    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFareRestrictPref getFareRestrictPref(int i) {
        return this.fareRestrictPref[i];
    }

    public void setFareRestrictPref(int i, org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFareRestrictPref _value) {
        this.fareRestrictPref[i] = _value;
    }


    /**
     * Gets the equipPref value for this AirSearchPrefsType.
     * 
     * @return equipPref   * Defines preferred equipment profile(s) to be used in a search.
     */
    public org.opentravel.www.OTA._2003._05.EquipmentTypePref[] getEquipPref() {
        return equipPref;
    }


    /**
     * Sets the equipPref value for this AirSearchPrefsType.
     * 
     * @param equipPref   * Defines preferred equipment profile(s) to be used in a search.
     */
    public void setEquipPref(org.opentravel.www.OTA._2003._05.EquipmentTypePref[] equipPref) {
        this.equipPref = equipPref;
    }

    public org.opentravel.www.OTA._2003._05.EquipmentTypePref getEquipPref(int i) {
        return this.equipPref[i];
    }

    public void setEquipPref(int i, org.opentravel.www.OTA._2003._05.EquipmentTypePref _value) {
        this.equipPref[i] = _value;
    }


    /**
     * Gets the cabinPref value for this AirSearchPrefsType.
     * 
     * @return cabinPref   * Defines preferred cabin(s) to be used in a search. The Cabin
     * type specified in a OriginDestinationInformation/TPA_Extensions overrides
     * this Cabin type for that specific segment/leg. If a Cabin type is
     * not specified in a OriginDestinationInformation/TPA_Extensions the
     * cabin type in this element will be used as default cabin type for
     * that segment/leg.
     */
    public org.opentravel.www.OTA._2003._05.CabinPrefType[] getCabinPref() {
        return cabinPref;
    }


    /**
     * Sets the cabinPref value for this AirSearchPrefsType.
     * 
     * @param cabinPref   * Defines preferred cabin(s) to be used in a search. The Cabin
     * type specified in a OriginDestinationInformation/TPA_Extensions overrides
     * this Cabin type for that specific segment/leg. If a Cabin type is
     * not specified in a OriginDestinationInformation/TPA_Extensions the
     * cabin type in this element will be used as default cabin type for
     * that segment/leg.
     */
    public void setCabinPref(org.opentravel.www.OTA._2003._05.CabinPrefType[] cabinPref) {
        this.cabinPref = cabinPref;
    }

    public org.opentravel.www.OTA._2003._05.CabinPrefType getCabinPref(int i) {
        return this.cabinPref[i];
    }

    public void setCabinPref(int i, org.opentravel.www.OTA._2003._05.CabinPrefType _value) {
        this.cabinPref[i] = _value;
    }


    /**
     * Gets the ticketDistribPref value for this AirSearchPrefsType.
     * 
     * @return ticketDistribPref   * Defines Distribution prefernces.
     */
    public org.opentravel.www.OTA._2003._05.TicketDistribPrefType[] getTicketDistribPref() {
        return ticketDistribPref;
    }


    /**
     * Sets the ticketDistribPref value for this AirSearchPrefsType.
     * 
     * @param ticketDistribPref   * Defines Distribution prefernces.
     */
    public void setTicketDistribPref(org.opentravel.www.OTA._2003._05.TicketDistribPrefType[] ticketDistribPref) {
        this.ticketDistribPref = ticketDistribPref;
    }

    public org.opentravel.www.OTA._2003._05.TicketDistribPrefType getTicketDistribPref(int i) {
        return this.ticketDistribPref[i];
    }

    public void setTicketDistribPref(int i, org.opentravel.www.OTA._2003._05.TicketDistribPrefType _value) {
        this.ticketDistribPref[i] = _value;
    }


    /**
     * Gets the TPA_Extensions value for this AirSearchPrefsType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this AirSearchPrefsType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the ancillaryFees value for this AirSearchPrefsType.
     * 
     * @return ancillaryFees
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup[] getAncillaryFees() {
        return ancillaryFees;
    }


    /**
     * Sets the ancillaryFees value for this AirSearchPrefsType.
     * 
     * @param ancillaryFees
     */
    public void setAncillaryFees(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup[] ancillaryFees) {
        this.ancillaryFees = ancillaryFees;
    }


    /**
     * Gets the frequentFlyer value for this AirSearchPrefsType.
     * 
     * @return frequentFlyer   * Frequent Flyer Status Information
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFrequentFlyer[] getFrequentFlyer() {
        return frequentFlyer;
    }


    /**
     * Sets the frequentFlyer value for this AirSearchPrefsType.
     * 
     * @param frequentFlyer   * Frequent Flyer Status Information
     */
    public void setFrequentFlyer(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFrequentFlyer[] frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFrequentFlyer getFrequentFlyer(int i) {
        return this.frequentFlyer[i];
    }

    public void setFrequentFlyer(int i, org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeFrequentFlyer _value) {
        this.frequentFlyer[i] = _value;
    }


    /**
     * Gets the spanishFamilyDiscount value for this AirSearchPrefsType.
     * 
     * @return spanishFamilyDiscount
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscount getSpanishFamilyDiscount() {
        return spanishFamilyDiscount;
    }


    /**
     * Sets the spanishFamilyDiscount value for this AirSearchPrefsType.
     * 
     * @param spanishFamilyDiscount
     */
    public void setSpanishFamilyDiscount(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscount spanishFamilyDiscount) {
        this.spanishFamilyDiscount = spanishFamilyDiscount;
    }


    /**
     * Gets the interlineBrands value for this AirSearchPrefsType.
     * 
     * @return interlineBrands
     */
    public org.opentravel.www.OTA._2003._05.BrandType[] getInterlineBrands() {
        return interlineBrands;
    }


    /**
     * Sets the interlineBrands value for this AirSearchPrefsType.
     * 
     * @param interlineBrands
     */
    public void setInterlineBrands(org.opentravel.www.OTA._2003._05.BrandType[] interlineBrands) {
        this.interlineBrands = interlineBrands;
    }


    /**
     * Gets the smokingAllowed value for this AirSearchPrefsType.
     * 
     * @return smokingAllowed
     */
    public java.lang.Boolean getSmokingAllowed() {
        return smokingAllowed;
    }


    /**
     * Sets the smokingAllowed value for this AirSearchPrefsType.
     * 
     * @param smokingAllowed
     */
    public void setSmokingAllowed(java.lang.Boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }


    /**
     * Gets the onTimeRate value for this AirSearchPrefsType.
     * 
     * @return onTimeRate
     */
    public java.math.BigDecimal getOnTimeRate() {
        return onTimeRate;
    }


    /**
     * Sets the onTimeRate value for this AirSearchPrefsType.
     * 
     * @param onTimeRate
     */
    public void setOnTimeRate(java.math.BigDecimal onTimeRate) {
        this.onTimeRate = onTimeRate;
    }


    /**
     * Gets the ETicketDesired value for this AirSearchPrefsType.
     * 
     * @return ETicketDesired
     */
    public java.lang.Boolean getETicketDesired() {
        return ETicketDesired;
    }


    /**
     * Sets the ETicketDesired value for this AirSearchPrefsType.
     * 
     * @param ETicketDesired
     */
    public void setETicketDesired(java.lang.Boolean ETicketDesired) {
        this.ETicketDesired = ETicketDesired;
    }


    /**
     * Gets the validInterlineTicket value for this AirSearchPrefsType.
     * 
     * @return validInterlineTicket
     */
    public java.lang.Boolean getValidInterlineTicket() {
        return validInterlineTicket;
    }


    /**
     * Sets the validInterlineTicket value for this AirSearchPrefsType.
     * 
     * @param validInterlineTicket
     */
    public void setValidInterlineTicket(java.lang.Boolean validInterlineTicket) {
        this.validInterlineTicket = validInterlineTicket;
    }


    /**
     * Gets the maxStopsQuantity value for this AirSearchPrefsType.
     * 
     * @return maxStopsQuantity
     */
    public java.math.BigInteger getMaxStopsQuantity() {
        return maxStopsQuantity;
    }


    /**
     * Sets the maxStopsQuantity value for this AirSearchPrefsType.
     * 
     * @param maxStopsQuantity
     */
    public void setMaxStopsQuantity(java.math.BigInteger maxStopsQuantity) {
        this.maxStopsQuantity = maxStopsQuantity;
    }


    /**
     * Gets the useAllFlights value for this AirSearchPrefsType.
     * 
     * @return useAllFlights
     */
    public java.lang.Boolean getUseAllFlights() {
        return useAllFlights;
    }


    /**
     * Sets the useAllFlights value for this AirSearchPrefsType.
     * 
     * @param useAllFlights
     */
    public void setUseAllFlights(java.lang.Boolean useAllFlights) {
        this.useAllFlights = useAllFlights;
    }


    /**
     * Gets the allFlightsData value for this AirSearchPrefsType.
     * 
     * @return allFlightsData
     */
    public java.lang.Boolean getAllFlightsData() {
        return allFlightsData;
    }


    /**
     * Sets the allFlightsData value for this AirSearchPrefsType.
     * 
     * @param allFlightsData
     */
    public void setAllFlightsData(java.lang.Boolean allFlightsData) {
        this.allFlightsData = allFlightsData;
    }


    /**
     * Gets the hybrid value for this AirSearchPrefsType.
     * 
     * @return hybrid
     */
    public java.lang.Boolean getHybrid() {
        return hybrid;
    }


    /**
     * Sets the hybrid value for this AirSearchPrefsType.
     * 
     * @param hybrid
     */
    public void setHybrid(java.lang.Boolean hybrid) {
        this.hybrid = hybrid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsType)) return false;
        AirSearchPrefsType other = (AirSearchPrefsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorPref==null && other.getVendorPref()==null) || 
             (this.vendorPref!=null &&
              java.util.Arrays.equals(this.vendorPref, other.getVendorPref()))) &&
            ((this.flightTypePref==null && other.getFlightTypePref()==null) || 
             (this.flightTypePref!=null &&
              this.flightTypePref.equals(other.getFlightTypePref()))) &&
            ((this.fareRestrictPref==null && other.getFareRestrictPref()==null) || 
             (this.fareRestrictPref!=null &&
              java.util.Arrays.equals(this.fareRestrictPref, other.getFareRestrictPref()))) &&
            ((this.equipPref==null && other.getEquipPref()==null) || 
             (this.equipPref!=null &&
              java.util.Arrays.equals(this.equipPref, other.getEquipPref()))) &&
            ((this.cabinPref==null && other.getCabinPref()==null) || 
             (this.cabinPref!=null &&
              java.util.Arrays.equals(this.cabinPref, other.getCabinPref()))) &&
            ((this.ticketDistribPref==null && other.getTicketDistribPref()==null) || 
             (this.ticketDistribPref!=null &&
              java.util.Arrays.equals(this.ticketDistribPref, other.getTicketDistribPref()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.ancillaryFees==null && other.getAncillaryFees()==null) || 
             (this.ancillaryFees!=null &&
              java.util.Arrays.equals(this.ancillaryFees, other.getAncillaryFees()))) &&
            ((this.frequentFlyer==null && other.getFrequentFlyer()==null) || 
             (this.frequentFlyer!=null &&
              java.util.Arrays.equals(this.frequentFlyer, other.getFrequentFlyer()))) &&
            ((this.spanishFamilyDiscount==null && other.getSpanishFamilyDiscount()==null) || 
             (this.spanishFamilyDiscount!=null &&
              this.spanishFamilyDiscount.equals(other.getSpanishFamilyDiscount()))) &&
            ((this.interlineBrands==null && other.getInterlineBrands()==null) || 
             (this.interlineBrands!=null &&
              java.util.Arrays.equals(this.interlineBrands, other.getInterlineBrands()))) &&
            ((this.smokingAllowed==null && other.getSmokingAllowed()==null) || 
             (this.smokingAllowed!=null &&
              this.smokingAllowed.equals(other.getSmokingAllowed()))) &&
            ((this.onTimeRate==null && other.getOnTimeRate()==null) || 
             (this.onTimeRate!=null &&
              this.onTimeRate.equals(other.getOnTimeRate()))) &&
            ((this.ETicketDesired==null && other.getETicketDesired()==null) || 
             (this.ETicketDesired!=null &&
              this.ETicketDesired.equals(other.getETicketDesired()))) &&
            ((this.validInterlineTicket==null && other.getValidInterlineTicket()==null) || 
             (this.validInterlineTicket!=null &&
              this.validInterlineTicket.equals(other.getValidInterlineTicket()))) &&
            ((this.maxStopsQuantity==null && other.getMaxStopsQuantity()==null) || 
             (this.maxStopsQuantity!=null &&
              this.maxStopsQuantity.equals(other.getMaxStopsQuantity()))) &&
            ((this.useAllFlights==null && other.getUseAllFlights()==null) || 
             (this.useAllFlights!=null &&
              this.useAllFlights.equals(other.getUseAllFlights()))) &&
            ((this.allFlightsData==null && other.getAllFlightsData()==null) || 
             (this.allFlightsData!=null &&
              this.allFlightsData.equals(other.getAllFlightsData()))) &&
            ((this.hybrid==null && other.getHybrid()==null) || 
             (this.hybrid!=null &&
              this.hybrid.equals(other.getHybrid())));
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
        if (getVendorPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlightTypePref() != null) {
            _hashCode += getFlightTypePref().hashCode();
        }
        if (getFareRestrictPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareRestrictPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareRestrictPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEquipPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEquipPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEquipPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCabinPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCabinPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCabinPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTicketDistribPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTicketDistribPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTicketDistribPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getAncillaryFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAncillaryFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAncillaryFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFrequentFlyer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequentFlyer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequentFlyer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpanishFamilyDiscount() != null) {
            _hashCode += getSpanishFamilyDiscount().hashCode();
        }
        if (getInterlineBrands() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterlineBrands());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterlineBrands(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmokingAllowed() != null) {
            _hashCode += getSmokingAllowed().hashCode();
        }
        if (getOnTimeRate() != null) {
            _hashCode += getOnTimeRate().hashCode();
        }
        if (getETicketDesired() != null) {
            _hashCode += getETicketDesired().hashCode();
        }
        if (getValidInterlineTicket() != null) {
            _hashCode += getValidInterlineTicket().hashCode();
        }
        if (getMaxStopsQuantity() != null) {
            _hashCode += getMaxStopsQuantity().hashCode();
        }
        if (getUseAllFlights() != null) {
            _hashCode += getUseAllFlights().hashCode();
        }
        if (getAllFlightsData() != null) {
            _hashCode += getAllFlightsData().hashCode();
        }
        if (getHybrid() != null) {
            _hashCode += getHybrid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirSearchPrefsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("smokingAllowed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SmokingAllowed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("onTimeRate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OnTimeRate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Percentage"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ETicketDesired");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ETicketDesired"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validInterlineTicket");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ValidInterlineTicket"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxStopsQuantity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxStopsQuantity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to999"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("useAllFlights");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UseAllFlights"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("allFlightsData");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AllFlightsData"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hybrid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Hybrid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VendorPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNamePrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightTypePref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightTypePref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightTypePrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareRestrictPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareRestrictPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>FareRestrictPref"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquipPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquipmentTypePref"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabinPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CabinPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CabinPrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketDistribPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketDistribPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketDistribPrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>TPA_Extensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>AncillaryFees>AncillaryFeeGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AncillaryFeeGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequentFlyer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FrequentFlyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>FrequentFlyer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spanishFamilyDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SpanishFamilyDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>SpanishFamilyDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interlineBrands");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "InterlineBrands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BrandType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Brand"));
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
