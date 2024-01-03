import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("******* Menu Principal ********");
            System.out.println("*******************************");

            System.out.println("1. Registrar Usuario");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Ver Bares de Yungay");
            System.out.println("4. Buscar Bar");
            System.out.println("5. Salir Del Programa");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrando usuario...");
                    // Lógica de la opción 1
                    break;
                case 2:
                    System.out.println("Iniciando sesión...");
                    // Lógica de la opción 2
                    break;
                case 3:
                    System.out.println("Ver bares de Yungay...");
                    // Lógica de la opción 3
                    break;
                case 4:
                    System.out.println("Buscando bar...");
                    // Lógica de la opción 4
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    // Lógica de la opción 5
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
        scanner.close();
    }
}
