package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Dimitri on 08/09/2015.
 * @version 1.0
 */

@WebService
public class HelloWorld {

  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
}
