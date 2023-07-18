package ex05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        //의존객체 자동주입 확인
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("autowired-context.xml");
        
        // Printer 클래스로 가져온다
        Printer pt = ctx.getBean(Printer.class);

        System.out.println(pt.getDocument().data);
    }

}
