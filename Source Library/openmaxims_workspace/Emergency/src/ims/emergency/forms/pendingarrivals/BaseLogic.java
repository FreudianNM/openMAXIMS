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

package ims.emergency.forms.pendingarrivals;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.emergency.domain.PendingArrivals.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.emergency.domain.PendingArrivals domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbSourceOfReferralValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSourceOfReferral().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.ReferredBy existingInstance = (ims.emergency.vo.lookups.ReferredBy)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSourceOfReferralLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.emergency.vo.lookups.ReferredBy)
		{
			ims.emergency.vo.lookups.ReferredBy instance = (ims.emergency.vo.lookups.ReferredBy)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSourceOfReferralLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.emergency.vo.lookups.ReferredBy existingInstance = (ims.emergency.vo.lookups.ReferredBy)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSourceOfReferral().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSourceOfReferralLookup()
	{
		this.form.cmbSourceOfReferral().clear();
		ims.emergency.vo.lookups.ReferredByCollection lookupCollection = ims.emergency.vo.lookups.LookupHelper.getReferredBy(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSourceOfReferral().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSourceOfReferralLookupValue(int id)
	{
		ims.emergency.vo.lookups.ReferredBy instance = ims.emergency.vo.lookups.LookupHelper.getReferredByInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSourceOfReferral().setValue(instance);
	}
	protected final void defaultcmbSourceOfReferralLookupValue()
	{
		this.form.cmbSourceOfReferral().setValue((ims.emergency.vo.lookups.ReferredBy)domain.getLookupService().getDefaultInstance(ims.emergency.vo.lookups.ReferredBy.class, engine.getFormName().getID(), ims.emergency.vo.lookups.ReferredBy.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.emergency.domain.PendingArrivals domain;
}