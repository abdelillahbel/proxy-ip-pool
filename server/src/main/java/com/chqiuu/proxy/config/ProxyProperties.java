package com.chqiuu.proxy.config;

import com.chqiuu.proxy.common.constant.Constant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Component;

/**
 * 系统参数配置项
 *
 * @author abdelillahbel
 */
@Data
@Component
@ConfigurationProperties(prefix = "proxy")
public class ProxyProperties {
    /**
     * 是否启用API接口
     * swagger-enable
     */
    private boolean swaggerEnable = false;
    /**
     * local-resource-path
     */
    private String localResourcePath;
    /**
     * 绑定本机IP地址
     * local-ip
     */
    private String localIp;
    /**
     * 请求超时时长限制（单位：毫秒）
     */
    private Integer requestTimeout = 3000;
    /**
     * CSDN 用户名
     */
    private String csdnUser;
// Proxy Properties method
    public ProxyProperties() {
        ApplicationHome h = new ApplicationHome(getClass());
        String basePath = h.getSource().getParentFile().toString();
        if (localResourcePath == null) {
            this.localResourcePath = basePath;
        } else if (!localResourcePath.contains(":")) {
            this.localResourcePath = basePath + localResourcePath;
        }
        // 将绝对路径存储到公用变量中
        Constant.ResourcePath.LOCAL_RESOURCE_PATH = this.localResourcePath;
    }
}
