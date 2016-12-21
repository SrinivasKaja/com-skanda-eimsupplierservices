/**
 * PassengerTypeQuantityTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PassengerTypeQuantityTypeTPA_Extensions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsBirthDate birthDate;

    /* Exchange-specific */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsAge age;

    /* Exchange-specific */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsState state;

    /* Exchange-specific */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsTotalNumber totalNumber;

    /* Identifies whether penalties associated with voluntary changes
     * should be included in the search results. */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty[] voluntaryChanges;

    public PassengerTypeQuantityTypeTPA_Extensions() {
    }

    public PassengerTypeQuantityTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsBirthDate birthDate,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsAge age,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsState state,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsTotalNumber totalNumber,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty[] voluntaryChanges) {
           this.birthDate = birthDate;
           this.age = age;
           this.state = state;
           this.totalNumber = totalNumber;
           this.voluntaryChanges = voluntaryChanges;
    }


    /**
     * Gets the birthDate value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @return birthDate
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsBirthDate getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @param birthDate
     */
    public void setBirthDate(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsBirthDate birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the age value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @return age   * Exchange-specific
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsAge getAge() {
        return age;
    }


    /**
     * Sets the age value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @param age   * Exchange-specific
     */
    public void setAge(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsAge age) {
        this.age = age;
    }


    /**
     * Gets the state value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @return state   * Exchange-specific
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsState getState() {
        return state;
    }


    /**
     * Sets the state value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @param state   * Exchange-specific
     */
    public void setState(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsState state) {
        this.state = state;
    }


    /**
     * Gets the totalNumber value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @return totalNumber   * Exchange-specific
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsTotalNumber getTotalNumber() {
        return totalNumber;
    }


    /**
     * Sets the totalNumber value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @param totalNumber   * Exchange-specific
     */
    public void setTotalNumber(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsTotalNumber totalNumber) {
        this.totalNumber = totalNumber;
    }


    /**
     * Gets the voluntaryChanges value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @return voluntaryChanges   * Identifies whether penalties associated with voluntary changes
     * should be included in the search results.
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty[] getVoluntaryChanges() {
        return voluntaryChanges;
    }


    /**
     * Sets the voluntaryChanges value for this PassengerTypeQuantityTypeTPA_Extensions.
     * 
     * @param voluntaryChanges   * Identifies whether penalties associated with voluntary changes
     * should be included in the search results.
     */
    public void setVoluntaryChanges(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_ExtensionsVoluntaryChangesPenalty[] voluntaryChanges) {
        this.voluntaryChanges = voluntaryChanges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassengerTypeQuantityTypeTPA_Extensions)) return false;
        PassengerTypeQuantityTypeTPA_Extensions other = (PassengerTypeQuantityTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.totalNumber==null && other.getTotalNumber()==null) || 
             (this.totalNumber!=null &&
              this.totalNumber.equals(other.getTotalNumber()))) &&
            ((this.voluntaryChanges==null && other.getVoluntaryChanges()==null) || 
             (this.voluntaryChanges!=null &&
              java.util.Arrays.equals(this.voluntaryChanges, other.getVoluntaryChanges())));
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
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTotalNumber() != null) {
            _hashCode += getTotalNumber().hashCode();
        }
        if (getVoluntaryChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoluntaryChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoluntaryChanges(), i);
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
        new org.apache.axis.description.TypeDesc(PassengerTypeQuantityTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PassengerTypeQuantityType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>BirthDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>Age"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>State"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>TotalNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voluntaryChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VoluntaryChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PassengerTypeQuantityType>TPA_Extensions>VoluntaryChanges>Penalty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Penalty"));
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
