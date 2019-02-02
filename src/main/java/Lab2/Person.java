package Lab2;

public class Person {
    protected String name;
    protected String phone;
    protected int age;

    public Person(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUnits(){
        return 0;
    }



    public double getSalary(){
        return 0.0;
    }
    @Override
    public String toString() {

//        return new com.google.gson.Gson().toJson(this);
        return new StringBuilder()
                .append("\tclass:"+this.getClass().getName())
                .append("\tname:"+name)
                .append("\tphone:"+phone)
                .append("\tage:"+age)
                .toString();
    }

}
