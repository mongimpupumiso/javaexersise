

public class Person {
    private String name;
    private int age;
    private char gender;
    private String[] interests;

    //setters
    public void setName(String eName){
        this.name=eName;
    }
    public void setAge(int eAge){
        this.age=eAge;
    }
    public void setGender(char eGender){
        this.gender=eGender;
    }
    public void setInterests(String[] eInterests){
        this.interests=eInterests;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public String[] getInterests(){
        return  interests;
    }
    public String hello(){
        String message= "Hello, my name is " + name + " and I am " + age +" years old" +" My interests are "+
                interests[0] + interests[1] + interests[2];
        return message;

    }

    public Person(String name, int age, char gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
}
