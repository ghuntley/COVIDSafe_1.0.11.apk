.class final Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BluetoothMonitoringService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;",
        "invoke",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "au.gov.health.covidsafe.services.BluetoothMonitoringService$StatusReceiver$onReceive$1"
    f = "BluetoothMonitoringService.kt"
    i = {
        0x0
    }
    l = {
        0x25d
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $statusRecord:Lau/gov/health/covidsafe/status/persistence/StatusRecord;

.field L$0:Ljava/lang/Object;

.field label:I

.field private p$:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic this$0:Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;


# direct methods
.method constructor <init>(Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;Lau/gov/health/covidsafe/status/persistence/StatusRecord;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->this$0:Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;

    iput-object p2, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->$statusRecord:Lau/gov/health/covidsafe/status/persistence/StatusRecord;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;

    iget-object v1, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->this$0:Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;

    iget-object v2, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->$statusRecord:Lau/gov/health/covidsafe/status/persistence/StatusRecord;

    invoke-direct {v0, v1, v2, p2}, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;-><init>(Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;Lau/gov/health/covidsafe/status/persistence/StatusRecord;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, v0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 604
    iget v1, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    .line 606
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 604
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->p$:Lkotlinx/coroutines/CoroutineScope;

    .line 605
    iget-object v1, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->this$0:Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;

    iget-object v1, v1, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver;->this$0:Lau/gov/health/covidsafe/services/BluetoothMonitoringService;

    invoke-static {v1}, Lau/gov/health/covidsafe/services/BluetoothMonitoringService;->access$getStatusRecordStorage$p(Lau/gov/health/covidsafe/services/BluetoothMonitoringService;)Lau/gov/health/covidsafe/status/persistence/StatusRecordStorage;

    move-result-object v1

    iget-object v3, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->$statusRecord:Lau/gov/health/covidsafe/status/persistence/StatusRecord;

    iput-object p1, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lau/gov/health/covidsafe/services/BluetoothMonitoringService$StatusReceiver$onReceive$1;->label:I

    invoke-virtual {v1, v3, p0}, Lau/gov/health/covidsafe/status/persistence/StatusRecordStorage;->saveRecord(Lau/gov/health/covidsafe/status/persistence/StatusRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 606
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
