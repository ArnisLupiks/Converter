
package org.me.converter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for euroUsd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="euroUsd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="euro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "euroUsd", propOrder = {
    "euro"
})
public class EuroUsd {

    protected double euro;

    /**
     * Gets the value of the euro property.
     * 
     */
    public double getEuro() {
        return euro;
    }

    /**
     * Sets the value of the euro property.
     * 
     */
    public void setEuro(double value) {
        this.euro = value;
    }

}
