/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VeccCliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10549640177
 */
public class ClienteDAO extends DAO_Abstract{
public  ClienteDAO(){



}

    @Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
      session.beginTransaction();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(VeccCliente.class);
       criteria.add(Restrictions.eq("idveccCliente", id));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VeccCliente.class);
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
    }
}