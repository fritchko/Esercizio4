public class Main {
    public static void main(String[] args) {
        int a = 15;
        a+= 5;
        a-= 4;

        int b = a;
        b+= 1;

        // Int B è un numero dispari?

        if(b % 2 == 0){
            System.out.println("Il numero è pari.");
        } else{
            System.out.println("Il numero è dispari.");
        }

        // Il risultato di (b * (b + 1)) è un multiplo di 3?

        if(b * (b + 1) % 3 == 0){
            System.out.println("Il numero è un multiplo di 3.");
        } else{
            System.out.println("Il numero non è divisibile per 3.");
        }
    }
}