package saranbahan2resep;
import java.util.Scanner;

public class SaranBahan2Resep {

   
    public static void main(String[] args) {
        String identitas = "Zadit Taqwa Wahdana / XRPL3 / 40";
        System.out.println("Identitas : "+ identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukkan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
    }
    
}
