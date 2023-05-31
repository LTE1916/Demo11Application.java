import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class StackOverflowAPI {
  public static void main(String[] args){
    for (int i = 5; i <= 5; i++) {
      getAPI(i);
    }
  }

  public static void getAPI(int n){

    String url = "https://api.stackexchange.com/2.3/questions?page="+n+"&pagesize=100&order=desc&sort=votes&tagged=java&site=stackoverflow&filter=!17m5kbq6vrZn4Wg58z4SV(Vbw5s*kwA2JDMubqsLMom62F&key=nQP*qRlOx844vg4pHXAqTA((";
    try {
      URL obj = new URL(url);
      HttpURLConnection con = (HttpURLConnection) obj.openConnection();
      con.setRequestMethod("GET");
      con.setRequestProperty("Accept-Encoding","gzip,deflate");
      InputStream inputStream = con.getInputStream();
      String encoding = con.getContentEncoding();
      BufferedReader in = new BufferedReader(new InputStreamReader(new GZIPInputStream(inputStream)));
//String output;
//      while ((output = in.readLine()) != null) {
//        System.out.println(output);
//      }
//      in.close();
      String inputLine;
      StringBuilder response = new StringBuilder();
      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();
      String result = response.toString();
      JSONObject json = new JSONObject(result);
      File file = new File("votes"+n+".json");
      FileWriter writer = new FileWriter(file);
      writer.write(json.toString());
      writer.flush();
      writer.close();
      System.out.println("Successfully wrote JSON object to file."+file.getAbsolutePath());




//      JSONArray items = json.getJSONArray("items");
//      for (int i =0; i < items.length(); i++) {
//        JSONObject item = items.getJSONObject(i);
//        String title = item.getString("title");
//        int score = item.getInt("score");
//        System.out.println(title + " (score: " + score + ")");
//      }
    } catch (IOException | JSONException e) {
      throw new RuntimeException(e);
    }
  }
}