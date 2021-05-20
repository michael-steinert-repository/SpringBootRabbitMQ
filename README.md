# SpringBootRabbitMQ

* RabbitMQ is a Message Broker that implements the Advance Message Queuing Protocol (AMQP) *
* AMQP standardizes Messaging using by Producers, Broker and Consumers *
* Producers publicates the Message, Broker will holds the Message and Consumer will consume the Message *
* If a Message is consumed it will be removed from the Queue *

## Key Features of RabbitMQ

* Security: RabbitMQ supports Authentication and Authorization *
* Reliability: RabbitMQ confirms that the Message was successfully delivered to the Message Broker and confirms that the Message was successfully processed by the Consumer *
* Interoperability: RabbitMQ transfers the Messages as a Stream of Bytes so any Client can operate ont it *

## RabbitMQ Architecture

![RabbitMQ Architecture](https://user-images.githubusercontent.com/29623199/118953881-833f6880-b95d-11eb-9496-944021242fea.JPG)
*The Exchange and Queue are bined with the Routing Key which acts like an Identity. So each Message can be redirect to correspondig Queue *


## Start RabbitMQ

* docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management *
* username: guest *
* password: guest *
* Creating a Queue in the RabbitMQ Dashboard *