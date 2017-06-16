/**
 *
 */
package net.sitsol.hpmaker.beans.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.sitsol.hpmaker.consts.AppConfig;

/**
 * ヘッダー用ビーン
 * @author shibano
 */
public abstract class BaseBean implements Serializable {

	private static final long serialVersionUID = 8024143758308807427L;

	public class MenuItem {
		private String link = null;
		private String name = null;

		public MenuItem(String link, String name) {
			this.link = link;
			this.name = name;
		}

		public String getLink() {
			return link;
		}

		public String getName() {
			return name;
		}

	}

	private String title		= "柴野ＩＴソリューション";
	private String baseCssPath	= AppConfig.BASE_URL + "css/base.css?20170617";
	private int contentsWidthSize = AppConfig.CONTENTS_WIDTH_SIZE;
	private String headSubImageLink = AppConfig.IMAGE_URL + "logo_sub.gif";
	private String headImageLink = AppConfig.IMAGE_URL + "logo_main.gif";
	private String headFooterImageLink = AppConfig.IMAGE_URL + "logo_footer.gif";
	private String indexLink = AppConfig.BASE_URL;
	private String headImageText = "柴野ＩＴソリューション";
	private List<MenuItem> menuList = new ArrayList<MenuItem>();
	private String menuBackImageLink = AppConfig.IMAGE_URL + "menu_pre.gif";

	public BaseBean() {
		menuList.add(new MenuItem(AppConfig.BASE_URL + "gaiyo/gaiyo_index.html", "事務所概要"));
		menuList.add(new MenuItem(AppConfig.BASE_URL + "keireki/keireki_index.html", "業務経歴"));
		menuList.add(new MenuItem(AppConfig.BASE_URL + "contact/contact_index.html", "お問い合わせ"));
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeadImageLink() {
		return headImageLink;
	}

	public void setHeadImageLink(String headImageLink) {
		this.headImageLink = headImageLink;
	}

	public String getHeadImageText() {
		return headImageText;
	}

	public void setHeadImageText(String headImageText) {
		this.headImageText = headImageText;
	}

	public List<MenuItem> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuItem> menuList) {
		this.menuList = menuList;
	}

	public String getHeadSubImageLink() {
		return headSubImageLink;
	}

	public void setHeadSubImageLink(String headSubImageLink) {
		this.headSubImageLink = headSubImageLink;
	}

	public String getHeadFooterImageLink() {
		return headFooterImageLink;
	}

	public void setHeadFooterImageLink(String headFooterImageLink) {
		this.headFooterImageLink = headFooterImageLink;
	}

	public String getIndexLink() {
		return indexLink;
	}

	public void setIndexLink(String indexLink) {
		this.indexLink = indexLink;
	}

	public String getMenuBackImageLink() {
		return menuBackImageLink;
	}

	public void setMenuBackImageLink(String menuBackImageLink) {
		this.menuBackImageLink = menuBackImageLink;
	}

	public String getBaseCssPath() {
		return baseCssPath;
	}

	public void setBaseCssPath(String baseCssPath) {
		this.baseCssPath = baseCssPath;
	}

	public int getContentsWidthSize() {
		return contentsWidthSize;
	}

	public void setContentsWidthSize(int contentsWidthSize) {
		this.contentsWidthSize = contentsWidthSize;
	}

}
