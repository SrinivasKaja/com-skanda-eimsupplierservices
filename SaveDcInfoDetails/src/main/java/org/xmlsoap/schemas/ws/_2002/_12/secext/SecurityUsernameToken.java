/**
 * SecurityUsernameToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xmlsoap.schemas.ws._2002._12.secext;

public class SecurityUsernameToken  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String[] newPassword;

    private java.lang.String organization;

    private java.lang.String domain;

    public SecurityUsernameToken() {
    }

    public SecurityUsernameToken(
           java.lang.String username,
           java.lang.String password,
           java.lang.String[] newPassword,
           java.lang.String organization,
           java.lang.String domain) {
           this.username = username;
           this.password = password;
           this.newPassword = newPassword;
           this.organization = organization;
           this.domain = domain;
    }


    /**
     * Gets the username value for this SecurityUsernameToken.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this SecurityUsernameToken.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this SecurityUsernameToken.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SecurityUsernameToken.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the newPassword value for this SecurityUsernameToken.
     * 
     * @return newPassword
     */
    public java.lang.String[] getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this SecurityUsernameToken.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String[] newPassword) {
        this.newPassword = newPassword;
    }

    public java.lang.String getNewPassword(int i) {
        return this.newPassword[i];
    }

    public void setNewPassword(int i, java.lang.String _value) {
        this.newPassword[i] = _value;
    }


    /**
     * Gets the organization value for this SecurityUsernameToken.
     * 
     * @return organization
     */
    public java.lang.String getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this SecurityUsernameToken.
     * 
     * @param organization
     */
    public void setOrganization(java.lang.String organization) {
        this.organization = organization;
    }


    /**
     * Gets the domain value for this SecurityUsernameToken.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this SecurityUsernameToken.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityUsernameToken)) return false;
        SecurityUsernameToken other = (SecurityUsernameToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              java.util.Arrays.equals(this.newPassword, other.getNewPassword()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getNewPassword() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewPassword());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewPassword(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityUsernameToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", ">>Security>UsernameToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2002/12/secext", "NewPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Domain"));
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
