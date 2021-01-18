package club.codeqi.Entity;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:26
 */
public class Authorize extends BaseEntity {
    private Integer aId;
    private String aName;
    private String aInfo;
    private String aCode;
    private Integer rId;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaInfo() {
        return aInfo;
    }

    public void setaInfo(String aInfo) {
        this.aInfo = aInfo;
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Authorize() {
    }

    public Authorize(Integer aId, String aName, String aInfo, String aCode, Integer rId) {
        super();
        this.aId = aId;
        this.aName = aName;
        this.aInfo = aInfo;
        this.aCode = aCode;
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "Authorize{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aInfo='" + aInfo + '\'' +
                ", aCode='" + aCode + '\'' +
                ", rId=" + rId +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
