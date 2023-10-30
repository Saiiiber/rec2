/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.VeccProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author u10549640177
 */
public class ProdutoDAO extends DAO_Abstract {
    public ProdutoDAO(){}
    
    @Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override 
    public void update(Object object) {
       session.beginTransaction();
        session.flush();
       session.clear();
       session.update(object);
       session.getTransaction().commit();
    }
    
    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete( object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoDAO.class);
        criteria.add(Restrictions.eq("idusuarios", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoDAO.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
    public List listNome(String nome){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VeccProduto.class);
        criteria.add(Restrictions.like("VeccNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
    public static void main(String[] args) {
    }
    
}

