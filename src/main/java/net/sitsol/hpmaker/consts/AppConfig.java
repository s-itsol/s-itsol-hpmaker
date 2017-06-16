/**
 *
 */
package net.sitsol.hpmaker.consts;

/**
 * アプリ簡易パラメータ代わりの定数クラス
 * @author shibano
 */
public class AppConfig {

	protected AppConfig() {}

	// HP作成INパラメータ
	public static String VELOCITY_PROP_PATH	= "/Dev/Java/workspace/s-itsol-hpmaker/src/main/config/velocity.properties";
	public static String VM_ROOT_DIR			= "";
	public static String VM_CHARSET			= "UTF-8";
	public static String OUT_HTML_DIR			= "/Dev/Java/workspace/s-itsol-hpmaker/st_conts/s-itsol/";

	// HTMLコンテンツINパラメータ
//	public static String BASE_URL				= OUT_HTML_DIR;					// ローカル確認用
	public static String BASE_URL				= "http://www.s-itsol.net/";	// サーバアップ用
	public static String IMAGE_URL			= BASE_URL + "images/";
	public static String OUT_CHARSET			= "utf-8";
	public static int CONTENTS_WIDTH_SIZE		= 740;

}
