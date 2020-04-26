package kotlin.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource.Monotonic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\b\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a4\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\b\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)D", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)D", "kotlin-stdlib"}, k = 2, mv = {1, 1, 16})
/* compiled from: measureTime.kt */
public final class MeasureTimeKt {
    public static final double measureTime(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        TimeMark markNow = Monotonic.INSTANCE.markNow();
        function0.invoke();
        return markNow.elapsedNow();
    }

    public static final double measureTime(TimeSource timeSource, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(timeSource, "$this$measureTime");
        Intrinsics.checkParameterIsNotNull(function0, "block");
        TimeMark markNow = timeSource.markNow();
        function0.invoke();
        return markNow.elapsedNow();
    }

    public static final <T> TimedValue<T> measureTimedValue(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        return new TimedValue<>(function0.invoke(), Monotonic.INSTANCE.markNow().elapsedNow(), null);
    }

    public static final <T> TimedValue<T> measureTimedValue(TimeSource timeSource, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(timeSource, "$this$measureTimedValue");
        Intrinsics.checkParameterIsNotNull(function0, "block");
        return new TimedValue<>(function0.invoke(), timeSource.markNow().elapsedNow(), null);
    }
}
