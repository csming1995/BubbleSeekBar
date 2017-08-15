package com.xw.samlpe.bubbleseekbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.xw.repo.BubbleSeekBar;

import java.util.Random;

/**
 * DemoFragment1
 * <><p/>
 * Created by woxingxiao on 2017-03-11.
 */

public class DemoFragment5 extends Fragment {

    public static DemoFragment5 newInstance() {
        return new DemoFragment5();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo_5, container, false);

        final BubbleSeekBar bubbleSeekBar = (BubbleSeekBar) view.findViewById(R.id.demo_5_seek_bar_1);
        bubbleSeekBar.setProgress(20);
//        bubbleSeekBar.setEnabled(false);
        return view;
    }
}
