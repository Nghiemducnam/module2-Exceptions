package exceptions.user_difined;

public class TestException {
    public static void main(String[] args) {
        try{
            AgeOfDriver ageOfDriver;
            ageOfDriver = new AgeOfDriver(15);
            System.out.println(ageOfDriver.getAge());
        }catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}