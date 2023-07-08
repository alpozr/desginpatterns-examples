package factoryExample;

public class Main  {
    public static void main(String[] args) {

        Adidas adidas  = new Adidas(500.0,"Grey");
        Reebok reebok  = new Reebok(400.0,"White");
        Nike nike  = new Nike(500.0,"Black");

        System.out.println(adidas.getColor());

        System.out.println(nike.getPrice());

        System.out.println(reebok.getPrice());
        //Bu sekilde constructor yardımıyla nesne olusturulup ilgili metodlara ulasılabiliyordu.

        //Factory Pattern ile nesne olusturma asagıda goruldugu gibi factory metodumuz static oldugundan sınıf uzerınden ulasım saglanarak yapılır
        Shoes nikeFactoryInstance = ShoesFactory.newShoes("Nike","Grey",1500.0 );
        Shoes adidasFactoryInstance = ShoesFactory.newShoes("Adidas","White",1000.0 );
        Shoes reebokFactoryInstance = ShoesFactory.newShoes("Reebok","Grey",500.0 );

       nikeFactoryInstance.getColor();
       adidasFactoryInstance.getPrice();
        }
    }
