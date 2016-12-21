/**
 * From.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class From  implements java.io.Serializable {
    private org.ebxml.www.namespaces.messageHeader.PartyId[] partyId;

    private java.lang.String role;

    public From() {
    }

    public From(
           org.ebxml.www.namespaces.messageHeader.PartyId[] partyId,
           java.lang.String role) {
           this.partyId = partyId;
           this.role = role;
    }


    /**
     * Gets the partyId value for this From.
     * 
     * @return partyId
     */
    public org.ebxml.www.namespaces.messageHeader.PartyId[] getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this From.
     * 
     * @param partyId
     */
    public void setPartyId(org.ebxml.www.namespaces.messageHeader.PartyId[] partyId) {
        this.partyId = partyId;
    }

    public org.ebxml.www.namespaces.messageHeader.PartyId getPartyId(int i) {
        return this.partyId[i];
    }

    public void setPartyId(int i, org.ebxml.www.namespaces.messageHeader.PartyId _value) {
        this.partyId[i] = _value;
    }


    /**
     * Gets the role value for this From.
     * 
     * @return role
     */
    public java.lang.String getRole() {
        return role;
    }


    /**
     * Sets the role value for this From.
     * 
     * @param role
     */
    public void setRole(java.lang.String role) {
        this.role = role;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof From)) return false;
        From other = (From) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              java.util.Arrays.equals(this.partyId, other.getPartyId()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole())));
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
        if (getPartyId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartyId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartyId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(From.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">From"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "PartyId"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Role"));
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
