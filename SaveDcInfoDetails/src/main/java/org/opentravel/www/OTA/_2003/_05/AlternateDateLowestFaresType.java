/**
 * AlternateDateLowestFaresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * IntelliSell Type . lowest fare for alternate departure / return
 * date times.
 */
public class AlternateDateLowestFaresType  implements java.io.Serializable {
    private java.lang.String departureDateTime;

    private java.lang.String returnlDateTime;

    private org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare;

    public AlternateDateLowestFaresType() {
    }

    public AlternateDateLowestFaresType(
           java.lang.String departureDateTime,
           java.lang.String returnlDateTime,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare) {
           this.departureDateTime = departureDateTime;
           this.returnlDateTime = returnlDateTime;
           this.lowestFare = lowestFare;
    }


    /**
     * Gets the departureDateTime value for this AlternateDateLowestFaresType.
     * 
     * @return departureDateTime
     */
    public java.lang.String getDepartureDateTime() {
        return departureDateTime;
    }


    /**
     * Sets the departureDateTime value for this AlternateDateLowestFaresType.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(java.lang.String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }


    /**
     * Gets the returnlDateTime value for this AlternateDateLowestFaresType.
     * 
     * @return returnlDateTime
     */
    public java.lang.String getReturnlDateTime() {
        return returnlDateTime;
    }


    /**
     * Sets the returnlDateTime value for this AlternateDateLowestFaresType.
     * 
     * @param returnlDateTime
     */
    public void setReturnlDateTime(java.lang.String returnlDateTime) {
        this.returnlDateTime = returnlDateTime;
    }


    /**
     * Gets the lowestFare value for this AlternateDateLowestFaresType.
     * 
     * @return lowestFare
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getLowestFare() {
        return lowestFare;
    }


    /**
     * Sets the lowestFare value for this AlternateDateLowestFaresType.
     * 
     * @param lowestFare
     */
    public void setLowestFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare) {
        this.lowestFare = lowestFare;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternateDateLowestFaresType)) return false;
        AlternateDateLowestFaresType other = (AlternateDateLowestFaresType) obj;
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
            ((this.returnlDateTime==null && other.getReturnlDateTime()==null) || 
             (this.returnlDateTime!=null &&
              this.returnlDateTime.equals(other.getReturnlDateTime()))) &&
            ((this.lowestFare==null && other.getLowestFare()==null) || 
             (this.lowestFare!=null &&
              this.lowestFare.equals(other.getLowestFare())));
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
        if (getReturnlDateTime() != null) {
            _hashCode += getReturnlDateTime().hashCode();
        }
        if (getLowestFare() != null) {
            _hashCode += getLowestFare().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternateDateLowestFaresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateDateLowestFaresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnlDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReturnlDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LowestFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
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
