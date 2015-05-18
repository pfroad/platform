package com.qm.platform.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.pool2.impl.GenericObjectPool;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by CYMAC on 5/18/15.
 */
public class FtpClientPool {
    private GenericObjectPool<FTPClient> pool;

    private FtpClientFactory factory;

    public FtpClientPool(GenericObjectPool<FTPClient> pool) {
        this.pool = new GenericObjectPool<FTPClient>(factory);
    }

    public GenericObjectPool<FTPClient> getPool() {
        return pool;
    }

    public FtpClientFactory getFactory() {
        return factory;
    }

    public FTPClient getResource() throws Exception {
        return pool.borrowObject();
    }

    public void returnResource(FTPClient ftpClient) {
        pool.returnObject(ftpClient);pool.clear();
    }

    public void close() {
        if (!pool.isClosed())
            pool.close();
    }
}
