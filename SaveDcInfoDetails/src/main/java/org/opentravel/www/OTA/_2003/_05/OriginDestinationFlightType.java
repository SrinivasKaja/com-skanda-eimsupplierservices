/**
 * OriginDestinationFlightType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OriginDestinationFlightType  implements java.io.Serializable {
    /* Flight origin code */
    private org.opentravel.www.OTA._2003._05.RequestLocationType originLocation;

    /* Flight destination code */
    private org.opentravel.www.OTA._2003._05.RequestLocationType destinationLocation;

    /* Airline information */
    private org.opentravel.www.OTA._2003._05.AirlineType airline;

    /* Side trip information */
    private org.opentravel.www.OTA._2003._05.SideTripType sideTrip;

    /* Reservation information */
    private org.opentravel.www.OTA._2003._05.ReservationType reservation;

    /* Mileage information */
    private org.opentravel.www.OTA._2003._05.MileageDisplayType[] mileageDisplay;

    /* Booking date and time */
    private java.lang.String bookingDateTime;

    private org.opentravel.www.OTA._2003._05.FareOptionalDetailsType fare;

    private org.opentravel.www.OTA._2003._05.PlusUpType[] plusUp;

    private short number;  // attribute

    private java.lang.String departureDateTime;  // attribute

    private java.lang.String arrivalDateTime;  // attribute

    private java.lang.String marriageStatus;  // attribute

    private java.lang.String type;  // attribute

    private java.lang.Boolean flown;  // attribute

    private java.lang.String classOfService;  // attribute

    private java.lang.Boolean shopped;  // attribute

    public OriginDestinationFlightType() {
    }

    public OriginDestinationFlightType(
           org.opentravel.www.OTA._2003._05.RequestLocationType originLocation,
           org.opentravel.www.OTA._2003._05.RequestLocationType destinationLocation,
           org.opentravel.www.OTA._2003._05.AirlineType airline,
           org.opentravel.www.OTA._2003._05.SideTripType sideTrip,
           org.opentravel.www.OTA._2003._05.ReservationType reservation,
           org.opentravel.www.OTA._2003._05.MileageDisplayType[] mileageDisplay,
           java.lang.String bookingDateTime,
           org.opentravel.www.OTA._2003._05.FareOptionalDetailsType fare,
           org.opentravel.www.OTA._2003._05.PlusUpType[] plusUp,
           short number,
           java.lang.String departureDateTime,
           java.lang.String arrivalDateTime,
           java.lang.String marriageStatus,
           java.lang.String type,
           java.lang.Boolean flown,
           java.lang.String classOfService,
           java.lang.Boolean shopped) {
           this.originLocation = originLocation;
           this.destinationLocation = destinationLocation;
           this.airline = airline;
           this.sideTrip = sideTrip;
           this.reservation = reservation;
           this.mileageDisplay = mileageDisplay;
           this.bookingDateTime = bookingDateTime;
           this.fare = fare;
           this.plusUp = plusUp;
           this.number = number;
           this.departureDateTime = departureDateTime;
           this.arrivalDateTime = arrivalDateTime;
           this.marriageStatus = marriageStatus;
           this.type = type;
           this.flown = flown;
           this.classOfService = classOfService;
           this.shopped = shopped;
    }


    /**
     * Gets the originLocation value for this OriginDestinationFlightType.
     * 
     * @return originLocation   * Flight origin code
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType getOriginLocation() {
        return originLocation;
    }


    /**
     * Sets the originLocation value for this OriginDestinationFlightType.
     * 
     * @param originLocation   * Flight origin code
     */
    public void setOriginLocation(org.opentravel.www.OTA._2003._05.RequestLocationType originLocation) {
        this.originLocation = originLocation;
    }


    /**
     * Gets the destinationLocation value for this OriginDestinationFlightType.
     * 
     * @return destinationLocation   * Flight destination code
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType getDestinationLocation() {
        return destinationLocation;
    }


    /**
     * Sets the destinationLocation value for this OriginDestinationFlightType.
     * 
     * @param destinationLocation   * Flight destination code
     */
    public void setDestinationLocation(org.opentravel.www.OTA._2003._05.RequestLocationType destinationLocation) {
        this.destinationLocation = destinationLocation;
    }


    /**
     * Gets the airline value for this OriginDestinationFlightType.
     * 
     * @return airline   * Airline information
     */
    public org.opentravel.www.OTA._2003._05.AirlineType getAirline() {
        return airline;
    }


    /**
     * Sets the airline value for this OriginDestinationFlightType.
     * 
     * @param airline   * Airline information
     */
    public void setAirline(org.opentravel.www.OTA._2003._05.AirlineType airline) {
        this.airline = airline;
    }


    /**
     * Gets the sideTrip value for this OriginDestinationFlightType.
     * 
     * @return sideTrip   * Side trip information
     */
    public org.opentravel.www.OTA._2003._05.SideTripType getSideTrip() {
        return sideTrip;
    }


    /**
     * Sets the sideTrip value for this OriginDestinationFlightType.
     * 
     * @param sideTrip   * Side trip information
     */
    public void setSideTrip(org.opentravel.www.OTA._2003._05.SideTripType sideTrip) {
        this.sideTrip = sideTrip;
    }


    /**
     * Gets the reservation value for this OriginDestinationFlightType.
     * 
     * @return reservation   * Reservation information
     */
    public org.opentravel.www.OTA._2003._05.ReservationType getReservation() {
        return reservation;
    }


    /**
     * Sets the reservation value for this OriginDestinationFlightType.
     * 
     * @param reservation   * Reservation information
     */
    public void setReservation(org.opentravel.www.OTA._2003._05.ReservationType reservation) {
        this.reservation = reservation;
    }


    /**
     * Gets the mileageDisplay value for this OriginDestinationFlightType.
     * 
     * @return mileageDisplay   * Mileage information
     */
    public org.opentravel.www.OTA._2003._05.MileageDisplayType[] getMileageDisplay() {
        return mileageDisplay;
    }


    /**
     * Sets the mileageDisplay value for this OriginDestinationFlightType.
     * 
     * @param mileageDisplay   * Mileage information
     */
    public void setMileageDisplay(org.opentravel.www.OTA._2003._05.MileageDisplayType[] mileageDisplay) {
        this.mileageDisplay = mileageDisplay;
    }

    public org.opentravel.www.OTA._2003._05.MileageDisplayType getMileageDisplay(int i) {
        return this.mileageDisplay[i];
    }

    public void setMileageDisplay(int i, org.opentravel.www.OTA._2003._05.MileageDisplayType _value) {
        this.mileageDisplay[i] = _value;
    }


    /**
     * Gets the bookingDateTime value for this OriginDestinationFlightType.
     * 
     * @return bookingDateTime   * Booking date and time
     */
    public java.lang.String getBookingDateTime() {
        return bookingDateTime;
    }


    /**
     * Sets the bookingDateTime value for this OriginDestinationFlightType.
     * 
     * @param bookingDateTime   * Booking date and time
     */
    public void setBookingDateTime(java.lang.String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }


    /**
     * Gets the fare value for this OriginDestinationFlightType.
     * 
     * @return fare
     */
    public org.opentravel.www.OTA._2003._05.FareOptionalDetailsType getFare() {
        return fare;
    }


    /**
     * Sets the fare value for this OriginDestinationFlightType.
     * 
     * @param fare
     */
    public void setFare(org.opentravel.www.OTA._2003._05.FareOptionalDetailsType fare) {
        this.fare = fare;
    }


    /**
     * Gets the plusUp value for this OriginDestinationFlightType.
     * 
     * @return plusUp
     */
    public org.opentravel.www.OTA._2003._05.PlusUpType[] getPlusUp() {
        return plusUp;
    }


    /**
     * Sets the plusUp value for this OriginDestinationFlightType.
     * 
     * @param plusUp
     */
    public void setPlusUp(org.opentravel.www.OTA._2003._05.PlusUpType[] plusUp) {
        this.plusUp = plusUp;
    }

    public org.opentravel.www.OTA._2003._05.PlusUpType getPlusUp(int i) {
        return this.plusUp[i];
    }

    public void setPlusUp(int i, org.opentravel.www.OTA._2003._05.PlusUpType _value) {
        this.plusUp[i] = _value;
    }


    /**
     * Gets the number value for this OriginDestinationFlightType.
     * 
     * @return number
     */
    public short getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OriginDestinationFlightType.
     * 
     * @param number
     */
    public void setNumber(short number) {
        this.number = number;
    }


    /**
     * Gets the departureDateTime value for this OriginDestinationFlightType.
     * 
     * @return departureDateTime
     */
    public java.lang.String getDepartureDateTime() {
        return departureDateTime;
    }


    /**
     * Sets the departureDateTime value for this OriginDestinationFlightType.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(java.lang.String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }


    /**
     * Gets the arrivalDateTime value for this OriginDestinationFlightType.
     * 
     * @return arrivalDateTime
     */
    public java.lang.String getArrivalDateTime() {
        return arrivalDateTime;
    }


    /**
     * Sets the arrivalDateTime value for this OriginDestinationFlightType.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(java.lang.String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    /**
     * Gets the marriageStatus value for this OriginDestinationFlightType.
     * 
     * @return marriageStatus
     */
    public java.lang.String getMarriageStatus() {
        return marriageStatus;
    }


    /**
     * Sets the marriageStatus value for this OriginDestinationFlightType.
     * 
     * @param marriageStatus
     */
    public void setMarriageStatus(java.lang.String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }


    /**
     * Gets the type value for this OriginDestinationFlightType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OriginDestinationFlightType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the flown value for this OriginDestinationFlightType.
     * 
     * @return flown
     */
    public java.lang.Boolean getFlown() {
        return flown;
    }


    /**
     * Sets the flown value for this OriginDestinationFlightType.
     * 
     * @param flown
     */
    public void setFlown(java.lang.Boolean flown) {
        this.flown = flown;
    }


    /**
     * Gets the classOfService value for this OriginDestinationFlightType.
     * 
     * @return classOfService
     */
    public java.lang.String getClassOfService() {
        return classOfService;
    }


    /**
     * Sets the classOfService value for this OriginDestinationFlightType.
     * 
     * @param classOfService
     */
    public void setClassOfService(java.lang.String classOfService) {
        this.classOfService = classOfService;
    }


    /**
     * Gets the shopped value for this OriginDestinationFlightType.
     * 
     * @return shopped
     */
    public java.lang.Boolean getShopped() {
        return shopped;
    }


    /**
     * Sets the shopped value for this OriginDestinationFlightType.
     * 
     * @param shopped
     */
    public void setShopped(java.lang.Boolean shopped) {
        this.shopped = shopped;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginDestinationFlightType)) return false;
        OriginDestinationFlightType other = (OriginDestinationFlightType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originLocation==null && other.getOriginLocation()==null) || 
             (this.originLocation!=null &&
              this.originLocation.equals(other.getOriginLocation()))) &&
            ((this.destinationLocation==null && other.getDestinationLocation()==null) || 
             (this.destinationLocation!=null &&
              this.destinationLocation.equals(other.getDestinationLocation()))) &&
            ((this.airline==null && other.getAirline()==null) || 
             (this.airline!=null &&
              this.airline.equals(other.getAirline()))) &&
            ((this.sideTrip==null && other.getSideTrip()==null) || 
             (this.sideTrip!=null &&
              this.sideTrip.equals(other.getSideTrip()))) &&
            ((this.reservation==null && other.getReservation()==null) || 
             (this.reservation!=null &&
              this.reservation.equals(other.getReservation()))) &&
            ((this.mileageDisplay==null && other.getMileageDisplay()==null) || 
             (this.mileageDisplay!=null &&
              java.util.Arrays.equals(this.mileageDisplay, other.getMileageDisplay()))) &&
            ((this.bookingDateTime==null && other.getBookingDateTime()==null) || 
             (this.bookingDateTime!=null &&
              this.bookingDateTime.equals(other.getBookingDateTime()))) &&
            ((this.fare==null && other.getFare()==null) || 
             (this.fare!=null &&
              this.fare.equals(other.getFare()))) &&
            ((this.plusUp==null && other.getPlusUp()==null) || 
             (this.plusUp!=null &&
              java.util.Arrays.equals(this.plusUp, other.getPlusUp()))) &&
            this.number == other.getNumber() &&
            ((this.departureDateTime==null && other.getDepartureDateTime()==null) || 
             (this.departureDateTime!=null &&
              this.departureDateTime.equals(other.getDepartureDateTime()))) &&
            ((this.arrivalDateTime==null && other.getArrivalDateTime()==null) || 
             (this.arrivalDateTime!=null &&
              this.arrivalDateTime.equals(other.getArrivalDateTime()))) &&
            ((this.marriageStatus==null && other.getMarriageStatus()==null) || 
             (this.marriageStatus!=null &&
              this.marriageStatus.equals(other.getMarriageStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.flown==null && other.getFlown()==null) || 
             (this.flown!=null &&
              this.flown.equals(other.getFlown()))) &&
            ((this.classOfService==null && other.getClassOfService()==null) || 
             (this.classOfService!=null &&
              this.classOfService.equals(other.getClassOfService()))) &&
            ((this.shopped==null && other.getShopped()==null) || 
             (this.shopped!=null &&
              this.shopped.equals(other.getShopped())));
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
        if (getOriginLocation() != null) {
            _hashCode += getOriginLocation().hashCode();
        }
        if (getDestinationLocation() != null) {
            _hashCode += getDestinationLocation().hashCode();
        }
        if (getAirline() != null) {
            _hashCode += getAirline().hashCode();
        }
        if (getSideTrip() != null) {
            _hashCode += getSideTrip().hashCode();
        }
        if (getReservation() != null) {
            _hashCode += getReservation().hashCode();
        }
        if (getMileageDisplay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMileageDisplay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMileageDisplay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBookingDateTime() != null) {
            _hashCode += getBookingDateTime().hashCode();
        }
        if (getFare() != null) {
            _hashCode += getFare().hashCode();
        }
        if (getPlusUp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlusUp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlusUp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getNumber();
        if (getDepartureDateTime() != null) {
            _hashCode += getDepartureDateTime().hashCode();
        }
        if (getArrivalDateTime() != null) {
            _hashCode += getArrivalDateTime().hashCode();
        }
        if (getMarriageStatus() != null) {
            _hashCode += getMarriageStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFlown() != null) {
            _hashCode += getFlown().hashCode();
        }
        if (getClassOfService() != null) {
            _hashCode += getClassOfService().hashCode();
        }
        if (getShopped() != null) {
            _hashCode += getShopped().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OriginDestinationFlightType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationFlightType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("arrivalDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ArrivalDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("marriageStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarriageStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("flown");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Flown"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("classOfService");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ClassOfService"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ClassOfServiceType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shopped");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Shopped"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DestinationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Airline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sideTrip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SideTrip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SideTripType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Reservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReservationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mileageDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MileageDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MileageDisplayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookingDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Fare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareOptionalDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plusUp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PlusUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PlusUpType"));
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
