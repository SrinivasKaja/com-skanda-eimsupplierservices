/**
 * PriceRequestInformationTypeTPA_ExtensionsIndicators.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsIndicators  implements java.io.Serializable {
    /* Currently must be set to true. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRetainFare retainFare;

    /* If set to true, fares that have a min/max stay can be included
     * in the responses. If set to false, then no fares that include a min/max
     * stay requirement will be included in the response. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsMinMaxStay minMaxStay;

    /* If set to true, fares that have a refund penalty can be included
     * in the responses. If set to false, then no fares that include a refund
     * penalty requirement will be included in the response. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRefundPenalty refundPenalty;

    /* If set to true, fares that have a reservation/ticketing can
     * be included in the responses. If set to false, then no fares that
     * include reservation/ticketing requirement will be included in the
     * response. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsResTicketing resTicketing;

    /* This element is currently ignored whether it is true or false. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsTravelPolicy travelPolicy;

    public PriceRequestInformationTypeTPA_ExtensionsIndicators() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsIndicators(
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRetainFare retainFare,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsMinMaxStay minMaxStay,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRefundPenalty refundPenalty,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsResTicketing resTicketing,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsTravelPolicy travelPolicy) {
           this.retainFare = retainFare;
           this.minMaxStay = minMaxStay;
           this.refundPenalty = refundPenalty;
           this.resTicketing = resTicketing;
           this.travelPolicy = travelPolicy;
    }


    /**
     * Gets the retainFare value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @return retainFare   * Currently must be set to true.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRetainFare getRetainFare() {
        return retainFare;
    }


    /**
     * Sets the retainFare value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @param retainFare   * Currently must be set to true.
     */
    public void setRetainFare(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRetainFare retainFare) {
        this.retainFare = retainFare;
    }


    /**
     * Gets the minMaxStay value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @return minMaxStay   * If set to true, fares that have a min/max stay can be included
     * in the responses. If set to false, then no fares that include a min/max
     * stay requirement will be included in the response.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsMinMaxStay getMinMaxStay() {
        return minMaxStay;
    }


    /**
     * Sets the minMaxStay value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @param minMaxStay   * If set to true, fares that have a min/max stay can be included
     * in the responses. If set to false, then no fares that include a min/max
     * stay requirement will be included in the response.
     */
    public void setMinMaxStay(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsMinMaxStay minMaxStay) {
        this.minMaxStay = minMaxStay;
    }


    /**
     * Gets the refundPenalty value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @return refundPenalty   * If set to true, fares that have a refund penalty can be included
     * in the responses. If set to false, then no fares that include a refund
     * penalty requirement will be included in the response.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRefundPenalty getRefundPenalty() {
        return refundPenalty;
    }


    /**
     * Sets the refundPenalty value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @param refundPenalty   * If set to true, fares that have a refund penalty can be included
     * in the responses. If set to false, then no fares that include a refund
     * penalty requirement will be included in the response.
     */
    public void setRefundPenalty(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsRefundPenalty refundPenalty) {
        this.refundPenalty = refundPenalty;
    }


    /**
     * Gets the resTicketing value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @return resTicketing   * If set to true, fares that have a reservation/ticketing can
     * be included in the responses. If set to false, then no fares that
     * include reservation/ticketing requirement will be included in the
     * response.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsResTicketing getResTicketing() {
        return resTicketing;
    }


    /**
     * Sets the resTicketing value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @param resTicketing   * If set to true, fares that have a reservation/ticketing can
     * be included in the responses. If set to false, then no fares that
     * include reservation/ticketing requirement will be included in the
     * response.
     */
    public void setResTicketing(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsResTicketing resTicketing) {
        this.resTicketing = resTicketing;
    }


    /**
     * Gets the travelPolicy value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @return travelPolicy   * This element is currently ignored whether it is true or false.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsTravelPolicy getTravelPolicy() {
        return travelPolicy;
    }


    /**
     * Sets the travelPolicy value for this PriceRequestInformationTypeTPA_ExtensionsIndicators.
     * 
     * @param travelPolicy   * This element is currently ignored whether it is true or false.
     */
    public void setTravelPolicy(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsIndicatorsTravelPolicy travelPolicy) {
        this.travelPolicy = travelPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsIndicators)) return false;
        PriceRequestInformationTypeTPA_ExtensionsIndicators other = (PriceRequestInformationTypeTPA_ExtensionsIndicators) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retainFare==null && other.getRetainFare()==null) || 
             (this.retainFare!=null &&
              this.retainFare.equals(other.getRetainFare()))) &&
            ((this.minMaxStay==null && other.getMinMaxStay()==null) || 
             (this.minMaxStay!=null &&
              this.minMaxStay.equals(other.getMinMaxStay()))) &&
            ((this.refundPenalty==null && other.getRefundPenalty()==null) || 
             (this.refundPenalty!=null &&
              this.refundPenalty.equals(other.getRefundPenalty()))) &&
            ((this.resTicketing==null && other.getResTicketing()==null) || 
             (this.resTicketing!=null &&
              this.resTicketing.equals(other.getResTicketing()))) &&
            ((this.travelPolicy==null && other.getTravelPolicy()==null) || 
             (this.travelPolicy!=null &&
              this.travelPolicy.equals(other.getTravelPolicy())));
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
        if (getRetainFare() != null) {
            _hashCode += getRetainFare().hashCode();
        }
        if (getMinMaxStay() != null) {
            _hashCode += getMinMaxStay().hashCode();
        }
        if (getRefundPenalty() != null) {
            _hashCode += getRefundPenalty().hashCode();
        }
        if (getResTicketing() != null) {
            _hashCode += getResTicketing().hashCode();
        }
        if (getTravelPolicy() != null) {
            _hashCode += getTravelPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsIndicators.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Indicators"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retainFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RetainFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>RetainFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMaxStay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MinMaxStay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>MinMaxStay"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundPenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RefundPenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>RefundPenalty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resTicketing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResTicketing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>ResTicketing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Indicators>TravelPolicy"));
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
