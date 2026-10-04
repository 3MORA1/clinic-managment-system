package Projects;

public class Clinic {
    //attribute
    private Doctor[] arrOfDoctor=new Doctor [3];
    //method
    public void insert_doctor(Doctor d,int i){
        arrOfDoctor[i]=d;
        i++;
        System.out.println("Doctor added. Total doctors count : "+Doctor.counter);
    }
    public void diplaydoctor(String day){
        for (int i=0;i<3;i++){
            if(arrOfDoctor[i].working_day.equalsIgnoreCase(day)){
                System.out.println(arrOfDoctor[i].name);
            }
        }
    }
}
