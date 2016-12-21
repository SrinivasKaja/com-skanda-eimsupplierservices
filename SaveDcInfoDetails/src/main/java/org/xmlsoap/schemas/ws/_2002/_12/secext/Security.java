/**
 * Security.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xmlsoap.schemas.ws._2002._12.secext;

public class Security  implements java.io.Serializable {
    private org.xmlsoap.schemas.ws._2002._12.secext.SecurityUsernameToken usernameToken;

    private java.lang.String sabreAth;

    private java.lang.String binarySecurityToken;

    public Security() {
    }

    public Security(
           org.xmlsoap.schemas.ws._2002._12.secext.SecurityUsernameToken usernameToken,
           java.lang.String sabreAth,
           java.lang.String binarySecurityToken) {
           this.usernameToken = usernameToken;
           this.sabreAth = sabreAth;
           this.binarySecurityToken = binarySecurityToken;
    }


    /**
     * Gets the usernameToken value for this Security.
     * 
     * @return usernameToken
     */
    public org.xmlsoap.schemas.ws._2002._12.secext.SecurityUsernameToken getUsernameToken() {
        return usernameToken;
    }


    /**
     * Sets the usernameToken value for this Security.
     * 
     * @param usernameToken
     */
    public void setUsernameToken(org.xmlsoap.schemas.ws._2002._12.secext.SecurityUsernameToken usernameToken) {
        this.usernameToken = usernameToken;
    }


    /**
     * Gets the sabreAth value for this Security.
     * 
     * @return sabreAth
     */
    public java.lang.String getSabreAth() {
        return sabreAth;
    }


    /**
     * Sets the sabreAth value for this Security.
     * 
     * @param sabreAth
     */
    public void setSabreAth(java.lang.String sabreAth) {
        this.sabreAth = sabreAth;
    }


    /**
     * Gets the binarySecurityToken value for this Security.
     * 
     * @return binarySecurityToken
     */
    public java.lang.String getBinarySecurityToken() {
        return binarySecurityToken;
    }


    /**
     * Sets the binarySecurityToken value for this Security.
     * 
     * @param binarySecurityToken
     */
    public void setBinarySecurityToken(java.lang.String binarySecurityToken) {
        this.binarySecurityToken = binarySecurityToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Security)) return false;
        Security other = (Security) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usernameToken==null && other.getUsernameToken()==null) || 
             (this.usernameToken!=null &&
              this.usernameToken.equals(other.getUsernameToken()))) &&
            ((this.sabreAth==null && other.getSabreAth()==null) || 
             (this.sabreAth!=null &&
              this.sabreAth.equals(other.getSabreAth()))) &&
            ((this.binarySecurityToken==null && other.getBinarySecurityToken()==null) || 
             (this.binarySecurityToken!=null &&
              this.binarySecurityToken.equals(other.getBinarySecurityToken())));
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
        if (getUsernameToken() != null) {
            _hashCode += getUsernameToken().hashCode();
        }
        if (getSabreAth() != null) {
            _hashCode += getSabreAth().hashCode();
        }
        if (getBinarySecurityToken() != null) {
            _hashCode += getBinarySecurityToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Security.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", ">Security"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usernameToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "UsernameToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", ">>Security>UsernameToken"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sabreAth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "SabreAth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binarySecurityToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "BinarySecurityToken"));
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
