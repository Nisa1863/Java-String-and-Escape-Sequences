
public class Main {
    public static void main(String[] args) {

        /* mesaj adinda degisken tanimladik ve bu bir referans
        turu oldugu icin bu degiskeni new operatoru kullanarak
        baslatmaliyiz normalde c# busekilde yapma nedenimiz ama
        java da cok kisa yontem var
        string message = new String("hello world);

        */
        String message =" java beginner";
        System.out.println(message);


        /*koda kendimizden de eklemeler yapabiliriz bizim
        hafizamiza kalmis mesela baslanicini boolen olarak
        kelime dogru mu yanlis mi bakmak istiyoruz bence
        ilk hafiza sonra ingilizce bilgisine bagli deneyelim
        */
        System.out.println(message.startsWith(" java"));




        // kelime uzunluguna bakalim//
        System.out.println(message.length());



        /* hangi kelime nerde olduguna bakalim dizinine
        yani ingilizcesi neydi index hangi harf olsun b harfini
        kacinci bir bakali ve kucuk hatirlatma index 0 dan
        baslar aralarda ki bosluklar i da unutma
        */
        System.out.println(message.indexOf("b"));



        /* eger kelimeyi degistirmek istersek ben java
        beginner yerine java junior demek istedimm ne ile
        yaparim replace ile yaparim ve degistirecegim kelimeler arasi
        virgul kullanarak ayirdik biz beginner i arguman olarak
        adlandiriyoruz biz eger oraya ! yada * koysaydik yine de
        arguman olacakti ama ! ve * bir parametredir
         */
        System.out.println(message.replace("beginner", "junior"));

        /* harfleri buyuk ya da kucuk yapmak istersek ne yapmamiz
        gerekiyor tum kelimeler kucuk buyuk yapallim
        buyuk yapmak icin toUpperCase()
        kucuk yapmak icin toLowerCase()
         */
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        /*java beginner da java dan once bosluk vaar nasil duzeltebilirim
        trimle bir deneyelim gereksiz boslukari kaldirir
         */
        System.out.println(message.trim());

    }
}