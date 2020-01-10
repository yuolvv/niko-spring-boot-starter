package pub.iyu.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pub.iyu.NikoProperties;
import pub.iyu.service.impl.NikoServiceImpl;

/**
 * @ClassName NikoAutoConfiguration
 * @Author Niko
 * @DATE 2020-01-10 14:49
 * @Version 1.0
 * @Description:
 **/
//定义为配置类
@Configuration
//在web条件下成立
@ConditionalOnWebApplication
//启用HelloWorldProperties配置功能，并加入到IOC容器中
@EnableConfigurationProperties({NikoProperties.class})
//导入NikoService组件
@Import(NikoServiceImpl.class)
public class NikoAutoConfiguration {
}
