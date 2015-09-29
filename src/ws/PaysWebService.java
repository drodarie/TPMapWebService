package ws;

import dao.PaysDAO;
import dao.PaysDAOImpl;
import metier.Pays;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Pierre on 08/09/2015.
 */
@WebService
public class PaysWebService {
    @WebMethod
    public List<Pays> obtainListePays(){
        PaysDAO paysDAO = new PaysDAOImpl();
        List<Pays> listPays = paysDAO.getAllPays();

        return listPays;
    }
}
