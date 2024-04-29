package br.com.acbueno.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.acbueno.rabbitmq.producer.ProducerMessage;

@RestController("/api/message")
public class ProducerController {

  @Autowired
  ProducerMessage producerMessage;

  @PostMapping("/send-queue")
  public ResponseEntity<Void> producerMessage(@RequestBody String message) {
    try {
      producerMessage.sendMessage(message);
      return ResponseEntity.ok().build();
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  @PostMapping("/send-topic")
  public ResponseEntity<Void> producerTopicMessage(@RequestBody String message) {
    try {
      producerMessage.sendMessateToTopic(message);
      return ResponseEntity.ok().build();
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

}
