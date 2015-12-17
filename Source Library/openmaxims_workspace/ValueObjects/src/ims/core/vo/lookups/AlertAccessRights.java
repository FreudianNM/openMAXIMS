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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class AlertAccessRights extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public AlertAccessRights()
	{
		super();
	}
	public AlertAccessRights(int id)
	{
		super(id, "", true);
	}
	public AlertAccessRights(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public AlertAccessRights(int id, String text, boolean active, AlertAccessRights parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public AlertAccessRights(int id, String text, boolean active, AlertAccessRights parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public AlertAccessRights(int id, String text, boolean active, AlertAccessRights parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static AlertAccessRights buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new AlertAccessRights(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (AlertAccessRights)super.getParentInstance();
	}
	public AlertAccessRights getParent()
	{
		return (AlertAccessRights)super.getParentInstance();
	}
	public void setParent(AlertAccessRights parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		AlertAccessRights[] typedChildren = new AlertAccessRights[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (AlertAccessRights)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof AlertAccessRights)
		{
			super.addChild((AlertAccessRights)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof AlertAccessRights)
		{
			super.removeChild((AlertAccessRights)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		AlertAccessRightsCollection result = new AlertAccessRightsCollection();
		result.add(NO_ACCESS);
		result.add(READ_ONLY);
		result.add(READ_WRITE);
		return result;
	}
	public static AlertAccessRights[] getNegativeInstances()
	{
		AlertAccessRights[] instances = new AlertAccessRights[3];
		instances[0] = NO_ACCESS;
		instances[1] = READ_ONLY;
		instances[2] = READ_WRITE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "NO_ACCESS";
		negativeInstances[1] = "READ_ONLY";
		negativeInstances[2] = "READ_WRITE";
		return negativeInstances;
	}
	public static AlertAccessRights getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static AlertAccessRights getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		AlertAccessRights[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1021320;
	public static final AlertAccessRights NO_ACCESS = new AlertAccessRights(-2971, "No Access", true, null, null, Color.Default);
	public static final AlertAccessRights READ_ONLY = new AlertAccessRights(-2972, "R/O", true, null, null, Color.Default);
	public static final AlertAccessRights READ_WRITE = new AlertAccessRights(-2973, "R/W", true, null, null, Color.Default);
}