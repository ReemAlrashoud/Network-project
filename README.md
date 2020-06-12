# Network-project
### Project description
The project idea is to create a chat application with a server and users to enable the users to chat with each other’s. the chat application has basic two components, server and client. A server is a computer program or a device that provides functionality for other programs or devices. In this project we implement a server that serve data to systems on a local area network (LAN). Clients on our application who want to chat with each other must connect to the same server and have same network.  Multiple clients can connect to server and send messages. Every message is broadcasted to every connected client. The application is so easy to use to everyone can use it. 


### Problems that you faced and solutions.
**P1:** How to connect multiple clients to the same chat and send messages in parallel
          Solution: by using threads.

**P2:** How to make multiple devices connected to the same server
Solution: by make all clients connect to the IP address of the computer that works as the server of the chat.

**P3:** How to connect the GUI with other classes
By declaring and calling the class name of the GUI class.
