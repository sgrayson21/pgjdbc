package org.postgresql.jdbc1;


import java.sql.*;
import java.util.Vector;
import org.postgresql.Field;

/* $Header$
 * This class implements the java.sql.ResultSet interface for JDBC1.
 * However most of the implementation is really done in 
 * org.postgresql.jdbc1.AbstractJdbc1ResultSet
 */
public class Jdbc1ResultSet extends org.postgresql.jdbc1.AbstractJdbc1ResultSet implements java.sql.ResultSet
{

	public Jdbc1ResultSet(Jdbc1Connection conn, Field[] fields, Vector tuples, String status, int updateCount, long insertOID, boolean binaryCursor)
	{
		super(conn, fields, tuples, status, updateCount, insertOID, binaryCursor);
	}

	public Jdbc1ResultSet(Jdbc1Connection conn, Field[] fields, Vector tuples, String status, int updateCount)
	{
		super(conn, fields, tuples, status, updateCount, 0, false);
	}

	public java.sql.ResultSetMetaData getMetaData() throws SQLException
	{
		return new ResultSetMetaData(rows, fields);
	}

}

