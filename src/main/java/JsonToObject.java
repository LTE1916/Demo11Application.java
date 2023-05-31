import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonToObject {
  public static void main(String[] args) {
    ObjectMapper mapper = new ObjectMapper();
    File file = new File("hot1.json");

    try {
      //读取 JSON 文件并转换为对象
      StackOverflowResponse response = mapper.readValue(file, StackOverflowResponse.class);
      System.out.println(response.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}