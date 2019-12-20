package exceptions.user_difined;
//exceptions người dùng tự đinh nghĩa
//write checked exception

public class AgeOfDriver {
    private int age;

    public AgeOfDriver(int age) throws InvalidAgeException {
        setAge(age);
    }

    public AgeOfDriver() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("the age must greater or equal 18");
        } else {
            this.age = age;
        }
    }
}