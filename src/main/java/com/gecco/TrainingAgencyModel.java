package com.gecco;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;


@Gecco(matchUrl = "https://hz.58.com/xihuqu/huangyezonghe/pn1/?key=%E5%90%89%E4%BB%96%E5%9F%B9%E8%AE%AD",
pipelines = "myPipeLines")
public class TrainingAgencyModel implements HtmlBean{

	private static final long serialVersionUID = 1L;
	
	@HtmlField(cssPath=".containnerWrap>#mainlist>#infolist > #jingzhun >tbody> .ac_item>.t>.tdiv>p.seller")
	List<TrainingAgencyItems> items;

	public List<TrainingAgencyItems> getItems() {
		return items;
	}

	public void setItems(List<TrainingAgencyItems> items) {
		this.items = items;
	}
}
