package singletonExample;

public class Main extends  Thread{
    public static void main(String[] args) {

        /*//BasicSingletonExample
        BasicSingleton basicSingleton = new BasicSingleton();
        */


        /*
        //BasicSingletonExample (getInstance) iki nesne olusuyor gibi olmasına ragmen constructor bir kere calısır ve objelerin adresleri aynıdır
        BasicSingleton basicSingleton=BasicSingleton.getInstance();
        BasicSingleton basicSingleton2=BasicSingleton.getInstance();

        System.out.println(basicSingleton);//singletonExample.BasicSingleton@4f3f5b24
        System.out.println(basicSingleton2);//singletonExample.BasicSingleton@4f3f5b24
        */

        /*Sınıf icerisinde lazySingleton initialize edilmeden verilmesine ragmen ınstance ici null kontrolu sayesinde singletonın bos obje kontrolu yapılmıs oldu
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton);//singletonExample.LazySingleton@4f3f5b24
        System.out.println(lazySingleton2);//singletonExample.LazySingleton@4f3f5b24
         */

        ThreadSingleton threadSingleton ;

        for(int i = 0 ; i<500; i++){
            new Main().start();
        }
        System.out.println(ThreadSingleton.counter);
    }
    @Override
    public void run(){

        //ThreadSingleton singleton = ThreadSingleton.getInstance();//Senkrondur her zaman 1 cıktısını verir.
        ThreadSingleton singletonLazy= ThreadSingleton.getInstanceLazy();//Thread-safe olmadıgından 10,14 gibi farklı sonuçları çıktı olarak verir.
    }
}
