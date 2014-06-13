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

package ims.emergency.vo.beans;

public class WhiteBoardAssessmentConfigVoBean extends ims.vo.ValueObjectBean
{
	public WhiteBoardAssessmentConfigVoBean()
	{
	}
	public WhiteBoardAssessmentConfigVoBean(ims.emergency.vo.WhiteBoardAssessmentConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.icon = vo.getIcon() == null ? null : new ims.vo.RefVoBean(vo.getIcon().getBoId(), vo.getIcon().getBoVersion());
		this.maximsmappingvalue = vo.getMAXIMSMappingValue();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.WhiteBoardAssessmentConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.icon = vo.getIcon() == null ? null : new ims.vo.RefVoBean(vo.getIcon().getBoId(), vo.getIcon().getBoVersion());
		this.maximsmappingvalue = vo.getMAXIMSMappingValue();
	}

	public ims.emergency.vo.WhiteBoardAssessmentConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.WhiteBoardAssessmentConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.WhiteBoardAssessmentConfigVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.WhiteBoardAssessmentConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.WhiteBoardAssessmentConfigVo();
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
	public ims.vo.RefVoBean getIcon()
	{
		return this.icon;
	}
	public void setIcon(ims.vo.RefVoBean value)
	{
		this.icon = value;
	}
	public String getMAXIMSMappingValue()
	{
		return this.maximsmappingvalue;
	}
	public void setMAXIMSMappingValue(String value)
	{
		this.maximsmappingvalue = value;
	}

	private Integer id;
	private int version;
	private String name;
	private ims.vo.RefVoBean icon;
	private String maximsmappingvalue;
}