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
public class HelloServiceBean {
    private final String message = "Hello, ";
    
    public void HelloServiceBean() {}
    
    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
