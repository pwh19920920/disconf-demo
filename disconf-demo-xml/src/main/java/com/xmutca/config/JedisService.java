package com.xmutca.config;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by PETER on 2016/1/27.
 */
@Service
@DisconfUpdateService(confFileKeys = {"redis.properties"})
public class JedisService implements IDisconfUpdate {

    @Autowired
    JedisConfig jedisConfig;

    public void reload() throws Exception {
        System.out.println(jedisConfig.getHost());
        System.out.println(jedisConfig.getPort());
    }
}
