//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.vo.beans;

public class TelecomUsageTypeVoBean extends ims.vo.ValueObjectBean
{
	public TelecomUsageTypeVoBean()
	{
	}
	public TelecomUsageTypeVoBean(ims.core.vo.TelecomUsageTypeVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.usage = vo.getUsage() == null ? null : (ims.vo.LookupInstanceBean)vo.getUsage().getBean();
		this.channeltypes = vo.getChannelTypes() == null ? null : vo.getChannelTypes().getBeanCollection();
		this.defaultchanneltype = vo.getDefaultChannelType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDefaultChannelType().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.TelecomUsageTypeVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.usage = vo.getUsage() == null ? null : (ims.vo.LookupInstanceBean)vo.getUsage().getBean();
		this.channeltypes = vo.getChannelTypes() == null ? null : vo.getChannelTypes().getBeanCollection();
		this.defaultchanneltype = vo.getDefaultChannelType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDefaultChannelType().getBean();
	}

	public ims.core.vo.TelecomUsageTypeVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.TelecomUsageTypeVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.TelecomUsageTypeVo vo = null;
		if(map != null)
			vo = (ims.core.vo.TelecomUsageTypeVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.TelecomUsageTypeVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.LookupInstanceBean getUsage()
	{
		return this.usage;
	}
	public void setUsage(ims.vo.LookupInstanceBean value)
	{
		this.usage = value;
	}
	public java.util.Collection getChannelTypes()
	{
		return this.channeltypes;
	}
	public void setChannelTypes(java.util.Collection value)
	{
		this.channeltypes = value;
	}
	public void addChannelTypes(java.util.Collection value)
	{
		if(this.channeltypes == null)
			this.channeltypes = new java.util.ArrayList();
		this.channeltypes.add(value);
	}
	public ims.vo.LookupInstanceBean getDefaultChannelType()
	{
		return this.defaultchanneltype;
	}
	public void setDefaultChannelType(ims.vo.LookupInstanceBean value)
	{
		this.defaultchanneltype = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean usage;
	private java.util.Collection channeltypes;
	private ims.vo.LookupInstanceBean defaultchanneltype;
}