package Employee;
import java.util.Scanner;
public class Main extends employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        employee em= new employee();
        Boss bs= new Boss();
        Manager mn = new Manager();
        CleaningService cs =new CleaningService();
       int Masukan;
       System.out.println("Masukan Jabatan Anda :  \n 1.Boss \n 2.Manager \n 3.Employee \n 4.Cleaning Services");
       Masukan=input.nextInt();
       System.out.println("Jabtan Anda : "+Masukan);
        if(Masukan<1 || Masukan>=5){
            System.out.println("System Error Information");
        }
        switch(Masukan){
            case 1:
            em.datadiri();
            em.gajianda();
            em.absensi();
            break;

            case 2:
            bs.datadiri();
            bs.gajianda();
            bs.absensi();
            break;

            case 3:
            mn.datadiri();
            mn.gajianda();
            mn.absensi();
            break;

            case 4 :
            cs.datadiri();
            cs.gajianda();
            cs.absensi();
            break;

        }
    }
}
