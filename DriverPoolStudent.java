/**
 * This program is used to unit test the Pool class.
 * The format of the dollar amount is not important.
 * You should not be concerned that there are no 
 * dollar signs or there are more than two decimal
 * places.
 * 
 * @author 
 * @version Spring 2019
 */

import java.util.Scanner;
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();
        
        //2.  Test bounds of the range for pool days
        //2A. day - lower bound test 
        System.out.println("Testing day - lower bound");
        System.out.println(p.addEntry(0,0,"D0H0",1));
        System.out.println(p.addEntry(1,0,"D1H0",1));
        System.out.println(p.addEntry(2,0,"D2H0",1));
        System.out.println();
        //2B. day - mid-range test
        System.out.println("Testing day - mid-range");
        System.out.println(p.addEntry(3,0,"D3H0",1));
        System.out.println();
        //2C. day - upper bound test
        System.out.println("Testing day - upper bound");
        System.out.println(p.addEntry(6,0,"D6H0",1));
        System.out.println(p.addEntry(7,0,"D7H0",1));
        System.out.println(p.addEntry(8,0,"D8H0",1));
        System.out.println();
        
        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test
        System.out.println("Testing hour - lower bound");
        System.out.println(p.addEntry(1,0,"D1H0",1));
        System.out.println(p.addEntry(1,1,"D1H1",1));
        System.out.println(p.addEntry(1,2,"D1H2",1));
        System.out.println();
        //3B. hour - mid-range test
        System.out.println("Testing hour - mid-range");
        System.out.println(p.addEntry(1,11,"D1H11",1));
        System.out.println(p.addEntry(1,12,"D1H12",1));
        System.out.println(p.addEntry(1,13,"D1H13",1));
        System.out.println();
        //3C. hour - upper bound test
        System.out.println("Testing hour - upperbound");
        System.out.println(p.addEntry(1,22,"D1H22",1));
        System.out.println(p.addEntry(1,23,"D1H23",1));
        System.out.println(p.addEntry(1,24,"D1H24",1));
        System.out.println();
        //4A.  Test pool total; total is based on the pool entries above
        System.out.println("Pool Total Expected: 12.0");
        System.out.println("Pool Total Actual: " + p.poolTotal());
        System.out.println();
        //4B.  Test pool total with a new pool and no entries.
        Pool p2 = new Pool();
        System.out.println("Pool Total Expected: 0.0");
        System.out.println("Pool Total Actual: " + p2.poolTotal());
        System.out.println();
        //5A.  Test getWinner - winner exists
        System.out.println("Winner Expected: D1H12:1.0");
        System.out.println("Winner Actual: " + p.getWinner(1,12));
        System.out.println();
        //5B.  Test getWinner - no winner
        System.out.println("Winner Expected: null");
        System.out.println("Winner Actual: " + p.getWinner(5,17));
        System.out.println();
        //6.   print the complete matrix
        System.out.println("\n" + p);
        p.toString();
        /*
         * 7. 
         * Use the Pool object, p, you created above.  If there are entries 
         * still available (there should be lots!), ask the user to pick a day 
         * and time.  Keep asking until they have picked one that is not 
         * already used (is null).  Then, add the user to the pool.  You 
         * will need their name and the amount they would like to enter.
         * You only need to enter one user in the pool.
         */
        Scanner input = new Scanner(System.in);
        
        boolean entry = false;
        
        System.out.print("Enter your name: ");
        String name1 = input.nextLine();
        System.out.print("Enter dollar amount: ");
        double amount1 = input.nextDouble();
        while (entry == false)
        {
            System.out.println("Enter day (1-7)");
            int day1 = input.nextInt();
            System.out.println("Enter Hour (0-23)");
            int hour1 = input.nextInt();
            if (p.getWinner(day1, hour1) == null)
            {
                p.addEntry(day1, hour1, name1, amount1);
                entry = true;
                System.out.println("\n" + p);
                p.toString();
            } 
            else
            {
                System.out.println("Sorry, day " + day1 + " hour " + hour1 + " is already taken");
            }
        }
        
        
    }
}
