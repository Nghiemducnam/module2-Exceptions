package exceptions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class ThrowVSThrows {
    public static double div(int a, int b){
        if(b==0){
            throw new ArithmeticException("divide by zeroo");
        }
        return 1*a/b;
    }

    public static void main(String[] args) {
     try {
         double res = div(5,0);
     }catch (ArithmeticException e){
         System.out.println(e.getMessage());
     }
    }
}
