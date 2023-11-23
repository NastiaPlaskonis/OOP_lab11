package ucu.edu.ua.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInformation) {
        infos.add(mailInformation);
    }

    public void sendAll() throws MailjetException, MailjetSocketTimeoutException {
        MailSender mailSender = new MailSender();

        for (MailInfo mailInfo : infos) {
            mailSender.sendMail(mailInfo);
        }
    }
}


