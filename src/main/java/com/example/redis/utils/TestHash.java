package com.example.redis.utils;

import redis.clients.jedis.Jedis;

public class TestHash {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        jedis.flushDB();

        // 新增
        System.out.println(jedis.hset("fullName", "firstName", "Chauncey"));
        System.out.println(jedis.hset("fullName", "lastName", "Leonard"));
        System.out.println(jedis.hget("fullName", "firstName"));
        System.out.println(jedis.hgetAll("fullName"));

        // 删除
        System.out.println(jedis.hdel("fullName", "firstName"));

        // 是否存在
        System.out.println(jedis.hexists("fullName", "lastName"));
    }
}
