package com.avedia.transfers.struts.action;

/**
 * Created with IntelliJ IDEA.
 * User: hijack
 * Date: 13-6-5
 * Time: 下午9:06
 * To change this template use File | Settings | File Templates.
 */
public class CtrlFtpFile {
    //读取Dll
    static {
        System.loadLibrary("GetPlayTime");
    }

    /**
     * add GetPlayTime.dll and MediaInfo.dll into C:\Windows\System32
     * @param arg
     * @return
     */
    public native String getMediaTime(String arg);

    public static void main(String[] args) {

        CtrlFtpFile hw = new CtrlFtpFile();
        System.out.println(String.valueOf(hw.getMediaTime("F:/javaVideo/test.MOV")));

    }
}
