
package interfaceHP;

public class Xiaomi implements Phone {
    
    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume = 50;
    }
    
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di XIAOMI");
        System.out.println("Android version 11");
    }
    
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    
    public void volumeUp(){
        
        if (isPowerOn){
            if (this.volume == max_volume){
                System.out.println("Volume FULL !!");
                System.out.println("sudah " +this.getVolume() + "%");
            }
            else {
                this.volume += 10;
                System.out.println("VOlume sekarang : " +this.getVolume());
            }
        }
        
        else {
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
        
    }
    
    public void volumeDown(){
        
        if (isPowerOn){
            if (this.volume == min_volume){
                System.out.println("Volume = 0%");
            }
            else {
                this.volume -= 10;
                System.out.println("VOlume sekarang : " +this.getVolume());
            }
        }
        
        else {
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
        
    }
    
    public int getVolume(){
        return this.volume;
    }
    
}
