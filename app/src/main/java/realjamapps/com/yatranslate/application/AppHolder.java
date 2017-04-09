package realjamapps.com.yatranslate.application;

public enum AppHolder {
    INSTANCE;

    private YaApp yaApp;

    AppHolder() {
    }

    void setApplication(YaApp customApplication) {
        this.yaApp = customApplication;
    }

    public YaApp getApplication() {
        return yaApp;
    }
}
