package dev.elma.active_mq_spring_boot;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class Consumer {
    @JmsListener(destination = "mine.queue")
    public void listen(byte[] message) throws UnsupportedEncodingException {
        String msg=new String(message,"UTF-8");
        System.out.println(msg);
    }
}
