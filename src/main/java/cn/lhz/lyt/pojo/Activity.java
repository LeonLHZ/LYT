package cn.lhz.lyt.pojo;

public class Activity {
    private String activityId;

    private String activityUser;

    private String activityToUser;

    private String activityTime;

    private String activityPartTime;

    private String activityState;

    private String activityText;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getActivityUser() {
        return activityUser;
    }

    public void setActivityUser(String activityUser) {
        this.activityUser = activityUser == null ? null : activityUser.trim();
    }

    public String getActivityToUser() {
        return activityToUser;
    }

    public void setActivityToUser(String activityToUser) {
        this.activityToUser = activityToUser == null ? null : activityToUser.trim();
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime == null ? null : activityTime.trim();
    }

    public String getActivityPartTime() {
        return activityPartTime;
    }

    public void setActivityPartTime(String activityPartTime) {
        this.activityPartTime = activityPartTime == null ? null : activityPartTime.trim();
    }

    public String getActivityState() {
        return activityState;
    }

    public void setActivityState(String activityState) {
        this.activityState = activityState == null ? null : activityState.trim();
    }

    public String getActivityText() {
        return activityText;
    }

    public void setActivityText(String activityText) {
        this.activityText = activityText == null ? null : activityText.trim();
    }
}