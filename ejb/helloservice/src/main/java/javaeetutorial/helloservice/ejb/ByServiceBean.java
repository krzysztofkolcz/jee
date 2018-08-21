package javaeetutorial.helloservice.ejb;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * HelloServiceBean is a web service endpoint implemented as a stateless
 * session bean.
 */

@Stateless
@WebService
public class ByServiceBean {
    private final String message = "By, ";
    
    public void ByServiceBean() {}
    
    @WebMethod
    public String sayBy(String name) {
        return message + name + ".";
    }
}
