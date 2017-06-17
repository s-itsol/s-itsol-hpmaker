/**
 *
 */
package net.sitsol.hpmaker.beans;

import java.util.ArrayList;
import java.util.List;

import net.sitsol.hpmaker.beans.common.BaseBean;

/**
 * index用ビーン
 * @author shibano
 */
public class IndexBean extends BaseBean {

	private static final long serialVersionUID = -749876341578751051L;

	public class WhatNewItem {
		private String date = null;
		private String text = null;

		public WhatNewItem(String date, String text) {
			this.date = date;
			this.text= text;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

	}

	private String keywords	= "柴野ＩＴソリューション,柴野ITソリューション,柴野ＩＴ,柴野IT,s-itsol,柴野,しばのＩＴソリューション,しばのITソリューション,しばのＩＴ,しばのIT,柴野it-sol,ITアーキテクト,ITエンジニア,JAVA,人材派遣,フリーランス";
	private String contStatus	= " 現在、業務委託契約中。契約更新時期は2017年9月末です。 ";
	private List<WhatNewItem> whatNewList = new ArrayList<WhatNewItem>();

	public IndexBean() {
		this.whatNewList.add(new WhatNewItem("2017.03.01", "代表作の一つであるECサイトが、サービス開始から10周年を経過"));
		this.whatNewList.add(new WhatNewItem("2008.08.21", "「s-itsol.net」にドメイン名を変更"));
		this.whatNewList.add(new WhatNewItem("2008.02.01", "ホームページデザインリニューアル"));
		this.whatNewList.add(new WhatNewItem("2005.04.01", "「柴野ＩＴソリューション」開業"));
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getContStatus() {
		return contStatus;
	}

	public void setContStatus(String contStatus) {
		this.contStatus = contStatus;
	}

	public List<WhatNewItem> getWhatNewList() {
		return whatNewList;
	}

	public void setWhatNewList(List<WhatNewItem> whatNewList) {
		this.whatNewList = whatNewList;
	}


}
