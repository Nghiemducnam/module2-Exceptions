package exceptions.runtime_exception;

public class TestException {
    public static void main(String[] args) {
       try{
           AgeOfDriver ageOfDriver = new AgeOfDriver(10);
           System.out.println("the age is valid " + ageOfDriver.getAge());
       }catch (InvalidAgeException e){
           System.out.println(e.getMessage());
       }
    }
}