/**
 * BookFlightSegmentTypeStopAirportsStopAirport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class BookFlightSegmentTypeStopAirportsStopAirport  extends org.opentravel.www.OTA._2003._05.ResponseLocationType  implements java.io.Serializable {
    private java.lang.String arrivalDateTime;  // attribute

    private java.lang.String departureDateTime;  // attribute

    private int elapsedTime;  // attribute

    private int duration;  // attribute

    private float GMTOffset;  // attribute

    private java.lang.Object equipment;  // attribute

    public BookFlightSegmentTypeStopAirportsStopAirport() {
    }

    // Simple Types must have a String constructor
    public BookFlightSegmentTypeStopAirportsStopAirport(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the arrivalDateTime value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @return arrivalDateTime
     */
    public java.lang.String getArrivalDateTime() {
        return arrivalDateTime;
    }


    /**
     * Sets the arrivalDateTime value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(java.lang.String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    /**
     * Gets the departureDateTime value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @return departureDateTime
     */
    public java.lang.String getDepartureDateTime() {
        return departureDateTime;
    }


    /**
     * Sets the departureDateTime value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(java.lang.String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }


    /**
     * Gets the elapsedTime value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @return elapsedTime
     */
    public int getElapsedTime() {
        return elapsedTime;
    }


    /**
     * Sets the elapsedTime value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @param elapsedTime
     */
    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }


    /**
     * Gets the duration value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the GMTOffset value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @return GMTOffset
     */
    public float getGMTOffset() {
        return GMTOffset;
    }


    /**
     * Sets the GMTOffset value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @param GMTOffset
     */
    public void setGMTOffset(float GMTOffset) {
        this.GMTOffset = GMTOffset;
    }


    /**
     * Gets the equipment value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @return equipment
     */
    public java.lang.Object getEquipment() {
        return equipment;
    }


    /**
     * Sets the equipment value for this BookFlightSegmentTypeStopAirportsStopAirport.
     * 
     * @param equipment
     */
    public void setEquipment(java.lang.Object equipment) {
        this.equipment = equipment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookFlightSegmentTypeStopAirportsStopAirport)) return false;
        BookFlightSegmentTypeStopAirportsStopAirport other = (BookFlightSegmentTypeStopAirportsStopAirport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arrivalDateTime==null && other.getArrivalDateTime()==null) || 
             (this.arrivalDateTime!=null &&
              this.arrivalDateTime.equals(other.getArrivalDateTime()))) &&
            ((this.departureDateTime==null && other.getDepartureDateTime()==null) || 
             (this.departureDateTime!=null &&
              this.departureDateTime.equals(other.getDepartureDateTime()))) &&
            this.elapsedTime == other.getElapsedTime() &&
            this.duration == other.getDuration() &&
            this.GMTOffset == other.getGMTOffset() &&
            ((this.equipment==null && other.getEquipment()==null) || 
             (this.equipment!=null &&
              this.equipment.equals(other.getEquipment())));
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
        if (getArrivalDateTime() != null) {
            _hashCode += getArrivalDateTime().hashCode();
        }
        if (getDepartureDateTime() != null) {
            _hashCode += getDepartureDateTime().hashCode();
        }
        _hashCode += getElapsedTime();
        _hashCode += getDuration();
        _hashCode += new Float(getGMTOffset()).hashCode();
        if (getEquipment() != null) {
            _hashCode += getEquipment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookFlightSegmentTypeStopAirportsStopAirport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BookFlightSegmentType>StopAirports>StopAirport"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("arrivalDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ArrivalDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("elapsedTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ElapsedTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("duration");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("GMTOffset");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GMTOffset"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("equipment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Equipment"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
