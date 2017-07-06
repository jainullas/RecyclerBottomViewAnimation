package com.example.ullasjain.recyclerbottomviewanimation.scrollhandling;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by UllasJain on 06/07/17.
 */

@Retention(RetentionPolicy.SOURCE)
@IntDef({
        ScrollAnimationStates.HIDDEN,
        ScrollAnimationStates.SHOWN
})
@interface ScrollAnimationStates {
    int HIDDEN = 1;
    int SHOWN = 0;
}