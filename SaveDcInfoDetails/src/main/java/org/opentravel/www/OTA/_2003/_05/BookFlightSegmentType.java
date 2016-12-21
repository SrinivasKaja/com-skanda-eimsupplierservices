/**
 * BookFlightSegmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Container for the flight segment data plus the MarriageGrp.
 */
public class BookFlightSegmentType  implements java.io.Serializable {
    /* Departure point of flight segment. */
    private org.opentravel.www.OTA._2003._05.AirportInformationType departureAirport;

    /* Arrival point of flight segment. */
    private org.opentravel.www.OTA._2003._05.AirportInformationType arrivalAirport;

    /* The operating airline of the flight if it is a codeshare  flight. */
    private org.opentravel.www.OTA._2003._05.OperatingAirlineType operatingAirline;

    /* The type of equipment  used for the  flight.. */
    private org.opentravel.www.OTA._2003._05.EquipmentType[] equipment;

    /* The marketing airline. This is required for use with scheduled
     * airline messages but may be omitted for requests by tour operators. */
    private org.opentravel.www.OTA._2003._05.CompanyNameType marketingAirline;

    /* The disclosure airline. This is required by the DOT mandate. */
    private org.opentravel.www.OTA._2003._05.CompanyNameType disclosureAirline;

    /* Many airlines link connection flights together by terming them
     * married segments.  When two or more segments are married, they must
     * be processed as one unit. The segments must be moved, cancelled, and/or
     * priced together. The value of the marriage group must be the same
     * for all segments. */
    private java.lang.String marriageGrp;

    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeStopAirportsStopAirport[] stopAirports;

    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeDepartureTimeZone departureTimeZone;

    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeArrivalTimeZone arrivalTimeZone;

    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeOnTimePerformance onTimePerformance;

    private org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_Extensions TPA_Extensions;

    private java.lang.String departureDateTime;  // attribute

    private java.lang.String arrivalDateTime;  // attribute

    private org.apache.axis.types.NonNegativeInteger stopQuantity;  // attribute

    private java.lang.String RPH;  // attribute

    private java.lang.String infoSource;  // attribute

    private java.lang.String flightNumber;  // attribute

    private java.lang.String tourOperatorFlightID;  // attribute

    private java.lang.String resBookDesigCode;  // attribute

    private org.opentravel.www.OTA._2003._05.ActionCodeType actionCode;  // attribute

    private org.apache.axis.types.PositiveInteger numberInParty;  // attribute

    private short elapsedTime;  // attribute

    public BookFlightSegmentType() {
    }

    public BookFlightSegmentType(
           org.opentravel.www.OTA._2003._05.AirportInformationType departureAirport,
           org.opentravel.www.OTA._2003._05.AirportInformationType arrivalAirport,
           org.opentravel.www.OTA._2003._05.OperatingAirlineType operatingAirline,
           org.opentravel.www.OTA._2003._05.EquipmentType[] equipment,
           org.opentravel.www.OTA._2003._05.CompanyNameType marketingAirline,
           org.opentravel.www.OTA._2003._05.CompanyNameType disclosureAirline,
           java.lang.String marriageGrp,
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeStopAirportsStopAirport[] stopAirports,
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeDepartureTimeZone departureTimeZone,
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeArrivalTimeZone arrivalTimeZone,
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeOnTimePerformance onTimePerformance,
           org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_Extensions TPA_Extensions,
           java.lang.String departureDateTime,
           java.lang.String arrivalDateTime,
           org.apache.axis.types.NonNegativeInteger stopQuantity,
           java.lang.String RPH,
           java.lang.String infoSource,
           java.lang.String flightNumber,
           java.lang.String tourOperatorFlightID,
           java.lang.String resBookDesigCode,
           org.opentravel.www.OTA._2003._05.ActionCodeType actionCode,
           org.apache.axis.types.PositiveInteger numberInParty,
           short elapsedTime) {
           this.departureAirport = departureAirport;
           this.arrivalAirport = arrivalAirport;
           this.operatingAirline = operatingAirline;
           this.equipment = equipment;
           this.marketingAirline = marketingAirline;
           this.disclosureAirline = disclosureAirline;
           this.marriageGrp = marriageGrp;
           this.stopAirports = stopAirports;
           this.departureTimeZone = departureTimeZone;
           this.arrivalTimeZone = arrivalTimeZone;
           this.onTimePerformance = onTimePerformance;
           this.TPA_Extensions = TPA_Extensions;
           this.departureDateTime = departureDateTime;
           this.arrivalDateTime = arrivalDateTime;
           this.stopQuantity = stopQuantity;
           this.RPH = RPH;
           this.infoSource = infoSource;
           this.flightNumber = flightNumber;
           this.tourOperatorFlightID = tourOperatorFlightID;
           this.resBookDesigCode = resBookDesigCode;
           this.actionCode = actionCode;
           this.numberInParty = numberInParty;
           this.elapsedTime = elapsedTime;
    }


    /**
     * Gets the departureAirport value for this BookFlightSegmentType.
     * 
     * @return departureAirport   * Departure point of flight segment.
     */
    public org.opentravel.www.OTA._2003._05.AirportInformationType getDepartureAirport() {
        return departureAirport;
    }


    /**
     * Sets the departureAirport value for this BookFlightSegmentType.
     * 
     * @param departureAirport   * Departure point of flight segment.
     */
    public void setDepartureAirport(org.opentravel.www.OTA._2003._05.AirportInformationType departureAirport) {
        this.departureAirport = departureAirport;
    }


    /**
     * Gets the arrivalAirport value for this BookFlightSegmentType.
     * 
     * @return arrivalAirport   * Arrival point of flight segment.
     */
    public org.opentravel.www.OTA._2003._05.AirportInformationType getArrivalAirport() {
        return arrivalAirport;
    }


    /**
     * Sets the arrivalAirport value for this BookFlightSegmentType.
     * 
     * @param arrivalAirport   * Arrival point of flight segment.
     */
    public void setArrivalAirport(org.opentravel.www.OTA._2003._05.AirportInformationType arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }


    /**
     * Gets the operatingAirline value for this BookFlightSegmentType.
     * 
     * @return operatingAirline   * The operating airline of the flight if it is a codeshare  flight.
     */
    public org.opentravel.www.OTA._2003._05.OperatingAirlineType getOperatingAirline() {
        return operatingAirline;
    }


    /**
     * Sets the operatingAirline value for this BookFlightSegmentType.
     * 
     * @param operatingAirline   * The operating airline of the flight if it is a codeshare  flight.
     */
    public void setOperatingAirline(org.opentravel.www.OTA._2003._05.OperatingAirlineType operatingAirline) {
        this.operatingAirline = operatingAirline;
    }


    /**
     * Gets the equipment value for this BookFlightSegmentType.
     * 
     * @return equipment   * The type of equipment  used for the  flight..
     */
    public org.opentravel.www.OTA._2003._05.EquipmentType[] getEquipment() {
        return equipment;
    }


    /**
     * Sets the equipment value for this BookFlightSegmentType.
     * 
     * @param equipment   * The type of equipment  used for the  flight..
     */
    public void setEquipment(org.opentravel.www.OTA._2003._05.EquipmentType[] equipment) {
        this.equipment = equipment;
    }

    public org.opentravel.www.OTA._2003._05.EquipmentType getEquipment(int i) {
        return this.equipment[i];
    }

    public void setEquipment(int i, org.opentravel.www.OTA._2003._05.EquipmentType _value) {
        this.equipment[i] = _value;
    }


    /**
     * Gets the marketingAirline value for this BookFlightSegmentType.
     * 
     * @return marketingAirline   * The marketing airline. This is required for use with scheduled
     * airline messages but may be omitted for requests by tour operators.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNameType getMarketingAirline() {
        return marketingAirline;
    }


    /**
     * Sets the marketingAirline value for this BookFlightSegmentType.
     * 
     * @param marketingAirline   * The marketing airline. This is required for use with scheduled
     * airline messages but may be omitted for requests by tour operators.
     */
    public void setMarketingAirline(org.opentravel.www.OTA._2003._05.CompanyNameType marketingAirline) {
        this.marketingAirline = marketingAirline;
    }


    /**
     * Gets the disclosureAirline value for this BookFlightSegmentType.
     * 
     * @return disclosureAirline   * The disclosure airline. This is required by the DOT mandate.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNameType getDisclosureAirline() {
        return disclosureAirline;
    }


    /**
     * Sets the disclosureAirline value for this BookFlightSegmentType.
     * 
     * @param disclosureAirline   * The disclosure airline. This is required by the DOT mandate.
     */
    public void setDisclosureAirline(org.opentravel.www.OTA._2003._05.CompanyNameType disclosureAirline) {
        this.disclosureAirline = disclosureAirline;
    }


    /**
     * Gets the marriageGrp value for this BookFlightSegmentType.
     * 
     * @return marriageGrp   * Many airlines link connection flights together by terming them
     * married segments.  When two or more segments are married, they must
     * be processed as one unit. The segments must be moved, cancelled, and/or
     * priced together. The value of the marriage group must be the same
     * for all segments.
     */
    public java.lang.String getMarriageGrp() {
        return marriageGrp;
    }


    /**
     * Sets the marriageGrp value for this BookFlightSegmentType.
     * 
     * @param marriageGrp   * Many airlines link connection flights together by terming them
     * married segments.  When two or more segments are married, they must
     * be processed as one unit. The segments must be moved, cancelled, and/or
     * priced together. The value of the marriage group must be the same
     * for all segments.
     */
    public void setMarriageGrp(java.lang.String marriageGrp) {
        this.marriageGrp = marriageGrp;
    }


    /**
     * Gets the stopAirports value for this BookFlightSegmentType.
     * 
     * @return stopAirports
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeStopAirportsStopAirport[] getStopAirports() {
        return stopAirports;
    }


    /**
     * Sets the stopAirports value for this BookFlightSegmentType.
     * 
     * @param stopAirports
     */
    public void setStopAirports(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeStopAirportsStopAirport[] stopAirports) {
        this.stopAirports = stopAirports;
    }


    /**
     * Gets the departureTimeZone value for this BookFlightSegmentType.
     * 
     * @return departureTimeZone
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeDepartureTimeZone getDepartureTimeZone() {
        return departureTimeZone;
    }


    /**
     * Sets the departureTimeZone value for this BookFlightSegmentType.
     * 
     * @param departureTimeZone
     */
    public void setDepartureTimeZone(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeDepartureTimeZone departureTimeZone) {
        this.departureTimeZone = departureTimeZone;
    }


    /**
     * Gets the arrivalTimeZone value for this BookFlightSegmentType.
     * 
     * @return arrivalTimeZone
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeArrivalTimeZone getArrivalTimeZone() {
        return arrivalTimeZone;
    }


    /**
     * Sets the arrivalTimeZone value for this BookFlightSegmentType.
     * 
     * @param arrivalTimeZone
     */
    public void setArrivalTimeZone(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeArrivalTimeZone arrivalTimeZone) {
        this.arrivalTimeZone = arrivalTimeZone;
    }


    /**
     * Gets the onTimePerformance value for this BookFlightSegmentType.
     * 
     * @return onTimePerformance
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeOnTimePerformance getOnTimePerformance() {
        return onTimePerformance;
    }


    /**
     * Sets the onTimePerformance value for this BookFlightSegmentType.
     * 
     * @param onTimePerformance
     */
    public void setOnTimePerformance(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeOnTimePerformance onTimePerformance) {
        this.onTimePerformance = onTimePerformance;
    }


    /**
     * Gets the TPA_Extensions value for this BookFlightSegmentType.
     * 
     * @return TPA_Extensions
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this BookFlightSegmentType.
     * 
     * @param TPA_Extensions
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.BookFlightSegmentTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the departureDateTime value for this BookFlightSegmentType.
     * 
     * @return departureDateTime
     */
    public java.lang.String getDepartureDateTime() {
        return departureDateTime;
    }


    /**
     * Sets the departureDateTime value for this BookFlightSegmentType.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(java.lang.String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }


    /**
     * Gets the arrivalDateTime value for this BookFlightSegmentType.
     * 
     * @return arrivalDateTime
     */
    public java.lang.String getArrivalDateTime() {
        return arrivalDateTime;
    }


    /**
     * Sets the arrivalDateTime value for this BookFlightSegmentType.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(java.lang.String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    /**
     * Gets the stopQuantity value for this BookFlightSegmentType.
     * 
     * @return stopQuantity
     */
    public org.apache.axis.types.NonNegativeInteger getStopQuantity() {
        return stopQuantity;
    }


    /**
     * Sets the stopQuantity value for this BookFlightSegmentType.
     * 
     * @param stopQuantity
     */
    public void setStopQuantity(org.apache.axis.types.NonNegativeInteger stopQuantity) {
        this.stopQuantity = stopQuantity;
    }


    /**
     * Gets the RPH value for this BookFlightSegmentType.
     * 
     * @return RPH
     */
    public java.lang.String getRPH() {
        return RPH;
    }


    /**
     * Sets the RPH value for this BookFlightSegmentType.
     * 
     * @param RPH
     */
    public void setRPH(java.lang.String RPH) {
        this.RPH = RPH;
    }


    /**
     * Gets the infoSource value for this BookFlightSegmentType.
     * 
     * @return infoSource
     */
    public java.lang.String getInfoSource() {
        return infoSource;
    }


    /**
     * Sets the infoSource value for this BookFlightSegmentType.
     * 
     * @param infoSource
     */
    public void setInfoSource(java.lang.String infoSource) {
        this.infoSource = infoSource;
    }


    /**
     * Gets the flightNumber value for this BookFlightSegmentType.
     * 
     * @return flightNumber
     */
    public java.lang.String getFlightNumber() {
        return flightNumber;
    }


    /**
     * Sets the flightNumber value for this BookFlightSegmentType.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(java.lang.String flightNumber) {
        this.flightNumber = flightNumber;
    }


    /**
     * Gets the tourOperatorFlightID value for this BookFlightSegmentType.
     * 
     * @return tourOperatorFlightID
     */
    public java.lang.String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }


    /**
     * Sets the tourOperatorFlightID value for this BookFlightSegmentType.
     * 
     * @param tourOperatorFlightID
     */
    public void setTourOperatorFlightID(java.lang.String tourOperatorFlightID) {
        this.tourOperatorFlightID = tourOperatorFlightID;
    }


    /**
     * Gets the resBookDesigCode value for this BookFlightSegmentType.
     * 
     * @return resBookDesigCode
     */
    public java.lang.String getResBookDesigCode() {
        return resBookDesigCode;
    }


    /**
     * Sets the resBookDesigCode value for this BookFlightSegmentType.
     * 
     * @param resBookDesigCode
     */
    public void setResBookDesigCode(java.lang.String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }


    /**
     * Gets the actionCode value for this BookFlightSegmentType.
     * 
     * @return actionCode
     */
    public org.opentravel.www.OTA._2003._05.ActionCodeType getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this BookFlightSegmentType.
     * 
     * @param actionCode
     */
    public void setActionCode(org.opentravel.www.OTA._2003._05.ActionCodeType actionCode) {
        this.actionCode = actionCode;
    }


    /**
     * Gets the numberInParty value for this BookFlightSegmentType.
     * 
     * @return numberInParty
     */
    public org.apache.axis.types.PositiveInteger getNumberInParty() {
        return numberInParty;
    }


    /**
     * Sets the numberInParty value for this BookFlightSegmentType.
     * 
     * @param numberInParty
     */
    public void setNumberInParty(org.apache.axis.types.PositiveInteger numberInParty) {
        this.numberInParty = numberInParty;
    }


    /**
     * Gets the elapsedTime value for this BookFlightSegmentType.
     * 
     * @return elapsedTime
     */
    public short getElapsedTime() {
        return elapsedTime;
    }


    /**
     * Sets the elapsedTime value for this BookFlightSegmentType.
     * 
     * @param elapsedTime
     */
    public void setElapsedTime(short elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookFlightSegmentType)) return false;
        BookFlightSegmentType other = (BookFlightSegmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureAirport==null && other.getDepartureAirport()==null) || 
             (this.departureAirport!=null &&
              this.departureAirport.equals(other.getDepartureAirport()))) &&
            ((this.arrivalAirport==null && other.getArrivalAirport()==null) || 
             (this.arrivalAirport!=null &&
              this.arrivalAirport.equals(other.getArrivalAirport()))) &&
            ((this.operatingAirline==null && other.getOperatingAirline()==null) || 
             (this.operatingAirline!=null &&
              this.operatingAirline.equals(other.getOperatingAirline()))) &&
            ((this.equipment==null && other.getEquipment()==null) || 
             (this.equipment!=null &&
              java.util.Arrays.equals(this.equipment, other.getEquipment()))) &&
            ((this.marketingAirline==null && other.getMarketingAirline()==null) || 
             (this.marketingAirline!=null &&
              this.marketingAirline.equals(other.getMarketingAirline()))) &&
            ((this.disclosureAirline==null && other.getDisclosureAirline()==null) || 
             (this.disclosureAirline!=null &&
              this.disclosureAirline.equals(other.getDisclosureAirline()))) &&
            ((this.marriageGrp==null && other.getMarriageGrp()==null) || 
             (this.marriageGrp!=null &&
              this.marriageGrp.equals(other.getMarriageGrp()))) &&
            ((this.stopAirports==null && other.getStopAirports()==null) || 
             (this.stopAirports!=null &&
              java.util.Arrays.equals(this.stopAirports, other.getStopAirports()))) &&
            ((this.departureTimeZone==null && other.getDepartureTimeZone()==null) || 
             (this.departureTimeZone!=null &&
              this.departureTimeZone.equals(other.getDepartureTimeZone()))) &&
            ((this.arrivalTimeZone==null && other.getArrivalTimeZone()==null) || 
             (this.arrivalTimeZone!=null &&
              this.arrivalTimeZone.equals(other.getArrivalTimeZone()))) &&
            ((this.onTimePerformance==null && other.getOnTimePerformance()==null) || 
             (this.onTimePerformance!=null &&
              this.onTimePerformance.equals(other.getOnTimePerformance()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.departureDateTime==null && other.getDepartureDateTime()==null) || 
             (this.departureDateTime!=null &&
              this.departureDateTime.equals(other.getDepartureDateTime()))) &&
            ((this.arrivalDateTime==null && other.getArrivalDateTime()==null) || 
             (this.arrivalDateTime!=null &&
              this.arrivalDateTime.equals(other.getArrivalDateTime()))) &&
            ((this.stopQuantity==null && other.getStopQuantity()==null) || 
             (this.stopQuantity!=null &&
              this.stopQuantity.equals(other.getStopQuantity()))) &&
            ((this.RPH==null && other.getRPH()==null) || 
             (this.RPH!=null &&
              this.RPH.equals(other.getRPH()))) &&
            ((this.infoSource==null && other.getInfoSource()==null) || 
             (this.infoSource!=null &&
              this.infoSource.equals(other.getInfoSource()))) &&
            ((this.flightNumber==null && other.getFlightNumber()==null) || 
             (this.flightNumber!=null &&
              this.flightNumber.equals(other.getFlightNumber()))) &&
            ((this.tourOperatorFlightID==null && other.getTourOperatorFlightID()==null) || 
             (this.tourOperatorFlightID!=null &&
              this.tourOperatorFlightID.equals(other.getTourOperatorFlightID()))) &&
            ((this.resBookDesigCode==null && other.getResBookDesigCode()==null) || 
             (this.resBookDesigCode!=null &&
              this.resBookDesigCode.equals(other.getResBookDesigCode()))) &&
            ((this.actionCode==null && other.getActionCode()==null) || 
             (this.actionCode!=null &&
              this.actionCode.equals(other.getActionCode()))) &&
            ((this.numberInParty==null && other.getNumberInParty()==null) || 
             (this.numberInParty!=null &&
              this.numberInParty.equals(other.getNumberInParty()))) &&
            this.elapsedTime == other.getElapsedTime();
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
        if (getDepartureAirport() != null) {
            _hashCode += getDepartureAirport().hashCode();
        }
        if (getArrivalAirport() != null) {
            _hashCode += getArrivalAirport().hashCode();
        }
        if (getOperatingAirline() != null) {
            _hashCode += getOperatingAirline().hashCode();
        }
        if (getEquipment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEquipment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEquipment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarketingAirline() != null) {
            _hashCode += getMarketingAirline().hashCode();
        }
        if (getDisclosureAirline() != null) {
            _hashCode += getDisclosureAirline().hashCode();
        }
        if (getMarriageGrp() != null) {
            _hashCode += getMarriageGrp().hashCode();
        }
        if (getStopAirports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStopAirports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStopAirports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartureTimeZone() != null) {
            _hashCode += getDepartureTimeZone().hashCode();
        }
        if (getArrivalTimeZone() != null) {
            _hashCode += getArrivalTimeZone().hashCode();
        }
        if (getOnTimePerformance() != null) {
            _hashCode += getOnTimePerformance().hashCode();
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getDepartureDateTime() != null) {
            _hashCode += getDepartureDateTime().hashCode();
        }
        if (getArrivalDateTime() != null) {
            _hashCode += getArrivalDateTime().hashCode();
        }
        if (getStopQuantity() != null) {
            _hashCode += getStopQuantity().hashCode();
        }
        if (getRPH() != null) {
            _hashCode += getRPH().hashCode();
        }
        if (getInfoSource() != null) {
            _hashCode += getInfoSource().hashCode();
        }
        if (getFlightNumber() != null) {
            _hashCode += getFlightNumber().hashCode();
        }
        if (getTourOperatorFlightID() != null) {
            _hashCode += getTourOperatorFlightID().hashCode();
        }
        if (getResBookDesigCode() != null) {
            _hashCode += getResBookDesigCode().hashCode();
        }
        if (getActionCode() != null) {
            _hashCode += getActionCode().hashCode();
        }
        if (getNumberInParty() != null) {
            _hashCode += getNumberInParty().hashCode();
        }
        _hashCode += getElapsedTime();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookFlightSegmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookFlightSegmentType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("arrivalDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ArrivalDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stopQuantity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StopQuantity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("RPH");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RPH"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("infoSource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InfoSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("flightNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FlightNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightNumberType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tourOperatorFlightID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TourOperatorFlightID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resBookDesigCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResBookDesigCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaLength1to2WithSpace"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actionCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ActionCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ActionCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numberInParty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NumberInParty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("elapsedTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ElapsedTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirportInformationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirportInformationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingAirline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OperatingAirline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OperatingAirlineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Equipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EquipmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingAirline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MarketingAirline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclosureAirline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DisclosureAirline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marriageGrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MarriageGrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopAirports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StopAirports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>StopAirports>StopAirport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StopAirport"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>DepartureTimeZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>ArrivalTimeZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onTimePerformance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OnTimePerformance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>OnTimePerformance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>TPA_Extensions"));
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
