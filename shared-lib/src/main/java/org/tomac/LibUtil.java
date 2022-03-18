package org.tomac;

import java.lang.reflect.Method;

public class LibUtil {

    public static String libUtility() {
        return "Hello lib";
    }

    public static void checkClass(String name) {
        System.out.print("Checking class: " + name + " ");
        try {
            Class<?> aClass = Class.forName(name);
            Method method = aClass.getDeclaredMethod("call");
            method.invoke(null);
        } catch (Exception e) {
            System.out.println("Failed class: " + e);
        }
    }
}
