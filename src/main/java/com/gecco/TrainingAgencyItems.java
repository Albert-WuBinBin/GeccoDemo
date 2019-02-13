package com.gecco;

import java.util.List;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

public class TrainingAgencyItems implements HtmlBean{

	private static final long serialVersionUID = 1L;

	@HtmlField(cssPath="a.sellername")
	private List<TrainingAgency> trainingAgencys;

	public List<TrainingAgency> getTrainingAgencys() {
		return trainingAgencys;
	}

	public void setTrainingAgencys(List<TrainingAgency> trainingAgencys) {
		this.trainingAgencys = trainingAgencys;
	}

}
