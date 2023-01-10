import java.util.Scanner;

class Hotel{

    String id_Pegawai;
    String nama_pegawai;
    String nama_penyewa,room;
    int Id_Room;
    String[] nama_Room ={"Camelia","Foxglove","Coneflower"," Dandelion"};
    int lama_Sewa;
    int harga_Sewa;

    protected  void dataPegawai(){
        //METHOD UNTUK MEMASUKKAN INPUT DATA PEGAWAI KEDALAM PROGRAM
        Scanner inputUser = new Scanner(System.in);
        System.out.println("||===========================||");
        System.out.println("||\tData Pegawai Office  ||");
        System.out.println("||===========================||");
        System.out.println("Masukkan ID Pegawai : ");
        id_Pegawai = inputUser.next();
        // ID PEGAWAI HARUS 270303
        if(id_Pegawai.equalsIgnoreCase("270303")){
            id_Pegawai = "270303";
            nama_pegawai = "Bayu alfatah" ;
            System.out.println("Nama pegawai : " + nama_pegawai);
           
        }else{
            // JIKA ID PEGAWAI TIDAK SESUAI MAKA AKAN DIKEMBALIKAN KE METHOD DATAPEGAWAI
            System.err.println("Id Pegawai Yang Anda Masukkan Salah");
            System.err.println("Silahkan masukkan Id pegawai Kembali");
            dataPegawai();
        }

    }
    protected void sewaHotel(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Nama Penyewa : ");
        nama_penyewa = inputUser.next();
        System.out.println("ID Room [1-4] : ");
        Id_Room = inputUser.nextInt();
        if (Id_Room == 1){
            System.out.println("Nama Room : " + nama_Room[0]);
            harga_Sewa = 70000;
            room = "Camelia";
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa : ");
            lama_Sewa = inputUser.nextInt();
            System.out.println("Lama Sewa : " + lama_Sewa + "Malam");
            Transaksi();
        }else if(Id_Room == 2){
            System.out.println("Nama Room : " + nama_Room[1]);
            room = "Foxglove";
            harga_Sewa = 90000;
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa : ");
            lama_Sewa = inputUser.nextInt();
            System.out.println("Lama Sewa : " + lama_Sewa + "Malam");
            Transaksi();
        }else if(Id_Room == 3){
            System.out.println("Nama Room : " + nama_Room[2]);
            room = "ConeFlower";
            harga_Sewa = 110000;
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa : ");
            lama_Sewa = inputUser.nextInt();
            System.out.println("Lama Sewa : " + lama_Sewa + "Malam");
            Transaksi();
        }else if(Id_Room == 4){
            System.out.println("Nama Room : " + nama_Room[3]);
            room = "Dandelion";
            harga_Sewa = 150000;
            System.out.println("Harga Sewa : Rp " + harga_Sewa);
            System.out.println("Lama sewa : ");
            lama_Sewa = inputUser.nextInt();
            System.out.println("Lama Sewa : " + lama_Sewa + "Malam");
            Transaksi();
        }
    }
    private void Transaksi(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("Detail Sewa");
        System.out.println("===============");
        System.out.println("- Costumer : " + nama_penyewa);
        System.out.println("- Room : " + Id_Room +"-" + room);
        System.out.println("- Lama Sewa : " + lama_Sewa + " Malam");
        System.out.println("\n");
        var biaya = lama_Sewa * harga_Sewa;
        System.out.println("- Biaya Sewa : " + biaya);
        System.out.println("------------------------------------------------");
        System.out.println("================================================");
        System.out.println("Total Bayar : " + biaya);
        System.out.println("Uang Bayar : ");
        var uang_bayar = inputUser.nextInt();
        if(uang_bayar < biaya){
            System.err.println("uang yang anda kurang");
            System.err.println("Silahkan masukkan uang anda ");
            Transaksi();
        }
        System.out.println("Kembalian " + (uang_bayar - biaya));
        System.out.println("================================================");
        System.out.println("Di Input oleh " + "["+ nama_pegawai +" "+id_Pegawai + "]");
    }

}