package exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println("trong khối try");
        }catch (NullPointerException e){
            System.out.println("ngoại lệ :NullPointerException ");
            System.out.println("trong khối catch");
        }finally {
            System.out.println("trong khối finally");
        }
        System.out.println("Bên ngoài khối catch");
    }
}