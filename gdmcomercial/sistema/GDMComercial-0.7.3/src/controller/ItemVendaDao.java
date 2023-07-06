/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Interfaces.ItemVendaInterface;
import Utilitarios.HibernateUtil;
import model.ItemVenda;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Deibidson Mesquita
 */
public class ItemVendaDao implements ItemVendaInterface {

    @Override
    public ItemVenda getItemPorCodigoProduto(long codigo) {
        try (Session session = HibernateUtil.getHibernateSessionFactory().openSession()) {
            session.beginTransaction();
            Query<ItemVenda> query = session.createQuery("FROM ItemVenda i WHERE i.produto.codigo = :codigo");
            query.setParameter("codigo", codigo);
            session.getTransaction().commit();
            return null;
        }
    }

    @Override
    public void delete(ItemVenda it) {
        try (Session session = HibernateUtil.getHibernateSessionFactory().openSession()) {
            session.beginTransaction();
            session.remove(it);
            session.getTransaction().commit();
        }
    }

}
