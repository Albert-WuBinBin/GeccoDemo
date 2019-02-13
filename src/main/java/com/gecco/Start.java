package com.gecco;

import com.geccocrawler.gecco.GeccoEngine;

public class Start {

	public static void main(String[] args) {
		GeccoEngine.create()
				// Gecco搜索的包路径
				.classpath("com.gecco")
				// 开始抓取的页面地址
				.start("https://hz.58.com/xihuqu/huangyezonghe/pn1/?key=%E5%90%89%E4%BB%96%E5%9F%B9%E8%AE%AD")
				// 开启几个爬虫线程
				.thread(10)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000).run();
	}
}
