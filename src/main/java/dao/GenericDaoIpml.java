package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import mapper.IRowMapper;
import context.DBcontext;


public class GenericDaoIpml<T>  implements GenericDAO<T> {
	DBcontext ctx = null;
    public Connection getConnection()  {
    	ctx = new DBcontext();
    	try {
			return ctx.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
    }

    //select
    @Override
	public List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters) {
    	List<T> p = new ArrayList<>();
		Integer id = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			connection.setAutoCommit(false);
			rs = statement.executeQuery();
//			statement.getGeneratedKeys();
			connection.commit();
			System.out.println("query thanh cong");
			while (rs.next()) {
				p.add(rowMapper.mapRow(rs));
			}
			return p;
		} catch (SQLException e) {
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException ex) {
					return null;
				}
				return null;
			}
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}
		return p;
	}
    
    @Override
	public int countQuery(String sql, IRowMapper<T> rowMapper, Object... parameters) {
    	List<T> p = new ArrayList<>();
		Integer id = null;
		int count = 0;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			connection.setAutoCommit(false);
			rs = statement.executeQuery();
//			statement.getGeneratedKeys();
			connection.commit();
			System.out.println("query thanh cong");
			count = rowMapper.count(rs);
			return count;
			
		} catch (SQLException e) {
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException ex) {
					return 0;
				}
				return 0;
			}
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				return 0;
			}
		}
		return count;
	}
    //insert
    public Integer insert(String sql, Object... parameters){
        Integer a = null;
        Connection connection = null;
        PreparedStatement statement= null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            connection.setAutoCommit(false);
            setParameter(statement, parameters);
            a = statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            connection.commit();
            System.out.println("da tao thanh cong: 1 user");
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
            return a;
        } catch (SQLException e) {
            if(connection!=null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    return null;
                }
                return null;
            }
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
                if (statement!=null){
                    statement.close();
                }
                if (resultSet!=null){
                    resultSet.close();
                }
            }catch (SQLException e){
                return null;
            }
        }
        return null;
    }
    
    // update
    public Integer update(String sql, Object... parameters){
        Integer id = null;
        Connection connection = null;
        PreparedStatement statement= null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            connection.setAutoCommit(false);
            setParameter(statement, parameters);
            int a = statement.executeUpdate();
            connection.commit();
            System.out.println("da update thanh cong: " + a + "user");
            return id;
        } catch (SQLException e) {
            if(connection!=null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    return null;
                }
                return null;
            }
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
                if (statement!=null){
                    statement.close();
                }
            }catch (SQLException e){
                return null;
            }
        }
        return null;
    }
    
    public Integer delete(String sql, Object... parameters){
        Connection connection = null;
        PreparedStatement statement = null;
        Integer id = null;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            statement= connection.prepareStatement(sql);
            setParameter(statement,parameters);
            id = statement.executeUpdate();
            connection.commit();
            return id;
        } catch (SQLException e) {
            try {
                connection.rollback();
                return null;
            } catch (SQLException ex) {
                return null;
            }finally {
                try {
                    if (connection!=null){
                        connection.close();
                    }
                    if (statement!=null){
                        statement.close();
                    }
                }catch (SQLException ext){
                    return null;
                }
            }
        }
    }
    
    protected void setParameter(PreparedStatement statement, Object... parameters){
        try {
            for (int i = 0; i< parameters.length; i++){
                Object parameter = parameters[i];

                if(parameter instanceof Long){
                    statement.setLong(i+1, (Long)parameter);
                } else if (parameter instanceof String) {
                    statement.setString(i, (String)parameter);
                }else if (parameter instanceof Integer) {
                    statement.setInt(i+1, (Integer)parameter);
                }else if (parameter instanceof Float) {
                    statement.setFloat(i+1, (Float) parameter);
                }else if (parameter instanceof Object) {
                    statement.setObject(i+1, parameter);
                }else if (parameter instanceof Timestamp) {
                    statement.setTimestamp(i+1, (Timestamp)parameter);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


	

}
