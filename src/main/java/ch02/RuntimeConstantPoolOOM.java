package ch02;

import java.util.*;

/**
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * -XX:PermSize=10M -XX:MaxPermSize=10M support was removed in 8.0
 * -Xmx6M -XX:MetaspaceSize=10M -XX:MaxMetaspaceSize=10M
 * @author HWD
 * @date 2020/7/14 10:48
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        // 使用 List 保持着常量池引用，避免 Full GC 回收常量池行为
        List<String> list = new ArrayList<String>();
        // 10MB 的 PermSize 在 integer 范围内足够产生 OOM 了
        int i = 0;
        while (true) {
            System.out.println(i);
            list.add(String.valueOf(i++).intern());
        }
    }
}
