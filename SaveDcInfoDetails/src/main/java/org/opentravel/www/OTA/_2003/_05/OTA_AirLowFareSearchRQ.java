/**
 * OTA_AirLowFareSearchRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQ  implements java.io.Serializable {
    /* Point of sale object. */
    private org.opentravel.www.OTA._2003._05.SourceType[] POS;

    /* Origin and Destination location, and time information for the
     * Air Low Fare Search request. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation[] originDestinationInformation;

    /* Single leg specification */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLeg[] leg;

    /* Air Low Fare Search Request preference information. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsType travelPreferences;

    /* Specifies the number of passengers and types for Air Low Fare
     * Search. */
    private org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType travelerInfoSummary;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_Extensions TPA_Extensions;

    private org.opentravel.www.OTA._2003._05.EchoToken echoToken;  // attribute

    private java.lang.String timeStamp;  // attribute

    private org.opentravel.www.OTA._2003._05.Target target;  // attribute

    private java.lang.String version;  // attribute

    private java.lang.String transactionIdentifier;  // attribute

    private org.opentravel.www.OTA._2003._05.NbrOrBooleanType sequenceNmbr;  // attribute

    private org.opentravel.www.OTA._2003._05.TransactionStatusCode transactionStatusCode;  // attribute

    private org.apache.axis.types.Language primaryLangID;  // attribute

    private org.apache.axis.types.Language altLangID;  // attribute

    private org.opentravel.www.OTA._2003._05.MaxResponses maxResponses;  // attribute

    private java.lang.Boolean directFlightsOnly;  // attribute

    private java.lang.Boolean availableFlightsOnly;  // attribute

    private java.lang.String responseType;  // attribute

    private java.lang.String responseVersion;  // attribute

    private java.lang.Boolean separateMessages;  // attribute

    private java.lang.Boolean truncateMessages;  // attribute

    public OTA_AirLowFareSearchRQ() {
    }

    public OTA_AirLowFareSearchRQ(
           org.opentravel.www.OTA._2003._05.SourceType[] POS,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation[] originDestinationInformation,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLeg[] leg,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsType travelPreferences,
           org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType travelerInfoSummary,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_Extensions TPA_Extensions,
           org.opentravel.www.OTA._2003._05.EchoToken echoToken,
           java.lang.String timeStamp,
           org.opentravel.www.OTA._2003._05.Target target,
           java.lang.String version,
           java.lang.String transactionIdentifier,
           org.opentravel.www.OTA._2003._05.NbrOrBooleanType sequenceNmbr,
           org.opentravel.www.OTA._2003._05.TransactionStatusCode transactionStatusCode,
           org.apache.axis.types.Language primaryLangID,
           org.apache.axis.types.Language altLangID,
           org.opentravel.www.OTA._2003._05.MaxResponses maxResponses,
           java.lang.Boolean directFlightsOnly,
           java.lang.Boolean availableFlightsOnly,
           java.lang.String responseType,
           java.lang.String responseVersion,
           java.lang.Boolean separateMessages,
           java.lang.Boolean truncateMessages) {
           this.POS = POS;
           this.originDestinationInformation = originDestinationInformation;
           this.leg = leg;
           this.travelPreferences = travelPreferences;
           this.travelerInfoSummary = travelerInfoSummary;
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
           this.maxResponses = maxResponses;
           this.directFlightsOnly = directFlightsOnly;
           this.availableFlightsOnly = availableFlightsOnly;
           this.responseType = responseType;
           this.responseVersion = responseVersion;
           this.separateMessages = separateMessages;
           this.truncateMessages = truncateMessages;
    }


    /**
     * Gets the POS value for this OTA_AirLowFareSearchRQ.
     * 
     * @return POS   * Point of sale object.
     */
    public org.opentravel.www.OTA._2003._05.SourceType[] getPOS() {
        return POS;
    }


    /**
     * Sets the POS value for this OTA_AirLowFareSearchRQ.
     * 
     * @param POS   * Point of sale object.
     */
    public void setPOS(org.opentravel.www.OTA._2003._05.SourceType[] POS) {
        this.POS = POS;
    }


    /**
     * Gets the originDestinationInformation value for this OTA_AirLowFareSearchRQ.
     * 
     * @return originDestinationInformation   * Origin and Destination location, and time information for the
     * Air Low Fare Search request.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation[] getOriginDestinationInformation() {
        return originDestinationInformation;
    }


    /**
     * Sets the originDestinationInformation value for this OTA_AirLowFareSearchRQ.
     * 
     * @param originDestinationInformation   * Origin and Destination location, and time information for the
     * Air Low Fare Search request.
     */
    public void setOriginDestinationInformation(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation[] originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation getOriginDestinationInformation(int i) {
        return this.originDestinationInformation[i];
    }

    public void setOriginDestinationInformation(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformation _value) {
        this.originDestinationInformation[i] = _value;
    }


    /**
     * Gets the leg value for this OTA_AirLowFareSearchRQ.
     * 
     * @return leg   * Single leg specification
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLeg[] getLeg() {
        return leg;
    }


    /**
     * Sets the leg value for this OTA_AirLowFareSearchRQ.
     * 
     * @param leg   * Single leg specification
     */
    public void setLeg(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLeg[] leg) {
        this.leg = leg;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLeg getLeg(int i) {
        return this.leg[i];
    }

    public void setLeg(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLeg _value) {
        this.leg[i] = _value;
    }


    /**
     * Gets the travelPreferences value for this OTA_AirLowFareSearchRQ.
     * 
     * @return travelPreferences   * Air Low Fare Search Request preference information.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsType getTravelPreferences() {
        return travelPreferences;
    }


    /**
     * Sets the travelPreferences value for this OTA_AirLowFareSearchRQ.
     * 
     * @param travelPreferences   * Air Low Fare Search Request preference information.
     */
    public void setTravelPreferences(org.opentravel.www.OTA._2003._05.AirSearchPrefsType travelPreferences) {
        this.travelPreferences = travelPreferences;
    }


    /**
     * Gets the travelerInfoSummary value for this OTA_AirLowFareSearchRQ.
     * 
     * @return travelerInfoSummary   * Specifies the number of passengers and types for Air Low Fare
     * Search.
     */
    public org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType getTravelerInfoSummary() {
        return travelerInfoSummary;
    }


    /**
     * Sets the travelerInfoSummary value for this OTA_AirLowFareSearchRQ.
     * 
     * @param travelerInfoSummary   * Specifies the number of passengers and types for Air Low Fare
     * Search.
     */
    public void setTravelerInfoSummary(org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType travelerInfoSummary) {
        this.travelerInfoSummary = travelerInfoSummary;
    }


    /**
     * Gets the TPA_Extensions value for this OTA_AirLowFareSearchRQ.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this OTA_AirLowFareSearchRQ.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the echoToken value for this OTA_AirLowFareSearchRQ.
     * 
     * @return echoToken
     */
    public org.opentravel.www.OTA._2003._05.EchoToken getEchoToken() {
        return echoToken;
    }


    /**
     * Sets the echoToken value for this OTA_AirLowFareSearchRQ.
     * 
     * @param echoToken
     */
    public void setEchoToken(org.opentravel.www.OTA._2003._05.EchoToken echoToken) {
        this.echoToken = echoToken;
    }


    /**
     * Gets the timeStamp value for this OTA_AirLowFareSearchRQ.
     * 
     * @return timeStamp
     */
    public java.lang.String getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this OTA_AirLowFareSearchRQ.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.lang.String timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the target value for this OTA_AirLowFareSearchRQ.
     * 
     * @return target
     */
    public org.opentravel.www.OTA._2003._05.Target getTarget() {
        return target;
    }


    /**
     * Sets the target value for this OTA_AirLowFareSearchRQ.
     * 
     * @param target
     */
    public void setTarget(org.opentravel.www.OTA._2003._05.Target target) {
        this.target = target;
    }


    /**
     * Gets the version value for this OTA_AirLowFareSearchRQ.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this OTA_AirLowFareSearchRQ.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the transactionIdentifier value for this OTA_AirLowFareSearchRQ.
     * 
     * @return transactionIdentifier
     */
    public java.lang.String getTransactionIdentifier() {
        return transactionIdentifier;
    }


    /**
     * Sets the transactionIdentifier value for this OTA_AirLowFareSearchRQ.
     * 
     * @param transactionIdentifier
     */
    public void setTransactionIdentifier(java.lang.String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }


    /**
     * Gets the sequenceNmbr value for this OTA_AirLowFareSearchRQ.
     * 
     * @return sequenceNmbr
     */
    public org.opentravel.www.OTA._2003._05.NbrOrBooleanType getSequenceNmbr() {
        return sequenceNmbr;
    }


    /**
     * Sets the sequenceNmbr value for this OTA_AirLowFareSearchRQ.
     * 
     * @param sequenceNmbr
     */
    public void setSequenceNmbr(org.opentravel.www.OTA._2003._05.NbrOrBooleanType sequenceNmbr) {
        this.sequenceNmbr = sequenceNmbr;
    }


    /**
     * Gets the transactionStatusCode value for this OTA_AirLowFareSearchRQ.
     * 
     * @return transactionStatusCode
     */
    public org.opentravel.www.OTA._2003._05.TransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }


    /**
     * Sets the transactionStatusCode value for this OTA_AirLowFareSearchRQ.
     * 
     * @param transactionStatusCode
     */
    public void setTransactionStatusCode(org.opentravel.www.OTA._2003._05.TransactionStatusCode transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }


    /**
     * Gets the primaryLangID value for this OTA_AirLowFareSearchRQ.
     * 
     * @return primaryLangID
     */
    public org.apache.axis.types.Language getPrimaryLangID() {
        return primaryLangID;
    }


    /**
     * Sets the primaryLangID value for this OTA_AirLowFareSearchRQ.
     * 
     * @param primaryLangID
     */
    public void setPrimaryLangID(org.apache.axis.types.Language primaryLangID) {
        this.primaryLangID = primaryLangID;
    }


    /**
     * Gets the altLangID value for this OTA_AirLowFareSearchRQ.
     * 
     * @return altLangID
     */
    public org.apache.axis.types.Language getAltLangID() {
        return altLangID;
    }


    /**
     * Sets the altLangID value for this OTA_AirLowFareSearchRQ.
     * 
     * @param altLangID
     */
    public void setAltLangID(org.apache.axis.types.Language altLangID) {
        this.altLangID = altLangID;
    }


    /**
     * Gets the maxResponses value for this OTA_AirLowFareSearchRQ.
     * 
     * @return maxResponses
     */
    public org.opentravel.www.OTA._2003._05.MaxResponses getMaxResponses() {
        return maxResponses;
    }


    /**
     * Sets the maxResponses value for this OTA_AirLowFareSearchRQ.
     * 
     * @param maxResponses
     */
    public void setMaxResponses(org.opentravel.www.OTA._2003._05.MaxResponses maxResponses) {
        this.maxResponses = maxResponses;
    }


    /**
     * Gets the directFlightsOnly value for this OTA_AirLowFareSearchRQ.
     * 
     * @return directFlightsOnly
     */
    public java.lang.Boolean getDirectFlightsOnly() {
        return directFlightsOnly;
    }


    /**
     * Sets the directFlightsOnly value for this OTA_AirLowFareSearchRQ.
     * 
     * @param directFlightsOnly
     */
    public void setDirectFlightsOnly(java.lang.Boolean directFlightsOnly) {
        this.directFlightsOnly = directFlightsOnly;
    }


    /**
     * Gets the availableFlightsOnly value for this OTA_AirLowFareSearchRQ.
     * 
     * @return availableFlightsOnly
     */
    public java.lang.Boolean getAvailableFlightsOnly() {
        return availableFlightsOnly;
    }


    /**
     * Sets the availableFlightsOnly value for this OTA_AirLowFareSearchRQ.
     * 
     * @param availableFlightsOnly
     */
    public void setAvailableFlightsOnly(java.lang.Boolean availableFlightsOnly) {
        this.availableFlightsOnly = availableFlightsOnly;
    }


    /**
     * Gets the responseType value for this OTA_AirLowFareSearchRQ.
     * 
     * @return responseType
     */
    public java.lang.String getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this OTA_AirLowFareSearchRQ.
     * 
     * @param responseType
     */
    public void setResponseType(java.lang.String responseType) {
        this.responseType = responseType;
    }


    /**
     * Gets the responseVersion value for this OTA_AirLowFareSearchRQ.
     * 
     * @return responseVersion
     */
    public java.lang.String getResponseVersion() {
        return responseVersion;
    }


    /**
     * Sets the responseVersion value for this OTA_AirLowFareSearchRQ.
     * 
     * @param responseVersion
     */
    public void setResponseVersion(java.lang.String responseVersion) {
        this.responseVersion = responseVersion;
    }


    /**
     * Gets the separateMessages value for this OTA_AirLowFareSearchRQ.
     * 
     * @return separateMessages
     */
    public java.lang.Boolean getSeparateMessages() {
        return separateMessages;
    }


    /**
     * Sets the separateMessages value for this OTA_AirLowFareSearchRQ.
     * 
     * @param separateMessages
     */
    public void setSeparateMessages(java.lang.Boolean separateMessages) {
        this.separateMessages = separateMessages;
    }


    /**
     * Gets the truncateMessages value for this OTA_AirLowFareSearchRQ.
     * 
     * @return truncateMessages
     */
    public java.lang.Boolean getTruncateMessages() {
        return truncateMessages;
    }


    /**
     * Sets the truncateMessages value for this OTA_AirLowFareSearchRQ.
     * 
     * @param truncateMessages
     */
    public void setTruncateMessages(java.lang.Boolean truncateMessages) {
        this.truncateMessages = truncateMessages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQ)) return false;
        OTA_AirLowFareSearchRQ other = (OTA_AirLowFareSearchRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.POS==null && other.getPOS()==null) || 
             (this.POS!=null &&
              java.util.Arrays.equals(this.POS, other.getPOS()))) &&
            ((this.originDestinationInformation==null && other.getOriginDestinationInformation()==null) || 
             (this.originDestinationInformation!=null &&
              java.util.Arrays.equals(this.originDestinationInformation, other.getOriginDestinationInformation()))) &&
            ((this.leg==null && other.getLeg()==null) || 
             (this.leg!=null &&
              java.util.Arrays.equals(this.leg, other.getLeg()))) &&
            ((this.travelPreferences==null && other.getTravelPreferences()==null) || 
             (this.travelPreferences!=null &&
              this.travelPreferences.equals(other.getTravelPreferences()))) &&
            ((this.travelerInfoSummary==null && other.getTravelerInfoSummary()==null) || 
             (this.travelerInfoSummary!=null &&
              this.travelerInfoSummary.equals(other.getTravelerInfoSummary()))) &&
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
            ((this.maxResponses==null && other.getMaxResponses()==null) || 
             (this.maxResponses!=null &&
              this.maxResponses.equals(other.getMaxResponses()))) &&
            ((this.directFlightsOnly==null && other.getDirectFlightsOnly()==null) || 
             (this.directFlightsOnly!=null &&
              this.directFlightsOnly.equals(other.getDirectFlightsOnly()))) &&
            ((this.availableFlightsOnly==null && other.getAvailableFlightsOnly()==null) || 
             (this.availableFlightsOnly!=null &&
              this.availableFlightsOnly.equals(other.getAvailableFlightsOnly()))) &&
            ((this.responseType==null && other.getResponseType()==null) || 
             (this.responseType!=null &&
              this.responseType.equals(other.getResponseType()))) &&
            ((this.responseVersion==null && other.getResponseVersion()==null) || 
             (this.responseVersion!=null &&
              this.responseVersion.equals(other.getResponseVersion()))) &&
            ((this.separateMessages==null && other.getSeparateMessages()==null) || 
             (this.separateMessages!=null &&
              this.separateMessages.equals(other.getSeparateMessages()))) &&
            ((this.truncateMessages==null && other.getTruncateMessages()==null) || 
             (this.truncateMessages!=null &&
              this.truncateMessages.equals(other.getTruncateMessages())));
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
        if (getPOS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPOS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginDestinationInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginDestinationInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginDestinationInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTravelPreferences() != null) {
            _hashCode += getTravelPreferences().hashCode();
        }
        if (getTravelerInfoSummary() != null) {
            _hashCode += getTravelerInfoSummary().hashCode();
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
        if (getMaxResponses() != null) {
            _hashCode += getMaxResponses().hashCode();
        }
        if (getDirectFlightsOnly() != null) {
            _hashCode += getDirectFlightsOnly().hashCode();
        }
        if (getAvailableFlightsOnly() != null) {
            _hashCode += getAvailableFlightsOnly().hashCode();
        }
        if (getResponseType() != null) {
            _hashCode += getResponseType().hashCode();
        }
        if (getResponseVersion() != null) {
            _hashCode += getResponseVersion().hashCode();
        }
        if (getSeparateMessages() != null) {
            _hashCode += getSeparateMessages().hashCode();
        }
        if (getTruncateMessages() != null) {
            _hashCode += getTruncateMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OTA_AirLowFareSearchRQ"));
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
        attrField.setFieldName("maxResponses");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxResponses"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">MaxResponses"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("directFlightsOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DirectFlightsOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("availableFlightsOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvailableFlightsOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("responseType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResponseType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("responseVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResponseVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("separateMessages");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SeparateMessages"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("truncateMessages");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TruncateMessages"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "POS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SourceType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Source"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originDestinationInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>OriginDestinationInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Leg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>Leg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirSearchPrefsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelerInfoSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfoSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfoSummaryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>TPA_Extensions"));
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
