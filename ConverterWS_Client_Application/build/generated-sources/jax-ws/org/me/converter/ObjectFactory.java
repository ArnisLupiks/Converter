
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

    private final static QName _UsdEuroResponse_QNAME = new QName("http://converter.me.org/", "usdEuroResponse");
    private final static QName _UsdEuro_QNAME = new QName("http://converter.me.org/", "usdEuro");
    private final static QName _EuroUsdResponse_QNAME = new QName("http://converter.me.org/", "euroUsdResponse");
    private final static QName _EuroUsd_QNAME = new QName("http://converter.me.org/", "euroUsd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.converter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsdEuroResponse }
     * 
     */
    public UsdEuroResponse createUsdEuroResponse() {
        return new UsdEuroResponse();
    }

    /**
     * Create an instance of {@link UsdEuro }
     * 
     */
    public UsdEuro createUsdEuro() {
        return new UsdEuro();
    }

    /**
     * Create an instance of {@link EuroUsdResponse }
     * 
     */
    public EuroUsdResponse createEuroUsdResponse() {
        return new EuroUsdResponse();
    }

    /**
     * Create an instance of {@link EuroUsd }
     * 
     */
    public EuroUsd createEuroUsd() {
        return new EuroUsd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsdEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "usdEuroResponse")
    public JAXBElement<UsdEuroResponse> createUsdEuroResponse(UsdEuroResponse value) {
        return new JAXBElement<UsdEuroResponse>(_UsdEuroResponse_QNAME, UsdEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsdEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "usdEuro")
    public JAXBElement<UsdEuro> createUsdEuro(UsdEuro value) {
        return new JAXBElement<UsdEuro>(_UsdEuro_QNAME, UsdEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroUsdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "euroUsdResponse")
    public JAXBElement<EuroUsdResponse> createEuroUsdResponse(EuroUsdResponse value) {
        return new JAXBElement<EuroUsdResponse>(_EuroUsdResponse_QNAME, EuroUsdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroUsd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://converter.me.org/", name = "euroUsd")
    public JAXBElement<EuroUsd> createEuroUsd(EuroUsd value) {
        return new JAXBElement<EuroUsd>(_EuroUsd_QNAME, EuroUsd.class, null, value);
    }

}
