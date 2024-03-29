package ex04;

import ex03.MemberDAO;

import java.util.List;
import java.util.Map;

public class Customer {

    //멤버변수
    private List<String> lists;
    private List<MemberDAO> dao;
    private Map<String, Object> map;

    //getter, setter
    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public List<MemberDAO> getDao() {
        return dao;
    }

    public void setDao(List<MemberDAO> dao) {
        this.dao = dao;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
