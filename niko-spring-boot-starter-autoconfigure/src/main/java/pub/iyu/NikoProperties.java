package pub.iyu;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Niko属性配置类
 * @auther: nik0
 * @date: 2020-01-01 12:00:00
 */
@ConfigurationProperties(prefix = "niko")
public class NikoProperties {

    /**
     * 打招呼的内容，默认为“Hello Niko!”
     */
    private String msg = "Hello Niko!";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
