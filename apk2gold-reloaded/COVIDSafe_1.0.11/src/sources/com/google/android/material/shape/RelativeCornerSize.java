package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public RelativeCornerSize(float f) {
        this.percent = f;
    }

    public float getRelativePercent() {
        return this.percent;
    }

    public float getCornerSize(RectF rectF) {
        return this.percent * rectF.height();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeCornerSize)) {
            return false;
        }
        if (this.percent != ((RelativeCornerSize) obj).percent) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }
}
