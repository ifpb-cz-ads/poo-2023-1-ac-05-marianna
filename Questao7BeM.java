import java.util.Scanner;

public class Questao7BeM {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int y, x;
        System.out.print("Insira um numero: ");
        x = scan.nextInt();
        if ( x > 0){
            if ( x % 2 != 0) {
                while ( x % 2 != 0 ){
                    if ( x == 1 ){
                        break;
                    }
                    y = (3 * x) + 1;
                    System.out.print(" -> " + y);
                    x = y;
                    }
                }
            if ( x % 2 == 0) {
                do{
                    y = x / 2;
                    System.out.print(" -> " + y);
                    x = y;
                } while ( y != 1 );
            }  scan.close();
        }
        else {
            System.out.print("O numero e invalido, por favor insira um numero positivo!");
        }
    }
}
