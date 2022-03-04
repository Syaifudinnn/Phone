
package interfaceHP;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Phone RedmiNote8 = new Xiaomi();
        PhoneUser Adn = new PhoneUser(RedmiNote8);
        
        Adn.turnOntThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("---------------------------");
            
            System.out.println("Pilih aksi > ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                Adn.turnOntThePhone();
            }
            else if(aksi.equalsIgnoreCase("2")){
                Adn.turnOffThePhone();
            }
            else if(aksi.equalsIgnoreCase("3")){
                Adn.makePhoneLouder();
            }
            else if(aksi.equalsIgnoreCase("4")){
                Adn.makePhoneSilent();
            }
            else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }
            else {
                System.out.println("Kamu memilih aksi yang salah !");
            }
            
        }
        
    }
    
}
