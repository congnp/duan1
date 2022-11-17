/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.repository;

import com.poly.it17323.group6.domainmodel.ChatLieu;
import com.poly.it17323.group6.hibernateconfig.Hibernate_Util;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transaction;
import org.hibernate.Session;

/**
 *
 * @author ThanhNam
 */
public class ChatLieuRepository {

    private Session session = Hibernate_Util.getFACTORY().openSession();
    private String fromTable = "From ChatLieu";

    public List<ChatLieu> getAll() {
        Query query = session.createQuery(fromTable, ChatLieu.class);
        List<ChatLieu> list = query.getResultList();
        return list;
    }

    public ChatLieu getOne(Integer id) {
        String sql = fromTable + "Where id =: id";
        Query query = session.createQuery(fromTable, ChatLieu.class);
        query.setParameter("id", id);
        ChatLieu chatLieu = (ChatLieu) query.getSingleResult();
        return chatLieu;
    }

    public Boolean add(ChatLieu chatLieu) {
        Transaction transaction = null;
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
    
     public static void main(String[] args) {
        List<ChatLieu> list = new ChatLieuRepository().getAll();
        for (ChatLieu chatLieu : list) {
            System.out.println(chatLieu.toString());
        }
    }
}
