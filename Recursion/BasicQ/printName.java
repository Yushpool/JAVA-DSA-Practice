package BasicQ;

public class printName {


    static int count = 0;
    public static void nameP(){
        if(count == 5){
            return;
        }
        System.out.println("Ayush");
        count++;
        nameP();
    
    }


    public static void main(String[] args) {
        nameP();
        
    }

    
}