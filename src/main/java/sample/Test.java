package sample;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        String userName = map.get("USERNAME");// 获取用户名
        System.out.println(userName);
    }
}
