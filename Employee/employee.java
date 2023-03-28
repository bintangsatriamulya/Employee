package Employee;
import java.util.Scanner;
public class employee {
    Scanner ipt = new Scanner(System.in);
    String nama;
    boolean status;
    int nip;
    int gaji;
    int bonus=10000000;
    int potongan=500000;
    int waktukerja;
    int lembur=200000;
    int total;
    int pilih;
    int jabatan;
    
    public void datadiri(){
        System.out.print("Masukan Nama Anda : ");
        nama=ipt.nextLine();
        System.out.println("Nama Anda : "+nama);
        System.out.print("Masukan NIP Anda : ");
        nip=ipt.nextInt();
        System.out.println("NIP Anda : "+nip);
        
    }
    public void gajianda() {
        System.out.println();
        System.out.println("Rincian Gaji Sebagai Berikut : \n 1.Jabatan : \n - Boss : 5000000 \n - Manager : 4000000 \n - Employee : 3000000 \n -Cleaning Services : 2000000 \n 2.Bonus Menikah : 10000000 \n 3.Lembur : 2000000 \n 4.Potongan < 8 = 1000000");
        System.out.println();
        System.out.println("Daftar Jabatan : \n 1.Boss \n 2.Manager \n 3.Employee \n 4.Cleaaning Services ");
        System.out.println("Masukan Jabatan Anda : ");
        jabatan=ipt.nextInt();
        System.out.println("Jabatan Anda : "+jabatan);
        System.out.print("Masukan Status Anda : ");
        status=ipt.nextBoolean();
        System.out.println("Status Anda Adalah : "+status);

        System.out.println("Masukan Jam Kerja Anda : ");
        waktukerja=ipt.nextInt();
        System.out.println("Jam Kerja Anda  : "+waktukerja);

        //Penetuan Gaji Lewat Jabatan
        System.out.println();
        if(jabatan<=0){
            System.out.println("ERR0R");
        }
        //Boss
        else if(jabatan==1){
            gaji=5000000;
            System.out.println("Anda Adalah Boss");
            if(status==true){
                System.out.println("Anda Sudah Menikah");
    
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 ");
                    total=gaji+bonus;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Potongan ");
                    total=gaji+bonus-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Lembur : 200000/jam");
                    total=gaji+bonus+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
    
            }
    
            else{
                System.out.println("Anda Belum Menikah");
    
                
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n ");
                    total=gaji;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Potongan ");
                    total=jabatan-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Lembur : 200000/jam");
                    total=gaji+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
            }
        ///Manager
        }else if(jabatan==2){
            gaji=4000000;
            System.out.println("Anda Adalah Manager");
            if(status==true){
                System.out.println("Anda Sudah Menikah");
    
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 ");
                    total=gaji+bonus;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Potongan ");
                    total=gaji+bonus-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Lembur : 200000/jam");
                    total=gaji+bonus+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
    
            }
    
            else{
                System.out.println("Anda Belum Menikah");
    
                
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n ");
                    total=gaji;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Potongan ");
                    total=jabatan-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Lembur : 200000/jam");
                    total=gaji+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
            }
    ///Employee
        }else if(jabatan==3){
            gaji=3000000;
            System.out.println("Anda Adalah Employee");
            if(status==true){
                System.out.println("Anda Sudah Menikah");
    
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 ");
                    total=gaji+bonus;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Potongan ");
                    total=gaji+bonus-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Lembur : 200000/jam");
                    total=gaji+bonus+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
    
            }
    
            else{
                System.out.println("Anda Belum Menikah");
    
                
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n ");
                    total=gaji;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Potongan ");
                    total=jabatan-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Lembur : 200000/jam");
                    total=gaji+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
            }
            //Cleaning Service
        }else if(jabatan==4){
            gaji=2000000;
            System.out.println("Anda Adalah Cleaning Services");
            if(status==true){
                System.out.println("Anda Sudah Menikah");
    
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 ");
                    total=gaji+bonus;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Potongan ");
                    total=gaji+bonus-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Bonus : 10000000 \n 3.Lembur : 200000/jam");
                    total=gaji+bonus+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
    
            }
    
            else{
                System.out.println("Anda Belum Menikah");
    
                
                if(waktukerja==8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n ");
                    total=gaji;
                    System.out.println("Gaji Anda : "+total);
                }
                else if(waktukerja<8){
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Potongan ");
                    total=jabatan-potongan;
                    System.out.println("Gaji Anda : "+total);
    
                }else{
                    System.out.println("Gaji Anda : \n 1.Gaji Jabatan :  - Boss : 5000000 \n   - Manager : 4000000 \n  - Employee : 3000000 \n  -Cleaning Services : 2000000 \n 2.Lembur : 200000/jam");
                    total=gaji+(lembur*waktukerja);
                    System.out.println("Gaji Anda : "+total);
                }
            }
    
        }
        else{
            System.out.println("ERROR");
        }
        
     
        

        
    }

    
    //Absensi Kehadiran
    public void absensi(){
        System.out.println("Apakah Hari Ini Hadir ? ");
        pilih=ipt.nextInt();
        if(pilih<1 || pilih >=3){
            System.out.println("System Error");
        }else if(pilih==1){
            System.out.println("Hari Ini Anda Telah Hadir  \n Terimaksih Telah Absen");
        }else{
            System.out.println("Hari Ini Anda Tidak Hadir \n Terimakasih Telah Absen");
        }
    }

}
