package rx.internal.operators;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;

public enum EmptyObservableHolder implements OnSubscribe<Object> {
    INSTANCE;
    
    static final Observable<Object> EMPTY = null;

    static {
        EmptyObservableHolder emptyObservableHolder;
        EMPTY = Observable.unsafeCreate(emptyObservableHolder);
    }

    public static <T> Observable<T> instance() {
        return EMPTY;
    }

    public void call(Subscriber<? super Object> subscriber) {
        subscriber.onCompleted();
    }
}
