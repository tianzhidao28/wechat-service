package com.rocyuan.wechat.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by rocyuan on 2017/5/13.
 */
@Component
public class MongoUtils {


    private static MongoTemplate mongoTemplate;


    public static void save(Object object, String collectionName) {
        mongoTemplate.save(object,collectionName);
    }



    @Autowired
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        MongoUtils.mongoTemplate = mongoTemplate;
    }
}
