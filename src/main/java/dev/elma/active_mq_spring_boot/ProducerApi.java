package dev.elma.active_mq_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producer")
public class ProducerApi {
    @GetMapping("/send")
    public String sendToQueue(){
        return "Hello Queue..." ;
    }
}
