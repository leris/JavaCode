package ie.leris.misc.http;

import java.io.IOException;
import java.util.Date;

public class HttpDownloader {

    public static void main(String[] args) {
        String fileURL = "http://www.teamworkpm.net/index.cfm";
        String saveDir = "/home/jack/Documents/development/tmp";
        try {
            System.out.println(new Date().toString());

            HttpDownloadUtility.downloadFile(fileURL, saveDir);
            System.out.println(new Date().toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}