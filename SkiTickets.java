/************************************
*Author: Kevin Reid
*09/05/2017
*SkiTickets
*This is the second homework assignment,
*that reads information from the user
*and prints the results in columbs. 
************************************/

import java.util.Scanner;
public class SkiTickets{

   public static void main (String[] args){
      
      //initialize the scanner
      Scanner input = new Scanner(System.in);
      
      double adultTicketTotal;
      double youthTicketTotal;
      double ticketTotal;
      
      System.out.print("Please enter your name:  ");
      String firstLastName = input.nextLine();
      
      System.out.print("Please enter the number of adult tickets: ");
      int adultTicket = input.nextInt();
      
      System.out.print("Please enter number of youth tickets: ");
      int youthTickets = input.nextInt();
      
      //Total ticket prices
      adultTicketTotal = adultTicket * 93.00;
      youthTicketTotal = youthTickets * 47.00;
      ticketTotal = adultTicketTotal + youthTicketTotal;
      
      
      //Summary output
      System.out.printf("Adult tickets: %d",adultTicket);
      System.out.print("\n");
      
      System.out.printf("Youth tickets: %d",youthTickets);
      System.out.print("\n");
      
      System.out.printf("Name: %s ",firstLastName);
      System.out.println("\n");
      
      //Invoice output
      System.out.printf("Invoice for: %s", firstLastName);
      System.out.println("\n");
      
      System.out.printf("Adult Tickets: %d .. $%.2f ",adultTicket,adultTicketTotal);
      System.out.print("\n");
      
      System.out.printf("Youth Tickets: %d .. $%.2f ",youthTickets,youthTicketTotal);
      System.out.print("\n");
      
      System.out.print("----------------------------");
      System.out.print("\n");
      System.out.printf("$ %.2f",ticketTotal);
      
      
      
      
      /*
      sample output:
      Number of adult tickets: 4
      Number of youth tickets: 11
      Name: Anna Maria


      Invoice for Anna Maria:

      Adult tickets  4  .. $ 372.00
      Youth tickets  11 .. $ 517.00
      -----------------------------
                           $ 889.00
                           ========
      
      */
      
      
      
      
      
      
      
      
   }

}