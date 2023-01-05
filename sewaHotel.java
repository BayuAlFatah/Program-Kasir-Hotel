import java.util.Scanner;

public class sewaHotel {
    String nama_penyewa;
    int Id_Room;
    String[] nama_Room ={"Camelia","Foxglove","Coneflower"," Dandelion"};
    int lama_Sewa;
    int harga_Sewa;

    protected void sewaHotel(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Nama Penyewa : ");
        nama_penyewa = inputUser.next();
        System.out.println("ID Room [1-4] : ");
        Id_Room = inputUser.nextInt();
        if (Id_Room == 1){
            System.out.println("Nama Room : " + nama_Room[0]);
            harga_Sewa = 70000;
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa " + lama_Sewa + "Malam");
        }else if(Id_Room == 2){
            System.out.println("Nama Room : " + nama_Room[1]);
            harga_Sewa = 90000;
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa " + lama_Sewa + "Malam");
        }else if(Id_Room == 3){
            System.out.println("Nama Room : " + nama_Room[2]);
            harga_Sewa = 110000;
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa " + lama_Sewa + "Malam");
        }else if(Id_Room == 4){
            System.out.println("Nama Room : " + nama_Room[3]);
            harga_Sewa = 150000;
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa " + lama_Sewa + "Malam");
            
        }
        
        
    }
}
