package sample.lang;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class LangExample {

    public static void main(String[] args) {
        Rect r = new LangExample().new Rect();
        r.x = "332";
        r.y = "543";
        System.out.println(ToStringBuilder.reflectionToString(r));
    }
 
    class Rect {
        String x;
        String y;
    }
}
