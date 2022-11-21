import java.util.ArrayList;
import java.util.Scanner;

public class driverclass {

    public static void main(String[] args) {

        System.out.println("Employee details");

        ArrayList<Integer> Ecode=new ArrayList<Integer>();
        ArrayList<String> EName=new ArrayList<String>();
        ArrayList<String> Desgn=new ArrayList<String>();
        ArrayList<Integer> Sal=new ArrayList<Integer>();
        ArrayList<String> CName=new ArrayList<String>();
        ArrayList<Integer> phno=new ArrayList<Integer>();
        ArrayList<String> Emailid=new ArrayList<String>();


        int exit=0;
        while (exit!=1)
        {
            System.out.println("1:Add employee\n 2:View Employee \n 3:Search Employee\n 4:Delete employee\n5:exit\n");

            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("add emp");


                case 2:
                    System.out.println("view emp");

                case 3:
                    System.out.println("search emp");

                case 4:
                    System.out.println("delete emp");


                case 5:
                    exit=1;

                default:
                    System.out.println("wrong choice");


            }

            System.out.println("Enter 1 to exit \n 0 to continue:");
            exit= sc.nextInt();

        }

    }
}
