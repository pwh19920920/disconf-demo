package com.xmutca.config;

/**
 * Created by PETER on 2016/1/25.
 */
public class JedisConfig {

    // 代表连接地址
    private String host;

    // 代表连接port
    private String port;

    /**
     * 地址, 分布式文件配置
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 端口, 分布式文件配置
     *
     * @return
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
