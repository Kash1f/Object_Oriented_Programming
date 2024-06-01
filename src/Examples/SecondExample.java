package Examples;

class Computer{
    public void playMusic(){
        System.out.println("The Computer is Running");
    }
    public String getMeAPen(int cost){

        if(cost >= 10)
        return "Pen";
        //else -- here we don't really need to specify if statement, the code will stop executing once the if conditions gets true
        return "Nothing";
    }
}

public class SecondExample {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);        
    }
}
