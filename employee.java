import java.util.Scanner;
class employee
{
    int eid;
    char rank;
    
    void get_employeedetails()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the eid: " );
        eid = sc.nextInt();
        System.out.print(" Enter the rank: ");
        rank = sc.next().charAt(0);
     }
    
    void print_employeedetails()
    {
        System.out.println("employee id =  " + eid);
        System.out.println("employee rank = " + rank);
    }
    
    public static void main (String[] args) 
    {
        employee emp[] = new employee[5];
        for (int i=0; i<5; i++)
        {
           emp[i] = new employee();
 		   emp[i].get_employeedetails();
        }
	 
	    for (int i=0; i<5; i++)
	    {
        emp[i].print_employeedetails();
	    }
    }
}