package com.avedia.transfers.struts.action;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: hijack
 * Date: 13-6-6
 * Time: 上午8:47
 * To change this template use File | Settings | File Templates.
 */
public class VideoIO {

    public static void videoIO() throws Exception {
        FileInputStream fis = new FileInputStream("F:/javaVideo/test2.MP4");
        FileOutputStream fos = new FileOutputStream("F:/javaVideo/test2_out.MP4");
        byte[] b = new byte[1024];
        int l;
        while ( (l = fis.read(b)) != -1 ) {
            fos.write(b, 0, b.length);
            fos.flush();
        }
        fos.close();
        fis.close();
    }

    /**
     * this method, you can not read the full video:
     * because, the video is a binary Stream,
     * use InputStream instead!
     * @throws Exception
     */
    public static void videoIOBuffered() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/javaVideo/test2.MP4")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:/javaVideo/test2_Buffered.MP4")));
        String str = "";
        while ( (str = br.readLine()) != null ) {
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();

    }
    public static void main(String[] args) throws Exception{
//        videoIO();
        videoIOBuffered();
    }
}
