package com.nabei.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

/**
 * 用户手动转 @JsonProperty 的类
 *
 * @author guichang
 * @since 2018/1/9
 */

public class FaJsonUtils {
    private static ObjectMapper om = new ObjectMapper();


    public static String objToString(Object obj) {
        String result = "";
        try {
            result = om.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static <T> T parseObj(String json, Class<T> clazz) {
        T t = null;
        if (StringUtils.isNotBlank(json)) {
            try {
                t = om.readValue(json.getBytes(), clazz);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return t;
    }

}