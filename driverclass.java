import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

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

                    System.out.println("Enter emp code: ");
                    Scanner sc1=new Scanner(System.in);
                    int num= sc1.nextInt();
                    Ecode.add(num);

                    System.out.println("Enter emp name: ");
                    String str=new String();
                    Scanner sc2=new Scanner(System.in);
                    str=sc2.nextLine();
                    EName.add(str);

                    System.out.println("Enter emp desgn: ");
                    str=new String();
                    Scanner sc3=new Scanner(System.in);
                    str=sc3.nextLine();
                    Desgn.add(str);

                    System.out.println("Enter emp sal: ");
                    Scanner sc4=new Scanner(System.in);
                    num= sc4.nextInt();
                    Sal.add(num);

                    System.out.println("Enter emp comp name:");
                    str=new String();
                    Scanner sc5=new Scanner(System.in);
                    str=sc5.nextLine();
                    CName.add(str);

                    System.out.println("Enter phone num: ");
                    Scanner sc6=new Scanner(System.in);
                    long number= sc6.nextLong();
                    phno.add(num);


                    System.out.println("Enter email id: ");
                    str=new String();
                    Scanner sc7=new Scanner(System.in);
                    str=sc7.nextLine();
                    Emailid.add(str);


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
