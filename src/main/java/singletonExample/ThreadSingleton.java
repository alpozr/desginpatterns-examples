package singletonExample;

public class ThreadSingleton {
        private static ThreadSingleton threadSingleton ;
        public static int counter;

        private ThreadSingleton(){
                    System.out.println("Object has been created from ThreadSingleton class!");
                    counter++;
        }
        //ilk if bizim nesne bos mu dolu mu kontrolümüz (Lazy),ikinci if
        public  static ThreadSingleton getInstance(){
            if(threadSingleton==null){
                //Bir metodun eşlemeli(sychronized) olması durumunda metottaki bütün işlemler, bu metodu çağıran lifler (threads) tarafından sırayla yapılır.
                //Yani bir thread bu metodu çalıştırırken bir diğeri beklemek zorundadır.
                synchronized (ThreadSingleton.class){
                    if(threadSingleton==null){
                        threadSingleton = new ThreadSingleton();

                    }
                }
            }
            return threadSingleton;
        }

    public   static ThreadSingleton getInstanceLazy(){
        if(threadSingleton==null){
            //Bir metodun eşlemeli(sychronized) olmaması durumunda metottaki bütün işlemler, bu metodu çağıran lifler (threads) tarafından asenkron yani sırasız yapılır.
            //Yani bir thread bu metodu çalıştırırken bir diğeri beklemez ve aynı anda birden fazla thread girerek çıktıda farklı sonuçlara yol açar.
            threadSingleton = new ThreadSingleton();
        }
        return threadSingleton;
    }



}
