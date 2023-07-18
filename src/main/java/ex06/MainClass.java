package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("autowired_quiz-context.xml");
        Airplane airplane = ctx.getBean(Airplane.class);
        Car car = ctx.getBean(Car.class);

        airplane.getBattery().energy();
        car.getBattery().energy();

    }
}
