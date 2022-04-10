import java.util.Scanner;

import Util.UserUtil;
import bean.User;
import tcp.Server;

public class Main {
    public static void main(String[] args) throws Exception {
        UserUtil.regUser();
        UserUtil.sendFileLocation();
    }
}
