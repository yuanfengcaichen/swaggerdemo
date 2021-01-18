package club.codeqi.Entity;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:16
 */
public class Project extends BaseEntity{
    private int pId;
    private String pName;
    private String pInfo;
    private User createUser;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpInfo() {
        return pInfo;
    }

    public void setpInfo(String pInfo) {
        this.pInfo = pInfo;
    }

    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public Project() {
    }

    public Project(int pId, String pName, String pInfo, User createUser) {
        super();
        this.pId = pId;
        this.pName = pName;
        this.pInfo = pInfo;
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pInfo='" + pInfo + '\'' +
                ", createUser=" + createUser +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
