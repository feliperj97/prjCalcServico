
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Somar", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Somar", namespace = "http://control/", propOrder = {
    "a",
    "b"
})
public class Somar {

    @XmlElement(name = "a", namespace = "")
    private float a;
    @XmlElement(name = "b", namespace = "")
    private float b;

    /**
     * 
     * @return
     *     returns float
     */
    public float getA() {
        return this.a;
    }

    /**
     * 
     * @param a
     *     the value for the a property
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * 
     * @return
     *     returns float
     */
    public float getB() {
        return this.b;
    }

    /**
     * 
     * @param b
     *     the value for the b property
     */
    public void setB(float b) {
        this.b = b;
    }

}
