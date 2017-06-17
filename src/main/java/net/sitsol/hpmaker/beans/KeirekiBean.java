/**
 *
 */
package net.sitsol.hpmaker.beans;

import net.sitsol.hpmaker.beans.common.BaseBean;
import net.sitsol.hpmaker.consts.AppConfig;

/**
 * keireki用ビーン
 * @author shibano
 */
public class KeirekiBean extends BaseBean {

	private static final long serialVersionUID = -26564197194535224L;

	private String excelKeirekiLink = AppConfig.BASE_URL + "keireki/keireki.xls";

	public String getExcelKeirekiLink() {
		return excelKeirekiLink;
	}

	public void setExcelKeirekiLink(String excelKeirekiLink) {
		this.excelKeirekiLink = excelKeirekiLink;
	}

}
