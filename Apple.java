public class Apple <T> {

    public T name;

    public Apple(T t){
        System.out.println("Apple's constructor");
        name = t;
    }

   /* public void eat(){
        System.out.println("Eating Apple" + name);
    }

    public void appleSpecific(){
        System.out.println("Apple specific");
    }*/
}