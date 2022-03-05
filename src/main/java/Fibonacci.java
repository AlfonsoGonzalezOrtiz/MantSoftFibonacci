
/*
 *  Class providing a method that computes the fibonacci of
 *  an integer number
 *  @author Alfonso Gonzalez Ortiz
 */

public class Fibonacci {

    public int compute(int value) {
        int inicio = 0;
        int siguiente = 1;
        int result = 1;
        if(value < 0){
            throw new RuntimeException("El numero introducido tiene un valor negativo: " + value);
        }
        else if(value == 0){
            result = 0;
        }
        for(int i = 2; i <= value; i++){
            result = inicio + siguiente;
            inicio = siguiente;
            siguiente = result;
        }
        return result;
    }
}

