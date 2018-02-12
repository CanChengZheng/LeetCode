package no93;

import java.util.List;

/**
 * @author ZCC
 * @date 2018/1/21
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] ipStr = {"010010", "25525511135"};
        String[][] target = {{"0.10.0.10", "0.100.1.0"}, {"255.255.11.135", "255.255.111.35"}};

        for (int i = 0; i < ipStr.length; i++) {
            List<String> list = solution.restoreIpAddresses(ipStr[i]);
            boolean flag = true;
            for(String e:target[i]) {
                if(!list.contains(e)) {
                    System.out.println("缺少" + e + " ");
                    flag = false;
                }
            }
            System.out.println("匹配结果：" + (flag?"成功":"失败"));
        }
    }
}
