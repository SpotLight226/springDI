package ex01;

import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        // IOC 컨테이터 안에서 bean 을 객체로 만들어준다
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");

        // 1st
        
        SpringTest st = (SpringTest) ctx.getBean("test");
        st.hello();

        // 2nd SpringTest 의 클래스 타입을 받아주는 메서드
        SpringTest st2 = ctx.getBean(SpringTest.class);
        st2.hello();
        //st와 st2는 동일하다 == 주소 값 동일
        // bean 으로 만들어진 객체는 scope 를 설정하지 않으면 싱글톤으로 생성된다
        // xml 에서 scope 를 prototype 으로 지정하면 다른 주소를 가진다
        System.out.println(st==st2);

        /*
        // Hotel 타입 객체를 꺼낸다
        Hotel hotel = ctx.getBean(Hotel.class);
        // Hotel 타입 객체에는 Chef 객체가 있고, Chef 객체에는 cooking 메서드가 있다
        hotel.getChef().cooking();

        // MemberDAO
        MemberDAO dao = ctx.getBean(MemberDAO.class);
        // MemberDAO 안에 있는 DatabaseDev 객체
        DatabaseDev dev = dao.getDataSource();
        System.out.println(dev.getUrl());
        System.out.println(dev.getUid());
        System.out.println(dev.getUpw());

        //IOC컨테이너 안에 bean의 이름들 반환
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        */
    }
}
