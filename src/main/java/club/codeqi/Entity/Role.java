package club.codeqi.Entity;

import java.util.ArrayList;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:23
 */
public class Role extends BaseEntity {
    private Integer rId;
    private String roleName;
    private String roleInfo;
    private boolean isUsed;
    private ArrayList<Authorize> authes;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public ArrayList<Authorize> getAuthes() {
        return authes;
    }

    public void setAuthes(ArrayList<Authorize> authes) {
        this.authes = authes;
    }

    public Role() {
    }

    public Role(Integer rId, String roleName, String roleInfo, boolean isUsed, ArrayList<Authorize> authes) {
        super();
        this.rId = rId;
        this.roleName = roleName;
        this.roleInfo = roleInfo;
        this.isUsed = isUsed;
        this.authes = authes;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rId=" + rId +
                ", roleName='" + roleName + '\'' +
                ", roleInfo='" + roleInfo + '\'' +
                ", isUsed=" + isUsed +
                ", authes=" + authes +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
