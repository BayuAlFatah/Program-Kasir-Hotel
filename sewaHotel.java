public class sewaHotel {
    String nama_penyewa;
    int Id_Room;
    String nama_Room;
    int lama_Sewa;

    protected void sewaHotel(){
        System.out.println("Nama Penyewa : ");
        System.out.println("ID Room [1-4] : ");
        System.out.println("Nama Room : ");
        System.out.println("Harga Sewa : ");
        System.out.println("Lama sewa " + lama_Sewa + "Malam");
    }
}
