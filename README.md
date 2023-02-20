https://www.rabbitmq.com/install-generic-unix.html#downloads

```
brew install erlang
sbin/rabbitmq-server
```

```
rm -rf ~/.erlang.cookie
cd sbin
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
The default administrator username and password are guest and guest.
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

```
docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management
```

<img width="907" alt="Screenshot 2023-02-21 at 1 03 57 AM" src="https://user-images.githubusercontent.com/43849911/220186328-ed4aa233-147f-4f5b-984c-5ea2a3f0aa22.png">

<img width="1166" alt="Screenshot 2023-02-21 at 1 04 44 AM" src="https://user-images.githubusercontent.com/43849911/220186416-3f1ffa2e-e7ad-4ae5-96ae-8dc75c8cd347.png">

<img width="969" alt="Screenshot 2023-02-21 at 1 17 01 AM" src="https://user-images.githubusercontent.com/43849911/220187988-edd01f45-42e4-43d7-91b1-c415b5b63195.png">

<img width="1441" alt="Screenshot 2023-02-21 at 1 18 10 AM" src="https://user-images.githubusercontent.com/43849911/220188112-f87176b0-a610-4f89-b415-63fa9340803e.png">

<img width="1057" alt="Screenshot 2023-02-21 at 1 19 49 AM" src="https://user-images.githubusercontent.com/43849911/220188304-95d7b5fe-e378-4e0a-a1f1-15195122d7c3.png">

<img width="1063" alt="Screenshot 2023-02-21 at 1 20 12 AM" src="https://user-images.githubusercontent.com/43849911/220188350-ef9d6599-212a-43e0-b01a-2032a56dfc04.png">

<img width="1077" alt="Screenshot 2023-02-21 at 1 20 39 AM" src="https://user-images.githubusercontent.com/43849911/220188408-7240da3d-713d-4573-8bbf-82764bf887d7.png">

<img width="1067" alt="Screenshot 2023-02-21 at 1 27 00 AM" src="https://user-images.githubusercontent.com/43849911/220189133-a3496332-056c-4600-a7f5-65729c650789.png">

<img width="1362" alt="Screenshot 2023-02-21 at 1 27 58 AM" src="https://user-images.githubusercontent.com/43849911/220189262-7a8eac06-5ff5-434a-a886-fe73a0028dca.png">

<img width="1298" alt="Screenshot 2023-02-21 at 1 27 38 AM" src="https://user-images.githubusercontent.com/43849911/220189216-837fb0a7-2b50-4b07-ba3d-fd40821558a3.png">
