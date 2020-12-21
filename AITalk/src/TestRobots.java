
import util.JsonFormatTool;
import connection.QingYunKeConnection;

public class TestRobots {
	public static void main(String[] args) throws Exception {
        String response1 = QingYunKeConnection.getResponse("你好啊");
        System.out.println(new JsonFormatTool().formatJson(response1));
	}
}
