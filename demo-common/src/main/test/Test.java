import java.text.MessageFormat;

/**
 * @ClassName Test
 * @Description TODO
 * @Author amunamuna
 * @Date 2020/8/17 13:51
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.printf(MessageFormat.format("打印参数为{0}，{1}","一","二"));
        System.out.printf("打印参数为%s，%s","一","二");
    }
}
