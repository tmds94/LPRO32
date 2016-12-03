/** This package has everything that deals with Communications to Server.
* It has SocketClient class that is responsible of establishing a communication and sending/receiving data
*/ 
package Communications;


import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/** This class has all methods that deal with the connection to the server and that deal with the socket.
      *It has methods to send a string, receive a string, and close connection.
      */ 

public class SocketClient
{
    
     // variable so we can connect to the server
     private  Socket PirateSocket;
    
     // variable to write to the socket
     private  PrintWriter writer;
    
     // variable to read from the socket
     private  BufferedReader reader;

     /** Opens the socket to gnomo.fe.up.pt and initializes variables to write to the socket and read from the socket
         */
    
    public SocketClient()
    {
        
         try
         {
             // connecting to the server
             PirateSocket = new Socket("gnomo.fe.up.pt", 3217);
             
             // connecting the write variable with the socket
             writer = new PrintWriter(PirateSocket.getOutputStream(), true);
             
             // connecting the read variable with the socket
             reader = new BufferedReader(new InputStreamReader(PirateSocket.getInputStream()));
         } 
         catch (UnknownHostException e) 
         {
             
         // Can't find host
         System.err.println("Host gnomo not found!");
         System.exit(1);
         } 
         catch (IOException ex) 
         {
             // Can't create socket
             System.out.println("Error creating socket.");
             System.exit(1);
         } 
      
    }
    
    
   public String run(String encoded)
   {
         try 
         {
             String received;
             send(encoded);
             received = receive();
             close();
             return received;
         } 
         catch (IOException ex) 
         {
            System.out.println(ex);
            return null;
         }
   }
   
       
    /** This method sends a string through the socket
       *
       * @param message string which is sent
       * @throws IOException Whenever there's a problem on IO
       * @return 1
       */
    

   
   public int send(String message) throws IOException 
   {
      
      //sending message to socket
      writer.println(message);

      return 1;
   }
   
   /** This method receives a message from the socket
       *
       * @throws IOException Whenever there's a problem on IO
       * @return received String
       *
       */
    
   public String receive() throws IOException 
   {
      
      // String where we store the received value
      String toReturn;
       
      // Reading the string
      toReturn = reader.readLine();
      System.out.println("Received: " + toReturn);
       
      // We're done
      return toReturn;
   }
   
   /** This method closes the connection to the server and closes the write and read variables
         *
         * @return 1 if it worked and 0 if there was an error
         *
         */
    
      public int close()
   {   
         try 
         {
             writer.close();
             reader.close();
             PirateSocket.close();
         }
         catch (IOException ex) 
         {
             return 0;
         }
     
      return 1;
   }
}