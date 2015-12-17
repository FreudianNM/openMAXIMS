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

package ims.ntpf.vo;

/**
 * Linked to NTPF.Exchequer.ExchequerMapping business object (ID: 1078100000).
 */
public class ExchequerMappingVo extends ims.ntpf.exchequer.vo.ExchequerMappingRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ExchequerMappingVo()
	{
	}
	public ExchequerMappingVo(Integer id, int version)
	{
		super(id, version);
	}
	public ExchequerMappingVo(ims.ntpf.vo.beans.ExchequerMappingVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.datetype = bean.getDateType() == null ? null : ims.ntpf.vo.lookups.AccountingType.buildLookup(bean.getDateType());
		this.yearmonth = bean.getYearMonth();
		this.exchequermapping = bean.getExchequerMapping();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ntpf.vo.beans.ExchequerMappingVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.datetype = bean.getDateType() == null ? null : ims.ntpf.vo.lookups.AccountingType.buildLookup(bean.getDateType());
		this.yearmonth = bean.getYearMonth();
		this.exchequermapping = bean.getExchequerMapping();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ntpf.vo.beans.ExchequerMappingVoBean bean = null;
		if(map != null)
			bean = (ims.ntpf.vo.beans.ExchequerMappingVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ntpf.vo.beans.ExchequerMappingVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("DATETYPE"))
			return getDateType();
		if(fieldName.equals("YEARMONTH"))
			return getYearMonth();
		if(fieldName.equals("EXCHEQUERMAPPING"))
			return getExchequerMapping();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDateTypeIsNotNull()
	{
		return this.datetype != null;
	}
	public ims.ntpf.vo.lookups.AccountingType getDateType()
	{
		return this.datetype;
	}
	public void setDateType(ims.ntpf.vo.lookups.AccountingType value)
	{
		this.isValidated = false;
		this.datetype = value;
	}
	public boolean getYearMonthIsNotNull()
	{
		return this.yearmonth != null;
	}
	public Integer getYearMonth()
	{
		return this.yearmonth;
	}
	public void setYearMonth(Integer value)
	{
		this.isValidated = false;
		this.yearmonth = value;
	}
	public boolean getExchequerMappingIsNotNull()
	{
		return this.exchequermapping != null;
	}
	public String getExchequerMapping()
	{
		return this.exchequermapping;
	}
	public static int getExchequerMappingMaxLength()
	{
		return 255;
	}
	public void setExchequerMapping(String value)
	{
		this.isValidated = false;
		this.exchequermapping = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		ExchequerMappingVo clone = new ExchequerMappingVo(this.id, this.version);
		
		if(this.datetype == null)
			clone.datetype = null;
		else
			clone.datetype = (ims.ntpf.vo.lookups.AccountingType)this.datetype.clone();
		clone.yearmonth = this.yearmonth;
		clone.exchequermapping = this.exchequermapping;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(ExchequerMappingVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ExchequerMappingVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ExchequerMappingVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ExchequerMappingVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.datetype != null)
			count++;
		if(this.yearmonth != null)
			count++;
		if(this.exchequermapping != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.ntpf.vo.lookups.AccountingType datetype;
	protected Integer yearmonth;
	protected String exchequermapping;
	private boolean isValidated = false;
	private boolean isBusy = false;
}