import java.util.Scanner;

public class Carro {
    private final String marca;
    private final String modelo;
    private final String color;
    private final int kilometraje;

    public Carro(String marca, String modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de carros a ingresar: ");
        int cantidadCarros = scanner.nextInt();

        Carro[] carros = new Carro[cantidadCarros];

        for (int i = 0; i < cantidadCarros; i++) {
            System.out.println("\nDatos del carro " + (i + 1));

            System.out.print("Marca: ");
            String marca = scanner.next();

            System.out.print("Modelo: ");
            String modelo = scanner.next();

            System.out.print("Color: ");
            String color = scanner.next();

            System.out.print("Kilometraje: ");
            int kilometraje = scanner.nextInt();

            carros[i] = new Carro(marca, modelo, color, kilometraje);
        }
        // Ordenar los carros por kilometraje de menor a mayor
        for (int i = 0; i < cantidadCarros - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < cantidadCarros; j++) {
                if (carros[j].getKilometraje() < carros[indexMin].getKilometraje()) {
                    indexMin = j;
                }
            }
            Carro temp = carros[indexMin];
            carros[indexMin] = carros[i];
            carros[i] = temp;
        }


        System.out.println("\nCarros ingresados:");
        for (int i = 0; i < cantidadCarros; i++) {
            Carro carro = carros[i];
            System.out.println("Carro " + (i + 1) + ": " +
                    "Marca=" + carro.getMarca() + ", " +
                    "Modelo=" + carro.getModelo() + ", " +
                    "Color=" + carro.getColor() + ", " +
                    "Kilometraje=" + carro.getKilometraje());
      
        }
    }
}
