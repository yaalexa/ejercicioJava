public class Licencia {
    public static void main(String[] args) {
        int edad = 25;
        boolean tieneLicencia = false;
        boolean tomoAlcholo = true;
        if (edad > 18 && tieneLicencia == true && tomoAlcholo==false) {
            System.out.println("puede conducir");
        }
        else {
            System.out.println("no puede conducir");
        }
    }
}