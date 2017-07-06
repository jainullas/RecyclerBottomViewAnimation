package com.example.ullasjain.recyclerbottomviewanimation.scrollhandling;

import android.support.v7.widget.RecyclerView;

/**
 * Created by UllasJain on 06/07/17.
 */

public class RecyclerViewScrollAnimationStateHandler {

    private RecyclerView recyclerView;
    private ScrollAnimationListener listener;
    private boolean canAnimate = false;
    private int state = ScrollAnimationStates.SHOWN;

    public RecyclerViewScrollAnimationStateHandler(RecyclerView recyclerView, ScrollAnimationListener listener) {
        this.recyclerView = recyclerView;
        this.listener = listener;
        listenToScroll();
    }

    private void show() {
        if (state == ScrollAnimationStates.SHOWN) {
            return;
        }
        listener.showBottomView();
        state = ScrollAnimationStates.SHOWN;
    }

    private void hide() {
        if (state == ScrollAnimationStates.HIDDEN && canAnimate) {
            return;
        }
        listener.hideBottomView();
        state = ScrollAnimationStates.HIDDEN;
    }

    private void listenToScroll() {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                switch (newState) {
                    case RecyclerView.SCROLL_STATE_IDLE:
                        canAnimate = false;
                        show();
                        break;
                    case RecyclerView.SCROLL_STATE_DRAGGING:
                        canAnimate = true;
                        break;
                }

            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0) {
                    hide();
                } else {
                    show();
                }
            }
        });
    }
}