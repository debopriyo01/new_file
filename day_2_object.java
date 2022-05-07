package CWH_2;

class Employee{

    int sallary;

    String name;

    String department;

    char level;
    public int getSallary(){

        return sallary;
    }

    public String getName() {

        return name;
    }
    public String getDepartment(){
        return department;
    }
    public char getLevel(){
        return level;
    }
    public void setLevel(char ch){

        level=ch;
    }
    public void setName(String  n ){

        name=n;
        department=n;
    }
}

public class day_2_object {
    public static void main(String[] args) {
        Employee Debopriyo=new Employee();

        Debopriyo.setName("Debopriyo chatterjee");
        System.out.println("The name of the employee is "+Debopriyo.getName());

          Debopriyo.sallary=14000;
        System.out.println("The sallry of the employee is "+Debopriyo.getSallary());

        Debopriyo.setName("mechanical Engineering");
        System.out.println("The post of the employee is "+Debopriyo.getDepartment());

        Debopriyo.setLevel('l');
        System.out.println("The lavel of the employee is "+Debopriyo.getLevel());
    }
}
