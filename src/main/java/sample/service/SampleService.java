package sample.service;

public class SampleService {
    public String say(int n) {
        if (n % 2 == 0) {
            return "hoge";
        } else {
            return "fuga";
        }
    }
}
