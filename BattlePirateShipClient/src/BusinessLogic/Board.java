
package BusinessLogic;

 /** 
     * This class represents the Board where the game will be played.
     * It has methods to make a shot and to place Ships on the board.
     * Last but not least, it has a method to send the board with ships placed to the server
     */

public class Board 
{
  public static int[][] positions;
  private static int hits;
  private static int misses; 
  private static int gameid;
  private static Ship ship;
  private static PirateProtocol pirate;
  
   /** 
     * This method creates and initializes the board where the player's ships will be placed.
     */
  public Board()
  {
      // variables for cicle control
      int i=0,j=0;
      
      for(i=0;i<10;i++)
      {
          for(j=0;j<10;j++)
          {
              positions[i][j] = 0;
          }
      }
  }
  
   /** 
     * This method's aim is to register a shot on the board and call the ship class to verify if a ship is hit.
     *
     * 
     * @return ship id if a ship was hit or false otherwise
     */  
  
  public int shot(int gameid)
  {
      //variable to check the return of ship.hit
      int health;
      
      // listener aqui
      
      // variable that is going to be sent to the protocol
      String[] tosend;
      
      // variable to receive from the protocol
      String[] received;
      
      // placing info on the string that is going to be sent
      tosend[0] = gameid;
      tosend[1] = xpos;
      tosend[2] = ypos;
      
      // calling the protocol and receiving an answer
      received[] = pirate.run(7,tosend,3);
      
      // checking what was received
      if(received[1] == "OK")
      {
          // received[2] is a string containing hitalive, hitdead or fail, to the interface knows what happened.
          return received[2];
      }
      else
      {
          // error
          return -1;
      }
  }
  
  /** 
     * This method's aim is to place the ships on board.
     * 
     * @return true
     */  
  
  
  public boolean PlaceShips()
  {
      // variables for cicle control
      int i = 0,j=0;
      
      // variable for the return of ship.place
      int[] info;
      
      for(i = 0;i<5;i++)
      {
          //info[0] = xpos;
          //info[1] = ypos;
          //info[2] = health;
          //info[3] = orientation ( 1 for vertical, 0 for horizontal)
          info = ship.place();
          switch( info[3])
          {
              case 0:
                        // horizontal
                  
                        // placing the ship in the correct position
                        for(j=0;j<info[2];j++)
                        {
                            positions[info[0]+j][info[1]] = info[2];
                        }
              case 1:
                        // vertical
                  
                        // placing the ship in the correct position
                        for(j=0;j<info[2];j++)
                        {
                            positions[info[0]][info[1]+j] = info[2];
                        }
          }
      }
      return true;
  }

  public boolean Sendboard(int gameid,int userid)
  {
      // variables for cicle control
      int i=0,j=0;
      
      // variable that is going to be sent to the protocol
      String[] tosend;
      
      // variable to receive from the protocol
      String[] received;
      
      // placing info on the string that is going to be sent
      tosend[0] = gameid;
      tosend[1] = userid;
      for(i=2;i<12;i++)
      {
          for(j=0;j<10;j++)
          {
              // each position of tosend is going to have a line of the board.
              tosend[i] = tosend[i] + positions[i][j];
          }
      }
      
      // calling the protocol and receiving an answer
      received[] = pirate.run(6,tosend,12);
      
      // checking what was received
      if(received[1] == "OK")
      {
          return 1;
      }
      else
      {
          // error
          return -1;
      }
      
  }
}
