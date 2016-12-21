/**
 * TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore[] score;

    private org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer[] frequentFlyer;

    public TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating() {
    }

    public TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating(
           org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore[] score,
           org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer[] frequentFlyer) {
           this.score = score;
           this.frequentFlyer = frequentFlyer;
    }


    /**
     * Gets the score value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating.
     * 
     * @return score
     */
    public org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore[] getScore() {
        return score;
    }


    /**
     * Sets the score value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating.
     * 
     * @param score
     */
    public void setScore(org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore[] score) {
        this.score = score;
    }

    public org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore getScore(int i) {
        return this.score[i];
    }

    public void setScore(int i, org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore _value) {
        this.score[i] = _value;
    }


    /**
     * Gets the frequentFlyer value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating.
     * 
     * @return frequentFlyer
     */
    public org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer[] getFrequentFlyer() {
        return frequentFlyer;
    }


    /**
     * Sets the frequentFlyer value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating.
     * 
     * @param frequentFlyer
     */
    public void setFrequentFlyer(org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer[] frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer getFrequentFlyer(int i) {
        return this.frequentFlyer[i];
    }

    public void setFrequentFlyer(int i, org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer _value) {
        this.frequentFlyer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating)) return false;
        TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating other = (TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              java.util.Arrays.equals(this.score, other.getScore()))) &&
            ((this.frequentFlyer==null && other.getFrequentFlyer()==null) || 
             (this.frequentFlyer!=null &&
              java.util.Arrays.equals(this.frequentFlyer, other.getFrequentFlyer())));
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
        if (getScore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFrequentFlyer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequentFlyer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequentFlyer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelerInfoSummary_TPA_ExtensionsType>TravelerRating"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelerInfoSummary_TPA_ExtensionsType>TravelerRating>Score"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequentFlyer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FrequentFlyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelerInfoSummary_TPA_ExtensionsType>TravelerRating>FrequentFlyer"));
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
