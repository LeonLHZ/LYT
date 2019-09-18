package cn.lhz.lyt.pojo;

public class Relationship {
    private String relationshipAid;

    private String relationshipBid;

    private String relationshipType;

    public String getRelationshipAid() {
        return relationshipAid;
    }

    public void setRelationshipAid(String relationshipAid) {
        this.relationshipAid = relationshipAid == null ? null : relationshipAid.trim();
    }

    public String getRelationshipBid() {
        return relationshipBid;
    }

    public void setRelationshipBid(String relationshipBid) {
        this.relationshipBid = relationshipBid == null ? null : relationshipBid.trim();
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType == null ? null : relationshipType.trim();
    }
}