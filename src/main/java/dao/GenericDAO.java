package dao;

import java.util.List;

import mapper.IRowMapper;

public interface GenericDAO<T> {
	List<T> query(String sql, IRowMapper<T> rowMapper, Object...parameters);
	int countQuery(String sql, IRowMapper<T> rowMapper, Object... parameters);
    Integer insert(String sql, Object... parameters);
    Integer update(String sql, Object... parameters);
    Integer delete(String sql, Object... parameters);
}
