public class login {
    public static void main(String[] args) {
        String usuario = "admin";
        int contrasena = 123;
        if (usuario == "admin") {
            if (contrasena == 123) {
                System.out.println("acceso concedido");
            }
            if (contrasena != 123) {
                System.out.println("contrasena incorrecta");
            }
        }
        if (usuario != "admin") {
            System.out.println("usuario incorrecto");
        }
    }
}
