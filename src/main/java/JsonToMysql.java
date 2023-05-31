import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class JsonToMysql {

  public static void main(String[] args) throws IOException, SQLException {
//    for (int i = 1; i <= 5; i++) {
//      toMysql(i);
//    }
//    for (int i = 1; i <= 5; i++) {
//      voteToMysql(i);
//    }
  //  findMostTags();
    findMostUsers();
  }

  public static void toMysql(int n) {
    ObjectMapper mapper = new ObjectMapper();
    File file = new File("activity" + n + ".json");

    try {
      //读取 JSON 文件并转换为对象
      StackOverflowResponse response = mapper.readValue(file, StackOverflowResponse.class);

      //连接 MySQL 数据库
      String url = "jdbc:mysql://localhost:3306/stackoverflow";
      String username = "root";
      String password = "463329sz";
      Connection conn = DriverManager.getConnection(url, username, password);

      //将数据插入到 MySQL 表中
      String insertSql = "INSERT INTO stackoverflow_questions"
          + " (question_id, title, tags, owner_profile_image, owner_account_id, owner_user_type, owner_user_id, owner_link, owner_reputation, owner_display_name, content_license, link, last_activity_date, creation_date, answer_count, score, accepted_answer_id, is_answered, view_count, last_edit_date, has_more, quota_max, quota_remaining) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement stmt = conn.prepareStatement(insertSql);
      for (StackOverflowResponse.Item item : response.getItems()) {
        stmt.setInt(1, item.getQuestion_id());
        stmt.setString(2, item.getTitle());
        stmt.setString(3, String.join(",", item.getTags()));
        stmt.setString(4, item.getOwner().getProfile_image());
        stmt.setInt(5, item.getOwner().getAccount_id());
        stmt.setString(6, item.getOwner().getUser_type());
        stmt.setInt(7, item.getOwner().getUser_id());
        stmt.setString(8, item.getOwner().getLink());
        stmt.setInt(9, item.getOwner().getReputation());
        stmt.setString(10, item.getOwner().getDisplay_name());
        stmt.setString(11, item.getContent_license());
        stmt.setString(12, item.getLink());
        stmt.setLong(13, item.getLast_activity_date());
        stmt.setLong(14, item.getCreation_date());
        stmt.setInt(15, item.getAnswer_count());
        stmt.setInt(16, item.getScore());
        stmt.setInt(17, item.getAccepted_answer_id());
        stmt.setBoolean(18, item.isIs_answered());
        stmt.setInt(19, item.getView_count());
        stmt.setLong(20, item.getLast_edit_date());
        stmt.setBoolean(21, response.isHas_more());
        stmt.setInt(22, response.getQuota_max());
        stmt.setInt(23, response.getQuota_remaining());
        stmt.executeUpdate();
      }

      //关闭连接和语句 stmt.close();
      conn.close();
    } catch (IOException | SQLException e) {
      e.printStackTrace();
    }
  }

  public static void voteToMysql(int n) throws IOException, SQLException {
    File file = new File("votes" + n + ".json");
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode = objectMapper.readTree(file);
    String url = "jdbc:mysql://localhost:3306/stackoverflow";
    String user = "root";
    String password = "463329sz";
    Connection connection = DriverManager.getConnection(url, user, password);
//    PreparedStatement preparedStatement = connection.prepareStatement("INSERT ignore INTO  questions "
//        + "(id,title, view_count, answer_count, score, is_answered, accepted_answer_id, creation_date, "
//        + "last_activity_date, link) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)  ");
//
//    for (JsonNode item : jsonNode.get("items")) {
//      int id = item.get("question_id").asInt();
//      String title = item.get("title").asText();
//      int viewCount = item.get("view_count").asInt();
//      int answerCount = item.get("answer_count").asInt();
//      int score = item.get("score").asInt();
//      boolean isAnswered = item.get("is_answered").asBoolean();
//      int acceptedAnswerId;
//      if(item.has("accepted_answer_id")){
//        acceptedAnswerId= item.get("accepted_answer_id").asInt();
//      }else {
//        acceptedAnswerId =0;
//      }
//      Long creationDate = item.get("creation_date").asLong();
//      Long lastActivityDate = item.get("last_activity_date").asLong();
//      String link = item.get("link").asText();
//
//      preparedStatement.setInt(1,id);
//      preparedStatement.setString(2, title);
//      preparedStatement.setInt(3, viewCount);
//      preparedStatement.setInt(4, answerCount);
//      preparedStatement.setInt(5, score);
//      preparedStatement.setBoolean(6, isAnswered);
//      preparedStatement.setInt(7, acceptedAnswerId);
//      preparedStatement.setLong(8, (creationDate));
//      preparedStatement.setLong(9, lastActivityDate);
//      preparedStatement.setString(10, link);
//
//      preparedStatement.executeUpdate();
//
//    }

//    PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO users "
//        + "(id, display_name, reputation, user_type) VALUES (?, ?, ?, ?) "
//        + "ON DUPLICATE KEY UPDATE display_name=?, reputation=?, user_type=?");
//
//    for (JsonNode item : jsonNode.get("items")) {
//      for (JsonNode answer : item.get("answers")) {
//
//      JsonNode owner ;
//      if (answer.has("owner")) {
//        owner = answer.get("owner");
//      } else {
//        continue;
//      }
//
//      int userId = 0;
//      if (owner.has("user_id")) {
//        userId = owner.get("user_id").asInt();
//      }
//
//      String displayName = "";
//      if(owner.has("display_name")){
//        displayName = owner.get("display_name").asText();
//
//      }
//      int reputation = 0;
//      if (owner.has("reputation")) {
//        reputation = owner.get("reputation").asInt();
//      }
//
//      String userType = owner.get("user_type").asText();
//
//      preparedStatement1.setInt(1, userId);
//      preparedStatement1.setString(2, displayName);
//      preparedStatement1.setInt(3, reputation);
//      preparedStatement1.setString(4, userType);
//      preparedStatement1.setString(5, displayName);
//      preparedStatement1.setInt(6, reputation);
//      preparedStatement1.setString(7, userType);
//
//      preparedStatement1.executeUpdate();
//    }
//  }

    PreparedStatement preparedStatement2 = connection.prepareStatement("INSERT INTO answers "
        + "(id, question_id, owner_id, is_accepted, up_vote_count, creation_date,comment_count) "
        + "VALUES (?, ?, ?, ?, ?, ?,?)");

    for (JsonNode item : jsonNode.get("items")) {
      for (JsonNode answer :item.get("answers")) {
//
//
        int answerCnt = item.get("answer_count").asInt();
//      JsonNode answer;
//
//      if(item.has("answer")){
//        answer = item.get("answer");
//      }else {
//        continue;
//      }
        int questionId = item.get("question_id").asInt();
        JsonNode questionOwner = item.get("owner");
        JsonNode owner = answer.get("owner");
        int ownerUserId = 0;
        //  ownerUserId = answer.get("user_id").asInt();
        if (owner.has("user_id")) {
          ownerUserId = owner.get("user_id").asInt();
        }

        boolean isAccepted = false;
        if (answer.has("is_accepted")) {
          isAccepted = answer.get("is_accepted").asBoolean();
        }

        int upVoteCount = 0;
        if (answer.has("up_vote_count")) {
          upVoteCount = answer.get("up_vote_count").asInt();
        }

        LocalDateTime creationDate = LocalDateTime.ofEpochSecond(
            answer.get("creation_date").asLong(), 0, ZoneOffset.UTC);
        int answerId = 0;
        if (answer.has("answer_id")) {
          answerId = answer.get("answer_id").asInt();
        } else
          continue;
        int comment_count = answer.get("comment_count").asInt();
        preparedStatement2.setInt(1, answerId);
        preparedStatement2.setInt(2, questionId);
        preparedStatement2.setInt(3, ownerUserId);
        preparedStatement2.setBoolean(4, isAccepted);
        preparedStatement2.setInt(5, upVoteCount);
        preparedStatement2.setTimestamp(6, Timestamp.valueOf(creationDate));
        preparedStatement2.setInt(7,comment_count);

        preparedStatement2.executeUpdate();
      }
    }
  }

  static class Tag{
    String name;
    int cnt;
    int view;
    int upVotes;
   public Tag(String name){
     this.name = name;
   }
  }


  public static void findMostTags() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/stackoverflow";
    String user = "root";
    String password = "463329sz";
    Connection connection = DriverManager.getConnection(url, user, password);
    Statement statement = connection.createStatement();
    String sql = "select tags, view_count from stackoverflow_questions";
    ArrayList<Tag> tags = new ArrayList<>();
    tags.add(new Tag("java"));
    ResultSet resultSet = statement.executeQuery(sql);
    while (resultSet.next()){
      String tag = resultSet.getString(1);
      int view = resultSet.getInt(2);
      String[]strings = tag.split(",");
      for (int i = 0; i < strings.length; i++) {
        boolean found = false;
        for (int j = 0; j < tags.size(); j++) {
          if(tags.get(j).name.equals(strings[i])){
            found = true;
            tags.get(j).cnt++;
            tags.get(j).view++;
          }
        }if(!found){
          Tag tmp = new Tag(strings[i]);
          tmp.cnt = 1;
          tmp.view = view;
          tags.add(tmp);
        }
      }
    }
    ArrayList<Tag> cntSort = new ArrayList<>();
    ArrayList<Tag> viewSort = new ArrayList<>();
    ArrayList<Tag> voteSort = new ArrayList<>();
    for (int i = 0; i < tags.size(); i++) {
      cntSort.add(tags.get(i));
      voteSort.add(tags.get(i));
      viewSort.add(tags.get(i));
    }
    Collections.sort(cntSort, new Comparator<Tag>() {
      @Override
      public int compare(Tag o1, Tag o2) {
       return o2.cnt-o1.cnt;
      }
    });

    Collections.sort(viewSort, new Comparator<Tag>() {
          @Override
          public int compare(Tag o1, Tag o2) {
            return o2.view-o1.view;
          }
        });



        ResultSet resultSet1 = statement.executeQuery(sql);
    int cnt = 0;
    while (resultSet1.next()){
      String tag = resultSet1.getString(1);
      String[]strings = tag.split(",");
      for (int i = 0; i < strings.length; i++) {
        if(tags.contains(strings[i])){
          cnt++;

        }
      }
    }

      }

  static class User{

    int id;
    int answerCnt;
    public User(int id){
      this.id = id;
    }
  }

  public static void findMostUsers()throws SQLException{
    String url = "jdbc:mysql://localhost:3306/stackoverflow";
    String user = "root";
    String password = "463329sz";
    Connection connection = DriverManager.getConnection(url, user, password);
    Statement statement = connection.createStatement();
    String sql = "select owner_id from answers";
    ResultSet resultSet =statement.executeQuery(sql);
    ArrayList<User> users = new ArrayList<>();
    users.add(new User(0));
    while (resultSet.next()){
      int id = resultSet.getInt(1);
      boolean found = false;
      for (int i = 0; i < users.size(); i++) {
        if(users.get(i).id == id){
         found = true;
          users.get(i).answerCnt++;
        }
      }
      if(!found){
        User tmp = new User(id);
        tmp.answerCnt = 1;
        users.add(tmp);

      }
    }
    users.sort(new Comparator<User>() {
      @Override
      public int compare(User o1, User o2) {
        return o2.answerCnt-o1.answerCnt;
      }
    });
    System.out.println();

  }
}
