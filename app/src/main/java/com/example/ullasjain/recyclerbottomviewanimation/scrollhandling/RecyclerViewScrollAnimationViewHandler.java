package com.example.ullasjain.recyclerbottomviewanimation.scrollhandling;

import android.view.View;

/**
 * Created by UllasJain on 06/07/17.
 */

public class RecyclerViewScrollAnimationViewHandler implements ScrollAnimationListener {

    private View animateView;

    public RecyclerViewScrollAnimationViewHandler(View view) {
        this.animateView = view;
    }


    @Override
    public void showBottomView() {
        handleBottomViewState(true);
    }

    @Override
    public void hideBottomView() {
        handleBottomViewState(false);
    }

    private void handleBottomViewState(boolean isVisible) {
        animateView.animate()
                .alpha(isVisible ? 1 : 0)
                .translationY(isVisible ? 0 : animateView.getHeight());
    }

}
