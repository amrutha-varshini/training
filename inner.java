class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
interface Flyer {
    default final String identifyMyself() {
        return "I am able to fly.";
    }
}
interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
public class inner extends Horse implements Flyer, Mythical {
    public static void main(String... args) {
        inner myApp = new inner();
        System.out.println(myApp.identifyMyself());
    }
}