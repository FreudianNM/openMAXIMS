//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.scheduling.vo.beans;

public class SessionListVoBean extends ims.vo.ValueObjectBean
{
	public SessionListVoBean()
	{
	}
	public SessionListVoBean(ims.scheduling.vo.SessionListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.location = vo.getLocation() == null ? null : (ims.core.vo.beans.LocationListVoBean)vo.getLocation().getBean();
		this.bookingrights = vo.getBookingRights() == null ? null : vo.getBookingRights().getBeanCollection();
		this.description = vo.getDescription();
		this.isfixed = vo.getIsFixed();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.SessionListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.location = vo.getLocation() == null ? null : (ims.core.vo.beans.LocationListVoBean)vo.getLocation().getBean(map);
		this.bookingrights = vo.getBookingRights() == null ? null : vo.getBookingRights().getBeanCollection();
		this.description = vo.getDescription();
		this.isfixed = vo.getIsFixed();
	}

	public ims.scheduling.vo.SessionListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.SessionListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.SessionListVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.SessionListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.SessionListVo();
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
	public String getName()
	{
		return this.name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public ims.core.vo.beans.LocationListVoBean getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.core.vo.beans.LocationListVoBean value)
	{
		this.location = value;
	}
	public ims.scheduling.vo.beans.Session_BookingRightVoBean[] getBookingRights()
	{
		return this.bookingrights;
	}
	public void setBookingRights(ims.scheduling.vo.beans.Session_BookingRightVoBean[] value)
	{
		this.bookingrights = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}
	public Boolean getIsFixed()
	{
		return this.isfixed;
	}
	public void setIsFixed(Boolean value)
	{
		this.isfixed = value;
	}

	private Integer id;
	private int version;
	private String name;
	private ims.core.vo.beans.LocationListVoBean location;
	private ims.scheduling.vo.beans.Session_BookingRightVoBean[] bookingrights;
	private String description;
	private Boolean isfixed;
}