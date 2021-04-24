package com.itmady1;
import java.io.*;

import org.apache.commons.io.filefilter.AgeFileFilter;
import org.slf4j.LoggerFactory;
import com.itmady1.Logger;

import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        // write your code here

        Logger.LOGGER2.info("Program is starting......");

        LogParser lparser = new LogParser("C://Somelogs");

        Logger.LOGGER2.info("The End.");
    }
}

