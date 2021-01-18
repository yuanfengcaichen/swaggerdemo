package club.codeqi.Entity;

import java.util.Date;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:19
 */
public class BaseEntity {
    Date createTime;
    boolean isDelete;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
