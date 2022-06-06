package aspiradordepo;
import java.util.Random;
public class AspiradorDePo {
    
    public static void print(){
        Random r = new Random();
        ARoom aRoom = new ARoom(r.nextBoolean());
        BRoom bRoom = new BRoom(r.nextBoolean());
        if(aRoom.isDirty() && !bRoom.isDirty()){
            System.out.println("Não encontrei sujeira na sala B");
            System.out.println("Movimentando para a sala A");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Encontrei sujeira na sala A!");
            aRoom.setDirty(false);
            System.out.println("Limpando sala A...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Sala A limpa!");
            System.out.println("=======================================");
        } else if(!aRoom.isDirty() && bRoom.isDirty()){
            System.out.println("Não encontrei sujeira na sala A");
            System.out.println("Movimentando para sala B...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Encontrei sujeira na sala B!");
            bRoom.setDirty(false);
            System.out.println("Limpando Sala B...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Sala B limpa!");
            System.out.println("=======================================");
            System.out.println("Movimentando para a sala A...");
        } else if (aRoom.isDirty() && bRoom.isDirty()){
            System.out.println("Encontrei sujeira na sala A!");
            aRoom.setDirty(false);
            System.out.println("Limpando sala A...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Sala A limpa!");
            System.out.println("======================================");
            System.out.println("Movimentando para a sala B...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Encontrei sujeira na sala B!");
            System.out.println("Limapando sala B...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Sala B limpa!");
            System.out.println("========================================");
        }
        try {
            Thread.sleep(2000);   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        while(true){
            print();
        }
    }
    
}
