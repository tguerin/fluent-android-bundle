package com.fluent.android.bundle;

import android.app.Fragment;

public class FragmentArgsSetter {

    public static <T extends Fragment> T setFragmentArguments(T fragment, FluentBundle fluentBundle) {
        fragment.setArguments(fluentBundle.get());
        return fragment;
    }

    public static <T extends android.support.v4.app.Fragment> T setFragmentArguments(T fragment, FluentBundle fluentBundle) {
        fragment.setArguments(fluentBundle.get());
        return fragment;
    }
}
