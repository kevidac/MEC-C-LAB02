import java.util.Arrays;

public class Datos {
    public static void main(String[] args) {
        //La siguiente parte proviene de chatgpt
        int[] valores = {100, 500, 1000, 5000, 10000};
        
        for (int size : valores) {
            double[] arr = generateRandomArray(size);
            
            double[] arr1 = Arrays.copyOf(arr, arr.length);
            long startTime1 = System.nanoTime();
            Datos(arr1);
            long endTime1 = System.nanoTime();
            long timeElapsed1 = endTime1 - startTime1;
            
            System.out.println("tsmsno mstriz " + size);
            System.out.println("tipo de clasificacion: " + timeElapsed1 + " nanosegundos");
        }
    }
    // hasta aca, ya que no tenia claro como crear el arreglo
    public static void Datos(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static double[] generateRandomArray(int size) {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }
}