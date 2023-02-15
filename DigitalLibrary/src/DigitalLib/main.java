package DigitalLib;

import com.sun.org.apache.bcel.internal.classfile.Module;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner obj=new Scanner(System.in);
        int choice =0;
        while(choice !=3){
            System.out.println("Enter 1 - for Module 1 \n Enter 2 - for Module 2 \n Enter 3 to exit");
            choice =obj.nextInt();

            if(choice==1){
                module1 obj1= new module1();
                System.out.println("Enter student name");
                obj1.name=obj.nextLine();obj1.name=obj.nextLine();
                System.out.println("Enter fathers name");
                obj1.fname=obj.nextLine();
                System.out.println("Enter university id");
                obj1.uni_id=obj.nextLine();
                System.out.println("Enter the User id");
                obj1.uid=obj.nextLine();
                System.out.println("Which book do you study:");
                obj1.book=obj.nextInt();

                obj1.getdata(obj1.name, obj1.fname, obj1.uid, obj1.uni_id,obj1.book);
                obj1.setdata();
            }
            else if(choice ==2){
                module2 obj2=new module2();
                obj2.chemistry();
                obj2.physics();
                obj2.biology();
            }
        }
    }
}
