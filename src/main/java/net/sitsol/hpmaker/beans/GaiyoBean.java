/**
 *
 */
package net.sitsol.hpmaker.beans;

import java.util.ArrayList;
import java.util.List;

import net.sitsol.hpmaker.beans.common.BaseBean;

/**
 * gaiyo用ビーン
 * @author shibano
 */
public class GaiyoBean extends BaseBean {

	public class InfoItem {
		private String title = null;
		private String text = null;

		public InfoItem(String title, String text) {
			this.title = title;
			this.text= text;
		}

		public String getTitle() {
			return title;
		}

		public String getText() {
			return text;
		}

	}

	private List<InfoItem> infoList = new ArrayList<InfoItem>();

	public GaiyoBean() {
		this.infoList.add(new InfoItem("名称", "柴野ＩＴソリューション"));
		this.infoList.add(new InfoItem("所在地", "東京都新宿区  最寄駅「都営大江戸線 都庁前駅」"));
		this.infoList.add(new InfoItem("営業形態", "インディペンデント・コントラクター （独立契約者）"));
		this.infoList.add(new InfoItem("所員数", "1名"));
		this.infoList.add(new InfoItem("代表者", "柴野 玲"));
		this.infoList.add(new InfoItem("事業内容", "Web・オープン系システム開発の業務委託契約 ほか"));
	}

	public List<InfoItem> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<InfoItem> infoList) {
		this.infoList = infoList;
	}

}
