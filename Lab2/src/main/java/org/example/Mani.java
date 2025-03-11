package org.example;

import com.google.common.base.Joiner;

public class Mani {
    public static void main(String[] args) {
        System.out.println(joinStrings("Hello", null, "world"));
    }

    public static String joinStrings(String... parts) {
        Joiner joiner = Joiner.on(", ").skipNulls();
        return joiner.join(parts);
    }
}