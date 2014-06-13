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

package ims.assessment.vo.beans;

public class Answer_DetailsVoBean extends ims.vo.ValueObjectBean
{
	public Answer_DetailsVoBean()
	{
	}
	public Answer_DetailsVoBean(ims.assessment.vo.Answer_DetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.answertype = vo.getAnswerType() == null ? null : (ims.assessment.vo.beans.Question_AnswerTypeVoBean)vo.getAnswerType().getBean();
		this.answerwidth = vo.getAnswerWidth();
		this.maxmultiselectallowed = vo.getMaxMultiselectAllowed();
		this.multiselectanswers = vo.getMultiSelectAnswers() == null ? null : vo.getMultiSelectAnswers().getBeanCollection();
		this.boolvalueanswer = vo.getBoolValueAnswer();
		this.picklist = vo.getPicklist() == null ? null : (ims.assessment.vo.beans.Answer_OptionVoBean)vo.getPicklist().getBean();
		this.calculatedscore = vo.getCalculatedScore();
		this.dateanswer = vo.getDateAnswer() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateAnswer().getBean();
		this.timeanswer = vo.getTimeAnswer() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeAnswer().getBean();
		this.stringanswer = vo.getStringAnswer();
		this.integeranswer = vo.getIntegerAnswer();
		this.decimalanswer = vo.getDecimalAnswer();
		this.partialdate = vo.getPartialDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getPartialDate().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.Answer_DetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.answertype = vo.getAnswerType() == null ? null : (ims.assessment.vo.beans.Question_AnswerTypeVoBean)vo.getAnswerType().getBean(map);
		this.answerwidth = vo.getAnswerWidth();
		this.maxmultiselectallowed = vo.getMaxMultiselectAllowed();
		this.multiselectanswers = vo.getMultiSelectAnswers() == null ? null : vo.getMultiSelectAnswers().getBeanCollection();
		this.boolvalueanswer = vo.getBoolValueAnswer();
		this.picklist = vo.getPicklist() == null ? null : (ims.assessment.vo.beans.Answer_OptionVoBean)vo.getPicklist().getBean(map);
		this.calculatedscore = vo.getCalculatedScore();
		this.dateanswer = vo.getDateAnswer() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateAnswer().getBean();
		this.timeanswer = vo.getTimeAnswer() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeAnswer().getBean();
		this.stringanswer = vo.getStringAnswer();
		this.integeranswer = vo.getIntegerAnswer();
		this.decimalanswer = vo.getDecimalAnswer();
		this.partialdate = vo.getPartialDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getPartialDate().getBean();
	}

	public ims.assessment.vo.Answer_DetailsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.assessment.vo.Answer_DetailsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.Answer_DetailsVo vo = null;
		if(map != null)
			vo = (ims.assessment.vo.Answer_DetailsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.assessment.vo.Answer_DetailsVo();
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
	public ims.assessment.vo.beans.Question_AnswerTypeVoBean getAnswerType()
	{
		return this.answertype;
	}
	public void setAnswerType(ims.assessment.vo.beans.Question_AnswerTypeVoBean value)
	{
		this.answertype = value;
	}
	public Integer getAnswerWidth()
	{
		return this.answerwidth;
	}
	public void setAnswerWidth(Integer value)
	{
		this.answerwidth = value;
	}
	public Integer getMaxMultiselectAllowed()
	{
		return this.maxmultiselectallowed;
	}
	public void setMaxMultiselectAllowed(Integer value)
	{
		this.maxmultiselectallowed = value;
	}
	public ims.assessment.vo.beans.Answer_OptionVoBean[] getMultiSelectAnswers()
	{
		return this.multiselectanswers;
	}
	public void setMultiSelectAnswers(ims.assessment.vo.beans.Answer_OptionVoBean[] value)
	{
		this.multiselectanswers = value;
	}
	public Boolean getBoolValueAnswer()
	{
		return this.boolvalueanswer;
	}
	public void setBoolValueAnswer(Boolean value)
	{
		this.boolvalueanswer = value;
	}
	public ims.assessment.vo.beans.Answer_OptionVoBean getPicklist()
	{
		return this.picklist;
	}
	public void setPicklist(ims.assessment.vo.beans.Answer_OptionVoBean value)
	{
		this.picklist = value;
	}
	public Float getCalculatedScore()
	{
		return this.calculatedscore;
	}
	public void setCalculatedScore(Float value)
	{
		this.calculatedscore = value;
	}
	public ims.framework.utils.beans.DateBean getDateAnswer()
	{
		return this.dateanswer;
	}
	public void setDateAnswer(ims.framework.utils.beans.DateBean value)
	{
		this.dateanswer = value;
	}
	public ims.framework.utils.beans.TimeBean getTimeAnswer()
	{
		return this.timeanswer;
	}
	public void setTimeAnswer(ims.framework.utils.beans.TimeBean value)
	{
		this.timeanswer = value;
	}
	public String getStringAnswer()
	{
		return this.stringanswer;
	}
	public void setStringAnswer(String value)
	{
		this.stringanswer = value;
	}
	public Integer getIntegerAnswer()
	{
		return this.integeranswer;
	}
	public void setIntegerAnswer(Integer value)
	{
		this.integeranswer = value;
	}
	public Float getDecimalAnswer()
	{
		return this.decimalanswer;
	}
	public void setDecimalAnswer(Float value)
	{
		this.decimalanswer = value;
	}
	public ims.framework.utils.beans.PartialDateBean getPartialDate()
	{
		return this.partialdate;
	}
	public void setPartialDate(ims.framework.utils.beans.PartialDateBean value)
	{
		this.partialdate = value;
	}

	private Integer id;
	private int version;
	private ims.assessment.vo.beans.Question_AnswerTypeVoBean answertype;
	private Integer answerwidth;
	private Integer maxmultiselectallowed;
	private ims.assessment.vo.beans.Answer_OptionVoBean[] multiselectanswers;
	private Boolean boolvalueanswer;
	private ims.assessment.vo.beans.Answer_OptionVoBean picklist;
	private Float calculatedscore;
	private ims.framework.utils.beans.DateBean dateanswer;
	private ims.framework.utils.beans.TimeBean timeanswer;
	private String stringanswer;
	private Integer integeranswer;
	private Float decimalanswer;
	private ims.framework.utils.beans.PartialDateBean partialdate;
}