package com.qm.platform.ftp;

import com.qm.platform.Storage;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by CYMAC on 5/18/15.
 */
public class StorageImpl implements Storage {

    private FtpClientPool ftpClientPool;
    private String ftpHome;

    public boolean upload(File file, String path) throws Exception {
        InputStream in = new FileInputStream(file);
        FTPClient ftpClient = ftpClientPool.getResource();
        ftpClient.changeWorkingDirectory(ftpHome);
        return ftpClient.storeFile(path, in);
    }

    public boolean delete(String fileName) throws Exception {
        FTPClient ftpClient = ftpClientPool.getResource();
        ftpClient.changeWorkingDirectory(ftpHome);
        return ftpClient.deleteFile(fileName);
    }

//    public boolean download(String fileName, String) throws Exception {
//        FTPClient ftpClient = ftpClientPool.getResource();
//        ftpClient.changeWorkingDirectory(ftpHome);
//        ftpClient.retrieveFile()
//    }
}
