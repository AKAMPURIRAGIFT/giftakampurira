package Student;

import java.io.*;

import java.util.*;

class Student

{

   Scanner sc=new Scanner(System.in);

   int Total=0,subjects;
   
   String RegNo;

   String name;

   int marks[];

   Student()

   {

      System.out.print("Enter Registration No.: ");

      RegNo=sc.nextLine();

      System.out.print("Enter Student Name: ");

      name=sc.next();;

      getDisMarks();

   }

   public void getDisMarks()

   {

       marks=new int[3];

       System.out.print("Enter marks of Physics: ");

       marks[0]=sc.nextInt();

       System.out.print("Enter marks of Chemistry: ");

       marks[1]=sc.nextInt();

       System.out.print("Enter marks of Maths: ");

       marks[2]=sc.nextInt();

       for(int i=0;i<3;i++)

       {

          Total+=marks[i];

       }

       System.out.println("Total Marks of student "+name+": " +Total);

   }

}

class StudentDemo

{

    public static void main(String args[])

    {

        Student s[]=new Student[5];

        for(int i=0;i<5;i++)

              s[i]=new Student();

     }

}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
