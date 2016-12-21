/**
 * OTA_AirLowFareSearchRQTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_Extensions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.TransactionType intelliSellTransaction;

    private org.opentravel.www.OTA._2003._05.DiversityControlType diversityControl;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMessagingDetails messagingDetails;

    /* For each specified location provide an alternate location. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities[] alternateAirportCities;

    /* Specify maximum allowed distance from specified airport. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage alternateAirportMileage;

    private org.opentravel.www.OTA._2003._05.AwardShoppingType awardShopping;

    private org.opentravel.www.OTA._2003._05.BillingInformationType billing;

    private org.opentravel.www.OTA._2003._05.ExchangeSettingsType exchangeSettings;

    private org.opentravel.www.OTA._2003._05.ExchangeType[] exchange;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes splitTaxes;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing alternateDatesProcessing;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache itineraryCache;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket multiTicket;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsPartitions partitions;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsReservationData reservationData;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC[] alternatePCC;

    public OTA_AirLowFareSearchRQTPA_Extensions() {
    }

    public OTA_AirLowFareSearchRQTPA_Extensions(
           org.opentravel.www.OTA._2003._05.TransactionType intelliSellTransaction,
           org.opentravel.www.OTA._2003._05.DiversityControlType diversityControl,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMessagingDetails messagingDetails,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities[] alternateAirportCities,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage alternateAirportMileage,
           org.opentravel.www.OTA._2003._05.AwardShoppingType awardShopping,
           org.opentravel.www.OTA._2003._05.BillingInformationType billing,
           org.opentravel.www.OTA._2003._05.ExchangeSettingsType exchangeSettings,
           org.opentravel.www.OTA._2003._05.ExchangeType[] exchange,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes splitTaxes,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing alternateDatesProcessing,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache itineraryCache,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket multiTicket,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsPartitions partitions,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsReservationData reservationData,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC[] alternatePCC) {
           this.intelliSellTransaction = intelliSellTransaction;
           this.diversityControl = diversityControl;
           this.messagingDetails = messagingDetails;
           this.alternateAirportCities = alternateAirportCities;
           this.alternateAirportMileage = alternateAirportMileage;
           this.awardShopping = awardShopping;
           this.billing = billing;
           this.exchangeSettings = exchangeSettings;
           this.exchange = exchange;
           this.splitTaxes = splitTaxes;
           this.alternateDatesProcessing = alternateDatesProcessing;
           this.itineraryCache = itineraryCache;
           this.multiTicket = multiTicket;
           this.partitions = partitions;
           this.reservationData = reservationData;
           this.alternatePCC = alternatePCC;
    }


    /**
     * Gets the intelliSellTransaction value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return intelliSellTransaction
     */
    public org.opentravel.www.OTA._2003._05.TransactionType getIntelliSellTransaction() {
        return intelliSellTransaction;
    }


    /**
     * Sets the intelliSellTransaction value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param intelliSellTransaction
     */
    public void setIntelliSellTransaction(org.opentravel.www.OTA._2003._05.TransactionType intelliSellTransaction) {
        this.intelliSellTransaction = intelliSellTransaction;
    }


    /**
     * Gets the diversityControl value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return diversityControl
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlType getDiversityControl() {
        return diversityControl;
    }


    /**
     * Sets the diversityControl value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param diversityControl
     */
    public void setDiversityControl(org.opentravel.www.OTA._2003._05.DiversityControlType diversityControl) {
        this.diversityControl = diversityControl;
    }


    /**
     * Gets the messagingDetails value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return messagingDetails
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMessagingDetails getMessagingDetails() {
        return messagingDetails;
    }


    /**
     * Sets the messagingDetails value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param messagingDetails
     */
    public void setMessagingDetails(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMessagingDetails messagingDetails) {
        this.messagingDetails = messagingDetails;
    }


    /**
     * Gets the alternateAirportCities value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return alternateAirportCities   * For each specified location provide an alternate location.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities[] getAlternateAirportCities() {
        return alternateAirportCities;
    }


    /**
     * Sets the alternateAirportCities value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param alternateAirportCities   * For each specified location provide an alternate location.
     */
    public void setAlternateAirportCities(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities[] alternateAirportCities) {
        this.alternateAirportCities = alternateAirportCities;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities getAlternateAirportCities(int i) {
        return this.alternateAirportCities[i];
    }

    public void setAlternateAirportCities(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities _value) {
        this.alternateAirportCities[i] = _value;
    }


    /**
     * Gets the alternateAirportMileage value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return alternateAirportMileage   * Specify maximum allowed distance from specified airport.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage getAlternateAirportMileage() {
        return alternateAirportMileage;
    }


    /**
     * Sets the alternateAirportMileage value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param alternateAirportMileage   * Specify maximum allowed distance from specified airport.
     */
    public void setAlternateAirportMileage(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportMileage alternateAirportMileage) {
        this.alternateAirportMileage = alternateAirportMileage;
    }


    /**
     * Gets the awardShopping value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return awardShopping
     */
    public org.opentravel.www.OTA._2003._05.AwardShoppingType getAwardShopping() {
        return awardShopping;
    }


    /**
     * Sets the awardShopping value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param awardShopping
     */
    public void setAwardShopping(org.opentravel.www.OTA._2003._05.AwardShoppingType awardShopping) {
        this.awardShopping = awardShopping;
    }


    /**
     * Gets the billing value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return billing
     */
    public org.opentravel.www.OTA._2003._05.BillingInformationType getBilling() {
        return billing;
    }


    /**
     * Sets the billing value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param billing
     */
    public void setBilling(org.opentravel.www.OTA._2003._05.BillingInformationType billing) {
        this.billing = billing;
    }


    /**
     * Gets the exchangeSettings value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return exchangeSettings
     */
    public org.opentravel.www.OTA._2003._05.ExchangeSettingsType getExchangeSettings() {
        return exchangeSettings;
    }


    /**
     * Sets the exchangeSettings value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param exchangeSettings
     */
    public void setExchangeSettings(org.opentravel.www.OTA._2003._05.ExchangeSettingsType exchangeSettings) {
        this.exchangeSettings = exchangeSettings;
    }


    /**
     * Gets the exchange value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return exchange
     */
    public org.opentravel.www.OTA._2003._05.ExchangeType[] getExchange() {
        return exchange;
    }


    /**
     * Sets the exchange value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param exchange
     */
    public void setExchange(org.opentravel.www.OTA._2003._05.ExchangeType[] exchange) {
        this.exchange = exchange;
    }

    public org.opentravel.www.OTA._2003._05.ExchangeType getExchange(int i) {
        return this.exchange[i];
    }

    public void setExchange(int i, org.opentravel.www.OTA._2003._05.ExchangeType _value) {
        this.exchange[i] = _value;
    }


    /**
     * Gets the splitTaxes value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return splitTaxes
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes getSplitTaxes() {
        return splitTaxes;
    }


    /**
     * Sets the splitTaxes value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param splitTaxes
     */
    public void setSplitTaxes(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes splitTaxes) {
        this.splitTaxes = splitTaxes;
    }


    /**
     * Gets the alternateDatesProcessing value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return alternateDatesProcessing
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing getAlternateDatesProcessing() {
        return alternateDatesProcessing;
    }


    /**
     * Sets the alternateDatesProcessing value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param alternateDatesProcessing
     */
    public void setAlternateDatesProcessing(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing alternateDatesProcessing) {
        this.alternateDatesProcessing = alternateDatesProcessing;
    }


    /**
     * Gets the itineraryCache value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return itineraryCache
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache getItineraryCache() {
        return itineraryCache;
    }


    /**
     * Sets the itineraryCache value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param itineraryCache
     */
    public void setItineraryCache(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache itineraryCache) {
        this.itineraryCache = itineraryCache;
    }


    /**
     * Gets the multiTicket value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return multiTicket
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket getMultiTicket() {
        return multiTicket;
    }


    /**
     * Sets the multiTicket value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param multiTicket
     */
    public void setMultiTicket(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket multiTicket) {
        this.multiTicket = multiTicket;
    }


    /**
     * Gets the partitions value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return partitions
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsPartitions getPartitions() {
        return partitions;
    }


    /**
     * Sets the partitions value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param partitions
     */
    public void setPartitions(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsPartitions partitions) {
        this.partitions = partitions;
    }


    /**
     * Gets the reservationData value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return reservationData
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsReservationData getReservationData() {
        return reservationData;
    }


    /**
     * Sets the reservationData value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param reservationData
     */
    public void setReservationData(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsReservationData reservationData) {
        this.reservationData = reservationData;
    }


    /**
     * Gets the alternatePCC value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @return alternatePCC
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC[] getAlternatePCC() {
        return alternatePCC;
    }


    /**
     * Sets the alternatePCC value for this OTA_AirLowFareSearchRQTPA_Extensions.
     * 
     * @param alternatePCC
     */
    public void setAlternatePCC(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC[] alternatePCC) {
        this.alternatePCC = alternatePCC;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC getAlternatePCC(int i) {
        return this.alternatePCC[i];
    }

    public void setAlternatePCC(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC _value) {
        this.alternatePCC[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_Extensions)) return false;
        OTA_AirLowFareSearchRQTPA_Extensions other = (OTA_AirLowFareSearchRQTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intelliSellTransaction==null && other.getIntelliSellTransaction()==null) || 
             (this.intelliSellTransaction!=null &&
              this.intelliSellTransaction.equals(other.getIntelliSellTransaction()))) &&
            ((this.diversityControl==null && other.getDiversityControl()==null) || 
             (this.diversityControl!=null &&
              this.diversityControl.equals(other.getDiversityControl()))) &&
            ((this.messagingDetails==null && other.getMessagingDetails()==null) || 
             (this.messagingDetails!=null &&
              this.messagingDetails.equals(other.getMessagingDetails()))) &&
            ((this.alternateAirportCities==null && other.getAlternateAirportCities()==null) || 
             (this.alternateAirportCities!=null &&
              java.util.Arrays.equals(this.alternateAirportCities, other.getAlternateAirportCities()))) &&
            ((this.alternateAirportMileage==null && other.getAlternateAirportMileage()==null) || 
             (this.alternateAirportMileage!=null &&
              this.alternateAirportMileage.equals(other.getAlternateAirportMileage()))) &&
            ((this.awardShopping==null && other.getAwardShopping()==null) || 
             (this.awardShopping!=null &&
              this.awardShopping.equals(other.getAwardShopping()))) &&
            ((this.billing==null && other.getBilling()==null) || 
             (this.billing!=null &&
              this.billing.equals(other.getBilling()))) &&
            ((this.exchangeSettings==null && other.getExchangeSettings()==null) || 
             (this.exchangeSettings!=null &&
              this.exchangeSettings.equals(other.getExchangeSettings()))) &&
            ((this.exchange==null && other.getExchange()==null) || 
             (this.exchange!=null &&
              java.util.Arrays.equals(this.exchange, other.getExchange()))) &&
            ((this.splitTaxes==null && other.getSplitTaxes()==null) || 
             (this.splitTaxes!=null &&
              this.splitTaxes.equals(other.getSplitTaxes()))) &&
            ((this.alternateDatesProcessing==null && other.getAlternateDatesProcessing()==null) || 
             (this.alternateDatesProcessing!=null &&
              this.alternateDatesProcessing.equals(other.getAlternateDatesProcessing()))) &&
            ((this.itineraryCache==null && other.getItineraryCache()==null) || 
             (this.itineraryCache!=null &&
              this.itineraryCache.equals(other.getItineraryCache()))) &&
            ((this.multiTicket==null && other.getMultiTicket()==null) || 
             (this.multiTicket!=null &&
              this.multiTicket.equals(other.getMultiTicket()))) &&
            ((this.partitions==null && other.getPartitions()==null) || 
             (this.partitions!=null &&
              this.partitions.equals(other.getPartitions()))) &&
            ((this.reservationData==null && other.getReservationData()==null) || 
             (this.reservationData!=null &&
              this.reservationData.equals(other.getReservationData()))) &&
            ((this.alternatePCC==null && other.getAlternatePCC()==null) || 
             (this.alternatePCC!=null &&
              java.util.Arrays.equals(this.alternatePCC, other.getAlternatePCC())));
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
        if (getIntelliSellTransaction() != null) {
            _hashCode += getIntelliSellTransaction().hashCode();
        }
        if (getDiversityControl() != null) {
            _hashCode += getDiversityControl().hashCode();
        }
        if (getMessagingDetails() != null) {
            _hashCode += getMessagingDetails().hashCode();
        }
        if (getAlternateAirportCities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateAirportCities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateAirportCities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternateAirportMileage() != null) {
            _hashCode += getAlternateAirportMileage().hashCode();
        }
        if (getAwardShopping() != null) {
            _hashCode += getAwardShopping().hashCode();
        }
        if (getBilling() != null) {
            _hashCode += getBilling().hashCode();
        }
        if (getExchangeSettings() != null) {
            _hashCode += getExchangeSettings().hashCode();
        }
        if (getExchange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExchange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExchange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSplitTaxes() != null) {
            _hashCode += getSplitTaxes().hashCode();
        }
        if (getAlternateDatesProcessing() != null) {
            _hashCode += getAlternateDatesProcessing().hashCode();
        }
        if (getItineraryCache() != null) {
            _hashCode += getItineraryCache().hashCode();
        }
        if (getMultiTicket() != null) {
            _hashCode += getMultiTicket().hashCode();
        }
        if (getPartitions() != null) {
            _hashCode += getPartitions().hashCode();
        }
        if (getReservationData() != null) {
            _hashCode += getReservationData().hashCode();
        }
        if (getAlternatePCC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternatePCC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternatePCC(), i);
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
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intelliSellTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IntelliSellTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TransactionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diversityControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiversityControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiversityControlType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MessagingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>MessagingDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAirportCities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateAirportCities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAirportMileage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateAirportMileage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportMileage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awardShopping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AwardShopping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AwardShoppingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Billing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BillingInformationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeSettingsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Exchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SplitTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>SplitTaxes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDatesProcessing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateDatesProcessing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateDatesProcessing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraryCache");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItineraryCache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>ItineraryCache"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MultiTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>MultiTicket"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Partitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>Partitions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReservationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>ReservationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatePCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternatePCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC"));
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
