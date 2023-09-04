import java.util.Scanner;
public class UcakFiyati {
    public static void main(String[] args){
        int mesafe,yas,yolculukTipi;
        double ucret=0.10;
        double fiyat=0;
        Scanner input= new Scanner(System.in);



        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe=input.nextInt();
        System.out.print("Yaşınız: ");
        yas= input.nextInt();
        System.out.print("1.Tek Yön\n"+
                "2.Gidiş-Dönüş\n"+
                "Yolculuk tipini seçiniz: ");
        yolculukTipi= input.nextInt();

        fiyat = mesafe*ucret;


        if ((mesafe > 0 && yas  > 0)){
            if (yolculukTipi== 1){
                if(yas < 12){
                    double indirim= fiyat -(fiyat * 0.50);
                    System.out.println("Toplam Tutar: "+indirim+ " TL");
                } else if ((yas >= 12) && (yas < 24)) {
                    double indirim= fiyat -(fiyat * 0.10);
                    System.out.println("Toplam Tutar: "+indirim+ " TL");
                } else if ((yas >= 24 ) && (yas < 65)) {
                    fiyat = mesafe*ucret;
                    System.out.println("Toplam Tutar: "+fiyat+ " TL");
                }else {
                    double indirim= fiyat -(fiyat * 0.30);
                    System.out.println("Toplam Tutar: "+indirim+ " TL");
                }

            } if (yolculukTipi == 2){
                if(yas < 12){
                    double indirim= fiyat -(fiyat * 0.50);
                    double bilet= indirim-(indirim*0.20);
                    System.out.println("Toplam Tutar: "+(bilet*2)+ " TL");
                } else if ((yas >= 12) && (yas < 24)) {
                    double indirim= fiyat -(fiyat * 0.10);
                    double bilet= indirim-(indirim*0.20);
                    System.out.println("Toplam Tutar: "+(bilet*2)+ " TL");
                } else if ((yas >= 24 ) && (yas < 65)) {
                    fiyat = mesafe*ucret;
                    System.out.println("Toplam Tutar: "+(fiyat*2)+ " TL");
                }else {
                    double bilet= fiyat-(fiyat*0.30);
                    System.out.println("Toplam Tutar: "+(bilet*2)+ " TL");
                }
            }
        }else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
