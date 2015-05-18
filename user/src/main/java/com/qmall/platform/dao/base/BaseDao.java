package com.qmall.platform.dao.base;

import com.qmall.platform.common.PaginationResult;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by caoyi on 5/14/15.
 */
abstract public interface BaseDao<T, PK extends Serializable> {
    abstract public T get(PK id);
    abstract public int count();
    abstract public int count(Map<String, Object> params);
    abstract public Integer delete(PK id);
    abstract public Integer delete(Map<String, Object> params);
    abstract public Integer update(PK id);
    abstract public Integer update(Map<String, Object> params);
    abstract public Integer save(T entity);
    abstract public List<T> select();
    abstract public List<T> select(Map<String, Object> params);
    abstract public PaginationResult<T> selectWithPage(Map<String, Object> params);
}
