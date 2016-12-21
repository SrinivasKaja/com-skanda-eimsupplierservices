/**
 * PriceRequestInformationTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_Extensions  implements java.io.Serializable {
    /* This element finds only public fares. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPublicFare publicFare;

    /* This element finds only private fares. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPrivateFare privateFare;

    /* This element finds only IATA fares. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIATAFare IATAFare;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsWebFare webFare;

    /* This element governs how flights are returned. A user can uses
     * a priority of 1-4 to make this determination. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriority priority;

    /* This element restricts fares which can be returned in response.
     * If a customer passes this element, all its children should be specified. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicators indicators;

    /* Promotional Identifier - a string which identifies a promotion,
     * possibly giving a discount prices etc. */
    private java.lang.String promoID;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCustomerType customerType;

    /* This element governs how flights are returned when multiple
     * passenger groups are requested. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups multipleTravelerGroups;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators brandedFareIndicators;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatus passengerStatus;

    /* Will return the fares available for specified point of sale
     * and priced in this point of sale currency. Currency is overriden by
     * PriceRequestInformation@CurrencyCode. */
    private org.opentravel.www.OTA._2003._05.PointOfSaleOverrideType pointOfSaleOverride;

    private org.opentravel.www.OTA._2003._05.PointOfTicketingOverrideType pointOfTicketingOverride;

    /* Apply resident discount in CLFE */
    private org.opentravel.www.OTA._2003._05.ApplyResidentDiscountType applyResidentDiscount;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsETicketableOverride ETicketableOverride;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCurrency currency;

    /* Use reduced constructions (simple fare paths with restrictions
     * on the number of fare components). */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsUseReducedConstructions useReducedConstructions;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsOBFees OBFees;

    /* Force fare breaks at leg points if split taxes by leg requested.
     * By default set to true. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareBreaksAtLegs fareBreaksAtLegs;

    /* Capability to specify Plus-Up and Discount Amount and Percentage. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareAdjustment fareAdjustment;

    public PriceRequestInformationTypeTPA_Extensions() {
    }

    public PriceRequestInformationTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPublicFare publicFare,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPrivateFare privateFare,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIATAFare IATAFare,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsWebFare webFare,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriority priority,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicators indicators,
           java.lang.String promoID,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCustomerType customerType,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups multipleTravelerGroups,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators brandedFareIndicators,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatus passengerStatus,
           org.opentravel.www.OTA._2003._05.PointOfSaleOverrideType pointOfSaleOverride,
           org.opentravel.www.OTA._2003._05.PointOfTicketingOverrideType pointOfTicketingOverride,
           org.opentravel.www.OTA._2003._05.ApplyResidentDiscountType applyResidentDiscount,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsETicketableOverride ETicketableOverride,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCurrency currency,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsUseReducedConstructions useReducedConstructions,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsOBFees OBFees,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareBreaksAtLegs fareBreaksAtLegs,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareAdjustment fareAdjustment) {
           this.publicFare = publicFare;
           this.privateFare = privateFare;
           this.IATAFare = IATAFare;
           this.webFare = webFare;
           this.priority = priority;
           this.indicators = indicators;
           this.promoID = promoID;
           this.customerType = customerType;
           this.multipleTravelerGroups = multipleTravelerGroups;
           this.brandedFareIndicators = brandedFareIndicators;
           this.passengerStatus = passengerStatus;
           this.pointOfSaleOverride = pointOfSaleOverride;
           this.pointOfTicketingOverride = pointOfTicketingOverride;
           this.applyResidentDiscount = applyResidentDiscount;
           this.ETicketableOverride = ETicketableOverride;
           this.currency = currency;
           this.useReducedConstructions = useReducedConstructions;
           this.OBFees = OBFees;
           this.fareBreaksAtLegs = fareBreaksAtLegs;
           this.fareAdjustment = fareAdjustment;
    }


    /**
     * Gets the publicFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return publicFare   * This element finds only public fares.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPublicFare getPublicFare() {
        return publicFare;
    }


    /**
     * Sets the publicFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param publicFare   * This element finds only public fares.
     */
    public void setPublicFare(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPublicFare publicFare) {
        this.publicFare = publicFare;
    }


    /**
     * Gets the privateFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return privateFare   * This element finds only private fares.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPrivateFare getPrivateFare() {
        return privateFare;
    }


    /**
     * Sets the privateFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param privateFare   * This element finds only private fares.
     */
    public void setPrivateFare(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPrivateFare privateFare) {
        this.privateFare = privateFare;
    }


    /**
     * Gets the IATAFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return IATAFare   * This element finds only IATA fares.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIATAFare getIATAFare() {
        return IATAFare;
    }


    /**
     * Sets the IATAFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param IATAFare   * This element finds only IATA fares.
     */
    public void setIATAFare(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIATAFare IATAFare) {
        this.IATAFare = IATAFare;
    }


    /**
     * Gets the webFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return webFare
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsWebFare getWebFare() {
        return webFare;
    }


    /**
     * Sets the webFare value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param webFare
     */
    public void setWebFare(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsWebFare webFare) {
        this.webFare = webFare;
    }


    /**
     * Gets the priority value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return priority   * This element governs how flights are returned. A user can uses
     * a priority of 1-4 to make this determination.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param priority   * This element governs how flights are returned. A user can uses
     * a priority of 1-4 to make this determination.
     */
    public void setPriority(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the indicators value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return indicators   * This element restricts fares which can be returned in response.
     * If a customer passes this element, all its children should be specified.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicators getIndicators() {
        return indicators;
    }


    /**
     * Sets the indicators value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param indicators   * This element restricts fares which can be returned in response.
     * If a customer passes this element, all its children should be specified.
     */
    public void setIndicators(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicators indicators) {
        this.indicators = indicators;
    }


    /**
     * Gets the promoID value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return promoID   * Promotional Identifier - a string which identifies a promotion,
     * possibly giving a discount prices etc.
     */
    public java.lang.String getPromoID() {
        return promoID;
    }


    /**
     * Sets the promoID value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param promoID   * Promotional Identifier - a string which identifies a promotion,
     * possibly giving a discount prices etc.
     */
    public void setPromoID(java.lang.String promoID) {
        this.promoID = promoID;
    }


    /**
     * Gets the customerType value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return customerType
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCustomerType getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param customerType
     */
    public void setCustomerType(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCustomerType customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the multipleTravelerGroups value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return multipleTravelerGroups   * This element governs how flights are returned when multiple
     * passenger groups are requested.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups getMultipleTravelerGroups() {
        return multipleTravelerGroups;
    }


    /**
     * Sets the multipleTravelerGroups value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param multipleTravelerGroups   * This element governs how flights are returned when multiple
     * passenger groups are requested.
     */
    public void setMultipleTravelerGroups(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups multipleTravelerGroups) {
        this.multipleTravelerGroups = multipleTravelerGroups;
    }


    /**
     * Gets the brandedFareIndicators value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return brandedFareIndicators
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators getBrandedFareIndicators() {
        return brandedFareIndicators;
    }


    /**
     * Sets the brandedFareIndicators value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param brandedFareIndicators
     */
    public void setBrandedFareIndicators(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsBrandedFareIndicators brandedFareIndicators) {
        this.brandedFareIndicators = brandedFareIndicators;
    }


    /**
     * Gets the passengerStatus value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return passengerStatus
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatus getPassengerStatus() {
        return passengerStatus;
    }


    /**
     * Sets the passengerStatus value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param passengerStatus
     */
    public void setPassengerStatus(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPassengerStatus passengerStatus) {
        this.passengerStatus = passengerStatus;
    }


    /**
     * Gets the pointOfSaleOverride value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return pointOfSaleOverride   * Will return the fares available for specified point of sale
     * and priced in this point of sale currency. Currency is overriden by
     * PriceRequestInformation@CurrencyCode.
     */
    public org.opentravel.www.OTA._2003._05.PointOfSaleOverrideType getPointOfSaleOverride() {
        return pointOfSaleOverride;
    }


    /**
     * Sets the pointOfSaleOverride value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param pointOfSaleOverride   * Will return the fares available for specified point of sale
     * and priced in this point of sale currency. Currency is overriden by
     * PriceRequestInformation@CurrencyCode.
     */
    public void setPointOfSaleOverride(org.opentravel.www.OTA._2003._05.PointOfSaleOverrideType pointOfSaleOverride) {
        this.pointOfSaleOverride = pointOfSaleOverride;
    }


    /**
     * Gets the pointOfTicketingOverride value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return pointOfTicketingOverride
     */
    public org.opentravel.www.OTA._2003._05.PointOfTicketingOverrideType getPointOfTicketingOverride() {
        return pointOfTicketingOverride;
    }


    /**
     * Sets the pointOfTicketingOverride value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param pointOfTicketingOverride
     */
    public void setPointOfTicketingOverride(org.opentravel.www.OTA._2003._05.PointOfTicketingOverrideType pointOfTicketingOverride) {
        this.pointOfTicketingOverride = pointOfTicketingOverride;
    }


    /**
     * Gets the applyResidentDiscount value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return applyResidentDiscount   * Apply resident discount in CLFE
     */
    public org.opentravel.www.OTA._2003._05.ApplyResidentDiscountType getApplyResidentDiscount() {
        return applyResidentDiscount;
    }


    /**
     * Sets the applyResidentDiscount value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param applyResidentDiscount   * Apply resident discount in CLFE
     */
    public void setApplyResidentDiscount(org.opentravel.www.OTA._2003._05.ApplyResidentDiscountType applyResidentDiscount) {
        this.applyResidentDiscount = applyResidentDiscount;
    }


    /**
     * Gets the ETicketableOverride value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return ETicketableOverride
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsETicketableOverride getETicketableOverride() {
        return ETicketableOverride;
    }


    /**
     * Sets the ETicketableOverride value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param ETicketableOverride
     */
    public void setETicketableOverride(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsETicketableOverride ETicketableOverride) {
        this.ETicketableOverride = ETicketableOverride;
    }


    /**
     * Gets the currency value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return currency
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCurrency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param currency
     */
    public void setCurrency(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsCurrency currency) {
        this.currency = currency;
    }


    /**
     * Gets the useReducedConstructions value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return useReducedConstructions   * Use reduced constructions (simple fare paths with restrictions
     * on the number of fare components).
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsUseReducedConstructions getUseReducedConstructions() {
        return useReducedConstructions;
    }


    /**
     * Sets the useReducedConstructions value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param useReducedConstructions   * Use reduced constructions (simple fare paths with restrictions
     * on the number of fare components).
     */
    public void setUseReducedConstructions(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsUseReducedConstructions useReducedConstructions) {
        this.useReducedConstructions = useReducedConstructions;
    }


    /**
     * Gets the OBFees value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return OBFees
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsOBFees getOBFees() {
        return OBFees;
    }


    /**
     * Sets the OBFees value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param OBFees
     */
    public void setOBFees(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsOBFees OBFees) {
        this.OBFees = OBFees;
    }


    /**
     * Gets the fareBreaksAtLegs value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return fareBreaksAtLegs   * Force fare breaks at leg points if split taxes by leg requested.
     * By default set to true.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareBreaksAtLegs getFareBreaksAtLegs() {
        return fareBreaksAtLegs;
    }


    /**
     * Sets the fareBreaksAtLegs value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param fareBreaksAtLegs   * Force fare breaks at leg points if split taxes by leg requested.
     * By default set to true.
     */
    public void setFareBreaksAtLegs(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareBreaksAtLegs fareBreaksAtLegs) {
        this.fareBreaksAtLegs = fareBreaksAtLegs;
    }


    /**
     * Gets the fareAdjustment value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @return fareAdjustment   * Capability to specify Plus-Up and Discount Amount and Percentage.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareAdjustment getFareAdjustment() {
        return fareAdjustment;
    }


    /**
     * Sets the fareAdjustment value for this PriceRequestInformationTypeTPA_Extensions.
     * 
     * @param fareAdjustment   * Capability to specify Plus-Up and Discount Amount and Percentage.
     */
    public void setFareAdjustment(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsFareAdjustment fareAdjustment) {
        this.fareAdjustment = fareAdjustment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_Extensions)) return false;
        PriceRequestInformationTypeTPA_Extensions other = (PriceRequestInformationTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicFare==null && other.getPublicFare()==null) || 
             (this.publicFare!=null &&
              this.publicFare.equals(other.getPublicFare()))) &&
            ((this.privateFare==null && other.getPrivateFare()==null) || 
             (this.privateFare!=null &&
              this.privateFare.equals(other.getPrivateFare()))) &&
            ((this.IATAFare==null && other.getIATAFare()==null) || 
             (this.IATAFare!=null &&
              this.IATAFare.equals(other.getIATAFare()))) &&
            ((this.webFare==null && other.getWebFare()==null) || 
             (this.webFare!=null &&
              this.webFare.equals(other.getWebFare()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.indicators==null && other.getIndicators()==null) || 
             (this.indicators!=null &&
              this.indicators.equals(other.getIndicators()))) &&
            ((this.promoID==null && other.getPromoID()==null) || 
             (this.promoID!=null &&
              this.promoID.equals(other.getPromoID()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.multipleTravelerGroups==null && other.getMultipleTravelerGroups()==null) || 
             (this.multipleTravelerGroups!=null &&
              this.multipleTravelerGroups.equals(other.getMultipleTravelerGroups()))) &&
            ((this.brandedFareIndicators==null && other.getBrandedFareIndicators()==null) || 
             (this.brandedFareIndicators!=null &&
              this.brandedFareIndicators.equals(other.getBrandedFareIndicators()))) &&
            ((this.passengerStatus==null && other.getPassengerStatus()==null) || 
             (this.passengerStatus!=null &&
              this.passengerStatus.equals(other.getPassengerStatus()))) &&
            ((this.pointOfSaleOverride==null && other.getPointOfSaleOverride()==null) || 
             (this.pointOfSaleOverride!=null &&
              this.pointOfSaleOverride.equals(other.getPointOfSaleOverride()))) &&
            ((this.pointOfTicketingOverride==null && other.getPointOfTicketingOverride()==null) || 
             (this.pointOfTicketingOverride!=null &&
              this.pointOfTicketingOverride.equals(other.getPointOfTicketingOverride()))) &&
            ((this.applyResidentDiscount==null && other.getApplyResidentDiscount()==null) || 
             (this.applyResidentDiscount!=null &&
              this.applyResidentDiscount.equals(other.getApplyResidentDiscount()))) &&
            ((this.ETicketableOverride==null && other.getETicketableOverride()==null) || 
             (this.ETicketableOverride!=null &&
              this.ETicketableOverride.equals(other.getETicketableOverride()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.useReducedConstructions==null && other.getUseReducedConstructions()==null) || 
             (this.useReducedConstructions!=null &&
              this.useReducedConstructions.equals(other.getUseReducedConstructions()))) &&
            ((this.OBFees==null && other.getOBFees()==null) || 
             (this.OBFees!=null &&
              this.OBFees.equals(other.getOBFees()))) &&
            ((this.fareBreaksAtLegs==null && other.getFareBreaksAtLegs()==null) || 
             (this.fareBreaksAtLegs!=null &&
              this.fareBreaksAtLegs.equals(other.getFareBreaksAtLegs()))) &&
            ((this.fareAdjustment==null && other.getFareAdjustment()==null) || 
             (this.fareAdjustment!=null &&
              this.fareAdjustment.equals(other.getFareAdjustment())));
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
        if (getPublicFare() != null) {
            _hashCode += getPublicFare().hashCode();
        }
        if (getPrivateFare() != null) {
            _hashCode += getPrivateFare().hashCode();
        }
        if (getIATAFare() != null) {
            _hashCode += getIATAFare().hashCode();
        }
        if (getWebFare() != null) {
            _hashCode += getWebFare().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIndicators() != null) {
            _hashCode += getIndicators().hashCode();
        }
        if (getPromoID() != null) {
            _hashCode += getPromoID().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getMultipleTravelerGroups() != null) {
            _hashCode += getMultipleTravelerGroups().hashCode();
        }
        if (getBrandedFareIndicators() != null) {
            _hashCode += getBrandedFareIndicators().hashCode();
        }
        if (getPassengerStatus() != null) {
            _hashCode += getPassengerStatus().hashCode();
        }
        if (getPointOfSaleOverride() != null) {
            _hashCode += getPointOfSaleOverride().hashCode();
        }
        if (getPointOfTicketingOverride() != null) {
            _hashCode += getPointOfTicketingOverride().hashCode();
        }
        if (getApplyResidentDiscount() != null) {
            _hashCode += getApplyResidentDiscount().hashCode();
        }
        if (getETicketableOverride() != null) {
            _hashCode += getETicketableOverride().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getUseReducedConstructions() != null) {
            _hashCode += getUseReducedConstructions().hashCode();
        }
        if (getOBFees() != null) {
            _hashCode += getOBFees().hashCode();
        }
        if (getFareBreaksAtLegs() != null) {
            _hashCode += getFareBreaksAtLegs().hashCode();
        }
        if (getFareAdjustment() != null) {
            _hashCode += getFareAdjustment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PriceRequestInformationType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PublicFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PublicFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PrivateFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PrivateFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IATAFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IATAFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>IATAFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "WebFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>WebFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Priority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Indicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Indicators"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PromoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>CustomerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleTravelerGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MultipleTravelerGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>MultipleTravelerGroups"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandedFareIndicators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BrandedFareIndicators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>BrandedFareIndicators"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PassengerStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointOfSaleOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PointOfSaleOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PointOfSaleOverrideType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointOfTicketingOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PointOfTicketingOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PointOfTicketingOverrideType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyResidentDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ApplyResidentDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ApplyResidentDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ETicketableOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ETicketableOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>ETicketableOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Currency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useReducedConstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UseReducedConstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>UseReducedConstructions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OBFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>OBFees"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareBreaksAtLegs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareBreaksAtLegs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>FareBreaksAtLegs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>FareAdjustment"));
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
