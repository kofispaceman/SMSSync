package org.addhen.smssync.util;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Created by Kamil Kalfas(kkalfas@soldevelo.com) on 24.04.14.
 *
 * This class uses Google gson to parsing objects and strings
 */
public final class JsonUtils {

    private JsonUtils() {
        // Prevent instantiation
    }

    public static <T> T getObj(String json, java.lang.Class<T> afterClass) {
        return new Gson().fromJson(json, afterClass);
    }

    public static <T> T getObj(String json, Type type) {
        return new Gson().fromJson(json, type);
    }

    public static String objToJson(Object object) {
        return new Gson().toJson(object);
    }
}
