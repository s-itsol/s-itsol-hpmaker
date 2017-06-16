/**
 *
 */
package net.sitsol.hpmaker;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import net.sitsol.hpmaker.beans.GaiyoBean;
import net.sitsol.hpmaker.beans.IndexBean;
import net.sitsol.hpmaker.beans.KeirekiBean;
import net.sitsol.hpmaker.beans.common.BaseBean;
import net.sitsol.hpmaker.consts.AppConfig;

/**
 * HP作成メインスレッド
 * @author shibano
 */
public class MainThread {

	/**
	 * メイン
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		// 各ページ用パラメータ
		Object[][] itemsList = {
			{	"index.vm"			, "index.html"					, new IndexBean()	}	// トップページ
			, {	"gaiyo_index.vm"	, "gaiyo/gaiyo_index.html"		, new GaiyoBean()	}	// 事業所概要
			, {	"keireki_index.vm"	, "keireki/keireki_index.html"	, new KeirekiBean()	}	// 業務経歴
			, {	"contact_index.vm"	, "contact/contact_index.html"	, new IndexBean()	}	// お問い合わせ
		};

		for (Object[] items : itemsList) {

			String templagePath		= AppConfig.VM_ROOT_DIR + (String) items[0];
			String htmlPath			= AppConfig.OUT_HTML_DIR + (String) items[1];
			BaseBean bean			= (BaseBean) items[2];

			// HTML生成
			createHtml(templagePath, htmlPath, bean);
		}

		System.out.println("全ページ生成完了！");
	}

	/**
	 * HTMLの生成
	 * @param templagePath
	 * @param htmlPath
	 * @param bean
	 * @throws Exception
	 */
	private static void createHtml(String templagePath, String htmlPath, BaseBean bean) throws Exception {

		// Velocityの初期化
		Velocity.init(AppConfig.VELOCITY_PROP_PATH);
		//Velocityコンテキストに値を設定
		VelocityContext context = new VelocityContext();

		// 元データビーンの取り込み
		context.put("bean", bean);

		//テンプレートの作成
		Template template = Velocity.getTemplate(templagePath, AppConfig.VM_CHARSET);

		OutputStreamWriter sw = new OutputStreamWriter(
									new BufferedOutputStream(new FileOutputStream(htmlPath))
									, AppConfig.OUT_CHARSET
								);
		//テンプレートとマージ
		template.merge(context, sw);
		sw.flush();

		System.out.println("[" + htmlPath + "]生成完了！");
	}

}
