/**
 * OCFeeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * OC Fee details
 */
public class OCFeeType  implements java.io.Serializable {
    private java.math.BigDecimal amount;  // attribute

    private java.lang.String description;  // attribute

    private java.lang.String originAirport;  // attribute

    private java.lang.String destinationAirport;  // attribute

    private java.lang.String carrier;  // attribute

    private java.lang.String passengerCode;  // attribute

    private java.lang.String date;  // attribute

    private java.lang.Object startSegment;  // attribute

    private java.lang.Object endSegment;  // attribute

    public OCFeeType() {
    }

    public OCFeeType(
           java.math.BigDecimal amount,
           java.lang.String description,
           java.lang.String originAirport,
           java.lang.String destinationAirport,
           java.lang.String carrier,
           java.lang.String passengerCode,
           java.lang.String date,
           java.lang.Object startSegment,
           java.lang.Object endSegment) {
           this.amount = amount;
           this.description = description;
           this.originAirport = originAirport;
           this.destinationAirport = destinationAirport;
           this.carrier = carrier;
           this.passengerCode = passengerCode;
           this.date = date;
           this.startSegment = startSegment;
           this.endSegment = endSegment;
    }


    /**
     * Gets the amount value for this OCFeeType.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OCFeeType.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the description value for this OCFeeType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OCFeeType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the originAirport value for this OCFeeType.
     * 
     * @return originAirport
     */
    public java.lang.String getOriginAirport() {
        return originAirport;
    }


    /**
     * Sets the originAirport value for this OCFeeType.
     * 
     * @param originAirport
     */
    public void setOriginAirport(java.lang.String originAirport) {
        this.originAirport = originAirport;
    }


    /**
     * Gets the destinationAirport value for this OCFeeType.
     * 
     * @return destinationAirport
     */
    public java.lang.String getDestinationAirport() {
        return destinationAirport;
    }


    /**
     * Sets the destinationAirport value for this OCFeeType.
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(java.lang.String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }


    /**
     * Gets the carrier value for this OCFeeType.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this OCFeeType.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the passengerCode value for this OCFeeType.
     * 
     * @return passengerCode
     */
    public java.lang.String getPassengerCode() {
        return passengerCode;
    }


    /**
     * Sets the passengerCode value for this OCFeeType.
     * 
     * @param passengerCode
     */
    public void setPassengerCode(java.lang.String passengerCode) {
        this.passengerCode = passengerCode;
    }


    /**
     * Gets the date value for this OCFeeType.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OCFeeType.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the startSegment value for this OCFeeType.
     * 
     * @return startSegment
     */
    public java.lang.Object getStartSegment() {
        return startSegment;
    }


    /**
     * Sets the startSegment value for this OCFeeType.
     * 
     * @param startSegment
     */
    public void setStartSegment(java.lang.Object startSegment) {
        this.startSegment = startSegment;
    }


    /**
     * Gets the endSegment value for this OCFeeType.
     * 
     * @return endSegment
     */
    public java.lang.Object getEndSegment() {
        return endSegment;
    }


    /**
     * Sets the endSegment value for this OCFeeType.
     * 
     * @param endSegment
     */
    public void setEndSegment(java.lang.Object endSegment) {
        this.endSegment = endSegment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OCFeeType)) return false;
        OCFeeType other = (OCFeeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.originAirport==null && other.getOriginAirport()==null) || 
             (this.originAirport!=null &&
              this.originAirport.equals(other.getOriginAirport()))) &&
            ((this.destinationAirport==null && other.getDestinationAirport()==null) || 
             (this.destinationAirport!=null &&
              this.destinationAirport.equals(other.getDestinationAirport()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.passengerCode==null && other.getPassengerCode()==null) || 
             (this.passengerCode!=null &&
              this.passengerCode.equals(other.getPassengerCode()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.startSegment==null && other.getStartSegment()==null) || 
             (this.startSegment!=null &&
              this.startSegment.equals(other.getStartSegment()))) &&
            ((this.endSegment==null && other.getEndSegment()==null) || 
             (this.endSegment!=null &&
              this.endSegment.equals(other.getEndSegment())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOriginAirport() != null) {
            _hashCode += getOriginAirport().hashCode();
        }
        if (getDestinationAirport() != null) {
            _hashCode += getDestinationAirport().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getPassengerCode() != null) {
            _hashCode += getPassengerCode().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getStartSegment() != null) {
            _hashCode += getStartSegment().hashCode();
        }
        if (getEndSegment() != null) {
            _hashCode += getEndSegment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OCFeeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OCFeeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("amount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originAirport");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginAirport"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("destinationAirport");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DestinationAirport"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("carrier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Carrier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("passengerCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PassengerCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OCFeeCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("date");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startSegment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StartSegment"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("endSegment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EndSegment"));
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
