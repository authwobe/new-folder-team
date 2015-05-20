package com.pages;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;


public class ReadMail {
        Folder inbox;
        public ReadMail() {
            Properties props = System.getProperties();
            props.setProperty("mail.store.protocol", "imaps");
            try {           
                Session session = Session.getDefaultInstance(props, null);
                Store store = session.getStore("imaps");
                store.connect("mail.evozon.com", "mihai.mindrutescu@",
                        "123456");
                /* Mention the folder name which you want to read. */
                inbox = store.getFolder("Inbox");
                System.out.println("No of Unread Messages : "
                        + inbox.getMessageCount() + " "
                        + inbox.getUnreadMessageCount());

                /* Open the inbox using store. */
                inbox.open(Folder.READ_ONLY);

                Message messages[] = inbox.getMessages();
                Message unread[] = inbox.search(new FlagTerm( new Flags(Flag.SEEN), false));
                /* Use a suitable FetchProfile */
                FetchProfile fp = new FetchProfile();
                fp.add(FetchProfile.Item.ENVELOPE);
                fp.add(FetchProfile.Item.CONTENT_INFO);
                inbox.fetch(messages, fp);
                inbox.fetch(unread, fp);

                try {
                    printAllMessages(unread);
                    inbox.close(true);
                    store.close();
                } catch (Exception ex) {
                    System.out.println("Exception arise at the time of read mail");
                    ex.printStackTrace();
                }
            } catch (NoSuchProviderException e) {
                e.printStackTrace();
                System.exit(1);
            } catch (MessagingException e) {
                e.printStackTrace();
                System.exit(2);
            }
        }

        public void printAllMessages(Message[] msgs) throws Exception {
            for (int i = 0; i < msgs.length; i++) {
                System.out.println("MESSAGE #" + (i + 1) + ":");
                printEnvelope(msgs[i]);
            }
        }

        /* Print the envelope(FromAddress,ReceivedDate,Subject) */
        public void printEnvelope(Message message) throws Exception {
            Address[] a;
            // FROM
            if ((a = message.getFrom()) != null) {
                for (int j = 0; j < a.length; j++) {
                    System.out.println("FROM: " + a[j].toString());
                }
            }
            // TO
            if ((a = message.getRecipients(Message.RecipientType.TO)) != null) {
                for (int j = 0; j < a.length; j++) {
                    System.out.println("TO: " + a[j].toString());
                }
            }
            String subject = message.getSubject();
            Date receivedDate = message.getReceivedDate();
            String content = message.getContent().toString();
            System.out.println("Subject : " + subject);
            System.out.println("Received Date : " + receivedDate.toString());
            System.out.println("Content : " + content);
            getContent(message);
        }

        public void getContent(Message msg) {
            try {
                String contentType = msg.getContentType();
                System.out.println("Content Type : " + contentType);
                String mp = (String) msg.getContent();
                System.out.println(mp);
//                int count = mp.getCount();
//                for (int i = 0; i < count; i++) {
//                    dumpPart(mp.getBodyPart(i));
//                }
            } catch (Exception ex) {
                System.out.println("Exception arise at get Content");
                ex.printStackTrace();
            }
        }

        public void dumpPart(Part p) throws Exception {
            // Dump input stream ..
            if (p.getFileName() == null) {
                return;
            }
            System.out.println("filename:" + p.getFileName());
            InputStream is = p.getInputStream();
            File file = new File(p.getFileName());
            FileOutputStream fout = null;
            fout = new FileOutputStream(p.getFileName());
            // If "is" is not already buffered, wrap a BufferedInputStream
            // around it.
            if (!(is instanceof BufferedInputStream)) {
                is = new BufferedInputStream(is);
            }
            int c;
            System.out.println("Message : ");
            while ((c = is.read()) != -1) {
                fout.write(c);
            }
            if (fout != null) {
                fout.close();
            }
        }

        public static void main(String args[]) {
            new ReadMail();
        }
    }