/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;



/**
 *
 * @author ghadafaisal
 */
import java.io.PrintStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

// the Server class
public class Server {
   // The server socket.
  private static ServerSocket serverSocket = null;
  // The client socket.
  private static Socket clientSocket = null;

  // This chat server can accept up to maxClientsCount clients' connections.
  private static final int MAXCLIENTS = 200; // no need
  private static final clientThread[] threads = new clientThread[MAXCLIENTS]; // 

  public static void main(String args[]) {

    // The default port number.
    int portNumber = 5555;
          System.out.println("Server is running \n"
          + "port number = " + portNumber);
           System.out.print("witing for clients ... ");


    /*
     * Open a server socket on the portNumber (default 2222). Note that we can
     * not choose a port less than 1023 if we are not privileged users (root).
     */
    try {
      serverSocket = new ServerSocket(portNumber);
    } catch (IOException e) {
      System.out.println(e);
    }

    /*
     * Create a client socket for each connection and pass it to a new client
     * thread.
     */
    while (true) {
      try {
        clientSocket = serverSocket.accept(); // each client have its own socket
        int i = 0;
        for (i = 0; i < MAXCLIENTS; i++) {
          if (threads[i] == null) {
            (threads[i] = new clientThread(clientSocket, threads)).start();
            break;
          }
        }
   
      } catch (IOException e) {
        System.out.println(e);
      }
    }
  }  
}
