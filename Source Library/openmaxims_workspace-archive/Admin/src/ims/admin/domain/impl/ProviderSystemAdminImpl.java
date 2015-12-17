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
// This code was generated by Michael Noonan using IMS Development Environment (version 1.53 build 2511.27271)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import ims.domain.DomainFactory;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.core.admin.domain.objects.ProviderSystem;
import ims.admin.domain.base.impl.BaseProviderSystemAdminImpl;
import ims.ocrr.vo.ProviderSystemLiteVoCollection;
import ims.ocrr.vo.domain.ProviderSystemLiteVoAssembler;
import ims.ocrr.vo.domain.ProviderSystemVoAssembler;

public class ProviderSystemAdminImpl extends BaseProviderSystemAdminImpl
{

	private static final long serialVersionUID = 1L;

	public ims.ocrr.vo.ProviderSystemVoCollection listProviderSystems()
	{
		DomainFactory factory = getDomainFactory();
		return ProviderSystemVoAssembler.createProviderSystemVoCollectionFromProviderSystem(factory.listDomainObjects(ProviderSystem.class)).sort();
	}
	
	public ProviderSystemLiteVoCollection listProviderSystemLites()
	{
		DomainFactory factory = getDomainFactory();
		return ProviderSystemLiteVoAssembler.createProviderSystemLiteVoCollectionFromProviderSystem(factory.listDomainObjects(ProviderSystem.class)).sort();
	}

	
	public ims.ocrr.vo.ProviderSystemVo saveProviderSystem(ims.ocrr.vo.ProviderSystemVo voProviderSystem) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if(voProviderSystem == null)
			throw new RuntimeException("Cannot save null value for ProviderSystemVo");
		if(!voProviderSystem.isValidated())
		{
			throw new CodingRuntimeException("Provider System Value Object has not been validated");
		}
		DomainFactory factory = getDomainFactory();
		ProviderSystem doProviderSystem = ProviderSystemVoAssembler.extractProviderSystem(factory, voProviderSystem);			
		try
		{
			factory.save(doProviderSystem);
		}
		catch(UnqViolationUncheckedException e)
		{
			throw new ims.domain.exceptions.UniqueKeyViolationException("A System called " + (voProviderSystem.getSystemNameIsNotNull()?voProviderSystem.getSystemName():"") + "or an HL7 Application called " + (voProviderSystem.getHl7ApplicationIsNotNull()?voProviderSystem.getHl7Application():"") + " already exists. Duplicates not allowed.", e);
		}
		return ProviderSystemVoAssembler.create(doProviderSystem);
	}


}