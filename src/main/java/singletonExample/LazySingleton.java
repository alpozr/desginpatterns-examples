package singletonExample;

public class LazySingleton {

        private static LazySingleton lazySingleton;//initialize edilmededen null bir şekilde veriliyor.


        private LazySingleton(){
            System.out.println("Object has been created from LazySingleton class!");
        }
         public static LazySingleton getInstance(){
          if (lazySingleton==null){
               lazySingleton = new LazySingleton();
          }
          return lazySingleton;
        }
}
