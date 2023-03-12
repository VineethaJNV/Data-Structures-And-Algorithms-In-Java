public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.changeColor("blue");
        System.out.println(p1.color);
        p1.changeTip(10);
        System.out.println(p1.tip);
        p1.changeColor("yellow");
        System.out.println(p1.color);
        p1.color = "red";
        System.out.println(p1.color);
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Vineetha";
        // myAcc.password = "lekkala"; //field BankAccount.password is not visible
        myAcc.chnagePwd("Navodaya123"); // can only chage but can't be accessed
    }
}
class BankAccount{
    public String userName;
    private String password;

    void chnagePwd(String pwd){
        password = pwd;
    }

}

class Pen{
    String color;
    int tip;

    void changeColor(String newColor){
        color = newColor;
    }
    void changeTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float cgpa;

    void calcAvg(int phy, int math, int chem){
        cgpa = (phy+chem+math) / 3;
    }
}