import java.util.Scanner;

class pegawai{

    String id_Pegawai;
    String nama_pegawai;

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

}