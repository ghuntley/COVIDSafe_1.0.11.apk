package au.gov.health.covidsafe.factory;

import au.gov.health.covidsafe.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(
    bv = {1, 0, 3},
    d1 =
        {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b¢\u0006\u0002\u0010\fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"},
    d2 = {"Lau/gov/health/covidsafe/factory/RetrofitServiceGenerator;", "",
          "()V", "builder", "Lretrofit2/Retrofit$Builder;",
          "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;",
          "createService", "S", "serviceClass", "Ljava/lang/Class;",
          "(Ljava/lang/Class;)Ljava/lang/Object;", "app_release"},
    k = 1, mv = {1, 1, 16})
/* compiled from: NetworkFactory.kt */
public final class RetrofitServiceGenerator {
  public static final RetrofitServiceGenerator INSTANCE =
      new RetrofitServiceGenerator();
  private static final Retrofit.Builder builder;
  private static Retrofit retrofit;

  static {
    Retrofit.Builder addConverterFactory =
        new Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());
    builder = addConverterFactory;
    retrofit = addConverterFactory.build();
  }

  private RetrofitServiceGenerator() {}

  public final <S> S createService(Class<S> cls) {
    Intrinsics.checkParameterIsNotNull(cls, "serviceClass");
    builder.client(NetworkFactory.Companion.getOkHttpClient());
    Retrofit build = builder.build();
    retrofit = build;
    return build.create(cls);
  }
}
