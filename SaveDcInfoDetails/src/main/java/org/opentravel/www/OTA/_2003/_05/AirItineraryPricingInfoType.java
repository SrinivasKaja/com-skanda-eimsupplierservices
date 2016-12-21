/**
 * AirItineraryPricingInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Pricing Information for an Air Itinerary
 */
public class AirItineraryPricingInfoType  implements java.io.Serializable {
    /* Total price of the itinerary */
    private org.opentravel.www.OTA._2003._05.ItinTotalFareType itinTotalFare;

    /* This is a collection of PTC Fare Breakdowns */
    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownType[] PTC_FareBreakdowns;

    /* This is a collection of FareInfo */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfo[] fareInfos;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_Extensions TPA_Extensions;

    private java.lang.String pricingSource;  // attribute

    private java.lang.String pricingSubSource;  // attribute

    private java.lang.String pseudoCityCode;  // attribute

    private java.lang.String brandID;  // attribute

    private java.lang.Boolean fareReturned;  // attribute

    private java.lang.String fareStatus;  // attribute

    private java.lang.Boolean cachedItin;  // attribute

    private java.lang.String cachePartition;  // attribute

    private org.apache.axis.types.NonNegativeInteger cachePartitionPriority;  // attribute

    private java.lang.String cacheVersion;  // attribute

    private java.math.BigInteger timeToLive;  // attribute

    private boolean alternateCityOption;  // attribute

    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType lastTicketDate;  // attribute

    private java.lang.String privateFareType;  // attribute

    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator spanishFamilyDiscountIndicator;  // attribute

    private org.apache.axis.types.PositiveInteger flexibleFareID;  // attribute

    private java.util.Date previousExchangeDate;  // attribute

    private org.opentravel.www.OTA._2003._05.ReissueExchange reissueExchange;  // attribute

    private java.util.Date advancedPurchaseDate;  // attribute

    private java.util.Date purchaseByDate;  // attribute

    public AirItineraryPricingInfoType() {
    }

    public AirItineraryPricingInfoType(
           org.opentravel.www.OTA._2003._05.ItinTotalFareType itinTotalFare,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownType[] PTC_FareBreakdowns,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfo[] fareInfos,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_Extensions TPA_Extensions,
           java.lang.String pricingSource,
           java.lang.String pricingSubSource,
           java.lang.String pseudoCityCode,
           java.lang.String brandID,
           java.lang.Boolean fareReturned,
           java.lang.String fareStatus,
           java.lang.Boolean cachedItin,
           java.lang.String cachePartition,
           org.apache.axis.types.NonNegativeInteger cachePartitionPriority,
           java.lang.String cacheVersion,
           java.math.BigInteger timeToLive,
           boolean alternateCityOption,
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType lastTicketDate,
           java.lang.String privateFareType,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator spanishFamilyDiscountIndicator,
           org.apache.axis.types.PositiveInteger flexibleFareID,
           java.util.Date previousExchangeDate,
           org.opentravel.www.OTA._2003._05.ReissueExchange reissueExchange,
           java.util.Date advancedPurchaseDate,
           java.util.Date purchaseByDate) {
           this.itinTotalFare = itinTotalFare;
           this.PTC_FareBreakdowns = PTC_FareBreakdowns;
           this.fareInfos = fareInfos;
           this.TPA_Extensions = TPA_Extensions;
           this.pricingSource = pricingSource;
           this.pricingSubSource = pricingSubSource;
           this.pseudoCityCode = pseudoCityCode;
           this.brandID = brandID;
           this.fareReturned = fareReturned;
           this.fareStatus = fareStatus;
           this.cachedItin = cachedItin;
           this.cachePartition = cachePartition;
           this.cachePartitionPriority = cachePartitionPriority;
           this.cacheVersion = cacheVersion;
           this.timeToLive = timeToLive;
           this.alternateCityOption = alternateCityOption;
           this.lastTicketDate = lastTicketDate;
           this.privateFareType = privateFareType;
           this.spanishFamilyDiscountIndicator = spanishFamilyDiscountIndicator;
           this.flexibleFareID = flexibleFareID;
           this.previousExchangeDate = previousExchangeDate;
           this.reissueExchange = reissueExchange;
           this.advancedPurchaseDate = advancedPurchaseDate;
           this.purchaseByDate = purchaseByDate;
    }


    /**
     * Gets the itinTotalFare value for this AirItineraryPricingInfoType.
     * 
     * @return itinTotalFare   * Total price of the itinerary
     */
    public org.opentravel.www.OTA._2003._05.ItinTotalFareType getItinTotalFare() {
        return itinTotalFare;
    }


    /**
     * Sets the itinTotalFare value for this AirItineraryPricingInfoType.
     * 
     * @param itinTotalFare   * Total price of the itinerary
     */
    public void setItinTotalFare(org.opentravel.www.OTA._2003._05.ItinTotalFareType itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
    }


    /**
     * Gets the PTC_FareBreakdowns value for this AirItineraryPricingInfoType.
     * 
     * @return PTC_FareBreakdowns   * This is a collection of PTC Fare Breakdowns
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownType[] getPTC_FareBreakdowns() {
        return PTC_FareBreakdowns;
    }


    /**
     * Sets the PTC_FareBreakdowns value for this AirItineraryPricingInfoType.
     * 
     * @param PTC_FareBreakdowns   * This is a collection of PTC Fare Breakdowns
     */
    public void setPTC_FareBreakdowns(org.opentravel.www.OTA._2003._05.PTCFareBreakdownType[] PTC_FareBreakdowns) {
        this.PTC_FareBreakdowns = PTC_FareBreakdowns;
    }


    /**
     * Gets the fareInfos value for this AirItineraryPricingInfoType.
     * 
     * @return fareInfos   * This is a collection of FareInfo
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfo[] getFareInfos() {
        return fareInfos;
    }


    /**
     * Sets the fareInfos value for this AirItineraryPricingInfoType.
     * 
     * @param fareInfos   * This is a collection of FareInfo
     */
    public void setFareInfos(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfo[] fareInfos) {
        this.fareInfos = fareInfos;
    }


    /**
     * Gets the TPA_Extensions value for this AirItineraryPricingInfoType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this AirItineraryPricingInfoType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the pricingSource value for this AirItineraryPricingInfoType.
     * 
     * @return pricingSource
     */
    public java.lang.String getPricingSource() {
        return pricingSource;
    }


    /**
     * Sets the pricingSource value for this AirItineraryPricingInfoType.
     * 
     * @param pricingSource
     */
    public void setPricingSource(java.lang.String pricingSource) {
        this.pricingSource = pricingSource;
    }


    /**
     * Gets the pricingSubSource value for this AirItineraryPricingInfoType.
     * 
     * @return pricingSubSource
     */
    public java.lang.String getPricingSubSource() {
        return pricingSubSource;
    }


    /**
     * Sets the pricingSubSource value for this AirItineraryPricingInfoType.
     * 
     * @param pricingSubSource
     */
    public void setPricingSubSource(java.lang.String pricingSubSource) {
        this.pricingSubSource = pricingSubSource;
    }


    /**
     * Gets the pseudoCityCode value for this AirItineraryPricingInfoType.
     * 
     * @return pseudoCityCode
     */
    public java.lang.String getPseudoCityCode() {
        return pseudoCityCode;
    }


    /**
     * Sets the pseudoCityCode value for this AirItineraryPricingInfoType.
     * 
     * @param pseudoCityCode
     */
    public void setPseudoCityCode(java.lang.String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }


    /**
     * Gets the brandID value for this AirItineraryPricingInfoType.
     * 
     * @return brandID
     */
    public java.lang.String getBrandID() {
        return brandID;
    }


    /**
     * Sets the brandID value for this AirItineraryPricingInfoType.
     * 
     * @param brandID
     */
    public void setBrandID(java.lang.String brandID) {
        this.brandID = brandID;
    }


    /**
     * Gets the fareReturned value for this AirItineraryPricingInfoType.
     * 
     * @return fareReturned
     */
    public java.lang.Boolean getFareReturned() {
        return fareReturned;
    }


    /**
     * Sets the fareReturned value for this AirItineraryPricingInfoType.
     * 
     * @param fareReturned
     */
    public void setFareReturned(java.lang.Boolean fareReturned) {
        this.fareReturned = fareReturned;
    }


    /**
     * Gets the fareStatus value for this AirItineraryPricingInfoType.
     * 
     * @return fareStatus
     */
    public java.lang.String getFareStatus() {
        return fareStatus;
    }


    /**
     * Sets the fareStatus value for this AirItineraryPricingInfoType.
     * 
     * @param fareStatus
     */
    public void setFareStatus(java.lang.String fareStatus) {
        this.fareStatus = fareStatus;
    }


    /**
     * Gets the cachedItin value for this AirItineraryPricingInfoType.
     * 
     * @return cachedItin
     */
    public java.lang.Boolean getCachedItin() {
        return cachedItin;
    }


    /**
     * Sets the cachedItin value for this AirItineraryPricingInfoType.
     * 
     * @param cachedItin
     */
    public void setCachedItin(java.lang.Boolean cachedItin) {
        this.cachedItin = cachedItin;
    }


    /**
     * Gets the cachePartition value for this AirItineraryPricingInfoType.
     * 
     * @return cachePartition
     */
    public java.lang.String getCachePartition() {
        return cachePartition;
    }


    /**
     * Sets the cachePartition value for this AirItineraryPricingInfoType.
     * 
     * @param cachePartition
     */
    public void setCachePartition(java.lang.String cachePartition) {
        this.cachePartition = cachePartition;
    }


    /**
     * Gets the cachePartitionPriority value for this AirItineraryPricingInfoType.
     * 
     * @return cachePartitionPriority
     */
    public org.apache.axis.types.NonNegativeInteger getCachePartitionPriority() {
        return cachePartitionPriority;
    }


    /**
     * Sets the cachePartitionPriority value for this AirItineraryPricingInfoType.
     * 
     * @param cachePartitionPriority
     */
    public void setCachePartitionPriority(org.apache.axis.types.NonNegativeInteger cachePartitionPriority) {
        this.cachePartitionPriority = cachePartitionPriority;
    }


    /**
     * Gets the cacheVersion value for this AirItineraryPricingInfoType.
     * 
     * @return cacheVersion
     */
    public java.lang.String getCacheVersion() {
        return cacheVersion;
    }


    /**
     * Sets the cacheVersion value for this AirItineraryPricingInfoType.
     * 
     * @param cacheVersion
     */
    public void setCacheVersion(java.lang.String cacheVersion) {
        this.cacheVersion = cacheVersion;
    }


    /**
     * Gets the timeToLive value for this AirItineraryPricingInfoType.
     * 
     * @return timeToLive
     */
    public java.math.BigInteger getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this AirItineraryPricingInfoType.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(java.math.BigInteger timeToLive) {
        this.timeToLive = timeToLive;
    }


    /**
     * Gets the alternateCityOption value for this AirItineraryPricingInfoType.
     * 
     * @return alternateCityOption
     */
    public boolean isAlternateCityOption() {
        return alternateCityOption;
    }


    /**
     * Sets the alternateCityOption value for this AirItineraryPricingInfoType.
     * 
     * @param alternateCityOption
     */
    public void setAlternateCityOption(boolean alternateCityOption) {
        this.alternateCityOption = alternateCityOption;
    }


    /**
     * Gets the lastTicketDate value for this AirItineraryPricingInfoType.
     * 
     * @return lastTicketDate
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getLastTicketDate() {
        return lastTicketDate;
    }


    /**
     * Sets the lastTicketDate value for this AirItineraryPricingInfoType.
     * 
     * @param lastTicketDate
     */
    public void setLastTicketDate(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType lastTicketDate) {
        this.lastTicketDate = lastTicketDate;
    }


    /**
     * Gets the privateFareType value for this AirItineraryPricingInfoType.
     * 
     * @return privateFareType
     */
    public java.lang.String getPrivateFareType() {
        return privateFareType;
    }


    /**
     * Sets the privateFareType value for this AirItineraryPricingInfoType.
     * 
     * @param privateFareType
     */
    public void setPrivateFareType(java.lang.String privateFareType) {
        this.privateFareType = privateFareType;
    }


    /**
     * Gets the spanishFamilyDiscountIndicator value for this AirItineraryPricingInfoType.
     * 
     * @return spanishFamilyDiscountIndicator
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator getSpanishFamilyDiscountIndicator() {
        return spanishFamilyDiscountIndicator;
    }


    /**
     * Sets the spanishFamilyDiscountIndicator value for this AirItineraryPricingInfoType.
     * 
     * @param spanishFamilyDiscountIndicator
     */
    public void setSpanishFamilyDiscountIndicator(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator spanishFamilyDiscountIndicator) {
        this.spanishFamilyDiscountIndicator = spanishFamilyDiscountIndicator;
    }


    /**
     * Gets the flexibleFareID value for this AirItineraryPricingInfoType.
     * 
     * @return flexibleFareID
     */
    public org.apache.axis.types.PositiveInteger getFlexibleFareID() {
        return flexibleFareID;
    }


    /**
     * Sets the flexibleFareID value for this AirItineraryPricingInfoType.
     * 
     * @param flexibleFareID
     */
    public void setFlexibleFareID(org.apache.axis.types.PositiveInteger flexibleFareID) {
        this.flexibleFareID = flexibleFareID;
    }


    /**
     * Gets the previousExchangeDate value for this AirItineraryPricingInfoType.
     * 
     * @return previousExchangeDate
     */
    public java.util.Date getPreviousExchangeDate() {
        return previousExchangeDate;
    }


    /**
     * Sets the previousExchangeDate value for this AirItineraryPricingInfoType.
     * 
     * @param previousExchangeDate
     */
    public void setPreviousExchangeDate(java.util.Date previousExchangeDate) {
        this.previousExchangeDate = previousExchangeDate;
    }


    /**
     * Gets the reissueExchange value for this AirItineraryPricingInfoType.
     * 
     * @return reissueExchange
     */
    public org.opentravel.www.OTA._2003._05.ReissueExchange getReissueExchange() {
        return reissueExchange;
    }


    /**
     * Sets the reissueExchange value for this AirItineraryPricingInfoType.
     * 
     * @param reissueExchange
     */
    public void setReissueExchange(org.opentravel.www.OTA._2003._05.ReissueExchange reissueExchange) {
        this.reissueExchange = reissueExchange;
    }


    /**
     * Gets the advancedPurchaseDate value for this AirItineraryPricingInfoType.
     * 
     * @return advancedPurchaseDate
     */
    public java.util.Date getAdvancedPurchaseDate() {
        return advancedPurchaseDate;
    }


    /**
     * Sets the advancedPurchaseDate value for this AirItineraryPricingInfoType.
     * 
     * @param advancedPurchaseDate
     */
    public void setAdvancedPurchaseDate(java.util.Date advancedPurchaseDate) {
        this.advancedPurchaseDate = advancedPurchaseDate;
    }


    /**
     * Gets the purchaseByDate value for this AirItineraryPricingInfoType.
     * 
     * @return purchaseByDate
     */
    public java.util.Date getPurchaseByDate() {
        return purchaseByDate;
    }


    /**
     * Sets the purchaseByDate value for this AirItineraryPricingInfoType.
     * 
     * @param purchaseByDate
     */
    public void setPurchaseByDate(java.util.Date purchaseByDate) {
        this.purchaseByDate = purchaseByDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoType)) return false;
        AirItineraryPricingInfoType other = (AirItineraryPricingInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itinTotalFare==null && other.getItinTotalFare()==null) || 
             (this.itinTotalFare!=null &&
              this.itinTotalFare.equals(other.getItinTotalFare()))) &&
            ((this.PTC_FareBreakdowns==null && other.getPTC_FareBreakdowns()==null) || 
             (this.PTC_FareBreakdowns!=null &&
              java.util.Arrays.equals(this.PTC_FareBreakdowns, other.getPTC_FareBreakdowns()))) &&
            ((this.fareInfos==null && other.getFareInfos()==null) || 
             (this.fareInfos!=null &&
              java.util.Arrays.equals(this.fareInfos, other.getFareInfos()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.pricingSource==null && other.getPricingSource()==null) || 
             (this.pricingSource!=null &&
              this.pricingSource.equals(other.getPricingSource()))) &&
            ((this.pricingSubSource==null && other.getPricingSubSource()==null) || 
             (this.pricingSubSource!=null &&
              this.pricingSubSource.equals(other.getPricingSubSource()))) &&
            ((this.pseudoCityCode==null && other.getPseudoCityCode()==null) || 
             (this.pseudoCityCode!=null &&
              this.pseudoCityCode.equals(other.getPseudoCityCode()))) &&
            ((this.brandID==null && other.getBrandID()==null) || 
             (this.brandID!=null &&
              this.brandID.equals(other.getBrandID()))) &&
            ((this.fareReturned==null && other.getFareReturned()==null) || 
             (this.fareReturned!=null &&
              this.fareReturned.equals(other.getFareReturned()))) &&
            ((this.fareStatus==null && other.getFareStatus()==null) || 
             (this.fareStatus!=null &&
              this.fareStatus.equals(other.getFareStatus()))) &&
            ((this.cachedItin==null && other.getCachedItin()==null) || 
             (this.cachedItin!=null &&
              this.cachedItin.equals(other.getCachedItin()))) &&
            ((this.cachePartition==null && other.getCachePartition()==null) || 
             (this.cachePartition!=null &&
              this.cachePartition.equals(other.getCachePartition()))) &&
            ((this.cachePartitionPriority==null && other.getCachePartitionPriority()==null) || 
             (this.cachePartitionPriority!=null &&
              this.cachePartitionPriority.equals(other.getCachePartitionPriority()))) &&
            ((this.cacheVersion==null && other.getCacheVersion()==null) || 
             (this.cacheVersion!=null &&
              this.cacheVersion.equals(other.getCacheVersion()))) &&
            ((this.timeToLive==null && other.getTimeToLive()==null) || 
             (this.timeToLive!=null &&
              this.timeToLive.equals(other.getTimeToLive()))) &&
            this.alternateCityOption == other.isAlternateCityOption() &&
            ((this.lastTicketDate==null && other.getLastTicketDate()==null) || 
             (this.lastTicketDate!=null &&
              this.lastTicketDate.equals(other.getLastTicketDate()))) &&
            ((this.privateFareType==null && other.getPrivateFareType()==null) || 
             (this.privateFareType!=null &&
              this.privateFareType.equals(other.getPrivateFareType()))) &&
            ((this.spanishFamilyDiscountIndicator==null && other.getSpanishFamilyDiscountIndicator()==null) || 
             (this.spanishFamilyDiscountIndicator!=null &&
              this.spanishFamilyDiscountIndicator.equals(other.getSpanishFamilyDiscountIndicator()))) &&
            ((this.flexibleFareID==null && other.getFlexibleFareID()==null) || 
             (this.flexibleFareID!=null &&
              this.flexibleFareID.equals(other.getFlexibleFareID()))) &&
            ((this.previousExchangeDate==null && other.getPreviousExchangeDate()==null) || 
             (this.previousExchangeDate!=null &&
              this.previousExchangeDate.equals(other.getPreviousExchangeDate()))) &&
            ((this.reissueExchange==null && other.getReissueExchange()==null) || 
             (this.reissueExchange!=null &&
              this.reissueExchange.equals(other.getReissueExchange()))) &&
            ((this.advancedPurchaseDate==null && other.getAdvancedPurchaseDate()==null) || 
             (this.advancedPurchaseDate!=null &&
              this.advancedPurchaseDate.equals(other.getAdvancedPurchaseDate()))) &&
            ((this.purchaseByDate==null && other.getPurchaseByDate()==null) || 
             (this.purchaseByDate!=null &&
              this.purchaseByDate.equals(other.getPurchaseByDate())));
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
        if (getItinTotalFare() != null) {
            _hashCode += getItinTotalFare().hashCode();
        }
        if (getPTC_FareBreakdowns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPTC_FareBreakdowns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPTC_FareBreakdowns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFareInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getPricingSource() != null) {
            _hashCode += getPricingSource().hashCode();
        }
        if (getPricingSubSource() != null) {
            _hashCode += getPricingSubSource().hashCode();
        }
        if (getPseudoCityCode() != null) {
            _hashCode += getPseudoCityCode().hashCode();
        }
        if (getBrandID() != null) {
            _hashCode += getBrandID().hashCode();
        }
        if (getFareReturned() != null) {
            _hashCode += getFareReturned().hashCode();
        }
        if (getFareStatus() != null) {
            _hashCode += getFareStatus().hashCode();
        }
        if (getCachedItin() != null) {
            _hashCode += getCachedItin().hashCode();
        }
        if (getCachePartition() != null) {
            _hashCode += getCachePartition().hashCode();
        }
        if (getCachePartitionPriority() != null) {
            _hashCode += getCachePartitionPriority().hashCode();
        }
        if (getCacheVersion() != null) {
            _hashCode += getCacheVersion().hashCode();
        }
        if (getTimeToLive() != null) {
            _hashCode += getTimeToLive().hashCode();
        }
        _hashCode += (isAlternateCityOption() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLastTicketDate() != null) {
            _hashCode += getLastTicketDate().hashCode();
        }
        if (getPrivateFareType() != null) {
            _hashCode += getPrivateFareType().hashCode();
        }
        if (getSpanishFamilyDiscountIndicator() != null) {
            _hashCode += getSpanishFamilyDiscountIndicator().hashCode();
        }
        if (getFlexibleFareID() != null) {
            _hashCode += getFlexibleFareID().hashCode();
        }
        if (getPreviousExchangeDate() != null) {
            _hashCode += getPreviousExchangeDate().hashCode();
        }
        if (getReissueExchange() != null) {
            _hashCode += getReissueExchange().hashCode();
        }
        if (getAdvancedPurchaseDate() != null) {
            _hashCode += getAdvancedPurchaseDate().hashCode();
        }
        if (getPurchaseByDate() != null) {
            _hashCode += getPurchaseByDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryPricingInfoType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pricingSource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PricingSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponsePricingSourceType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pricingSubSource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PricingSubSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricingSubSourceType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pseudoCityCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PseudoCityCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareReturned");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareReturned"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cachedItin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CachedItin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cachePartition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CachePartition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cachePartitionPriority");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CachePartitionPriority"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cacheVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CacheVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timeToLive");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TimeToLive"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("alternateCityOption");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AlternateCityOption"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lastTicketDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LastTicketDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("privateFareType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PrivateFareType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>PrivateFareType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("spanishFamilyDiscountIndicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SpanishFamilyDiscountIndicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>SpanishFamilyDiscountIndicator"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("flexibleFareID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FlexibleFareID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("previousExchangeDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreviousExchangeDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueExchange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueExchange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ReissueExchange"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("advancedPurchaseDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdvancedPurchaseDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("purchaseByDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PurchaseByDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itinTotalFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItinTotalFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItinTotalFareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTC_FareBreakdowns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PTC_FareBreakdowns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PTCFareBreakdownType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PTC_FareBreakdown"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>FareInfos>FareInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirItineraryPricingInfoType>TPA_Extensions"));
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
