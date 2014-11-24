
package org.me.converter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.converter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EuroToUsdResponse_QNAME = new QName("http://converter.me.org/", "euroToUsdResponse");
    private final static QName _UsdToEuroResponse_QNAME = new QName("http://converter.me.org/", "usdToEuroResponse");
    private final static QName _EuroToUsd_QNAME = new QName("http://converter.me.org/", "euroToUsd");
    private final static QName _UsdToEuro_QNAME = new QName("http://converter.me.org/", "usdToEuro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.converter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EuroToUsdResponse }
     * 
     */
    public EuroToUsdResponse createEuroToUsdResponse() {
        return new EuroToUsdResponse();
    }

    /**
     * Create an instance of {@link UsdToEuroResponse }
     * 
     */
    public UsdToEuroResponse createUsdToEuroResponse() {
        return new UsdToEuroResponse();
    }

    /**
     * Create an instance of {@link EuroToUsd }
     * 
     */
    public EuroToUsd createEuroToUsd() {
        return new EuroToUsd();
    }

    /**
     * Create an instance of {@link UsdToEuro }
     * 
     */
    public UsdToEuro createUsdToEuro() {
        return new UsdToEuro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToUsdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "euroToUsdResponse")
    public JAXBElement<EuroToUsdResponse> createEuroToUsdResponse(EuroToUsdResponse value) {
        return new JAXBElement<EuroToUsdResponse>(_EuroToUsdResponse_QNAME, EuroToUsdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsdToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "usdToEuroResponse")
    public JAXBElement<UsdToEuroResponse> createUsdToEuroResponse(UsdToEuroResponse value) {
        return new JAXBElement<UsdToEuroResponse>(_UsdToEuroResponse_QNAME, UsdToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToUsd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "euroToUsd")
    public JAXBElement<EuroToUsd> createEuroToUsd(EuroToUsd value) {
        return new JAXBElement<EuroToUsd>(_EuroToUsd_QNAME, EuroToUsd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsdToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "usdToEuro")
    public JAXBElement<UsdToEuro> createUsdToEuro(UsdToEuro value) {
        return new JAXBElement<UsdToEuro>(_UsdToEuro_QNAME, UsdToEuro.class, null, value);
    }

}
