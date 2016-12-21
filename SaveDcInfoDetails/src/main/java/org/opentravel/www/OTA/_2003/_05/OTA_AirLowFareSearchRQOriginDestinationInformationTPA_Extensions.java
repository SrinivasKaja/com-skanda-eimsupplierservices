/**
 * OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.OriginDestinationFlightType[] flight;

    private org.opentravel.www.OTA._2003._05.RoutingLegType[][] routing;

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

    private org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] includeVendorPref;

    /* Consider only these alliances. */
    private org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref;

    private org.opentravel.www.OTA._2003._05.DepartureDaysType departureDays;

    public OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions() {
    }

    public OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions(
           org.opentravel.www.OTA._2003._05.OriginDestinationFlightType[] flight,
           org.opentravel.www.OTA._2003._05.RoutingLegType[][] routing,
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
           org.opentravel.www.OTA._2003._05.TotalTravelTime totalTravelTime,
           org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] includeVendorPref,
           org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref,
           org.opentravel.www.OTA._2003._05.DepartureDaysType departureDays) {
           this.flight = flight;
           this.routing = routing;
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
           this.includeVendorPref = includeVendorPref;
           this.includeAlliancePref = includeAlliancePref;
           this.departureDays = departureDays;
    }


    /**
     * Gets the flight value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return flight
     */
    public org.opentravel.www.OTA._2003._05.OriginDestinationFlightType[] getFlight() {
        return flight;
    }


    /**
     * Sets the flight value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param flight
     */
    public void setFlight(org.opentravel.www.OTA._2003._05.OriginDestinationFlightType[] flight) {
        this.flight = flight;
    }

    public org.opentravel.www.OTA._2003._05.OriginDestinationFlightType getFlight(int i) {
        return this.flight[i];
    }

    public void setFlight(int i, org.opentravel.www.OTA._2003._05.OriginDestinationFlightType _value) {
        this.flight[i] = _value;
    }


    /**
     * Gets the routing value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return routing
     */
    public org.opentravel.www.OTA._2003._05.RoutingLegType[][] getRouting() {
        return routing;
    }


    /**
     * Sets the routing value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param routing
     */
    public void setRouting(org.opentravel.www.OTA._2003._05.RoutingLegType[][] routing) {
        this.routing = routing;
    }

    public org.opentravel.www.OTA._2003._05.RoutingLegType[] getRouting(int i) {
        return this.routing[i];
    }

    public void setRouting(int i, org.opentravel.www.OTA._2003._05.RoutingLegType[] _value) {
        this.routing[i] = _value;
    }


    /**
     * Gets the dateFlexibility value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return dateFlexibility   * The number of alternate days around the travel date to search.
     */
    public org.opentravel.www.OTA._2003._05.DateFlexibility[] getDateFlexibility() {
        return dateFlexibility;
    }


    /**
     * Sets the dateFlexibility value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
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
     * Gets the sisterDestinationLocation value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return sisterDestinationLocation   * List of alternate destination cities to search
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType[] getSisterDestinationLocation() {
        return sisterDestinationLocation;
    }


    /**
     * Sets the sisterDestinationLocation value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
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
     * Gets the sisterDestinationMileage value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return sisterDestinationMileage
     */
    public org.opentravel.www.OTA._2003._05.SisterDestinationMileage getSisterDestinationMileage() {
        return sisterDestinationMileage;
    }


    /**
     * Sets the sisterDestinationMileage value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param sisterDestinationMileage
     */
    public void setSisterDestinationMileage(org.opentravel.www.OTA._2003._05.SisterDestinationMileage sisterDestinationMileage) {
        this.sisterDestinationMileage = sisterDestinationMileage;
    }


    /**
     * Gets the sisterOriginLocation value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return sisterOriginLocation   * List of alternate origin cities to search
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType[] getSisterOriginLocation() {
        return sisterOriginLocation;
    }


    /**
     * Sets the sisterOriginLocation value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
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
     * Gets the sisterOriginMileage value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return sisterOriginMileage
     */
    public org.opentravel.www.OTA._2003._05.SisterOriginMileage getSisterOriginMileage() {
        return sisterOriginMileage;
    }


    /**
     * Sets the sisterOriginMileage value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param sisterOriginMileage
     */
    public void setSisterOriginMileage(org.opentravel.www.OTA._2003._05.SisterOriginMileage sisterOriginMileage) {
        this.sisterOriginMileage = sisterOriginMileage;
    }


    /**
     * Gets the segmentType value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return segmentType
     */
    public org.opentravel.www.OTA._2003._05.SegmentType getSegmentType() {
        return segmentType;
    }


    /**
     * Sets the segmentType value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param segmentType
     */
    public void setSegmentType(org.opentravel.www.OTA._2003._05.SegmentType segmentType) {
        this.segmentType = segmentType;
    }


    /**
     * Gets the alternateTime value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return alternateTime   * Maximum time difference/deviation allowed.
     */
    public org.opentravel.www.OTA._2003._05.AlternateTime getAlternateTime() {
        return alternateTime;
    }


    /**
     * Sets the alternateTime value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param alternateTime   * Maximum time difference/deviation allowed.
     */
    public void setAlternateTime(org.opentravel.www.OTA._2003._05.AlternateTime alternateTime) {
        this.alternateTime = alternateTime;
    }


    /**
     * Gets the maxOneWayOptions value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return maxOneWayOptions   * Maximum number of options to return.
     */
    public org.opentravel.www.OTA._2003._05.MaxOneWayOptions getMaxOneWayOptions() {
        return maxOneWayOptions;
    }


    /**
     * Sets the maxOneWayOptions value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param maxOneWayOptions   * Maximum number of options to return.
     */
    public void setMaxOneWayOptions(org.opentravel.www.OTA._2003._05.MaxOneWayOptions maxOneWayOptions) {
        this.maxOneWayOptions = maxOneWayOptions;
    }


    /**
     * Gets the numOneWayOptions value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return numOneWayOptions   * Number of options for requested date.
     */
    public org.opentravel.www.OTA._2003._05.NumOneWayOptions getNumOneWayOptions() {
        return numOneWayOptions;
    }


    /**
     * Sets the numOneWayOptions value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param numOneWayOptions   * Number of options for requested date.
     */
    public void setNumOneWayOptions(org.opentravel.www.OTA._2003._05.NumOneWayOptions numOneWayOptions) {
        this.numOneWayOptions = numOneWayOptions;
    }


    /**
     * Gets the cabinPref value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
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
     * Sets the cabinPref value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
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
     * Gets the connectionTime value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return connectionTime   * Connection time between segments.
     */
    public org.opentravel.www.OTA._2003._05.ConnectionTime getConnectionTime() {
        return connectionTime;
    }


    /**
     * Sets the connectionTime value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param connectionTime   * Connection time between segments.
     */
    public void setConnectionTime(org.opentravel.www.OTA._2003._05.ConnectionTime connectionTime) {
        this.connectionTime = connectionTime;
    }


    /**
     * Gets the totalTravelTime value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return totalTravelTime   * Total travel time settings
     */
    public org.opentravel.www.OTA._2003._05.TotalTravelTime getTotalTravelTime() {
        return totalTravelTime;
    }


    /**
     * Sets the totalTravelTime value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param totalTravelTime   * Total travel time settings
     */
    public void setTotalTravelTime(org.opentravel.www.OTA._2003._05.TotalTravelTime totalTravelTime) {
        this.totalTravelTime = totalTravelTime;
    }


    /**
     * Gets the includeVendorPref value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return includeVendorPref
     */
    public org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] getIncludeVendorPref() {
        return includeVendorPref;
    }


    /**
     * Sets the includeVendorPref value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param includeVendorPref
     */
    public void setIncludeVendorPref(org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] includeVendorPref) {
        this.includeVendorPref = includeVendorPref;
    }

    public org.opentravel.www.OTA._2003._05.IncludeVendorPrefType getIncludeVendorPref(int i) {
        return this.includeVendorPref[i];
    }

    public void setIncludeVendorPref(int i, org.opentravel.www.OTA._2003._05.IncludeVendorPrefType _value) {
        this.includeVendorPref[i] = _value;
    }


    /**
     * Gets the includeAlliancePref value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return includeAlliancePref   * Consider only these alliances.
     */
    public org.opentravel.www.OTA._2003._05.AllianceType[] getIncludeAlliancePref() {
        return includeAlliancePref;
    }


    /**
     * Sets the includeAlliancePref value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param includeAlliancePref   * Consider only these alliances.
     */
    public void setIncludeAlliancePref(org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref) {
        this.includeAlliancePref = includeAlliancePref;
    }

    public org.opentravel.www.OTA._2003._05.AllianceType getIncludeAlliancePref(int i) {
        return this.includeAlliancePref[i];
    }

    public void setIncludeAlliancePref(int i, org.opentravel.www.OTA._2003._05.AllianceType _value) {
        this.includeAlliancePref[i] = _value;
    }


    /**
     * Gets the departureDays value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @return departureDays
     */
    public org.opentravel.www.OTA._2003._05.DepartureDaysType getDepartureDays() {
        return departureDays;
    }


    /**
     * Sets the departureDays value for this OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.
     * 
     * @param departureDays
     */
    public void setDepartureDays(org.opentravel.www.OTA._2003._05.DepartureDaysType departureDays) {
        this.departureDays = departureDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions)) return false;
        OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions other = (OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flight==null && other.getFlight()==null) || 
             (this.flight!=null &&
              java.util.Arrays.equals(this.flight, other.getFlight()))) &&
            ((this.routing==null && other.getRouting()==null) || 
             (this.routing!=null &&
              java.util.Arrays.equals(this.routing, other.getRouting()))) &&
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
              this.totalTravelTime.equals(other.getTotalTravelTime()))) &&
            ((this.includeVendorPref==null && other.getIncludeVendorPref()==null) || 
             (this.includeVendorPref!=null &&
              java.util.Arrays.equals(this.includeVendorPref, other.getIncludeVendorPref()))) &&
            ((this.includeAlliancePref==null && other.getIncludeAlliancePref()==null) || 
             (this.includeAlliancePref!=null &&
              java.util.Arrays.equals(this.includeAlliancePref, other.getIncludeAlliancePref()))) &&
            ((this.departureDays==null && other.getDepartureDays()==null) || 
             (this.departureDays!=null &&
              this.departureDays.equals(other.getDepartureDays())));
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
        if (getRouting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRouting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRouting(), i);
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
        if (getIncludeVendorPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeVendorPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeVendorPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeAlliancePref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeAlliancePref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeAlliancePref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartureDays() != null) {
            _hashCode += getDepartureDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>OriginDestinationInformation>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Flight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationFlightType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RoutingDefinitionType"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeVendorPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeVendorPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeVendorPrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAlliancePref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeAlliancePref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AllianceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDaysType"));
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
