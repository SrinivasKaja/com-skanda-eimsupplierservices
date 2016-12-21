/**
 * TravelDateTimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Date and time of trip, that allows specifying a time window before
 * and after the given date.
 */
public class TravelDateTimeType  implements java.io.Serializable {
    /* This date should be of the form YYYY-MM-DDTHH:MM:SS */
    private java.lang.String departureDateTime;

    /* This date should be of the form YYYY-MM-DDTHH:MM:SS */
    private java.lang.String arrivalDateTime;

    private org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates departureDates;

    /* Allowed only for Advanced Calendar API. */
    private org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates arrivalDates;

    /* This should be of the form HHMMHHMM. */
    private java.lang.String departureWindow;

    /* This should be of the form HHMMHHMM. */
    private java.lang.String arrivalWindow;

    public TravelDateTimeType() {
    }

    public TravelDateTimeType(
           java.lang.String departureDateTime,
           java.lang.String arrivalDateTime,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates departureDates,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates arrivalDates,
           java.lang.String departureWindow,
           java.lang.String arrivalWindow) {
           this.departureDateTime = departureDateTime;
           this.arrivalDateTime = arrivalDateTime;
           this.departureDates = departureDates;
           this.arrivalDates = arrivalDates;
           this.departureWindow = departureWindow;
           this.arrivalWindow = arrivalWindow;
    }


    /**
     * Gets the departureDateTime value for this TravelDateTimeType.
     * 
     * @return departureDateTime   * This date should be of the form YYYY-MM-DDTHH:MM:SS
     */
    public java.lang.String getDepartureDateTime() {
        return departureDateTime;
    }


    /**
     * Sets the departureDateTime value for this TravelDateTimeType.
     * 
     * @param departureDateTime   * This date should be of the form YYYY-MM-DDTHH:MM:SS
     */
    public void setDepartureDateTime(java.lang.String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }


    /**
     * Gets the arrivalDateTime value for this TravelDateTimeType.
     * 
     * @return arrivalDateTime   * This date should be of the form YYYY-MM-DDTHH:MM:SS
     */
    public java.lang.String getArrivalDateTime() {
        return arrivalDateTime;
    }


    /**
     * Sets the arrivalDateTime value for this TravelDateTimeType.
     * 
     * @param arrivalDateTime   * This date should be of the form YYYY-MM-DDTHH:MM:SS
     */
    public void setArrivalDateTime(java.lang.String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    /**
     * Gets the departureDates value for this TravelDateTimeType.
     * 
     * @return departureDates
     */
    public org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates getDepartureDates() {
        return departureDates;
    }


    /**
     * Sets the departureDates value for this TravelDateTimeType.
     * 
     * @param departureDates
     */
    public void setDepartureDates(org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates departureDates) {
        this.departureDates = departureDates;
    }


    /**
     * Gets the arrivalDates value for this TravelDateTimeType.
     * 
     * @return arrivalDates   * Allowed only for Advanced Calendar API.
     */
    public org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates getArrivalDates() {
        return arrivalDates;
    }


    /**
     * Sets the arrivalDates value for this TravelDateTimeType.
     * 
     * @param arrivalDates   * Allowed only for Advanced Calendar API.
     */
    public void setArrivalDates(org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates arrivalDates) {
        this.arrivalDates = arrivalDates;
    }


    /**
     * Gets the departureWindow value for this TravelDateTimeType.
     * 
     * @return departureWindow   * This should be of the form HHMMHHMM.
     */
    public java.lang.String getDepartureWindow() {
        return departureWindow;
    }


    /**
     * Sets the departureWindow value for this TravelDateTimeType.
     * 
     * @param departureWindow   * This should be of the form HHMMHHMM.
     */
    public void setDepartureWindow(java.lang.String departureWindow) {
        this.departureWindow = departureWindow;
    }


    /**
     * Gets the arrivalWindow value for this TravelDateTimeType.
     * 
     * @return arrivalWindow   * This should be of the form HHMMHHMM.
     */
    public java.lang.String getArrivalWindow() {
        return arrivalWindow;
    }


    /**
     * Sets the arrivalWindow value for this TravelDateTimeType.
     * 
     * @param arrivalWindow   * This should be of the form HHMMHHMM.
     */
    public void setArrivalWindow(java.lang.String arrivalWindow) {
        this.arrivalWindow = arrivalWindow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelDateTimeType)) return false;
        TravelDateTimeType other = (TravelDateTimeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureDateTime==null && other.getDepartureDateTime()==null) || 
             (this.departureDateTime!=null &&
              this.departureDateTime.equals(other.getDepartureDateTime()))) &&
            ((this.arrivalDateTime==null && other.getArrivalDateTime()==null) || 
             (this.arrivalDateTime!=null &&
              this.arrivalDateTime.equals(other.getArrivalDateTime()))) &&
            ((this.departureDates==null && other.getDepartureDates()==null) || 
             (this.departureDates!=null &&
              this.departureDates.equals(other.getDepartureDates()))) &&
            ((this.arrivalDates==null && other.getArrivalDates()==null) || 
             (this.arrivalDates!=null &&
              this.arrivalDates.equals(other.getArrivalDates()))) &&
            ((this.departureWindow==null && other.getDepartureWindow()==null) || 
             (this.departureWindow!=null &&
              this.departureWindow.equals(other.getDepartureWindow()))) &&
            ((this.arrivalWindow==null && other.getArrivalWindow()==null) || 
             (this.arrivalWindow!=null &&
              this.arrivalWindow.equals(other.getArrivalWindow())));
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
        if (getDepartureDateTime() != null) {
            _hashCode += getDepartureDateTime().hashCode();
        }
        if (getArrivalDateTime() != null) {
            _hashCode += getArrivalDateTime().hashCode();
        }
        if (getDepartureDates() != null) {
            _hashCode += getDepartureDates().hashCode();
        }
        if (getArrivalDates() != null) {
            _hashCode += getArrivalDates().hashCode();
        }
        if (getDepartureWindow() != null) {
            _hashCode += getDepartureWindow().hashCode();
        }
        if (getArrivalWindow() != null) {
            _hashCode += getArrivalWindow().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelDateTimeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelDateTimeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelDateTimeType>DepartureDates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelDateTimeType>ArrivalDates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
