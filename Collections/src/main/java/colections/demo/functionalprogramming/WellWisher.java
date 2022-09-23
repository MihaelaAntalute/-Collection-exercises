package colections.demo.functionalprogramming;

public class WellWisher {

    public static void wish(Greeting greeting) {
        greeting.sayHello();
    }

    public static void main(String[] args) {
//        Greeting hindiGreeting = new IndianGreeting();
//        wish(hindiGreeting);  // Passing an object of HindiGreeting.
//
//        Greeting englishGreeting = new EnglishGreeting();
//        wish(englishGreeting);

//        wish(new Greeting() {
//            @Override
//            public void sayHello() {
//                System.out.println("Ceau");
//            }
//        });

        wish ( () -> {
            System.out.println("Salut");
        });
    }
}
