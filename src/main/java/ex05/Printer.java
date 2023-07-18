package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
    
    /*
    * @Autowired
    * - 멤버변수, 생성자, setter 모두 사용 가능
    * - bean중에서 주입될 수 있는 적합합 타입을 찾아서 자동 주입
    */
    @Autowired
    @Qualifier("document1") // bean 이름 강제 연결 => 생성자에서는 사용 불가
    private Document document;

    // 기본 생성자
    public Printer() {}

    // document 이용한 생성자
    // 적합한 타입을 자동 주입 => 적합한 타입이 없다면 bean 의 id를 찾는다
    // 이 2개는 세트로 사용된다
    @Autowired
    public Printer(Document document) {
        this.document = document;
    }

    // getter, setter
    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
