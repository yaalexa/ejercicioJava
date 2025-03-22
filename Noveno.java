public class Noveno {
    public static void main(String[] args) {
        int saldo = 5000;
        int monto = 50;
        int resultado=0;
        if (saldo > monto) {
            if (monto < 1000) {
                System.out.println("retiro exitoso");
                resultado = saldo - monto;
                System.out.println(resultado);
            }
            if (monto > 1000) {
                System.out.println("limite de retiro por transaccion es 1000");
            }
        }
        else {
            System.out.println("fondos insuficientes");
        }
        
    }
}
