package com.tjhq.business.vuedemo;

/**
 * @author ：zhengqiao
 * @description：开发请求映射对象代码
 * Vue登录页面demo信息对象实体
 * @Copyright (C) 2019 太极华青
 * @version: 1.0
 * @date ：Created in 2019/2/20 14:57
 */
import javax.validation.constraints.NotNull;
public class VueLoginInfoVo {

        @NotNull(message="用户名不允许为空")
        private String username;

        @NotNull(message="密码不允许为空")
        private String password;

        public String getUsername() {
        return username;
    }

        public String getPassword() {
        return password;
    }

        public void setUsername(String username) {
        this.username = username;
    }

        public void setPassword(String password) {
        this.password = password;
    }
}
