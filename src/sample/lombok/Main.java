package sample.lombok;

import lombok.Data;

@Data
public class Main {

    public static void main(String... args) {
        Main m = new Main();

        m.setString(null);
        
        System.out.println(m.getString().toString());
    }

    private String string;
}