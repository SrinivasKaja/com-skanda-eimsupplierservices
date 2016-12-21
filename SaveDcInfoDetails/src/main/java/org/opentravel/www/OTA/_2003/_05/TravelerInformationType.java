/**
 * TravelerInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Specifies passenger numbers and types.
 */
public class TravelerInformationType  implements java.io.Serializable {
    /* Specifies number of passengers using Passenger Type Codes. */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] passengerTypeQuantity;

    /* Information profiling the person traveling Gender - the gender
     * of the customer, if needed BirthDate - Date of Birth Currency - the
     * preferred currency in which monetary amounts should be returned. */
    private org.opentravel.www.OTA._2003._05.AirTravelerType airTraveler;

    public TravelerInformationType() {
    }

    public TravelerInformationType(
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] passengerTypeQuantity,
           org.opentravel.www.OTA._2003._05.AirTravelerType airTraveler) {
           this.passengerTypeQuantity = passengerTypeQuantity;
           this.airTraveler = airTraveler;
    }


    /**
     * Gets the passengerTypeQuantity value for this TravelerInformationType.
     * 
     * @return passengerTypeQuantity   * Specifies number of passengers using Passenger Type Codes.
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }


    /**
     * Sets the passengerTypeQuantity value for this TravelerInformationType.
     * 
     * @param passengerTypeQuantity   * Specifies number of passengers using Passenger Type Codes.
     */
    public void setPassengerTypeQuantity(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType getPassengerTypeQuantity(int i) {
        return this.passengerTypeQuantity[i];
    }

    public void setPassengerTypeQuantity(int i, org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType _value) {
        this.passengerTypeQuantity[i] = _value;
    }


    /**
     * Gets the airTraveler value for this TravelerInformationType.
     * 
     * @return airTraveler   * Information profiling the person traveling Gender - the gender
     * of the customer, if needed BirthDate - Date of Birth Currency - the
     * preferred currency in which monetary amounts should be returned.
     */
    public org.opentravel.www.OTA._2003._05.AirTravelerType getAirTraveler() {
        return airTraveler;
    }


    /**
     * Sets the airTraveler value for this TravelerInformationType.
     * 
     * @param airTraveler   * Information profiling the person traveling Gender - the gender
     * of the customer, if needed BirthDate - Date of Birth Currency - the
     * preferred currency in which monetary amounts should be returned.
     */
    public void setAirTraveler(org.opentravel.www.OTA._2003._05.AirTravelerType airTraveler) {
        this.airTraveler = airTraveler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerInformationType)) return false;
        TravelerInformationType other = (TravelerInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passengerTypeQuantity==null && other.getPassengerTypeQuantity()==null) || 
             (this.passengerTypeQuantity!=null &&
              java.util.Arrays.equals(this.passengerTypeQuantity, other.getPassengerTypeQuantity()))) &&
            ((this.airTraveler==null && other.getAirTraveler()==null) || 
             (this.airTraveler!=null &&
              this.airTraveler.equals(other.getAirTraveler())));
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
        if (getPassengerTypeQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengerTypeQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengerTypeQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAirTraveler() != null) {
            _hashCode += getAirTraveler().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerTypeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTraveler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTraveler"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTravelerType"));
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
