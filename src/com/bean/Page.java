package com.bean;

public class Page {
	private Integer totalcount;//������
	private Integer pagecount;//ÿҳ��ʾ������
	private Integer totalpage;//��ҳ��
	private Integer dpage;//��ǰ��ʾ��ҳ����
	public Integer getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}
	public Integer getPagecount() {
		return pagecount;
	}
	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}
	public Integer getTotalpage() {
		return totalpage;
	}
	public void setTotalpage() {
		if(totalcount%pagecount==0) {
		this.totalpage = totalcount/pagecount;
		}else {
			this.totalpage = totalcount/pagecount+1;
		}
	}
	public Integer getDpage() {
		return dpage;
	}
	public void setDpage(Integer dpage) {
		this.dpage = dpage;
	}
	
}
