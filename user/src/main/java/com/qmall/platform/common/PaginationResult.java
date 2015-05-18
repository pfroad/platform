package com.qmall.platform.common;

import java.util.List;

/**
 * Created by caoyi on 5/14/15.
 */
public class PaginationResult<T> {
    private List<T> result;
    private int page;
    private int pageSize;
    private long totalCount;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
