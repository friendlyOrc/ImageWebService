
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _GetAllImage_QNAME = new QName("http://server/", "getAllImage");
    private final static QName _GetAllImageResponse_QNAME = new QName("http://server/", "getAllImageResponse");
    private final static QName _GetImage_QNAME = new QName("http://server/", "getImage");
    private final static QName _GetImageResponse_QNAME = new QName("http://server/", "getImageResponse");
    private final static QName _InitData_QNAME = new QName("http://server/", "initData");
    private final static QName _InitDataResponse_QNAME = new QName("http://server/", "initDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllImage }
     * 
     */
    public GetAllImage createGetAllImage() {
        return new GetAllImage();
    }

    /**
     * Create an instance of {@link GetAllImageResponse }
     * 
     */
    public GetAllImageResponse createGetAllImageResponse() {
        return new GetAllImageResponse();
    }

    /**
     * Create an instance of {@link GetImage }
     * 
     */
    public GetImage createGetImage() {
        return new GetImage();
    }

    /**
     * Create an instance of {@link GetImageResponse }
     * 
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link InitData }
     * 
     */
    public InitData createInitData() {
        return new InitData();
    }

    /**
     * Create an instance of {@link InitDataResponse }
     * 
     */
    public InitDataResponse createInitDataResponse() {
        return new InitDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllImage")
    public JAXBElement<GetAllImage> createGetAllImage(GetAllImage value) {
        return new JAXBElement<GetAllImage>(_GetAllImage_QNAME, GetAllImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllImageResponse")
    public JAXBElement<GetAllImageResponse> createGetAllImageResponse(GetAllImageResponse value) {
        return new JAXBElement<GetAllImageResponse>(_GetAllImageResponse_QNAME, GetAllImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getImage")
    public JAXBElement<GetImage> createGetImage(GetImage value) {
        return new JAXBElement<GetImage>(_GetImage_QNAME, GetImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getImageResponse")
    public JAXBElement<GetImageResponse> createGetImageResponse(GetImageResponse value) {
        return new JAXBElement<GetImageResponse>(_GetImageResponse_QNAME, GetImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "initData")
    public JAXBElement<InitData> createInitData(InitData value) {
        return new JAXBElement<InitData>(_InitData_QNAME, InitData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "initDataResponse")
    public JAXBElement<InitDataResponse> createInitDataResponse(InitDataResponse value) {
        return new JAXBElement<InitDataResponse>(_InitDataResponse_QNAME, InitDataResponse.class, null, value);
    }

}
