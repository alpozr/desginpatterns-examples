package factoryExample;

public class ShoesFactory {

    //Factory Pattern bizim uretecegimiz nesnenin ne oldugunu bizden alır ve icerisinde static yani sınıfa ozgu olan Factory method barındırır.
    //Boylelıkle sınıfta nesne bilgisi saklanmıs olur ve new anahtar kelimesine ihtiyacımız kalmaz.
    //Factory methodu asagıdaki gibidir ve nesne üretimini sınıf icerisinde yapar.Ancak bu pattern icin eklenecek olan
    // her bir yeni ayakkabı turu buraya if ile ekleneceginden bu clean code prensiplerine aykırıdır ve bu pattern pek kullanıslı degıldır.
    public static Shoes newShoes(String mark,String color,double price){
       if(mark.equalsIgnoreCase("Adidas")){
           Adidas adidas =new Adidas(price,color);
       }
        else if(mark.equalsIgnoreCase("Nike")){
            Nike nike =new Nike(price,color);
        }
        else if(mark.equalsIgnoreCase("Reebok")){
            Reebok reebok =new Reebok(price,color);
        }else {
            throw new RuntimeException("Ayakkabı markası bulunamadı");
       }
    return null;
    }


}
