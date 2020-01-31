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
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();
        
        //2.  Test bounds of the range for pool days
        //2A. day - lower bound test 
        System.out.println(p.addEntry(0,0,"testday0",0));
        System.out.println(p.addEntry(1,0,"testday1",0));
        System.out.println(p.addEntry(2,0,"testday2",0));
        //2B. day - mid-range test
        System.out.println(p.addEntry(3,0,"testday3",0));
        //2C. day - upper bound test
        System.out.println(p.addEntry(6,0,"testday6",0));
        System.out.println(p.addEntry(7,0,"testday7",0));
        System.out.println(p.addEntry(8,0,"testday8",0));
        
        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test
        System.out.println(p.addEntry(1,0,"testhour0",0));
        System.out.println(p.addEntry(1,1,"testhour1",0));
        System.out.println(p.addEntry(1,2,"testhour2",0));
        //3B. hour - mid-range test
        System.out.println(p.addEntry(1,11,"testhour11",0));
        System.out.println(p.addEntry(1,12,"testhour12",0));
        System.out.println(p.addEntry(1,13,"testhour13",0));
        //3C. hour - upper bound test
        System.out.println(p.addEntry(1,23,"testhour23",0));
        System.out.println(p.addEntry(1,24,"testhour24",0));
        System.out.println(p.addEntry(1,25,"testhour25",0));
        
        //4A.  Test pool total; total is based on the pool entries above
        System.out.println(p.poolTotal());

        //4B.  Test pool total with a new pool and no entries.
        Pool p2 = new Pool();
        System.out.println(p2.poolTotal());
        
        //5A.  Test getWinner - winner exists
        System.out.println(p.getWinner(1,0));

        //5B.  Test getWinner - no winner
        System.out.println(p.getWinner(5,17));

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
    }
}
