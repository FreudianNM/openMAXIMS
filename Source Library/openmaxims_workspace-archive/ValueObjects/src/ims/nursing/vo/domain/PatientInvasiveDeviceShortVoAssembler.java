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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class PatientInvasiveDeviceShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceShortVo copy(ims.nursing.vo.PatientInvasiveDeviceShortVo valueObjectDest, ims.nursing.vo.PatientInvasiveDeviceShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientInvasiveDevice(valueObjectSrc.getID_PatientInvasiveDevice());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// InvasiveDevice
		valueObjectDest.setInvasiveDevice(valueObjectSrc.getInvasiveDevice());
		// InsertedDateTime
		valueObjectDest.setInsertedDateTime(valueObjectSrc.getInsertedDateTime());
		// InsertedHCP
		valueObjectDest.setInsertedHCP(valueObjectSrc.getInsertedHCP());
		// VIPScore
		valueObjectDest.setVIPScore(valueObjectSrc.getVIPScore());
		// RemovalDateTime
		valueObjectDest.setRemovalDateTime(valueObjectSrc.getRemovalDateTime());
		// RemovalHCP
		valueObjectDest.setRemovalHCP(valueObjectSrc.getRemovalHCP());
		// TargetRemovalDateTime
		valueObjectDest.setTargetRemovalDateTime(valueObjectSrc.getTargetRemovalDateTime());
		// Site
		valueObjectDest.setSite(valueObjectSrc.getSite());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientInvasiveDeviceShortVoCollectionFromPatientInvasiveDevice(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceShortVoCollection createPatientInvasiveDeviceShortVoCollectionFromPatientInvasiveDevice(java.util.Set domainObjectSet)	
	{
		return createPatientInvasiveDeviceShortVoCollectionFromPatientInvasiveDevice(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceShortVoCollection createPatientInvasiveDeviceShortVoCollectionFromPatientInvasiveDevice(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PatientInvasiveDeviceShortVoCollection voList = new ims.nursing.vo.PatientInvasiveDeviceShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = (ims.clinical.domain.objects.PatientInvasiveDevice) iterator.next();
			ims.nursing.vo.PatientInvasiveDeviceShortVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceShortVoCollection createPatientInvasiveDeviceShortVoCollectionFromPatientInvasiveDevice(java.util.List domainObjectList) 
	{
		return createPatientInvasiveDeviceShortVoCollectionFromPatientInvasiveDevice(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientInvasiveDevice objects.
	 */
	public static ims.nursing.vo.PatientInvasiveDeviceShortVoCollection createPatientInvasiveDeviceShortVoCollectionFromPatientInvasiveDevice(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PatientInvasiveDeviceShortVoCollection voList = new ims.nursing.vo.PatientInvasiveDeviceShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = (ims.clinical.domain.objects.PatientInvasiveDevice) domainObjectList.get(i);
			ims.nursing.vo.PatientInvasiveDeviceShortVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.clinical.domain.objects.PatientInvasiveDevice set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientInvasiveDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceShortVoCollection voCollection) 
	 {
	 	return extractPatientInvasiveDeviceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientInvasiveDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PatientInvasiveDeviceShortVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = PatientInvasiveDeviceShortVoAssembler.extractPatientInvasiveDevice(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.clinical.domain.objects.PatientInvasiveDevice list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientInvasiveDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceShortVoCollection voCollection) 
	 {
	 	return extractPatientInvasiveDeviceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientInvasiveDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PatientInvasiveDeviceShortVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientInvasiveDevice domainObject = PatientInvasiveDeviceShortVoAssembler.extractPatientInvasiveDevice(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientInvasiveDevice object.
	 * @param domainObject ims.clinical.domain.objects.PatientInvasiveDevice
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceShortVo create(ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientInvasiveDevice object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PatientInvasiveDeviceShortVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PatientInvasiveDeviceShortVo valueObject = (ims.nursing.vo.PatientInvasiveDeviceShortVo) map.getValueObject(domainObject, ims.nursing.vo.PatientInvasiveDeviceShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PatientInvasiveDeviceShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientInvasiveDevice
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceShortVo insert(ims.nursing.vo.PatientInvasiveDeviceShortVo valueObject, ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientInvasiveDevice
	 */
	 public static ims.nursing.vo.PatientInvasiveDeviceShortVo insert(DomainObjectMap map, ims.nursing.vo.PatientInvasiveDeviceShortVo valueObject, ims.clinical.domain.objects.PatientInvasiveDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientInvasiveDevice(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// InvasiveDevice
		valueObject.setInvasiveDevice(ims.clinicaladmin.vo.domain.InvasiveDeviceConfigShortVoAssembler.create(map, domainObject.getInvasiveDevice()) );
		// InsertedDateTime
		java.util.Date InsertedDateTime = domainObject.getInsertedDateTime();
		if ( null != InsertedDateTime ) 
		{
			valueObject.setInsertedDateTime(new ims.framework.utils.DateTime(InsertedDateTime) );
		}
		// InsertedHCP
		valueObject.setInsertedHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getInsertedHCP()) );
		// VIPScore
		valueObject.setVIPScore(ims.nursing.vo.domain.PatientInvasiveDeviceVipVoAssembler.createPatientInvasiveDeviceVipVoCollectionFromVIPScore(map, domainObject.getVIPScore()) );
		// RemovalDateTime
		java.util.Date RemovalDateTime = domainObject.getRemovalDateTime();
		if ( null != RemovalDateTime ) 
		{
			valueObject.setRemovalDateTime(new ims.framework.utils.DateTime(RemovalDateTime) );
		}
		// RemovalHCP
		valueObject.setRemovalHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getRemovalHCP()) );
		// TargetRemovalDateTime
		java.util.Date TargetRemovalDateTime = domainObject.getTargetRemovalDateTime();
		if ( null != TargetRemovalDateTime ) 
		{
			valueObject.setTargetRemovalDateTime(new ims.framework.utils.DateTime(TargetRemovalDateTime) );
		}
		// Site
		valueObject.setSite(domainObject.getSite());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PatientInvasiveDevice extractPatientInvasiveDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceShortVo valueObject) 
	{
		return 	extractPatientInvasiveDevice(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientInvasiveDevice extractPatientInvasiveDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PatientInvasiveDeviceShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientInvasiveDevice();
		ims.clinical.domain.objects.PatientInvasiveDevice domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientInvasiveDevice)domMap.get(valueObject);
			}
			// ims.nursing.vo.PatientInvasiveDeviceShortVo ID_PatientInvasiveDevice field is unknown
			domainObject = new ims.clinical.domain.objects.PatientInvasiveDevice();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientInvasiveDevice());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientInvasiveDevice)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientInvasiveDevice) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientInvasiveDevice.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientInvasiveDevice());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.InvasiveDeviceConfig value1 = null;
		if ( null != valueObject.getInvasiveDevice() ) 
		{
			if (valueObject.getInvasiveDevice().getBoId() == null)
			{
				if (domMap.get(valueObject.getInvasiveDevice()) != null)
				{
					value1 = (ims.clinical.configuration.domain.objects.InvasiveDeviceConfig)domMap.get(valueObject.getInvasiveDevice());
				}
			}
			else
			{
				value1 = (ims.clinical.configuration.domain.objects.InvasiveDeviceConfig)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.InvasiveDeviceConfig.class, valueObject.getInvasiveDevice().getBoId());
			}
		}
		domainObject.setInvasiveDevice(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getInsertedDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setInsertedDateTime(value2);
		domainObject.setInsertedHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getInsertedHCP(), domMap));
		domainObject.setVIPScore(ims.nursing.vo.domain.PatientInvasiveDeviceVipVoAssembler.extractVIPScoreList(domainFactory, valueObject.getVIPScore(), domainObject.getVIPScore(), domMap));		
		ims.framework.utils.DateTime dateTime5 = valueObject.getRemovalDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setRemovalDateTime(value5);
		domainObject.setRemovalHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getRemovalHCP(), domMap));
		ims.framework.utils.DateTime dateTime7 = valueObject.getTargetRemovalDateTime();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setTargetRemovalDateTime(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSite() != null && valueObject.getSite().equals(""))
		{
			valueObject.setSite(null);
		}
		domainObject.setSite(valueObject.getSite());

		return domainObject;
	}

}