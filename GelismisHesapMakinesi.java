package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b){
        int result = a+b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int minus(int a,int b){
        int result = a-b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int multiplication(int a,int b){
        int result = a*b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int division (int a,int b){

        if (b==0){
            System.out.println("Gecersiz Rakam!");
            return 0;
        }
        int result= a/b;
        System.out.println("Sonuc : "+result);
        return result;
    }

    static int power(int a,int b){
        int result =1;

        for (int i =1; i<=b; i++){

        result *= a;

        }
        return result;
    }

    static int mod(int a,int b){
        return a % b;
    }

    static void calc(int a,int b){
        System.out.println("Cevre : "+(2*(a+b)));
        System.out.println("Alan : " +a*b);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;

        String menu= "1 - Toplama \n"
                +"2 - Cikarma \n"
                +"3 - Carpma \n"
                +"4 - Bolme \n"
                +"5 - Uslu Sayi Hesaplama \n"
                +"6 - Mod Alma \n"
                +"7 - Dikdortgen Alan ve Cevre Hesabi\n"
                +"0 - Cikis Yap\n";

        System.out.println(menu);

        while (true){


            System.out.print("Yapmak Istediginiz Islemi Seciniz : ");
            select =scan.nextInt();

            if (select==0){
                break;
            }

            System.out.print("Lutfen Ilk Sayiyi Giriniz : ");
            int a=scan.nextInt();

            System.out.print("Lutfen Ikinci Sayiyi Giriniz : ");
            int b=scan.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;

                case 2:
                    minus(a,b);
                    break;

                case 3:
                    multiplication(a,b);
                    break;

                case 4:
                    division(a,b);
                    break;

                case 5:
                    System.out.println("Us Hesabi "+power(a,b));
                    break;

                case 6:
                    System.out.println("Mod Sonucu : "+mod(a,b));
                    return;

                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz Islem");
            }
        }

    }
}

