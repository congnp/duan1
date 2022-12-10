package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author ThanhNam
 */
public class ChatLieuRepository {

    private Session session;
    private String fromTable = "From ChatLieu";

    public List<ChatLieu> getAll() {
        session = Hibernate_Util.getFACTORY().openSession();
        Query query = session.createQuery(fromTable + " order by maCL desc", ChatLieu.class);
        List<ChatLieu> list = query.getResultList();
        return list;
    }


    public List<ChatLieu> getOneByTen(String tenCL) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + " Where tenCL like :tenCL";
        Query query = session.createQuery(sql, ChatLieu.class);
        query.setParameter("tenCL", tenCL);
        List<ChatLieu> chatLieu = query.getResultList();
        return chatLieu;
    }

    public ChatLieu getOne(UUID id) {
        session = Hibernate_Util.getFACTORY().openSession();
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, ChatLieu.class);
        query.setParameter("id", id);
        ChatLieu chatLieu = (ChatLieu) query.getSingleResult();
        return chatLieu;
    }

    public Boolean add(ChatLieu chatLieu) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.save(chatLieu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(ChatLieu chatLieu) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.saveOrUpdate(chatLieu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(ChatLieu chatLieu) {
        Transaction transaction = null;
        session = Hibernate_Util.getFACTORY().openSession();
        try {
            transaction = (Transaction) session.beginTransaction();
            session.delete(chatLieu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
