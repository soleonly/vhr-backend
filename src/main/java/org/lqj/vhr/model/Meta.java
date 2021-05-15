package org.lqj.vhr.model;

/**
 * @Classname Meta
 * @Description
 * @Author liuqiangjian
 * @Date 2021/4/11 08:17
 * @Version 1.0
 **/
public class Meta {
    private Boolean keepaLive;

    private Boolean requireAuth;

    public Boolean getKeepaLive() {
        return keepaLive;
    }

    public void setKeepaLive(Boolean keepaLive) {
        this.keepaLive = keepaLive;
    }

    public Boolean getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
