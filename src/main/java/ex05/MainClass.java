package ex05;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        //의존객체 자동주입 확인
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("autowired-context.xml");
        
        // Printer 클래스로 가져온다
        Printer pt = ctx.getBean(Printer.class);

        System.out.println(pt.getDocument().data);
        
        // context 의 annotation-config 를 사용했기 때문에, Autowired 를 이용하는 변수가 추가된다
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
    }

}
