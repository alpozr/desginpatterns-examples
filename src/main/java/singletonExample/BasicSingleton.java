package singletonExample;

public class BasicSingleton {

    private static BasicSingleton basicSingleton = new BasicSingleton(); // static kullanılarak sınıf uzerınden ve sınıfa ozgu olması saglanıyor


   /* private BasicSingleton(){ //degismesini istemiyoruz private yaptık ancak bu seferde erisemiyoruz
        System.out.print("Singleton object has been created from BasicSingleton class!");
    }*/

    /*
    public BasicSingleton(){ //java.lang.StackOverflowError veriyor,kendi sınıfında kendi turunde variable bulunduramıyor
        System.out.print("Singleton object has been created from BasicSingleton class!");
    }*/

       private BasicSingleton(){
           System.out.print("Singleton object has been created from BasicSingleton class!");
       }
         public static BasicSingleton getInstance(){
             return basicSingleton;
         }
}
