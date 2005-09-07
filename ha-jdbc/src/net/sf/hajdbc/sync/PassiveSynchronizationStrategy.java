/*
 * HA-JDBC: High-Availability JDBC
 * Copyright (C) 2004 Paul Ferraro
 * 
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by the 
 * Free Software Foundation; either version 2.1 of the License, or (at your 
 * option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License 
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, 
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * Contact: ferraro@users.sourceforge.net
 */
package net.sf.hajdbc.sync;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import net.sf.hajdbc.SynchronizationStrategy;

/**
 * Trivial {@link SynchronizationStrategy} implementation with an empty {@link SynchronizationStrategy#synchronize(Connection, Connection, List)} method.
 * 
 * @author  Paul Ferraro
 * @since   1.0
 */
public class PassiveSynchronizationStrategy implements SynchronizationStrategy
{
	private String id;
	
	/**
	 * @see net.sf.hajdbc.SynchronizationStrategy#getId()
	 */
	public String getId()
	{
		return this.id;
	}

	/**
	 * @see net.sf.hajdbc.SynchronizationStrategy#setId(java.lang.String)
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @see net.sf.hajdbc.SynchronizationStrategy#readProperties()
	 */
	public Properties readProperties() throws Exception
	{
		return new Properties();
	}

	/**
	 * @see net.sf.hajdbc.SynchronizationStrategy#writeProperties(java.util.Properties)
	 */
	public void writeProperties(Properties properties) throws Exception
	{
		// Do nothing
	}

	/**
	 * @see net.sf.hajdbc.SynchronizationStrategy#synchronize(java.sql.Connection, java.sql.Connection, java.util.List)
	 */
	public void synchronize(Connection inactiveConnection, Connection activeConnection, List tableList) throws SQLException
	{
		// Do nothing
	}
}