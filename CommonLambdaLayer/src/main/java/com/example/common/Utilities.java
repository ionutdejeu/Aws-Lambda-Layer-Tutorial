package com.example.common;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utilities {

    public static void logMessage(LambdaLogger logger, String msg) {
        logger.log("Message: " + msg.toString());
        StringWriter sw = new StringWriter();
        logger.log(sw.toString().replaceAll("\n", "\r"));
    }
    public static String GetMessage(){
        return "Hello from Lambda Layer";
    }

}
