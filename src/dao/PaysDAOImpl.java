package dao;

import metier.Pays;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;

import java.util.List;

/**
 * Created by Pierre on 08/09/2015.
 */
public class PaysDAOImpl implements PaysDAO{

    @Override
    public List<Pays> getAllPays() {
        Session currentSession = HibernateUtils.getSession();
        Query query = currentSession.createQuery("from Pays");

        List<Pays> pays = query.list();
        currentSession.close();
        return pays;
    }
}
