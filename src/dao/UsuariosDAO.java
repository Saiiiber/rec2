/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import bean.VeccUsuario;

/**
 *
 * @author u10549640177
 */
public class UsuariosDAO extends DAO_Abstract{
    public UsuariosDAO(){}
    
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
        Criteria criteria = session.createCriteria(UsuariosDAO.class);
        criteria.add(Restrictions.eq("idusuarios", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosDAO.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    public List listNome(String nome){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuariosDAO.class);
        criteria.add(Restrictions.like("VeccNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    }    
     public List login(String nome, String senha){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuariosDAO.class);
        criteria.add(Restrictions.eq("VeccNome", nome ));
         criteria.add(Restrictions.eq("VeccSenha", senha ));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
   
    
    } 
    
    public static void main(String[] args) {
          VeccUsuario usuarios = new VeccUsuario();
        usuarios.setVeccIdusuario(1);
        usuarios.setVeccNome("victor");
        usuarios.setVeccApelido("vv");
        usuarios.setVeccCpf("3438905739");
        usuarios.setVeccTelefone("440956854");
        usuarios.setVeccEndereco("vjdnsfes");
        usuarios.setVeccSenha("1");
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
       usuariosDAO.insert(usuarios);
        System.out.println(usuarios);
    }
}