package realjamapps.com.yatranslate;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import butterknife.BindView;
import realjamapps.com.yatranslate.view.activities.BaseActivity;
import realjamapps.com.yatranslate.view.fragments.HistoryFragment;
import realjamapps.com.yatranslate.view.fragments.SettingsFragment;
import realjamapps.com.yatranslate.view.fragments.TranslationFragment;

public class MainActivity extends BaseActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_translation:
                    replaceFragment(new TranslationFragment(), TranslationFragment.TAG);
                    return true;
                case R.id.navigation_history:
                    replaceFragment(new HistoryFragment(), HistoryFragment.TAG);
                    return true;
                case R.id.navigation_settings:
                    replaceFragment(new SettingsFragment(), SettingsFragment.TAG);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void initializeActivity() {
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    private void showTranslateFragment() {
//        ArticleFragment newFragment = new ArticleFragment();
//        Bundle args = new Bundle();
//        args.putInt(ArticleFragment.ARG_POSITION, position);
//        newFragment.setArguments(args);
//
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//        // Replace whatever is in the fragment_container view with this fragment,
//        // and add the transaction to the back stack so the user can navigate back
//        transaction.replace(R.id.fragment_container, newFragment);
//        transaction.addToBackStack(null);
//
//        // Commit the transaction
//        transaction.commit();

    }
}
