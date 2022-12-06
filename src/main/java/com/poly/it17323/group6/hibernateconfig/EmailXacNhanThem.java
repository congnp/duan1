
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
 * @author ThanhNam
 */
public class EmailXacNhanThem {

    private final static String guiMail = "congngopham.test@gmail.com";
    private final static String mathau = "shxnfmipkemptwxj";
    private final static int random_int = (int) Math.floor(Math.random() * (9000 - 1000 + 1) );
     public static void guiMaXacNhan(String emailNhan, 
                          String noiDung) 
            throws AddressException, MessagingException {
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
                return new PasswordAuthentication(guiMail, mathau);
            }
        });
        
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(guiMail));
        message.setRecipients(
          Message.RecipientType.TO, InternetAddress.parse(emailNhan));
        
        // Tiêu đề
        message.setSubject("Mã xác nhận");

        // Nội dung
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(noiDung, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);
    }
    
    // Hàm để test
//    public static void main(String[] args) throws MessagingException {
//        EmailSender.guiMail("congnpph26510@fpt.edu.vn", "ABC", "Thành công");
//    }
}
