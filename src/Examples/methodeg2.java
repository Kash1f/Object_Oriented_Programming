
class Computer{
    public void playMusic(){
        System.out.println("The Computer is Running");
    }
    public String getMeAPen(){
        return "Pen";
    }
}

public class methodeg2 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen();
        System.out.println(str);        
    }
}
