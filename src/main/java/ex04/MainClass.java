package ex04;

import ex03.MemberDAO;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("collection-context.xml");
        Customer customer = ctx.getBean(Customer.class);

        // customer 객체의 list => String
        List<String> list = customer.getLists();
        System.out.println(list.toString());

        // customer 객체의 list => memberDAO
        List<MemberDAO> dao = customer.getDao();
        System.out.println(dao.get(0).getDataSource().getUrl());
        System.out.println(dao.get(0).getDataSource().getUid());
        System.out.println(dao.get(0).getDataSource().getUpw());

        //customer 객체의 map => String, memberDAO
        Map<String, Object> map = customer.getMap();


    }
}
