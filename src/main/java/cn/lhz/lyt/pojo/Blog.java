package cn.lhz.lyt.pojo;

public class Blog {
    private String blogId;

    private String blogBrowseTimes;

    private String blogTime;

    private String blogPoints;

    private String blogText;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getBlogBrowseTimes() {
        return blogBrowseTimes;
    }

    public void setBlogBrowseTimes(String blogBrowseTimes) {
        this.blogBrowseTimes = blogBrowseTimes == null ? null : blogBrowseTimes.trim();
    }

    public String getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(String blogTime) {
        this.blogTime = blogTime == null ? null : blogTime.trim();
    }

    public String getBlogPoints() {
        return blogPoints;
    }

    public void setBlogPoints(String blogPoints) {
        this.blogPoints = blogPoints == null ? null : blogPoints.trim();
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText == null ? null : blogText.trim();
    }
}