package realjamapps.com.yatranslate.application;

import android.app.Application;
import android.content.Context;

import realjamapps.com.yatranslate.BuildConfig;
import timber.log.Timber;

public class YaApp extends Application {

    public YaApp() {}

    public static YaApp get(Context context) {
        return (YaApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AppHolder.INSTANCE.setApplication(this);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        //strictMode();
    }
}
