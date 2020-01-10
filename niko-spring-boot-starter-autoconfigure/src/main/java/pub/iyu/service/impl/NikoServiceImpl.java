package pub.iyu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pub.iyu.NikoProperties;
import pub.iyu.service.INikoService;

/**
 * @ClassName NikoServiceImpl
 * @Author Niko
 * @DATE 2020-01-10 14:47
 * @Version 1.0
 * @Description:
 **/
@Component
public class NikoServiceImpl implements INikoService {

    @Autowired
    private NikoProperties nikoProperties;

    @Override
    public String sayHello(String name) {
        return "Hi, " + name + " " + nikoProperties.getMsg();
    }
}
