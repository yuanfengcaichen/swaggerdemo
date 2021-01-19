package club.codeqi.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:21
 */
@ApiModel(value="用户", description="用户表")
public class User extends BaseEntity {
    @ApiModelProperty(value = "用户编号", dataType = "Integer", example = "1")
    private Integer uId;
    @ApiModelProperty(value = "用户名", dataType = "String", example = "username")
    private String uName;
    @ApiModelProperty(value = "用户密码", dataType = "String", example = "password")
    private String uPwd;
    @ApiModelProperty(value = "用户角色", dataType = "Role")
    private Role role;
    @ApiModelProperty(value = "用户地址", dataType = "String", example = "上海市")
    private String uAddress;
    @ApiModelProperty(value = "用户电话", dataType = "String", example = "17721009090")
    private String uPhone;
    @ApiModelProperty(value = "用户邮箱", dataType = "String", example = "078@uu.com")
    private String uEmail;
    @ApiModelProperty(value = "用户权限", dataType = "ArrayList")
    private ArrayList<Authorize> authes;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public ArrayList<Authorize> getAuthes() {
        return authes;
    }

    public void setAuthes(ArrayList<Authorize> authes) {
        this.authes = authes;
    }

    public User() {
    }

    public User(Integer uId, String uName, String uPwd, Role role, String uAddress, String uPhone, String uEmail, ArrayList<Authorize> authes) {
        super();
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
        this.role = role;
        this.uAddress = uAddress;
        this.uPhone = uPhone;
        this.uEmail = uEmail;
        this.authes = authes;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", role=" + role +
                ", uAddress='" + uAddress + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", authes=" + authes +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
