package com.fluent.android.bundle;

import android.app.Fragment;

public class FragmentArgsSetter {

    public static <T extends Fragment> T setFragmentArguments(T fragment, FluentBundle fluentBundle) {
        fragment.setArguments(fluentBundle.get());
        return fragment;
    }
}
