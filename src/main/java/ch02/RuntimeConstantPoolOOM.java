package ch02;

import java.util.*;

/**
 * VM Args: -XX:PermSize=6M -XX:MaxPermSize=6M
 * -XX:PermSize=10M -XX:MaxPermSize=10M support was removed in 8.0
 * -Xmx6M -XX:MetaspaceSize=10M -XX:MaxMetaspaceSize=10M
 * @author HWD
 * @date 2020/7/14 10:48
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        // 使用 Set 保持着常量池引用，避免 Full GC 回收常量池行为
        Set<String> set = new HashSet<String>();
        // 在 short 范围内足以让 6MB 的 PermSize 产生OOM了
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
