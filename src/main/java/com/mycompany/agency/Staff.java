package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("John Smith", "123 wallstreet", "123-456-7890", "00-000-0001", 500000.00);
        staffList[1] = new Executive("Jane Doe", "321 wallstreet", "123-456-7899", "00-000-0002", 500000.01);
        staffList[2] = new TempEmployee("Harry Hardworker", "777 lucky avenue", "098-765-4321", "00-000-0003", 20.00);
        staffList[3] = new TempEmployee("Jenny Onthejob", "1984 dystopian boulevard", "[redacted]", "00-000-0004", 21.50);
        staffList[4] = new StaffEmployee("Batman", "Batcave", "batphone", "00-000-0005", 847.00);
        staffList[5] = new StaffEmployee("Generic Person", "Generic Address", "Generic Phone Number", "Generic SSN", 123.456);

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members. 
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
