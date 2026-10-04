package Projects;

public class Doctor {
    //attribute
    public final String name;
    public String working_day;
    public static int counter=0;//عشان يعد ال اوبجيكت اللي بتتعمل
    //constructor عشان كل ما اعمل اوبجيكت للدكتور يزود واحد على ال كاونتر

//constructor عشان يدي قيمه مبدايا اول ما اعمل اوبجيكت ويكون ليه باراميتر
public Doctor(String name,String working_day){
    this.name=name;
    this.working_day=working_day;
counter++;
}
}
