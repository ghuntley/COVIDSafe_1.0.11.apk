.class Lau/gov/health/covidsafe/status/persistence/StatusRecordDao_Impl$2;
.super Landroidx/room/SharedSQLiteStatement;
.source "StatusRecordDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lau/gov/health/covidsafe/status/persistence/StatusRecordDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lau/gov/health/covidsafe/status/persistence/StatusRecordDao_Impl;


# direct methods
.method constructor <init>(Lau/gov/health/covidsafe/status/persistence/StatusRecordDao_Impl;Landroidx/room/RoomDatabase;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lau/gov/health/covidsafe/status/persistence/StatusRecordDao_Impl$2;->this$0:Lau/gov/health/covidsafe/status/persistence/StatusRecordDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/SharedSQLiteStatement;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM status_table WHERE timestamp <= ?"

    return-object v0
.end method
