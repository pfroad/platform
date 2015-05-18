package com.qmall.platform.mapper;

import java.io.Serializable;
import java.util.List;

import com.qmall.platform.common.PaginationResult;

abstract public interface BaseMapper<T, PK extends Serializable> {
	abstract public T get(PK id);
    abstract public int count();
    abstract public int count(T entity);
    abstract public Integer delete(PK id);
    abstract public Integer delete(T entity);
    abstract public Integer update(PK id);
    abstract public Integer update(T entity);
    abstract public Integer save(T entity);
    abstract public List<T> select();
    abstract public List<T> select(T entity);
    abstract public PaginationResult<T> selectWithPage(T entity);
}
