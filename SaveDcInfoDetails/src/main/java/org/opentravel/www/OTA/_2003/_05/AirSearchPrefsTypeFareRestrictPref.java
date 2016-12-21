/**
 * AirSearchPrefsTypeFareRestrictPref.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeFareRestrictPref  extends org.opentravel.www.OTA._2003._05.FareRestrictPrefType  implements java.io.Serializable {
    /* Identifies whether advance reservation or ticketing restrictions
     * are acceptable in the search results. */
    private org.opentravel.www.OTA._2003._05.AdvResTicketingType advResTicketing;

    /* Identifies whether restrictions on minimum or maximum stays
     * should be included in the search results. */
    private org.opentravel.www.OTA._2003._05.StayRestrictionsType stayRestrictions;

    /* Identifies whether penalties associated with voluntary changes
     * should be included in the search results. */
    private org.opentravel.www.OTA._2003._05.VoluntaryChangesType voluntaryChanges;

    public AirSearchPrefsTypeFareRestrictPref() {
    }

    public AirSearchPrefsTypeFareRestrictPref(
           org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel,
           java.lang.String fareRestriction,
           org.opentravel.www.OTA._2003._05.AdvResTicketingType advResTicketing,
           org.opentravel.www.OTA._2003._05.StayRestrictionsType stayRestrictions,
           org.opentravel.www.OTA._2003._05.VoluntaryChangesType voluntaryChanges) {
        super(
            preferLevel,
            fareRestriction);
        this.advResTicketing = advResTicketing;
        this.stayRestrictions = stayRestrictions;
        this.voluntaryChanges = voluntaryChanges;
    }


    /**
     * Gets the advResTicketing value for this AirSearchPrefsTypeFareRestrictPref.
     * 
     * @return advResTicketing   * Identifies whether advance reservation or ticketing restrictions
     * are acceptable in the search results.
     */
    public org.opentravel.www.OTA._2003._05.AdvResTicketingType getAdvResTicketing() {
        return advResTicketing;
    }


    /**
     * Sets the advResTicketing value for this AirSearchPrefsTypeFareRestrictPref.
     * 
     * @param advResTicketing   * Identifies whether advance reservation or ticketing restrictions
     * are acceptable in the search results.
     */
    public void setAdvResTicketing(org.opentravel.www.OTA._2003._05.AdvResTicketingType advResTicketing) {
        this.advResTicketing = advResTicketing;
    }


    /**
     * Gets the stayRestrictions value for this AirSearchPrefsTypeFareRestrictPref.
     * 
     * @return stayRestrictions   * Identifies whether restrictions on minimum or maximum stays
     * should be included in the search results.
     */
    public org.opentravel.www.OTA._2003._05.StayRestrictionsType getStayRestrictions() {
        return stayRestrictions;
    }


    /**
     * Sets the stayRestrictions value for this AirSearchPrefsTypeFareRestrictPref.
     * 
     * @param stayRestrictions   * Identifies whether restrictions on minimum or maximum stays
     * should be included in the search results.
     */
    public void setStayRestrictions(org.opentravel.www.OTA._2003._05.StayRestrictionsType stayRestrictions) {
        this.stayRestrictions = stayRestrictions;
    }


    /**
     * Gets the voluntaryChanges value for this AirSearchPrefsTypeFareRestrictPref.
     * 
     * @return voluntaryChanges   * Identifies whether penalties associated with voluntary changes
     * should be included in the search results.
     */
    public org.opentravel.www.OTA._2003._05.VoluntaryChangesType getVoluntaryChanges() {
        return voluntaryChanges;
    }


    /**
     * Sets the voluntaryChanges value for this AirSearchPrefsTypeFareRestrictPref.
     * 
     * @param voluntaryChanges   * Identifies whether penalties associated with voluntary changes
     * should be included in the search results.
     */
    public void setVoluntaryChanges(org.opentravel.www.OTA._2003._05.VoluntaryChangesType voluntaryChanges) {
        this.voluntaryChanges = voluntaryChanges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeFareRestrictPref)) return false;
        AirSearchPrefsTypeFareRestrictPref other = (AirSearchPrefsTypeFareRestrictPref) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.advResTicketing==null && other.getAdvResTicketing()==null) || 
             (this.advResTicketing!=null &&
              this.advResTicketing.equals(other.getAdvResTicketing()))) &&
            ((this.stayRestrictions==null && other.getStayRestrictions()==null) || 
             (this.stayRestrictions!=null &&
              this.stayRestrictions.equals(other.getStayRestrictions()))) &&
            ((this.voluntaryChanges==null && other.getVoluntaryChanges()==null) || 
             (this.voluntaryChanges!=null &&
              this.voluntaryChanges.equals(other.getVoluntaryChanges())));
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
        if (getAdvResTicketing() != null) {
            _hashCode += getAdvResTicketing().hashCode();
        }
        if (getStayRestrictions() != null) {
            _hashCode += getStayRestrictions().hashCode();
        }
        if (getVoluntaryChanges() != null) {
            _hashCode += getVoluntaryChanges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeFareRestrictPref.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>FareRestrictPref"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advResTicketing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvResTicketing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvResTicketingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stayRestrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayRestrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayRestrictionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voluntaryChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VoluntaryChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VoluntaryChangesType"));
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
