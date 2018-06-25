package var3d.net.center;import com.badlogic.gdx.graphics.Pixmap;import com.badlogic.gdx.math.Rectangle;import com.badlogic.gdx.math.Vector2;import com.badlogic.gdx.scenes.scene2d.Actor;import com.badlogic.gdx.utils.Align;import com.badlogic.gdx.utils.Array;import java.util.Locale;import var3d.net.center.freefont.FreeListener;public interface VListener extends FreeListener {    public void setGame(VGame game);    public void esc();    public void getDiaolog(String msg);    public void goToShare(String title, String context, String url,                          byte[] imgByte, final Runnable success, final Runnable failure);    public void sayGood();    public void getTopList();    public void getTopList(String id);    public void log(String txt);    public void Tost(String msg);    public String getCountry();    public void startLevel(String level);    public void failLevel(String level);    public void finishLevel(String level);    public void getAdDialog();    public void openVar3dNet();    public void openAd(String str);    public void openAd(String str, Object... objects);    public void openAd(int aglin);    public void openAdbig(int aglin);    public void closeAd();    public void openFullAd();    public void onIOSResume();    public void onIOSPause();    public String getDeviceId();    public void signUp(String name, String pass);    public Array<Object> signUp(Object... obj);    public Locale getLocale();    public void openAppShop(String url);    public void updataScore(String userId, int score);    public void universalMethod(Object... obj);    public Array<Object> intelligentMethod(Object... obj);    public void pay(double price, String name, VPayListener listen);    public void getBuyList(VShopListener listen);    public boolean isCanShow();    public void openActivity(Class<?> cls, String name, Object value);    public void openActivity(Class<?> cls, String[] name, Object[] value);    public void runOnUiThread(Runnable run);    public void Screenshot(VGame game);    public void editScreenshot(VGame game, String path);    public void createIcon(VGame game, String path);    public void editLanguage(VGame game, String path);    public void createScreenshot(VGame game, String path);    public String getString(String key);    public String getVersionName();    public void openProtect(String... names);    public void unProtect(String... names);    public void create();    public void edit(VStage stage);    public void saveUI(VStage stage);    public void getLineNumber(Actor actor);    public void keyDown(int key);    public void keyUp(int key);    public Vector2 getAppScreenSize();    public Rectangle getSafeAreaInsets();    public Pixmap getIphoneXPixmap(String name);}