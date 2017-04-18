package realjamapps.com.yatranslate.view.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

    protected View rootView;
    protected Bundle bundleData;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getArguments() != null) {
            bundleData = getArguments();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutResource(), container, false);
        initializeFragment();
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        //getActivity().startPostponedEnterTransition();
    }

    public abstract String getKey();

    protected abstract void initializeFragment();

    protected abstract int getLayoutResource();

}
