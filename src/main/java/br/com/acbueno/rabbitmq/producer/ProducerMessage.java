package br.com.acbueno.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerMessage {

  @Autowired
  private AmqpTemplate rabbitTempalte;

  @Value("${queue.name}")
  private String queueName;

  @Value("${topic.name}")
  private String topicName;

  @Value("${routing.key}")
  private String routingKey;

  public void sendMessage(String message) {
    rabbitTempalte.convertAndSend(queueName, message);
  }

  public void sendMessateToTopic(String message) {
    rabbitTempalte.convertAndSend(topicName, routingKey, message);
  }

}
