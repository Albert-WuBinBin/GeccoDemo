package com.gecco;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class TrainingAgency implements HtmlBean{

	private static final long serialVersionUID = 1L;

	@Text
	@HtmlField(cssPath = "a")
	private String title;

	@Attr("href")
	@HtmlField(cssPath = "a")
	private String href;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	@Override
	public String toString() {
		return "TrainingAgency [title=" + title + ", href=" + href + "]";
	}
}
