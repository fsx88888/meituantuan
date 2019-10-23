package com.tt.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

//标识配置类
@Configuration
//引入配置文件
@PropertySource("classpath:/properties/redis.properties")
public class RedisConfig {
	/*
	 * @Value("${redis.host}") private String host;
	 * 
	 * @Value("${redis.port}") private Integer port;
	 */
	@Value("${redis.nodes}")
	private String nodes;
	/*
	 * @Bean public Jedis jedis() { return new Jedis(host,port); }
	 */
	/*
	 * @Bean public ShardedJedis shardedJedis() { List<JedisShardInfo>
	 * shardInfo=getList(); System.out.println("创建shardInfo"); return new
	 * ShardedJedis(shardInfo); }
	 * 
	 * private List<JedisShardInfo> getList() { List<JedisShardInfo> list=new
	 * ArrayList<>(); String[] arrayNodes=nodes.split(","); //node=ip:port for
	 * (String node : arrayNodes) { String host=node.split(":")[0]; int
	 * port=Integer.parseInt(node.split(":")[1]); list.add(new
	 * JedisShardInfo(host,port)); } System.out.println(list); return list; }
	 */
	/*
	 * @Bean
	 * 
	 * @Scope("prototype") public Jedis jedis(JedisSentinelPool sentinelPool) {
	 * return sentinelPool.getResource(); } // @Bean public JedisSentinelPool
	 * sentinelPool() { Set<String> sentinels=new HashSet<>(); sentinels.add(nodes);
	 * JedisSentinelPool sentinelPool =new JedisSentinelPool("mymaster", sentinels);
	 * return sentinelPool; }
	 */
	/*
	 * private Set<String> getNodeSet(){ Set<String> NodeSet=new HashSet<>();
	 * String[] arrayNodes=nodes.split(","); for (String string : arrayNodes) {
	 * NodeSet.add(string); }
	 * 
	 * return NodeSet; }
	 */
	@Bean
	@Scope("prototype")
	public JedisCluster jedisCluster() {
		Set<HostAndPort> set = new HashSet<>();
		String[] nodesArray = nodes.split(",");
		for(String node:nodesArray) {
			String host = node.split(":")[0];
			int port = Integer.parseInt(node.split(":")[1]);
			set.add(new HostAndPort(host, port));
		}
		return new JedisCluster(set);
	}
}

