/**
 * OTA_AirLowFareSearchRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRS  implements java.io.Serializable {
    /* In case of failure errors are returned. */
    private org.opentravel.www.OTA._2003._05.ErrorType[] errors;

    /* In case of success this element is returned. */
    private org.opentravel.www.OTA._2003._05.SuccessType success;

    /* In case of any warnings this element is returned. */
    private org.opentravel.www.OTA._2003._05.WarningType[] warnings;

    /* Low Fare priced itineraries container. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSPricedItineraries pricedItineraries;

    /* Successfull Low Fare priced itineraries in response to a Simplified
     * One Way request. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSOneWayItineraries oneWayItineraries;

    /* Departed Itineraries */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItineraries departedItineraries;

    /* Sold Out Itineraries */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItineraries soldOutItineraries;

    /* Available Itineraries */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItineraries availableItineraries;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_Extensions TPA_Extensions;

    private org.opentravel.www.OTA._2003._05.EchoToken echoToken;  // attribute

    private java.lang.String timeStamp;  // attribute

    private org.opentravel.www.OTA._2003._05.Target target;  // attribute

    private java.lang.String version;  // attribute

    private java.lang.String transactionIdentifier;  // attribute

    private org.opentravel.www.OTA._2003._05.NbrOrBooleanType sequenceNmbr;  // attribute

    private org.opentravel.www.OTA._2003._05.TransactionStatusCode transactionStatusCode;  // attribute

    private org.apache.axis.types.Language primaryLangID;  // attribute

    private org.apache.axis.types.Language altLangID;  // attribute

    private java.lang.Short pricedItinCount;  // attribute

    private java.lang.Short brandedOneWayItinCount;  // attribute

    private java.lang.Short simpleOneWayItinCount;  // attribute

    private java.lang.Short departedItinCount;  // attribute

    private java.lang.Short soldOutItinCount;  // attribute

    private java.lang.Short availableItinCount;  // attribute

    public OTA_AirLowFareSearchRS() {
    }

    public OTA_AirLowFareSearchRS(
           org.opentravel.www.OTA._2003._05.ErrorType[] errors,
           org.opentravel.www.OTA._2003._05.SuccessType success,
           org.opentravel.www.OTA._2003._05.WarningType[] warnings,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSPricedItineraries pricedItineraries,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSOneWayItineraries oneWayItineraries,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItineraries departedItineraries,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItineraries soldOutItineraries,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItineraries availableItineraries,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_Extensions TPA_Extensions,
           org.opentravel.www.OTA._2003._05.EchoToken echoToken,
           java.lang.String timeStamp,
           org.opentravel.www.OTA._2003._05.Target target,
           java.lang.String version,
           java.lang.String transactionIdentifier,
           org.opentravel.www.OTA._2003._05.NbrOrBooleanType sequenceNmbr,
           org.opentravel.www.OTA._2003._05.TransactionStatusCode transactionStatusCode,
           org.apache.axis.types.Language primaryLangID,
           org.apache.axis.types.Language altLangID,
           java.lang.Short pricedItinCount,
           java.lang.Short brandedOneWayItinCount,
           java.lang.Short simpleOneWayItinCount,
           java.lang.Short departedItinCount,
           java.lang.Short soldOutItinCount,
           java.lang.Short availableItinCount) {
           this.errors = errors;
           this.success = success;
           this.warnings = warnings;
           this.pricedItineraries = pricedItineraries;
           this.oneWayItineraries = oneWayItineraries;
           this.departedItineraries = departedItineraries;
           this.soldOutItineraries = soldOutItineraries;
           this.availableItineraries = availableItineraries;
           this.TPA_Extensions = TPA_Extensions;
           this.echoToken = echoToken;
           this.timeStamp = timeStamp;
           this.target = target;
           this.version = version;
           this.transactionIdentifier = transactionIdentifier;
           this.sequenceNmbr = sequenceNmbr;
           this.transactionStatusCode = transactionStatusCode;
           this.primaryLangID = primaryLangID;
           this.altLangID = altLangID;
           this.pricedItinCount = pricedItinCount;
           this.brandedOneWayItinCount = brandedOneWayItinCount;
           this.simpleOneWayItinCount = simpleOneWayItinCount;
           this.departedItinCount = departedItinCount;
           this.soldOutItinCount = soldOutItinCount;
           this.availableItinCount = availableItinCount;
    }


    /**
     * Gets the errors value for this OTA_AirLowFareSearchRS.
     * 
     * @return errors   * In case of failure errors are returned.
     */
    public org.opentravel.www.OTA._2003._05.ErrorType[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this OTA_AirLowFareSearchRS.
     * 
     * @param errors   * In case of failure errors are returned.
     */
    public void setErrors(org.opentravel.www.OTA._2003._05.ErrorType[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the success value for this OTA_AirLowFareSearchRS.
     * 
     * @return success   * In case of success this element is returned.
     */
    public org.opentravel.www.OTA._2003._05.SuccessType getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this OTA_AirLowFareSearchRS.
     * 
     * @param success   * In case of success this element is returned.
     */
    public void setSuccess(org.opentravel.www.OTA._2003._05.SuccessType success) {
        this.success = success;
    }


    /**
     * Gets the warnings value for this OTA_AirLowFareSearchRS.
     * 
     * @return warnings   * In case of any warnings this element is returned.
     */
    public org.opentravel.www.OTA._2003._05.WarningType[] getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this OTA_AirLowFareSearchRS.
     * 
     * @param warnings   * In case of any warnings this element is returned.
     */
    public void setWarnings(org.opentravel.www.OTA._2003._05.WarningType[] warnings) {
        this.warnings = warnings;
    }


    /**
     * Gets the pricedItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @return pricedItineraries   * Low Fare priced itineraries container.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSPricedItineraries getPricedItineraries() {
        return pricedItineraries;
    }


    /**
     * Sets the pricedItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @param pricedItineraries   * Low Fare priced itineraries container.
     */
    public void setPricedItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSPricedItineraries pricedItineraries) {
        this.pricedItineraries = pricedItineraries;
    }


    /**
     * Gets the oneWayItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @return oneWayItineraries   * Successfull Low Fare priced itineraries in response to a Simplified
     * One Way request.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSOneWayItineraries getOneWayItineraries() {
        return oneWayItineraries;
    }


    /**
     * Sets the oneWayItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @param oneWayItineraries   * Successfull Low Fare priced itineraries in response to a Simplified
     * One Way request.
     */
    public void setOneWayItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSOneWayItineraries oneWayItineraries) {
        this.oneWayItineraries = oneWayItineraries;
    }


    /**
     * Gets the departedItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @return departedItineraries   * Departed Itineraries
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItineraries getDepartedItineraries() {
        return departedItineraries;
    }


    /**
     * Sets the departedItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @param departedItineraries   * Departed Itineraries
     */
    public void setDepartedItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSDepartedItineraries departedItineraries) {
        this.departedItineraries = departedItineraries;
    }


    /**
     * Gets the soldOutItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @return soldOutItineraries   * Sold Out Itineraries
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItineraries getSoldOutItineraries() {
        return soldOutItineraries;
    }


    /**
     * Sets the soldOutItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @param soldOutItineraries   * Sold Out Itineraries
     */
    public void setSoldOutItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItineraries soldOutItineraries) {
        this.soldOutItineraries = soldOutItineraries;
    }


    /**
     * Gets the availableItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @return availableItineraries   * Available Itineraries
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItineraries getAvailableItineraries() {
        return availableItineraries;
    }


    /**
     * Sets the availableItineraries value for this OTA_AirLowFareSearchRS.
     * 
     * @param availableItineraries   * Available Itineraries
     */
    public void setAvailableItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSAvailableItineraries availableItineraries) {
        this.availableItineraries = availableItineraries;
    }


    /**
     * Gets the TPA_Extensions value for this OTA_AirLowFareSearchRS.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this OTA_AirLowFareSearchRS.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the echoToken value for this OTA_AirLowFareSearchRS.
     * 
     * @return echoToken
     */
    public org.opentravel.www.OTA._2003._05.EchoToken getEchoToken() {
        return echoToken;
    }


    /**
     * Sets the echoToken value for this OTA_AirLowFareSearchRS.
     * 
     * @param echoToken
     */
    public void setEchoToken(org.opentravel.www.OTA._2003._05.EchoToken echoToken) {
        this.echoToken = echoToken;
    }


    /**
     * Gets the timeStamp value for this OTA_AirLowFareSearchRS.
     * 
     * @return timeStamp
     */
    public java.lang.String getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this OTA_AirLowFareSearchRS.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.lang.String timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the target value for this OTA_AirLowFareSearchRS.
     * 
     * @return target
     */
    public org.opentravel.www.OTA._2003._05.Target getTarget() {
        return target;
    }


    /**
     * Sets the target value for this OTA_AirLowFareSearchRS.
     * 
     * @param target
     */
    public void setTarget(org.opentravel.www.OTA._2003._05.Target target) {
        this.target = target;
    }


    /**
     * Gets the version value for this OTA_AirLowFareSearchRS.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this OTA_AirLowFareSearchRS.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the transactionIdentifier value for this OTA_AirLowFareSearchRS.
     * 
     * @return transactionIdentifier
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this OTA_AirLowFareSearchRS.
     * 
     * @param transactionIdentifier
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the sequenceNmbr value for this OTA_AirLowFareSearchRS.
     * 
     * @return sequenceNmbr
     */
    public org.opentravel.www.OTA._2003._05.NbrOrBooleanType getSequenceNmbr() {
        return sequenceNmbr;
    }


    /**
     * Sets the sequenceNmbr value for this OTA_AirLowFareSearchRS.
     * 
     * @param sequenceNmbr
     */
    public void setSequenceNmbr(org.opentravel.www.OTA._2003._05.NbrOrBooleanType sequenceNmbr) {
        this.sequenceNmbr = sequenceNmbr;
    }


    /**
     * Gets the transactionStatusCode value for this OTA_AirLowFareSearchRS.
     * 
     * @return transactionStatusCode
     */
    public org.opentravel.www.OTA._2003._05.TransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }


    /**
     * Sets the transactionStatusCode value for this OTA_AirLowFareSearchRS.
     * 
     * @param transactionStatusCode
     */
    public void setTransactionStatusCode(org.opentravel.www.OTA._2003._05.TransactionStatusCode transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }


    /**
     * Gets the primaryLangID value for this OTA_AirLowFareSearchRS.
     * 
     * @return primaryLangID
     */
    public org.apache.axis.types.Language getPrimaryLangID() {
        return primaryLangID;
    }


    /**
     * Sets the primaryLangID value for this OTA_AirLowFareSearchRS.
     * 
     * @param primaryLangID
     */
    public void setPrimaryLangID(org.apache.axis.types.Language primaryLangID) {
        this.primaryLangID = primaryLangID;
    }


    /**
     * Gets the altLangID value for this OTA_AirLowFareSearchRS.
     * 
     * @return altLangID
     */
    public org.apache.axis.types.Language getAltLangID() {
        return altLangID;
    }


    /**
     * Sets the altLangID value for this OTA_AirLowFareSearchRS.
     * 
     * @param altLangID
     */
    public void setAltLangID(org.apache.axis.types.Language altLangID) {
        this.altLangID = altLangID;
    }


    /**
     * Gets the pricedItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @return pricedItinCount
     */
    public java.lang.Short getPricedItinCount() {
        return pricedItinCount;
    }


    /**
     * Sets the pricedItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @param pricedItinCount
     */
    public void setPricedItinCount(java.lang.Short pricedItinCount) {
        this.pricedItinCount = pricedItinCount;
    }


    /**
     * Gets the brandedOneWayItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @return brandedOneWayItinCount
     */
    public java.lang.Short getBrandedOneWayItinCount() {
        return brandedOneWayItinCount;
    }


    /**
     * Sets the brandedOneWayItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @param brandedOneWayItinCount
     */
    public void setBrandedOneWayItinCount(java.lang.Short brandedOneWayItinCount) {
        this.brandedOneWayItinCount = brandedOneWayItinCount;
    }


    /**
     * Gets the simpleOneWayItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @return simpleOneWayItinCount
     */
    public java.lang.Short getSimpleOneWayItinCount() {
        return simpleOneWayItinCount;
    }


    /**
     * Sets the simpleOneWayItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @param simpleOneWayItinCount
     */
    public void setSimpleOneWayItinCount(java.lang.Short simpleOneWayItinCount) {
        this.simpleOneWayItinCount = simpleOneWayItinCount;
    }


    /**
     * Gets the departedItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @return departedItinCount
     */
    public java.lang.Short getDepartedItinCount() {
        return departedItinCount;
    }


    /**
     * Sets the departedItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @param departedItinCount
     */
    public void setDepartedItinCount(java.lang.Short departedItinCount) {
        this.departedItinCount = departedItinCount;
    }


    /**
     * Gets the soldOutItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @return soldOutItinCount
     */
    public java.lang.Short getSoldOutItinCount() {
        return soldOutItinCount;
    }


    /**
     * Sets the soldOutItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @param soldOutItinCount
     */
    public void setSoldOutItinCount(java.lang.Short soldOutItinCount) {
        this.soldOutItinCount = soldOutItinCount;
    }


    /**
     * Gets the availableItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @return availableItinCount
     */
    public java.lang.Short getAvailableItinCount() {
        return availableItinCount;
    }


    /**
     * Sets the availableItinCount value for this OTA_AirLowFareSearchRS.
     * 
     * @param availableItinCount
     */
    public void setAvailableItinCount(java.lang.Short availableItinCount) {
        this.availableItinCount = availableItinCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRS)) return false;
        OTA_AirLowFareSearchRS other = (OTA_AirLowFareSearchRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.warnings==null && other.getWarnings()==null) || 
             (this.warnings!=null &&
              java.util.Arrays.equals(this.warnings, other.getWarnings()))) &&
            ((this.pricedItineraries==null && other.getPricedItineraries()==null) || 
             (this.pricedItineraries!=null &&
              this.pricedItineraries.equals(other.getPricedItineraries()))) &&
            ((this.oneWayItineraries==null && other.getOneWayItineraries()==null) || 
             (this.oneWayItineraries!=null &&
              this.oneWayItineraries.equals(other.getOneWayItineraries()))) &&
            ((this.departedItineraries==null && other.getDepartedItineraries()==null) || 
             (this.departedItineraries!=null &&
              this.departedItineraries.equals(other.getDepartedItineraries()))) &&
            ((this.soldOutItineraries==null && other.getSoldOutItineraries()==null) || 
             (this.soldOutItineraries!=null &&
              this.soldOutItineraries.equals(other.getSoldOutItineraries()))) &&
            ((this.availableItineraries==null && other.getAvailableItineraries()==null) || 
             (this.availableItineraries!=null &&
              this.availableItineraries.equals(other.getAvailableItineraries()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.echoToken==null && other.getEchoToken()==null) || 
             (this.echoToken!=null &&
              this.echoToken.equals(other.getEchoToken()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.transactionIdentifier==null && other.getTransactionIdentifier()==null) || 
             (this.transactionIdentifier!=null &&
              this.transactionIdentifier.equals(other.getTransactionIdentifier()))) &&
            ((this.sequenceNmbr==null && other.getSequenceNmbr()==null) || 
             (this.sequenceNmbr!=null &&
              this.sequenceNmbr.equals(other.getSequenceNmbr()))) &&
            ((this.transactionStatusCode==null && other.getTransactionStatusCode()==null) || 
             (this.transactionStatusCode!=null &&
              this.transactionStatusCode.equals(other.getTransactionStatusCode()))) &&
            ((this.primaryLangID==null && other.getPrimaryLangID()==null) || 
             (this.primaryLangID!=null &&
              this.primaryLangID.equals(other.getPrimaryLangID()))) &&
            ((this.altLangID==null && other.getAltLangID()==null) || 
             (this.altLangID!=null &&
              this.altLangID.equals(other.getAltLangID()))) &&
            ((this.pricedItinCount==null && other.getPricedItinCount()==null) || 
             (this.pricedItinCount!=null &&
              this.pricedItinCount.equals(other.getPricedItinCount()))) &&
            ((this.brandedOneWayItinCount==null && other.getBrandedOneWayItinCount()==null) || 
             (this.brandedOneWayItinCount!=null &&
              this.brandedOneWayItinCount.equals(other.getBrandedOneWayItinCount()))) &&
            ((this.simpleOneWayItinCount==null && other.getSimpleOneWayItinCount()==null) || 
             (this.simpleOneWayItinCount!=null &&
              this.simpleOneWayItinCount.equals(other.getSimpleOneWayItinCount()))) &&
            ((this.departedItinCount==null && other.getDepartedItinCount()==null) || 
             (this.departedItinCount!=null &&
              this.departedItinCount.equals(other.getDepartedItinCount()))) &&
            ((this.soldOutItinCount==null && other.getSoldOutItinCount()==null) || 
             (this.soldOutItinCount!=null &&
              this.soldOutItinCount.equals(other.getSoldOutItinCount()))) &&
            ((this.availableItinCount==null && other.getAvailableItinCount()==null) || 
             (this.availableItinCount!=null &&
              this.availableItinCount.equals(other.getAvailableItinCount())));
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
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getWarnings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarnings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarnings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricedItineraries() != null) {
            _hashCode += getPricedItineraries().hashCode();
        }
        if (getOneWayItineraries() != null) {
            _hashCode += getOneWayItineraries().hashCode();
        }
        if (getDepartedItineraries() != null) {
            _hashCode += getDepartedItineraries().hashCode();
        }
        if (getSoldOutItineraries() != null) {
            _hashCode += getSoldOutItineraries().hashCode();
        }
        if (getAvailableItineraries() != null) {
            _hashCode += getAvailableItineraries().hashCode();
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getEchoToken() != null) {
            _hashCode += getEchoToken().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getTransactionIdentifier() != null) {
            _hashCode += getTransactionIdentifier().hashCode();
        }
        if (getSequenceNmbr() != null) {
            _hashCode += getSequenceNmbr().hashCode();
        }
        if (getTransactionStatusCode() != null) {
            _hashCode += getTransactionStatusCode().hashCode();
        }
        if (getPrimaryLangID() != null) {
            _hashCode += getPrimaryLangID().hashCode();
        }
        if (getAltLangID() != null) {
            _hashCode += getAltLangID().hashCode();
        }
        if (getPricedItinCount() != null) {
            _hashCode += getPricedItinCount().hashCode();
        }
        if (getBrandedOneWayItinCount() != null) {
            _hashCode += getBrandedOneWayItinCount().hashCode();
        }
        if (getSimpleOneWayItinCount() != null) {
            _hashCode += getSimpleOneWayItinCount().hashCode();
        }
        if (getDepartedItinCount() != null) {
            _hashCode += getDepartedItinCount().hashCode();
        }
        if (getSoldOutItinCount() != null) {
            _hashCode += getSoldOutItinCount().hashCode();
        }
        if (getAvailableItinCount() != null) {
            _hashCode += getAvailableItinCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OTA_AirLowFareSearchRS"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("echoToken");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EchoToken"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">EchoToken"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timeStamp");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TimeStamp"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("target");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Target"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Target"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transactionIdentifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TransactionIdentifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sequenceNmbr");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SequenceNmbr"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NbrOrBooleanType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transactionStatusCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TransactionStatusCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionStatusCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("primaryLangID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PrimaryLangID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "language"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("altLangID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AltLangID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "language"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pricedItinCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PricedItinCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandedOneWayItinCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandedOneWayItinCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("simpleOneWayItinCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SimpleOneWayItinCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departedItinCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartedItinCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("soldOutItinCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SoldOutItinCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("availableItinCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvailableItinCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ErrorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Error"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SuccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "WarningType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Warning"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricedItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>PricedItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneWayItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>OneWayItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departedItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartedItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>DepartedItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldOutItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SoldOutItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>SoldOutItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AvailableItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>AvailableItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>TPA_Extensions"));
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
