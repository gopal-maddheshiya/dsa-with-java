package oops.classandobject;

public class ClassAndObject2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "gopalm466";
        System.out.println(myAcc.username);
        myAcc.setPass("adhyjghjsdf");
        System.out.println(myAcc.getPass());
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPass(String pass) {
        if (pass.length() >= 8) {
            password = pass;
        } else {
            System.out.println("Password is too short");
        }
    }

    public String getPass() {
        return password;
    }
}
