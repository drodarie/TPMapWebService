package ws;

import dao.PaysDAO;
import dao.PaysDAOImpl;
import metier.Pays;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pierre on 08/09/2015.
 */
@WebService
public class PaysWebService {

    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    @WebMethod
    public List<String> obtainListePays(){
        PaysDAO paysDAO = new PaysDAOImpl();
        List<Pays> listPays = paysDAO.getAllPays();
        List<String> listNomsPays = new ArrayList<>();

        for (Pays listPay : listPays) {
            listNomsPays.add(listPay.toString());
        }

        return listNomsPays;
    }
}
