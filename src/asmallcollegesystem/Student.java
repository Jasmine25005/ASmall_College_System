/*package asmallcollegesystem;
import java.util.Arrays;
import java.util.Scanner;
public class Student  {
    Scanner choco = new Scanner(System.in);
    String name;
    int phonenumber;
    Course [] coursesarray = new Course[2];
    
       public void addcourse (){
           
           
          
           do{
               System.out.println("enroll a course?:y/n");
              String  Ans = choco.next().toLowerCase();
               if(Ans=="y"){
                if(coursesarray.length<=6){
                   System.out.println("enter name");
               String  n = choco.next();
                System.out.println("enter lectuer name");
              String   ln  = choco.next();
               System.out.println("enter chs");
                 int ch = choco.nextInt();
                  System.out.println("enter id ");
                 int id = choco.nextInt();
                   Course m = new Course(n,ln,ch,id);
               
                
                
                   coursesarray=Arrays.copyOf(coursesarray,coursesarray.length);
                   coursesarray[coursesarray.length-1]=m;
                }
               }  
              /* else{
                   System.out.println("you have reached the maximum limit");
                   
               }
           }while(true);
                   
       }  
       }*/


