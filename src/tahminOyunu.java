import java.util.Scanner;
import java.util.Random;
public class tahminOyunu {
    public static void main(String[] args) {
        int randomDeger, degerKontrol, denemeSayisi=1;
        boolean whileKontrol = true;
        Scanner giris = new Scanner(System.in);
        Random random = new Random();
        randomDeger= random.nextInt(10);
        System.out.println("İlk tahmininizi giriniz: ");
        degerKontrol = giris.nextInt();
        while(whileKontrol == true){
            if(randomDeger == degerKontrol){
                System.out.print("Tebrikler doğru tahminde bulundunuz. " +denemeSayisi+ ". denemede doğru değere ulaştınız." );
            whileKontrol=false;
            }
            else {
                denemeSayisi++;
                System.out.println("Yeni bir tahmin yapınız: ");
                degerKontrol = giris.nextInt();
            }
        }
    }
}