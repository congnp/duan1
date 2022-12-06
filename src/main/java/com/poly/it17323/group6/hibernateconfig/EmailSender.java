/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.group6.hibernateconfig;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author LE BAO NGOC
 */
public class EmailSender {

    private final static String emailGui = "ngoctkc2003@gmail.com";
    private final static String matKhau = "aputkfxvzrwzokld";
    private final static int random_int = (int) Math.floor(Math.random() * (9000 - 1000 + 1) );

    public static void guiMail(String noiDung,String emailNhan,String nd)throws AddressException, MessagingException {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailGui, matKhau);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(emailGui));
        message.setRecipients(
                Message.RecipientType.TO, InternetAddress.parse(emailNhan));

        // Tiêu đề
        message.setSubject(noiDung);

        // Nội dung
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(nd, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);
    }

    // Hàm để test
//    public static void main(String[] args) throws MessagingException {
//        int min = 1000;
//        int max = 9999;
//
//        //Generate random int value from 50 to 100 
////        System.out.println("Random value in int from " + min + " to " + max + ":");
//        int random_int = (int) Math.floor(Math.random() * (9000 - 1000 + 1) );
//        System.out.println(random_int);
//    }
//        EmailSender.guiMail("danhpnph26382@fpt.edu.vn");
//    }
}
