
package interfaceHP;

public class PhoneUser {
    
    private Phone phone;
    
    public PhoneUser (Phone phone){
        this.phone = phone;
    }
    
    void turnOntThePhone(){
        this.phone.powerOn();
    }
    
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
    
}
