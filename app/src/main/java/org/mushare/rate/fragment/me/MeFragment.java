package org.mushare.rate.fragment.me;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dklap on 12/16/2016.
 */

public class MeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//      return inflater.inflate(R.layout.fragment_rate, container, false);
        return new View(container.getContext());
    }
}