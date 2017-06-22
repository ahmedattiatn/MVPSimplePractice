package ahmedattia.verysimplemvp.activitymain;

/**
 * Created by Ahmed Attia on 21/05/2017.
 */

public class User {
    private String gender;
    private int age;

    public User(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
