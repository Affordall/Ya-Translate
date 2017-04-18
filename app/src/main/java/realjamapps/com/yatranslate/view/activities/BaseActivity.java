package realjamapps.com.yatranslate.view.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import realjamapps.com.yatranslate.R;

public abstract class BaseActivity extends AppCompatActivity {

    protected final FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedStateBundle) {
        super.onCreate(savedStateBundle);
        setContentView(getLayoutResource());
        ButterKnife.bind(this);
        initializeActivity();
    }

    protected void replaceFragment(Fragment fragment, String tag) {
        try {
            fragmentManager.beginTransaction().replace(R.id.content_container, fragment, tag).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract void initializeActivity();

    protected abstract int getLayoutResource();
}
