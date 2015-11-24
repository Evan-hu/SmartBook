package com.smart.downloader;

import com.smart.Page;
import com.smart.Request;
import com.smart.Task;

public interface Downloader {

    /**
     * Downloads web pages and store in Page object.
     *
     * @param request
     * @param task
     * @return page
     */
    public Page download(Request request, Task task);

    /**
     * Tell the downloader how many threads the spider used.
     * @param threadNum number of threads
     */
    public void setThread(int threadNum);
}