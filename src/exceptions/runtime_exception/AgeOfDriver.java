package exceptions.runtime_exception;

public class AgeOfDriver {
    private int age;

    public AgeOfDriver(int age) {
        setAge(age);
    }

    public AgeOfDriver() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=16){
            this.age = age;
        }else{
            throw new InvalidAgeException("the age must greater or equal 16 years old");
        }
    }
}