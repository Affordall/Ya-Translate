package realjamapps.com.yatranslate.view.fragments;

import realjamapps.com.yatranslate.R;

public class HistoryFragment extends BaseFragment {

    public static final String TAG = HistoryFragment.class.getSimpleName();

    @Override
    public String getKey() {
        return TAG;
    }

    @Override
    protected void initializeFragment() {

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_history;
    }

}
