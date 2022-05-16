package OpenBootcamp;

public class _Switch {
    public static void main(String[] args) {
        String estacion = "Verano";

        switch (estacion){
            case "Verano":
                System.out.println("es verano");
                break;
            case "Otonio":
                System.out.println("es otonio");
                break;
            case "Invierno":
                System.out.println("es invierno");
                break;
            case "Primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("No existe estacion");

        }
    }
}
