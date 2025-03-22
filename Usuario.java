public class Usuario {
    public static void main(String[] args) {
        String contraseña = "clave123";
        boolean activa = false;
        if (contraseña == "clave123" && activa == true) {
            System.out.println("acceso permitido");
        }
        else if (contraseña != "clave123" && activa == true) {
            System.out.println("contraseña incorrecta");
        }
        else if (contraseña == "clave123" && activa == false) {
            System.out.println("cuenta inactiva");
        }
        
    }
}
