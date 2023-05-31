import java.util.Date;
import java.util.List;

public class StackOverflowResponse {
  private List<Item> items;
  private boolean has_more;
  private int quota_max;
  private int quota_remaining;

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public boolean isHas_more() {
    return has_more;
  }

  public void setHas_more(boolean has_more) {
    this.has_more = has_more;
  }

  public int getQuota_max() {
    return quota_max;
  }

  public void setQuota_max(int quota_max) {
    this.quota_max = quota_max;
  }

  public int getQuota_remaining() {
    return quota_remaining;
  }

  public void setQuota_remaining(int quota_remaining) {
    this.quota_remaining = quota_remaining;
  }

  public static class Item {
    private List<String> tags;
    private Owner owner;
    private boolean is_answered;
    private int view_count;
    private int answer_count;

    private int bounty_amount;
    private int score;
    private long last_activity_date;
    private long creation_date;
    private long last_edit_date;
    private int question_id;
    private int account_id;
    private int accept_rate;
    private int accepted_answer_id;
    private String content_license;
    private String link;
    private String title;

    private String closed_reason;
    private Date closed_date;
    private Date bounty_closes_date;

    private Date protected_date;

    public Date getProtected_date() {
      return protected_date;
    }

    public void setProtected_date(Date protected_date) {
      this.protected_date = protected_date;
    }

    public Date getBounty_closes_date() {
      return bounty_closes_date;
    }

    public void setBounty_closes_date(Date bounty_closes_date) {
      this.bounty_closes_date = bounty_closes_date;
    }

    public int getBounty_amount() {
      return bounty_amount;
    }

    public void setBounty_amount(int bounty_amount) {
      this.bounty_amount = bounty_amount;
    }

    public String getClosed_reason() {
      return closed_reason;
    }

    public void setClosed_reason(String closed_reason) {
      this.closed_reason = closed_reason;
    }

    public void setClosed_date(Date closed_date) {
      this.closed_date = closed_date;
    }

    public Date getClosed_date() {
      return closed_date;
    }

    public int getAccept_rate() {
      return accept_rate;
    }

    public void setAccept_rate(int accept_rate) {
      this.accept_rate = accept_rate;
    }

    public List<String> getTags() {
      return tags;
    }


    public void setTags(List<String> tags) {
      this.tags = tags;
    }

    public Owner getOwner() {
      return owner;
    }

    public void setOwner(Owner owner) {
      this.owner = owner;
    }

    public boolean isIs_answered() {
      return is_answered;
    }

    public void setIs_answered(boolean is_answered) {
      this.is_answered = is_answered;
    }

    public int getView_count() {
      return view_count;
    }

    public void setView_count(int view_count) {
      this.view_count = view_count;
    }

    public int getAnswer_count() {
      return answer_count;
    }

    public void setAnswer_count(int answer_count) {
      this.answer_count = answer_count;
    }

    public int getScore() {
      return score;
    }

    public void setScore(int score) {
      this.score = score;
    }

    public long getLast_activity_date() {
      return last_activity_date;
    }

    public void setLast_activity_date(long last_activity_date) {
      this.last_activity_date = last_activity_date;
    }

    public long getCreation_date() {
      return creation_date;
    }

    public void setCreation_date(long creation_date) {
      this.creation_date = creation_date;
    }

    public long getLast_edit_date() {
      return last_edit_date;
    }

    public void setLast_edit_date(long last_edit_date) {
      this.last_edit_date = last_edit_date;
    }

    public int getQuestion_id() {
      return question_id;
    }

    public void setQuestion_id(int question_id) {
      this.question_id = question_id;
    }

    public String getContent_license() {
      return content_license;
    }

    public void setContent_license(String content_license) {
      this.content_license = content_license;
    }

    public int getAccepted_answer_id() {
      return accepted_answer_id;
    }

    public void setAccepted_answer_id(int accepted_answer_id) {
      this.accepted_answer_id = accepted_answer_id;
    }

    public String getLink() {
      return link;
    }

    public void setLink(String link) {
      this.link = link;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public int getAccount_id() {
      return account_id;
    }

    public void setAccount_id(int account_id) {
      this.account_id = account_id;
    }

    public static class Owner {
      private int reputation;
      private int user_id;
      private int account_id;
      private int accept_rate;
      private String user_type;
      private String profile_image;
      private String display_name;
      private String link;



      public int getAccept_rate() {
        return accept_rate;
      }

      public void setAccept_rate(int accept_rate) {
        this.accept_rate = accept_rate;
      }

      public int getAccount_id() {
        return account_id;
      }

      public void setAccount_id(int account_id) {
        this.account_id = account_id;
      }

      public int getReputation() {
        return reputation;
      }

      public void setReputation(int reputation) {
        this.reputation = reputation;
      }

      public int getUser_id() {
        return user_id;
      }

      public void setUser_id(int user_id) {
        this.user_id = user_id;
      }

      public String getUser_type() {
        return user_type;
      }

      public void setUser_type(String user_type) {
        this.user_type = user_type;
      }

      public String getProfile_image() {
        return profile_image;
      }

      public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
      }

      public String getDisplay_name() {
        return display_name;
      }

      public void setDisplay_name(String display_name) {
        this.display_name = display_name;
      }

      public String getLink() {
        return link;
      }

      public void setLink(String link) {
        this.link = link;
      }


    }
  }
}