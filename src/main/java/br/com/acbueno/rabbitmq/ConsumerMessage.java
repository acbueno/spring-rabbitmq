package br.com.acbueno.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerMessage {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerMessage.class);

  @RabbitListener(queues = "${queue.name}")
  public void receiveMessageFromQueue(String message) {
    LOGGER.info("Received message from queue: {}", message);
  }

  @RabbitListener(queues = "${queue.name}")
  public void receiveMessageFromTopic(String message) {
    LOGGER.info("Received message from topic: {}", message);
  }

}
