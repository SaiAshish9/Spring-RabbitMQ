https://www.rabbitmq.com/install-generic-unix.html#downloads

```
brew install erlang
sbin/rabbitmq-server
```

```
./rabbitmq-plugins enable rabbitmq_management
Enabling plugins on node rabbit@MBP-C02F5ASXMD6M:
rabbitmq_management
The following plugins have been configured:
  rabbitmq_management
  rabbitmq_management_agent
  rabbitmq_web_dispatch
Applying plugin configuration to rabbit@MBP-C02F5ASXMD6M...
The following plugins have been enabled:
  rabbitmq_management
  rabbitmq_management_agent
  rabbitmq_web_dispatch

started 3 plugins.
```

```
RabbitMq is a message broker , it accepts and forwards the messages

Message queues provide a means for applications to push information to the queue. The message broker simply takes the information from the sender, translates it between different messaging protocols, if needed, and delivers the message to the correct receiver.

RabbitMq uses AMQP (Advanced Message Queuing Protocol)

AMQP is an open standard wire specification for asynchronous message communication. It provides a description of how message should be constructed.

```

```
Standard RabbitMQ Message Flow
```

<img width="927" alt="Screenshot 2023-02-21 at 12 36 18 AM" src="https://user-images.githubusercontent.com/43849911/220182959-6014f24d-3f0a-4ce0-a809-b7d591fc4e84.png">

```
Producer will send the message to exchange, from the exchange appropriate queue will pick the message and consumer pulls it.

Exchange will responsible for routing of the message and it exactly knows what to do.

Binding will used to establish connection b/w queue & exchange.

Queue is a buffer which stores the messages.

Consumer is a user aplication which reads the message.

```

```
AMQP is made up of exchanges, queues and bindings:
1. Direct Exchange
2. Fanout Exchange
3. Topic Exchange
4. Headers Exchange
5. Default Exchange
```

```
1. Direct Exchange : Routes messages to a queue by matching a complete routing key.
```

<img width="844" alt="Screenshot 2023-02-21 at 12 44 21 AM" src="https://user-images.githubusercontent.com/43849911/220183988-b345abad-2e14-4dc0-9f65-68b9ae17d9e6.png">


