package var3d.net.demo;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.scenes.scene2d.Actor;

import var3d.net.center.android.VAndroidLauncher;

public class AndroidLauncher extends VAndroidLauncher {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new Game(this), config);
    }
}
