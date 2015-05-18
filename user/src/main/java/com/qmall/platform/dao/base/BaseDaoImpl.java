package com.qmall.platform.dao.base;

import com.qmall.platform.common.PaginationResult;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by caoyi on 5/14/15.
 */
abstract public class BaseDaoImpl<T, PK extends Serializable> extends SqlSessionDaoSupport implements BaseDao<T, PK> {
    public final static String SELECT_BY_PK = "selectPK";
    public final static String COUNT = "count";
    public final static String COUNT_MAP = "count_by_map";
    public final static String INSERT = "insert";
    public final static String UPDATE_BY_PK = "updatePK";
    public final static String UPDATE_MAP = "update_by_map";
    public final static String DELETE = "deletePK";
    public final static String DELETE_MAP = "delete_by_map";
    public final static String LIST_ALL = "list";
    public final static String LIST_MAP = "list_by_map";
    public final static String LIST_WITH_PAGE = "page_list";

    private String sqlNamesSpace = "";

    public void setSqlNamesSpace(String sqlNamesSpace) {
        this.sqlNamesSpace = sqlNamesSpace;
    }

    public T get(PK id) {
        return getSqlSession().selectOne(sqlNamesSpace + "." + SELECT_BY_PK, id);
    }
    public int count() {
        return getSqlSession().selectOne(sqlNamesSpace + "." + COUNT);
    }
    public int count(Map<String, Object> params) {
        return getSqlSession().selectOne(sqlNamesSpace + "." + COUNT_MAP, params);
    }
    public Integer delete(PK id) {
        return getSqlSession().delete(sqlNamesSpace + "." + DELETE, id);
    }
    public Integer delete(Map<String, Object> params) {
        return getSqlSession().delete(sqlNamesSpace + "." + DELETE_MAP, params);
    }
    public Integer update(PK id) {
        return getSqlSession().update(sqlNamesSpace + "." + UPDATE_BY_PK, id);
    }
    public Integer update(Map<String, Object> params) {
        return getSqlSession().update(sqlNamesSpace + "." + UPDATE_MAP, params);
    }
    public Integer save(T entity) {
        return getSqlSession().insert(sqlNamesSpace + "." + INSERT, entity);
    }
    public List<T> select() {
        return getSqlSession().selectList(sqlNamesSpace + "." + LIST_ALL);
    }
    public List<T> select(Map<String, Object> params) {
        return getSqlSession().selectList(sqlNamesSpace + "." + LIST_MAP, params);
    }
    public PaginationResult<T> selectWithPage(Map<String, Object> params) {
        int count = count();
        PaginationResult<T> paginationResult = new PaginationResult<T>();
        paginationResult.setTotalCount(count());
        if (count > 0) {
            List<T> result = getSqlSession().selectList(sqlNamesSpace + "." + LIST_WITH_PAGE, params);
            paginationResult.setResult(result);
        }
        return paginationResult;
    }
}
