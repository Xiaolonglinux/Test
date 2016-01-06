package com.growingio.web.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Log 
{	
    public static void DoLog(String logDetail)
    {
        AppendLogfile(logDetail);
    }

    public static void LogAction(String element, String action, String logDetail)
    {
        AppendLogfile("[" + action + "] - [" + logDetail + "] - [" + element + "]");
    }

    public static void LogException(Exception e)
    {
        AppendLogfile(e.getMessage());
    }

    private static void AppendLogfile(String value) 
    {
		String outPutFilePath = "result\\" +Global.Time;
		String fileName = outPutFilePath + "\\" + "LogFile.txt";
		File file = new File(outPutFilePath);
		if(!file.exists()){
			file.mkdirs();
		}
		try {
			FileWriter fw = new FileWriter(fileName,true);
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " - " + value);
	        fw.write(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " - " + value + "\r\n");
	        fw.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}   
    }
}
