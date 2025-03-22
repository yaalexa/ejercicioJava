public class Nueve {
     public static void main(String[] args) {
        int saldo=5000;
        int cantidad=100;
        int resultado=0;
        if(cantidad>saldo){
            System.out.println("fondo insuficientes");
        }
        else{
            resultado=saldo-cantidad;
            System.out.println("retiro exitoso");
            System.out.println(resultado);
        }
        if(cantidad>=1000){
            System.out.println("solo puede retirar 1000");
        }
        
     }
}
