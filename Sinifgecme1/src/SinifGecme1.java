import java.util.Scanner;

public class SinifGecme1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("matematik dersi notu :");
        double mat1=input.nextInt();
        System.out.println("kimya dersi notu :");
        double kim1=input.nextInt();
        System.out.println("fizik dersi notu :");
        double fiz1=input.nextInt();
        System.out.println("tarih dersi notu :");
        double tar1=input.nextInt();
        System.out.println("türkce dersi notu :");
        double turk1=input.nextInt();

        if(!(mat1<100 & 0<mat1)){
            mat1=0;
        }
        if(!(fiz1<100 & 0<fiz1)){
            fiz1=0;
        }
        if(!(kim1<100 & 0<kim1)){
            kim1=0;
        }
        if(!(tar1<100 & 0<tar1)){
            tar1=0;
        }
        if(!(turk1<100 & 0<turk1)){
            turk1=0;
        }
        double avarge = (mat1+kim1+fiz1+tar1+turk1)/5;
        if(avarge>55){
            System.out.println("geçti");
        }
        else {
            System.out.println("kaldi");
        }
    }
 }

