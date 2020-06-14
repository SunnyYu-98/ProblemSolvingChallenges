package com.challenges.medium;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidateIPAddressUsingRegex {
    public static void main(String[] args) {
        System.out.println(validateIp("000.12.12.034"));
        System.out.println(validateIp("121.234.12.12"));
        System.out.println(validateIp("23.45.12.56"));
        System.out.println(validateIp("00.12.123.123123.123"));
        System.out.println(validateIp("122.23"));
        System.out.println(validateIp("Hello.IP"));
    }

    public static boolean validateIp(String ip) {
        //((?:2[5][0-5]|2[0-4][0-9]|[1]\d{1,2}|\d)[.]){3}
        //((?:2[5][0-5]|2[0-4][0-9]|[1]?\d{1,2})[.]){3}((?:2[5][0-5]|2[0-4][0-9]|[1]?\d{1,2}))
        String pattern = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        return ip.matches(pattern);

    }


}
