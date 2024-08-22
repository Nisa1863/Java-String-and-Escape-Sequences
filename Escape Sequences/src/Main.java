
public class Main {
    public static void main(String[] args) {

        /*\t: Sekme (tab) ekler.

        \\: Ters eğik çizgiyi (\) temsil eder.

        \": Çift tırnak işaretini (") temsil eder.

        \r: Satır başına geri döner (carriage return).

        \b: Bir geri alma (backspace) işlemi yapar.

        \f: Sayfa sonu (form feed) karakteri ekler

         */
        String message ="ozel\"karakterler\"";
        System.out.println(message);

        String message2 ="Nisa\tNur\nOzdal";
        System.out.println(message2);

        /*
        eper bu sekilde yaparsam hata verir sonuc cikmaz cunku
        java da ters egik cizgisinden sonra gelen tum karakteri
        ozel bir anlamda bagdaslasmaya calisir bu yuzden kod
        derleyicide kalir ve callismaz
        String message3 ="c:\Windows\...";
        System.out.println(message3);

         */

        /* sadece \\ bu isaretle degil kodu \t tab yapabiliriz
        \n yapip satir atlatabilliriz
         */
        String message3 ="c:\\Windows\\...";
        System.out.println(message3);


    }
}