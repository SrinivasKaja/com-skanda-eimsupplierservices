/**
 * ExchangeOriginDestinationInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeOriginDestinationInformationType  extends org.opentravel.www.OTA._2003._05.OriginDestinationInformationType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationFlightType[] flight;

    /* The number of alternate days around the travel date to search. */
    private org.opentravel.www.OTA._2003._05.DateFlexibility[] dateFlexibility;

    /* List of alternate destination cities to search */
    private org.opentravel.www.OTA._2003._05.RequestLocationType[] sisterDestinationLocation;

    private org.opentravel.www.OTA._2003._05.SisterDestinationMileage sisterDestinationMileage;

    /* List of alternate origin cities to search */
    private org.opentravel.www.OTA._2003._05.RequestLocationType[] sisterOriginLocation;

    private org.opentravel.www.OTA._2003._05.SisterOriginMileage sisterOriginMileage;

    private org.opentravel.www.OTA._2003._05.SegmentType segmentType;

    /* Maximum time difference/deviation allowed. */
    private org.opentravel.www.OTA._2003._05.AlternateTime alternateTime;

    /* Maximum number of options to return. */
    private org.opentravel.www.OTA._2003._05.MaxOneWayOptions maxOneWayOptions;

    /* Number of options for requested date. */
    private org.opentravel.www.OTA._2003._05.NumOneWayOptions numOneWayOptions;

    /* Defines preferred cabin to be used in a search for this leg
     * level (if SegmentType is "O") or segment (if SegmentType is "X").
     * The cabin type specified in this element will override the cabin type
     * specified at the request level for this leg/segment. If a cabin type
     * is not specified for this element the cabin type at request level
     * will be used as default for this leg or segment. If the cabin type
     * is not specified at both the leg/segment level and request level a
     * default cabin of "Economy" will be used? */
    private org.opentravel.www.OTA._2003._05.CabinPrefType cabinPref;

    /* Connection time between segments. */
    private org.opentravel.www.OTA._2003._05.ConnectionTime connectionTime;

    /* Total travel time settings */
    private org.opentravel.www.OTA._2003._05.TotalTravelTime totalTravelTime;

    public ExchangeOriginDestinationInformationType() {
    }

    public ExchangeOriginDestinationInformationType(
           java.lang.String departureDateTime,
           java.lang.String arrivalDateTime,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates departureDates,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates arrivalDates,
           java.lang.String departureWindow,
           java.lang.String arrivalWindow,
           org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation originLocation,
           org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation destinationLocation,
           org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations,
           org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationFlightType[] flight,
           org.opentravel.www.OTA._2003._05.DateFlexibility[] dateFlexibility,
           org.opentravel.www.OTA._2003._05.RequestLocationType[] sisterDestinationLocation,
           org.opentravel.www.OTA._2003._05.SisterDestinationMileage sisterDestinationMileage,
           org.opentravel.www.OTA._2003._05.RequestLocationType[] sisterOriginLocation,
           org.opentravel.www.OTA._2003._05.SisterOriginMileage sisterOriginMileage,
           org.opentravel.www.OTA._2003._05.SegmentType segmentType,
           org.opentravel.www.OTA._2003._05.AlternateTime alternateTime,
           org.opentravel.www.OTA._2003._05.MaxOneWayOptions maxOneWayOptions,
           org.opentravel.www.OTA._2003._05.NumOneWayOptions numOneWayOptions,
           org.opentravel.www.OTA._2003._05.CabinPrefType cabinPref,
           org.opentravel.www.OTA._2003._05.ConnectionTime connectionTime,
           org.opentravel.www.OTA._2003._05.TotalTravelTime totalTravelTime) {
        super(
            departureDateTime,
            arrivalDateTime,
            departureDates,
            arrivalDates,
            departureWindow,
            arrivalWindow,
            originLocation,
            destinationLocation,
            connectionLocations);
        this.flight = flight;
        this.dateFlexibility = dateFlexibility;
        this.sisterDestinationLocation = sisterDestinationLocation;
        this.sisterDestinationMileage = sisterDestinationMileage;
        this.sisterOriginLocation = sisterOriginLocation;
        this.sisterOriginMileage = sisterOriginMileage;
        this.segmentType = segmentType;
        this.alternateTime = alternateTime;
        this.maxOneWayOptions = maxOneWayOptions;
        this.numOneWayOptions = numOneWayOptions;
        this.cabinPref = cabinPref;
        this.connectionTime = connectionTime;
        this.totalTravelTime = totalTravelTime;
    }


    /**
     * Gets the flight value for this ExchangeOriginDestinationInformationType.
     * 
     * @return flight
     */
    public org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationFlightType[] getFlight() {
        return flight;
    }


    /**
     * Sets the flight value for this ExchangeOriginDestinationInformationType.
     * 
     * @param flight
     */
    public void setFlight(org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationFlightType[] flight) {
        this.flight = flight;
    }

    public org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationFlightType getFlight(int i) {
        return this.flight[i];
    }

    public void setFlight(int i, org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationFlightType _value) {
        this.flight[i] = _value;
    }


    /**
     * Gets the dateFlexibility value for this ExchangeOriginDestinationInformationType.
     * 
     * @return dateFlexibility   * The number of alternate days around the travel date to search.
     */
    public org.opentravel.www.OTA._2003._05.DateFlexibility[] getDateFlexibility() {
        return dateFlexibility;
    }


    /**
     * Sets the dateFlexibility value for this ExchangeOriginDestinationInformationType.
     * 
     * @param dateFlexibility   * The number of alternate days around the travel date to search.
     */
    public void setDateFlexibility(org.opentravel.www.OTA._2003._05.DateFlexibility[] dateFlexibility) {
        this.dateFlexibility = dateFlexibility;
    }

    public org.opentravel.www.OTA._2003._05.DateFlexibility getDateFlexibility(int i) {
        return this.dateFlexibility[i];
    }

    public void setDateFlexibility(int i, org.opentravel.www.OTA._2003._05.DateFlexibility _value) {
        this.dateFlexibility[i] = _value;
    }


    /**
     * Gets the sisterDestinationLocation value for this ExchangeOriginDestinationInformationType.
     * 
     * @return sisterDestinationLocation   * List of alternate destination cities to search
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType[] getSisterDestinationLocation() {
        return sisterDestinationLocation;
    }


    /**
     * Sets the sisterDestinationLocation value for this ExchangeOriginDestinationInformationType.
     * 
     * @param sisterDestinationLocation   * List of alternate destination cities to search
     */
    public void setSisterDestinationLocation(org.opentravel.www.OTA._2003._05.RequestLocationType[] sisterDestinationLocation) {
        this.sisterDestinationLocation = sisterDestinationLocation;
    }

    public org.opentravel.www.OTA._2003._05.RequestLocationType getSisterDestinationLocation(int i) {
        return this.sisterDestinationLocation[i];
    }

    public void setSisterDestinationLocation(int i, org.opentravel.www.OTA._2003._05.RequestLocationType _value) {
        this.sisterDestinationLocation[i] = _value;
    }


    /**
     * Gets the sisterDestinationMileage value for this ExchangeOriginDestinationInformationType.
     * 
     * @return sisterDestinationMileage
     */
    public org.opentravel.www.OTA._2003._05.SisterDestinationMileage getSisterDestinationMileage() {
        return sisterDestinationMileage;
    }


    /**
     * Sets the sisterDestinationMileage value for this ExchangeOriginDestinationInformationType.
     * 
     * @param sisterDestinationMileage
     */
    public void setSisterDestinationMileage(org.opentravel.www.OTA._2003._05.SisterDestinationMileage sisterDestinationMileage) {
        this.sisterDestinationMileage = sisterDestinationMileage;
    }


    /**
     * Gets the sisterOriginLocation value for this ExchangeOriginDestinationInformationType.
     * 
     * @return sisterOriginLocation   * List of alternate origin cities to search
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType[] getSisterOriginLocation() {
        return sisterOriginLocation;
    }


    /**
     * Sets the sisterOriginLocation value for this ExchangeOriginDestinationInformationType.
     * 
     * @param sisterOriginLocation   * List of alternate origin cities to search
     */
    public void setSisterOriginLocation(org.opentravel.www.OTA._2003._05.RequestLocationType[] sisterOriginLocation) {
        this.sisterOriginLocation = sisterOriginLocation;
    }

    public org.opentravel.www.OTA._2003._05.RequestLocationType getSisterOriginLocation(int i) {
        return this.sisterOriginLocation[i];
    }

    public void setSisterOriginLocation(int i, org.opentravel.www.OTA._2003._05.RequestLocationType _value) {
        this.sisterOriginLocation[i] = _value;
    }


    /**
     * Gets the sisterOriginMileage value for this ExchangeOriginDestinationInformationType.
     * 
     * @return sisterOriginMileage
     */
    public org.opentravel.www.OTA._2003._05.SisterOriginMileage getSisterOriginMileage() {
        return sisterOriginMileage;
    }


    /**
     * Sets the sisterOriginMileage value for this ExchangeOriginDestinationInformationType.
     * 
     * @param sisterOriginMileage
     */
    public void setSisterOriginMileage(org.opentravel.www.OTA._2003._05.SisterOriginMileage sisterOriginMileage) {
        this.sisterOriginMileage = sisterOriginMileage;
    }


    /**
     * Gets the segmentType value for this ExchangeOriginDestinationInformationType.
     * 
     * @return segmentType
     */
    public org.opentravel.www.OTA._2003._05.SegmentType getSegmentType() {
        return segmentType;
    }


    /**
     * Sets the segmentType value for this ExchangeOriginDestinationInformationType.
     * 
     * @param segmentType
     */
    public void setSegmentType(org.opentravel.www.OTA._2003._05.SegmentType segmentType) {
        this.segmentType = segmentType;
    }


    /**
     * Gets the alternateTime value for this ExchangeOriginDestinationInformationType.
     * 
     * @return alternateTime   * Maximum time difference/deviation allowed.
     */
    public org.opentravel.www.OTA._2003._05.AlternateTime getAlternateTime() {
        return alternateTime;
    }


    /**
     * Sets the alternateTime value for this ExchangeOriginDestinationInformationType.
     * 
     * @param alternateTime   * Maximum time difference/deviation allowed.
     */
    public void setAlternateTime(org.opentravel.www.OTA._2003._05.AlternateTime alternateTime) {
        this.alternateTime = alternateTime;
    }


    /**
     * Gets the maxOneWayOptions value for this ExchangeOriginDestinationInformationType.
     * 
     * @return maxOneWayOptions   * Maximum number of options to return.
     */
    public org.opentravel.www.OTA._2003._05.MaxOneWayOptions getMaxOneWayOptions() {
        return maxOneWayOptions;
    }


    /**
     * Sets the maxOneWayOptions value for this ExchangeOriginDestinationInformationType.
     * 
     * @param maxOneWayOptions   * Maximum number of options to return.
     */
    public void setMaxOneWayOptions(org.opentravel.www.OTA._2003._05.MaxOneWayOptions maxOneWayOptions) {
        this.maxOneWayOptions = maxOneWayOptions;
    }


    /**
     * Gets the numOneWayOptions value for this ExchangeOriginDestinationInformationType.
     * 
     * @return numOneWayOptions   * Number of options for requested date.
     */
    public org.opentravel.www.OTA._2003._05.NumOneWayOptions getNumOneWayOptions() {
        return numOneWayOptions;
    }


    /**
     * Sets the numOneWayOptions value for this ExchangeOriginDestinationInformationType.
     * 
     * @param numOneWayOptions   * Number of options for requested date.
     */
    public void setNumOneWayOptions(org.opentravel.www.OTA._2003._05.NumOneWayOptions numOneWayOptions) {
        this.numOneWayOptions = numOneWayOptions;
    }


    /**
     * Gets the cabinPref value for this ExchangeOriginDestinationInformationType.
     * 
     * @return cabinPref   * Defines preferred cabin to be used in a search for this leg
     * level (if SegmentType is "O") or segment (if SegmentType is "X").
     * The cabin type specified in this element will override the cabin type
     * specified at the request level for this leg/segment. If a cabin type
     * is not specified for this element the cabin type at request level
     * will be used as default for this leg or segment. If the cabin type
     * is not specified at both the leg/segment level and request level a
     * default cabin of "Economy" will be used?
     */
    public org.opentravel.www.OTA._2003._05.CabinPrefType getCabinPref() {
        return cabinPref;
    }


    /**
     * Sets the cabinPref value for this ExchangeOriginDestinationInformationType.
     * 
     * @param cabinPref   * Defines preferred cabin to be used in a search for this leg
     * level (if SegmentType is "O") or segment (if SegmentType is "X").
     * The cabin type specified in this element will override the cabin type
     * specified at the request level for this leg/segment. If a cabin type
     * is not specified for this element the cabin type at request level
     * will be used as default for this leg or segment. If the cabin type
     * is not specified at both the leg/segment level and request level a
     * default cabin of "Economy" will be used?
     */
    public void setCabinPref(org.opentravel.www.OTA._2003._05.CabinPrefType cabinPref) {
        this.cabinPref = cabinPref;
    }


    /**
     * Gets the connectionTime value for this ExchangeOriginDestinationInformationType.
     * 
     * @return connectionTime   * Connection time between segments.
     */
    public org.opentravel.www.OTA._2003._05.ConnectionTime getConnectionTime() {
        return connectionTime;
    }


    /**
     * Sets the connectionTime value for this ExchangeOriginDestinationInformationType.
     * 
     * @param connectionTime   * Connection time between segments.
     */
    public void setConnectionTime(org.opentravel.www.OTA._2003._05.ConnectionTime connectionTime) {
        this.connectionTime = connectionTime;
    }


    /**
     * Gets the totalTravelTime value for this ExchangeOriginDestinationInformationType.
     * 
     * @return totalTravelTime   * Total travel time settings
     */
    public org.opentravel.www.OTA._2003._05.TotalTravelTime getTotalTravelTime() {
        return totalTravelTime;
    }


    /**
     * Sets the totalTravelTime value for this ExchangeOriginDestinationInformationType.
     * 
     * @param totalTravelTime   * Total travel time settings
     */
    public void setTotalTravelTime(org.opentravel.www.OTA._2003._05.TotalTravelTime totalTravelTime) {
        this.totalTravelTime = totalTravelTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeOriginDestinationInformationType)) return false;
        ExchangeOriginDestinationInformationType other = (ExchangeOriginDestinationInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flight==null && other.getFlight()==null) || 
             (this.flight!=null &&
              java.util.Arrays.equals(this.flight, other.getFlight()))) &&
            ((this.dateFlexibility==null && other.getDateFlexibility()==null) || 
             (this.dateFlexibility!=null &&
              java.util.Arrays.equals(this.dateFlexibility, other.getDateFlexibility()))) &&
            ((this.sisterDestinationLocation==null && other.getSisterDestinationLocation()==null) || 
             (this.sisterDestinationLocation!=null &&
              java.util.Arrays.equals(this.sisterDestinationLocation, other.getSisterDestinationLocation()))) &&
            ((this.sisterDestinationMileage==null && other.getSisterDestinationMileage()==null) || 
             (this.sisterDestinationMileage!=null &&
              this.sisterDestinationMileage.equals(other.getSisterDestinationMileage()))) &&
            ((this.sisterOriginLocation==null && other.getSisterOriginLocation()==null) || 
             (this.sisterOriginLocation!=null &&
              java.util.Arrays.equals(this.sisterOriginLocation, other.getSisterOriginLocation()))) &&
            ((this.sisterOriginMileage==null && other.getSisterOriginMileage()==null) || 
             (this.sisterOriginMileage!=null &&
              this.sisterOriginMileage.equals(other.getSisterOriginMileage()))) &&
            ((this.segmentType==null && other.getSegmentType()==null) || 
             (this.segmentType!=null &&
              this.segmentType.equals(other.getSegmentType()))) &&
            ((this.alternateTime==null && other.getAlternateTime()==null) || 
             (this.alternateTime!=null &&
              this.alternateTime.equals(other.getAlternateTime()))) &&
            ((this.maxOneWayOptions==null && other.getMaxOneWayOptions()==null) || 
             (this.maxOneWayOptions!=null &&
              this.maxOneWayOptions.equals(other.getMaxOneWayOptions()))) &&
            ((this.numOneWayOptions==null && other.getNumOneWayOptions()==null) || 
             (this.numOneWayOptions!=null &&
              this.numOneWayOptions.equals(other.getNumOneWayOptions()))) &&
            ((this.cabinPref==null && other.getCabinPref()==null) || 
             (this.cabinPref!=null &&
              this.cabinPref.equals(other.getCabinPref()))) &&
            ((this.connectionTime==null && other.getConnectionTime()==null) || 
             (this.connectionTime!=null &&
              this.connectionTime.equals(other.getConnectionTime()))) &&
            ((this.totalTravelTime==null && other.getTotalTravelTime()==null) || 
             (this.totalTravelTime!=null &&
              this.totalTravelTime.equals(other.getTotalTravelTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getFlight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateFlexibility() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateFlexibility());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateFlexibility(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSisterDestinationLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSisterDestinationLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSisterDestinationLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSisterDestinationMileage() != null) {
            _hashCode += getSisterDestinationMileage().hashCode();
        }
        if (getSisterOriginLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSisterOriginLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSisterOriginLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSisterOriginMileage() != null) {
            _hashCode += getSisterOriginMileage().hashCode();
        }
        if (getSegmentType() != null) {
            _hashCode += getSegmentType().hashCode();
        }
        if (getAlternateTime() != null) {
            _hashCode += getAlternateTime().hashCode();
        }
        if (getMaxOneWayOptions() != null) {
            _hashCode += getMaxOneWayOptions().hashCode();
        }
        if (getNumOneWayOptions() != null) {
            _hashCode += getNumOneWayOptions().hashCode();
        }
        if (getCabinPref() != null) {
            _hashCode += getCabinPref().hashCode();
        }
        if (getConnectionTime() != null) {
            _hashCode += getConnectionTime().hashCode();
        }
        if (getTotalTravelTime() != null) {
            _hashCode += getTotalTravelTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeOriginDestinationInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeOriginDestinationInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Flight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeOriginDestinationFlightType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFlexibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DateFlexibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DateFlexibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sisterDestinationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SisterDestinationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sisterDestinationMileage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SisterDestinationMileage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SisterDestinationMileage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sisterOriginLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SisterOriginLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sisterOriginMileage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SisterOriginMileage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SisterOriginMileage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SegmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SegmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AlternateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxOneWayOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MaxOneWayOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">MaxOneWayOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOneWayOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumOneWayOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">NumOneWayOptions"));
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
        elemField.setFieldName("connectionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTravelTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalTravelTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TotalTravelTime"));
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
