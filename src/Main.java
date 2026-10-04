import java.util.Scanner;

import Projects.Doctor;
import Projects.Clinic;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Clinic c=new Clinic();
        for(int i=0;i<3;i++){
            System.out.println("Enter details of doctor "+(i+1)+" : ");
            System.out.println("Name : ");
            String name=input.nextLine();

            System.out.println("Working Day : ");
            String day=input.nextLine();
            Doctor d=new Doctor(name,day);
            c.insert_doctor(d,i);
        }
        System.out.println("#########################");
        System.out.println("Doctor working on saturday are : ");
        c.diplaydoctor("saturday");
    }
}

