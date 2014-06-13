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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4785.23502)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.emergency.domain.impl;

import ims.core.admin.domain.objects.ChartRequested;
import ims.core.admin.vo.EmergencyAttendanceRefVo;
import ims.domain.DomainFactory;
import ims.emergency.domain.base.impl.BaseChartRequestedCcImpl;
import ims.emergency.helper.EmergencyHelper;
import ims.emergency.helper.IEmergencyHelper;
import ims.emergency.vo.AttendanceDetailsVo;
import ims.emergency.vo.ChartRequestedVo;
import ims.emergency.vo.domain.ChartRequestedVoAssembler;
import ims.framework.exceptions.CodingRuntimeException;

public class ChartRequestedCcImpl extends BaseChartRequestedCcImpl
{

	private static final long serialVersionUID = 1L;

	public ims.emergency.vo.ChartRequestedVo save(ims.emergency.vo.ChartRequestedVo chartRequestedToSave) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if (chartRequestedToSave == null )
		{
			throw new CodingRuntimeException("Cannot get ChartRequestedVo on null Id ");
		}

		DomainFactory factory = getDomainFactory();
		
		ChartRequested domainChartRequested = ChartRequestedVoAssembler.extractChartRequested(factory,chartRequestedToSave);
		factory.save(domainChartRequested);
		return ChartRequestedVoAssembler.create(domainChartRequested);
	}

	public ims.emergency.vo.ChartRequestedVo getChartRequested(ims.core.admin.vo.ChartRequestedRefVo chartRequestedRef)
	{
		IEmergencyHelper impl = (IEmergencyHelper)getDomainImpl(EmergencyHelper.class);
		return impl.getChartRequested(chartRequestedRef);
	}

	public ims.admin.vo.EDAttendanceControlsConfigVoCollection getEDAttendanceControlsConfig(ims.admin.vo.lookups.EDAttendenceControlType controlType)
	{
		IEmergencyHelper impl = (IEmergencyHelper)getDomainImpl(EmergencyHelper.class);
		return impl.getEDAttendanceControlsConfig(controlType);
	}

	public ChartRequestedVo getChartRequestedByEmergencyAttendance(EmergencyAttendanceRefVo emergencyAttendanceRef)
	{
		IEmergencyHelper impl = (IEmergencyHelper)getDomainImpl(EmergencyHelper.class);
		return impl.getChartRequestedByEmergencyAttendance(emergencyAttendanceRef);
	}

	public AttendanceDetailsVo getAttendanceDetails(EmergencyAttendanceRefVo attendanceDetailsRef)
	{
		IEmergencyHelper impl = (IEmergencyHelper)getDomainImpl(EmergencyHelper.class);
		return impl.getAttendanceDetails(attendanceDetailsRef);
	}
}