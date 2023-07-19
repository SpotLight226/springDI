package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("autowired_quiz-context.xml");
        Airplane airplane = ctx.getBean(Airplane.class);
        Car car = ctx.getBean(Car.class);

        System.out.println("비행기의 배터리는");
        airplane.getBattery().energy();
        System.out.println("자동차의 배터리는");
        car.getBattery().energy();

    }
}
