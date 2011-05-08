/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 * 
 */
package org.mobicents.slee.container.component;

import java.util.List;


/**
 * @author martins
 *
 */
public interface SleeComponentWithUsageParametersInterface extends
		SleeComponent {

	/**
	 * Retrieves the usage parameters interface
	 * 
	 * @return
	 */
	public Class<?> getUsageParametersInterface();

	/**
	 * Sets the usage parameters interface
	 * 
	 * @param usageParametersInterface
	 */
	public void setUsageParametersInterface(Class<?> usageParametersInterface);

	/**
	 * Retrieves the concrete usage parameters class, generated by SLEE
	 * @return
	 */
	public Class<?> getUsageParametersConcreteClass();
	
	/**
	 * Sets the concrete usage parameters class, generated by SLEE
	 * @param usageParametersConcreteClass
	 */
	public void setUsageParametersConcreteClass(
			Class<?> usageParametersConcreteClass);
	
	/**
	 * Retrieves the concrete usage parameters mbean interface, generated by SLEE
	 * @return
	 */
	public Class<?> getUsageParametersMBeanConcreteInterface();
	
	/**
	 * Sets the concrete usage parameters mbean interface, generated by SLEE
	 * @param usageParametersMBeanConcreteInterface
	 */
	public void setUsageParametersMBeanConcreteInterface(
			Class<?> usageParametersMBeanConcreteInterface);
	
	/**
	 * Retrieves the concrete usage parameters mbean impl class, generated by SLEE
	 * @return
	 */
	public Class<?> getUsageParametersMBeanImplConcreteClass();
	
	/**
	 * Sets the concrete usage parameters mbean impl class, generated by SLEE
	 * @param usageParametersMBeanImplConcreteClass
	 */
	public void setUsageParametersMBeanImplConcreteClass(
			Class<?> usageParametersMBeanImplConcreteClass);
	
	/**
	 * Retrieves the concrete usage notification manager mbean interface, generated by SLEE
	 * @return
	 */
	public Class<?> getUsageNotificationManagerMBeanConcreteInterface();
	
	/**
	 * Sets the concrete usage notification manager mbean interface, generated by SLEE
	 * @param usageNotificationManagerMBeanConcreteInterface
	 */
	public void setUsageNotificationManagerMBeanConcreteInterface(
			Class<?> usageNotificationManagerMBeanConcreteInterface);
	
	/**
	 * Retrieves the concrete usage notification manager mbean impl class, generated by SLEE
	 * @return
	 */
	public Class<?> getUsageNotificationManagerMBeanImplConcreteClass();
	
	/**
	 * Sets the concrete usage notification manager mbean impl class, generated by SLEE
	 * @param usageNotificationManagerMBeanImplConcreteClass
	 */
	public void setUsageNotificationManagerMBeanImplConcreteClass(
			Class<?> usageNotificationManagerMBeanImplConcreteClass);

	/**
	 * 
	 * @return
	 */
	public List<UsageParameterDescriptor> getUsageParametersList();
}
