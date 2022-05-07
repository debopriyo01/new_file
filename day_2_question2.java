package CWH_2;
class cellphone{

    String  behavior;

String behavior2;

public  String getBehavior(){

    return behavior;
}
public String getBehavior2(){

    return behavior2;
}
public void setBehavior(String be){

    behavior=be;
    behavior2=be;

    }


}
public class day_2_question2 {
    public static void main(String[] args) {

        cellphone phone=new cellphone();

        phone.setBehavior("Phone is ringing");
        System.out.println(phone.getBehavior());

        phone.setBehavior("phone is vibreting");
        System.out.println(phone.getBehavior2());
    }
}
