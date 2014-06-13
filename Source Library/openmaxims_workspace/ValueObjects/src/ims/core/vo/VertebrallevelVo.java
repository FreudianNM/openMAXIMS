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

package ims.core.vo;

/**
 * Linked to core.clinical.VertebralLevels business object (ID: 1003100020).
 */
public class VertebrallevelVo extends ims.core.clinical.vo.VertebralLevelsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public VertebrallevelVo()
	{
	}
	public VertebrallevelVo(Integer id, int version)
	{
		super(id, version);
	}
	public VertebrallevelVo(ims.core.vo.beans.VertebrallevelVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.isllasiascore = bean.getIsLLAsiaScore();
		this.isulasiascore = bean.getIsULAsiaScore();
		this.isactive = bean.getIsActive();
		this.orderno = bean.getOrderNo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.VertebrallevelVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.description = bean.getDescription();
		this.isllasiascore = bean.getIsLLAsiaScore();
		this.isulasiascore = bean.getIsULAsiaScore();
		this.isactive = bean.getIsActive();
		this.orderno = bean.getOrderNo();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.VertebrallevelVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.VertebrallevelVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.VertebrallevelVoBean();
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
		if(fieldName.equals("NAME"))
			return getName();
		if(fieldName.equals("DESCRIPTION"))
			return getDescription();
		if(fieldName.equals("ISLLASIASCORE"))
			return getIsLLAsiaScore();
		if(fieldName.equals("ISULASIASCORE"))
			return getIsULAsiaScore();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("ORDERNO"))
			return getOrderNo();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNameIsNotNull()
	{
		return this.name != null;
	}
	public String getName()
	{
		return this.name;
	}
	public static int getNameMaxLength()
	{
		return 100;
	}
	public void setName(String value)
	{
		this.isValidated = false;
		this.name = value;
	}
	public boolean getDescriptionIsNotNull()
	{
		return this.description != null;
	}
	public String getDescription()
	{
		return this.description;
	}
	public static int getDescriptionMaxLength()
	{
		return 100;
	}
	public void setDescription(String value)
	{
		this.isValidated = false;
		this.description = value;
	}
	public boolean getIsLLAsiaScoreIsNotNull()
	{
		return this.isllasiascore != null;
	}
	public Boolean getIsLLAsiaScore()
	{
		return this.isllasiascore;
	}
	public void setIsLLAsiaScore(Boolean value)
	{
		this.isValidated = false;
		this.isllasiascore = value;
	}
	public boolean getIsULAsiaScoreIsNotNull()
	{
		return this.isulasiascore != null;
	}
	public Boolean getIsULAsiaScore()
	{
		return this.isulasiascore;
	}
	public void setIsULAsiaScore(Boolean value)
	{
		this.isValidated = false;
		this.isulasiascore = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public boolean getOrderNoIsNotNull()
	{
		return this.orderno != null;
	}
	public Integer getOrderNo()
	{
		return this.orderno;
	}
	public void setOrderNo(Integer value)
	{
		this.isValidated = false;
		this.orderno = value;
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
		if(this.name != null)
			if(this.name.length() > 100)
				listOfErrors.add("The length of the field [name] in the value object [ims.core.vo.VertebrallevelVo] is too big. It should be less or equal to 100");
		if(this.description != null)
			if(this.description.length() > 100)
				listOfErrors.add("The length of the field [description] in the value object [ims.core.vo.VertebrallevelVo] is too big. It should be less or equal to 100");
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
	
		VertebrallevelVo clone = new VertebrallevelVo(this.id, this.version);
		
		clone.name = this.name;
		clone.description = this.description;
		clone.isllasiascore = this.isllasiascore;
		clone.isulasiascore = this.isulasiascore;
		clone.isactive = this.isactive;
		clone.orderno = this.orderno;
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
		if (!(VertebrallevelVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A VertebrallevelVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		VertebrallevelVo compareObj = (VertebrallevelVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getOrderNo() == null && compareObj.getOrderNo() != null)
				return -1;
			if(this.getOrderNo() != null && compareObj.getOrderNo() == null)
				return 1;
			if(this.getOrderNo() != null && compareObj.getOrderNo() != null)
				retVal = this.getOrderNo().compareTo(compareObj.getOrderNo());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.name != null)
			count++;
		if(this.description != null)
			count++;
		if(this.isllasiascore != null)
			count++;
		if(this.isulasiascore != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.orderno != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected String name;
	protected String description;
	protected Boolean isllasiascore;
	protected Boolean isulasiascore;
	protected Boolean isactive;
	protected Integer orderno;
	private boolean isValidated = false;
	private boolean isBusy = false;
}