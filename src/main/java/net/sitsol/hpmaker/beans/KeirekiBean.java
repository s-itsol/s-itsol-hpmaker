/**
 *
 */
package net.sitsol.hpmaker.beans;

import java.util.ArrayList;
import java.util.List;

import net.sitsol.hpmaker.beans.common.BaseBean;
import net.sitsol.hpmaker.consts.AppConfig;

/**
 * keireki用ビーン
 * @author shibano
 */
public class KeirekiBean extends BaseBean {

	private static final long serialVersionUID = -1L;

	public class KeirekiItem {
		private String term = null;
		private String details = null;
		private String langs = null;
		private String machine = null;
		private String role = null;

		public KeirekiItem(String term, String details, String langs, String machine, String role) {
			this.term = term;
			this.details = details;
			this.langs = langs;
			this.machine = machine;
			this.role = role;
		}

		public String getTerm() {
			return term;
		}

		public void setTerm(String term) {
			this.term = term;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public String getLangs() {
			return langs;
		}

		public void setLangs(String langs) {
			this.langs = langs;
		}

		public String getMachine() {
			return machine;
		}

		public void setMachine(String machine) {
			this.machine = machine;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

	}

	private String excelKeirekiLink = AppConfig.BASE_URL + "keireki/keireki.xls";
	private List<KeirekiItem> keirekiList = new ArrayList<KeirekiItem>();

	public KeirekiBean() {
		super();
		
		this.keirekiList.add(
				new KeirekiItem(
						"1999/05～2002/05"
						, "通信業(固定電話) 料金計算業務ｼｽﾃﾑの開発" + "<br />"
							+ "・通話情報の一括修正機能" + "<br />"
							+ "・ﾏｽﾀﾒﾝﾃ画面＆ﾊﾞｯﾁ転送機能" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：1000台以上" + "<br />"
							+ "ｻｰﾊﾞ：10～20台" + "<br />"
							+ "ﾒﾝﾊﾞｰ：4～7名" + "<br />"
							+ "担当機能の概要設計～総合試験の実施およびﾕｰｻﾞ担当者殿への説明。" + "<br />"
						, "HOLON" + "<br />"
							+ "TUXEDO" + "<br />"
							+ "ORACLE7.3" + "<br />"
							+ "TUXEDO" + "<br />"
						, "Windows95" + "<br />"
							+ "HP-UX" + "<br />"
						, "3,4,5,6,7" + "<br />"
							+ "M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2002/06～2003/03"
						, "報道用文字発生ｼｽﾃﾑの開発" + "<br />"
							+ "・選挙WEBﾍﾟｰｼﾞ製作ｼｽﾃﾑ" + "<br />"
							+ "・携帯ﾒｰﾙ通知ｼｽﾃﾑ" + "<br />"
							+ "・その他各種ｼｽﾃﾑ(保守) など" + "<br />"
							+ "PC：2～10台" + "<br />"
							+ "ﾒﾝﾊﾞｰ：2～4名" + "<br />"
							+ "複数の小規模ｼｽﾃﾑの設計～ﾃｽﾄ。ﾕｰｻﾞとの折衝まではなし。" + "<br />"
						, "VisualC++" + "<br />"
							+ "MFC" + "<br />"
							+ "ADO" + "<br />"
							+ "Access2000" + "<br />"
						, "WindowsNT" + "<br />"
							+ "Windows2000" + "<br />"
						, "3,4,5" + "<br />"
							+ "M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2003/04～2003/11"
						, "通信業(移動体) 契約情報登録ｼｽﾃﾑの開発" + "<br />"
							+ "・登録内容総合ﾁｪｯｸ機能" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：300台" + "<br />"
							+ "ｻｰﾊﾞ：3～8台" + "<br />"
							+ "ﾕﾆｯﾄﾘｰﾀﾞｰとして新ｻｰﾋﾞｽ対応の要件分析～ﾕｰｻﾞの総合試験支援、および本番運用までの全工程に関わる。" + "<br />"
						, "C" + "<br />"
							+ "Pro*C" + "<br />"
							+ "ORACLE8.1" + "<br />"
						, "Windows2000" + "<br />"
							+ "Soralis8" + "<br />"
						, "1,2,3,4,5,6" + "<br />"
							+ "L" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2003/12～2004/02"
						, "通信業(ISP) 契約情報管理ｼｽﾃﾑの開発" + "<br />"
							+ "・結合以降の試験推進・実施" + "<br />"
							+ "・ｵﾝﾗｲﾝ更新画面" + "<br />"
							+ "・対外ｼｽﾃﾑ受信画面" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：1000台以上" + "<br />"
							+ "ｻｰﾊﾞ：10～15台" + "<br />"
							+ "試験実施ﾘｰﾀﾞｰとして結合工程以降の実施・推進に従事。ﾕｰｻﾞへの説明はなし。" + "<br />"
							+ "ｻｰﾋﾞｽIN後は、残障害の保守としてPG作業にも着手。" + "<br />"
						, "JAVA" + "<br />"
							+ "PL/SQL" + "<br />"
							+ "ORACLE8.1" + "<br />"
							+ "WebLogic8.1" + "<br />"
							+ "Apache" + "<br />"
							+ "Tomcat" + "<br />"
						, "Windows2000" + "<br />"
							+ "Soralis8" + "<br />"
						, "4,5,6,7" + "<br />"
							+ "L,M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2004/03～2004/11"
						, "会計ﾊﾟｯｹｰｼﾞｿﾌﾄの開発" + "<br />"
							+ "・請求締め、請求書発行、債権仕訳連携、債権残高、入金消込、外貨取引、帳票出力" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：100台以上" + "<br />"
							+ "ｻｰﾊﾞ：4～6台" + "<br />"
							+ "設計者として参加し、実装・ﾃｽﾄまでを担当。ﾊﾟｯｹｰｼﾞ開発のため、ﾕｰｻﾞ折衝なし。" + "<br />"
						, "VisualC#.NET" + "<br />"
							+ "ADO.NET" + "<br />"
							+ "Transact-SQL" + "<br />"
							+ "SQL Server2000" + "<br />"
							+ "SOAP" + "<br />"
							+ "CrossMission2" + "<br />"
							+ "SVF" + "<br />"
							+ "UML" + "<br />"
						, "WindowsXP" + "<br />"
						, "3,4,5" + "<br />"
							+ "M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2004/12～2005/04"
						, "販売管理SIｺﾝﾎﾟｰﾈﾝﾄの開発" + "<br />"
							+ "・ｻｰﾊﾞ側永続化ｺﾝﾎﾟｰﾈﾝﾄ設計・実装" + "<br />"
							+ "・代表ﾕｰｽｹｰｽ設計・実装" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：10～100台" + "<br />"
							+ "ｻｰﾊﾞ：4～6台" + "<br />"
							+ "初期立上ﾒﾝﾊﾞｰとして参加し、ﾄﾞﾒｲﾝ層の設計・実装を中心に、代表ﾕｰｽｹｰｽの設計・実装まで従事。ﾕｰｻﾞ折衝なし。" + "<br />"
						, "VisualC#.NET" + "<br />"
							+ "ADO.NET" + "<br />"
							+ "XML" + "<br />"
							+ "SQL Server2000" + "<br />"
							+ "SOAP" + "<br />"
							+ "CrossMission2" + "<br />"
							+ "UML" + "<br />"
						, "WindowsXP" + "<br />"
						, "2,3,4,5" + "<br />"
							+ "L" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2005/05～2005/07"
						, "証券業 ﾍﾟｰﾊﾟﾚｽｼｽﾃﾑの開発" + "<br />"
							+ "・各種帳票のHTMLおよびPDF化" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：100台以上" + "<br />"
							+ "ｻｰﾊﾞ：6台" + "<br />"
							+ "詳細設計～ﾃｽﾄを担当。保守・仕様追加が中心。ﾕｰｻﾞ折衝は担当者との細かな仕様確認程度。" + "<br />"
						, "XSLT" + "<br />"
							+ "JAVA" + "<br />"
							+ "JavaScript" + "<br />"
							+ "Apache" + "<br />"
							+ "SVF" + "<br />"
							+ "ORACLE9" + "<br />"
						, "Windows2000" + "<br />"
							+ "Soralis8" + "<br />"
							+ "AIX5" + "<br />"
						, "3,4,5" + "<br />"
							+ "M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2005/08～2006/11"
						, "ｺｰﾙセンター向けCRMﾊﾟｯｹｰｼﾞの開発・導入" + "<br />"
							+ "・顧客管理、ｺﾝﾀｸﾄ管理、ﾀｽｸ管理、ﾜｰｸﾌﾛｰ管理、ﾕｰｻﾞ向けｶｽﾀﾏｲｽﾞ開発、外部ｼｽﾃﾑ連携" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：10から100台" + "<br />"
							+ "ｻｰﾊﾞ：４から10台" + "<br />"
							+ "画面設計、詳細設計～総合ﾃｽﾄを担当。開発環境構築やDBﾁｭｰﾆﾝｸﾞにも関わる。" + "<br />"
							+ "仕様確認は要件定義担当者を通していたため、ﾕｰｻﾞ折衝なし。" + "<br />"
						, "VisualC#.NET" + "<br />"
							+ "JAVA" + "<br />"
							+ "XML" + "<br />"
							+ "SOAP" + "<br />"
							+ "WebLogic8.1" + "<br />"
							+ "ORACLE9" + "<br />"
							+ "PostgreSQL8.1" + "<br />"
							+ "eMailKit1.0" + "<br />"
						, "WindowsXP" + "<br />"
						, "3,4,5,6" + "<br />"
							+ "M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2006/12～2007/10"
						, "ﾈｯﾄｽｰﾊﾟｰECｻｲﾄ＆管理ｼｽﾃﾑの開発" + "<br />"
							+ "・Webｻｲﾄ買物画面、注文伝票管理、割引管理" + "<br />"
							+ "APﾁｭｰﾆﾝｸﾞ全般、ｻｲﾄ認証用暗号化ｱﾙｺﾞﾘｽﾞﾑ" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：1000台以上" + "<br />"
							+ "ｻｰﾊﾞ：6台～10台" + "<br />"
							+ "詳細設計から合流し、設計～運用・保守に関わる。" + "<br />"
							+ "外部設計の残分、ﾌﾚｰﾑﾜｰｸ見直し・追加構築、" + "<br />"
							+ "O/Rﾏｯﾋﾟﾝｸﾞのﾄﾞﾒｲﾝﾓﾃﾞﾙ設計、SQLﾁｭｰﾆﾝｸﾞ" + "<br />"
							+ "その他ｱﾌﾟﾘ側の課題管理・解決全般に関わる。" + "<br />"
							+ "技術側に注力したため、ﾕｰｻﾞ折衝なし。" + "<br />"
						, "JAVA" + "<br />"
							+ "Struts1.1" + "<br />"
							+ "velocity1.2" + "<br />"
							+ "hibernate3.0" + "<br />"
							+ "PL/SQL" + "<br />"
							+ "Tomcat5" + "<br />"
							+ "Oracle10(RAC)" + "<br />"
						, "WindowsXP" + "<br />"
							+ "HP-UX" + "<br />"
						, "3,4,5,6" + "<br />"
							+ "L,M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2007/11～2008/05"
						, "製造業向けECｻｲﾄ(BtoB)＆管理ｼｽﾃﾑの開発" + "<br />"
							+ "・DB論理&物理設計、AP&DB環境構築" + "<br />"
							+ "ﾄﾞﾒｲﾝ層全般、Webサイト商品画面" + "<br />"
							+ "海外ｻｲﾄ展開用ﾒｲﾝｱｰｷﾃｸﾁｬ設計" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：1000台以上" + "<br />"
							+ "ｻｰﾊﾞ：6台～" + "<br />"
							+ "主にDA兼DBA、基本設計要員として参加。" + "<br />"
							+ "新ﾌﾚｰﾑﾜｰｸ導入・追加構築、環境構築、" + "<br />"
							+ "その他ｱﾌﾟﾘ側の課題管理・解決全般に関わる。" + "<br />"
							+ "ﾕｰｻﾞ折衝は設計者としての仕様確認等。" + "<br />"
						, "JAVA" + "<br />"
							+ "Tapestry4" + "<br />"
							+ "Tomcat6" + "<br />"
							+ "PostgreSQL8.1" + "<br />"
							+ "PostgresForest4" + "<br />"
						, "WindowsXP" + "<br />"
							+ "RedHatLinux" + "<br />"
						, "2,3,4,5" + "<br />"
							+ "L,M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2008/06～2008/07"
						, "不動産業社内業務DB統合ﾌﾟﾛｼﾞｪｸﾄ" + "<br />"
							+ "・DB設計、各種ﾙｰﾙ標準化設計" + "<br />"
							+ "概要業務ﾌﾛｰ分析" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：1000台以上" + "<br />"
							+ "ｻｰﾊﾞ：ｲﾝﾌﾗ要件定義前のため未定" + "<br />"
							+ "対象業務ｼｽﾃﾑ：6～10個" + "<br />"
							+ "序盤の基本設計支援要員として参加。" + "<br />"
							+ "論理名命名ﾙｰﾙ策定、業務観点での" + "<br />"
							+ "ﾃｰﾌﾞﾙ項目概要まとめ等、分析・設計に関わる。" + "<br />"
							+ "ﾕｰｻﾞ折衝は設計者としてのﾚﾋﾞｭｰ・業務確認等。" + "<br />"
						, "-" + "<br />"
						, "-" + "<br />"
						, "1,2" + "<br />"
							+ "M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2008/08〜2010/05"
						, "流通業商品管理統合ｼｽﾃﾑ＆ECｻｲﾄの開発" + "<br />"
							+ "・売価ｺｽﾄ料金計算、決済外部ｼｽﾃﾑ連携、" + "<br />"
							+ "販促機能ほか、ｱﾌﾟﾘおよびｱﾌﾟﾘｱｰｷ全般" + "<br />"
							+ "ASPｻｰﾋﾞｽ連携(決済)" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：1000台以上" + "<br />"
							+ "ｻｰﾊﾞ：約20台" + "<br />"
							+ "外部設計から合流し、設計、開発、ﾃｽﾄ、および ｻｰﾋﾞｽIN後の運用・保守まで全工程に関わる。" + "<br />"
							+ "設計提案や2次ﾌｪｰｽﾞの要件分析などの 顧客説明、外部ｼｽﾃﾑﾍﾞﾝﾀｰとの課題調整に加え、 開発環境構築、DB設計、SQLﾁｭｰﾆﾝｸﾞ、 その他ｱﾌﾟﾘ実装など、技術・業務の両面にてｹｱ。" + "<br />"
						, "VisualC#.NET" + "<br />"
							+ "ASP.NET" + "<br />"
							+ "DBFlute" + "<br />"
							+ "IIS7.0" + "<br />"
							+ "XML" + "<br />"
							+ "SOAP" + "<br />"
							+ "Oracle10(RAC)" + "<br />"
						, "WindowsXP" + "<br />"
							+ "WindowsServer2003" + "<br />"
						, "1,2,3,4,5,6" + "<br />"
							+ "L,M" + "<br />"
				)
		);
		this.keirekiList.add(
				new KeirekiItem(
						"2010/06〜現在"
						, "ﾈｯﾄｽｰﾊﾟｰECｻｲﾄの保守＆ﾊﾟｯｹｰｼﾞ展開" + "<br />"
							+ "・ｱﾌﾟﾘｱｰｷ・ﾌﾚｰﾑﾜｰｸｱｰｷ、ｱﾌﾟﾘ全般" + "<br />"
							+ "DB設計、外部ｼｽﾃﾑ連携、ﾐﾄﾞﾙｳｪｱ環境構築" + "<br />"
							+ "ASPｻｰﾋﾞｽ連携(地図情報、決済、ﾎﾟｲﾝﾄ使用)" + "<br />"
							+ "ｸﾗｲｱﾝﾄ：1000台以上" + "<br />"
							+ "ｻｰﾊﾞ：6～30台" + "<br />"
							+ "過去に構築したﾌﾟﾛｼﾞｪｸﾄの追加開発に参加。" + "<br />"
							+ "ﾊﾟｯｹｰｼﾞ展開時には要件定義から参加し、 DB設計、ｱｰｷ設計、ｱﾌﾟﾘ設計、環境構築ほか ｼｽﾃﾑ構築・ﾃﾞｻﾞｲﾝの全般に関わる。" + "<br />"
							+ "ｺｽﾄ・ｽｹｼﾞｭｰﾙ以外の業務仕様や設計について、 顧客説明、外部ｼｽﾃﾑﾍﾞﾝﾀｰとの調整など。" + "<br />"
						, "JQuery" + "<br />"
							+ "JAVA" + "<br />"
							+ "Struts1.1" + "<br />"
							+ "velocity1.2" + "<br />"
							+ "hibernate3.0" + "<br />"
							+ "Solr4.3" + "<br />"
							+ "Tomcat5" + "<br />"
							+ "Tomcat7" + "<br />"
							+ "Oracle10(RAC)" + "<br />"
							+ "Oracle11(RAC)" + "<br />"
							+ "TimesTen11" + "<br />"
						, "WindowsXP" + "<br />"
							+ "Windows7" + "<br />"
							+ "WindowsServer2003" + "<br />"
							+ "HP-UX" + "<br />"
							+ "RedHatLinux" + "<br />"
						, "1,2,3,4,5,6,7" + "<br />"
							+ "L,M" + "<br />"
				)
		);
	}

	public String getExcelKeirekiLink() {
		return excelKeirekiLink;
	}

	public void setExcelKeirekiLink(String excelKeirekiLink) {
		this.excelKeirekiLink = excelKeirekiLink;
	}

	public List<KeirekiItem> getKeirekiList() {
		return keirekiList;
	}

	public void setKeirekiList(List<KeirekiItem> keirekiList) {
		this.keirekiList = keirekiList;
	}

}
