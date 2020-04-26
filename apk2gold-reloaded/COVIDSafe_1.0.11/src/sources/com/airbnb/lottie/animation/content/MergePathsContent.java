package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MergePathsContent implements PathContent, GreedyContent {
    private final Path firstPath = new Path();
    private final MergePaths mergePaths;
    private final String name;
    private final Path path = new Path();
    private final List<PathContent> pathContents = new ArrayList();
    private final Path remainderPath = new Path();

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode[] r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode = r0
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.MergePathsContent.AnonymousClass1.<clinit>():void");
        }
    }

    public MergePathsContent(MergePaths mergePaths2) {
        if (VERSION.SDK_INT >= 19) {
            this.name = mergePaths2.getName();
            this.mergePaths = mergePaths2;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    public void absorbContent(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == this) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            Content content = (Content) listIterator.previous();
            if (content instanceof PathContent) {
                this.pathContents.add((PathContent) content);
                listIterator.remove();
            }
        }
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < this.pathContents.size(); i++) {
            ((PathContent) this.pathContents.get(i)).setContents(list, list2);
        }
    }

    public Path getPath() {
        this.path.reset();
        if (this.mergePaths.isHidden()) {
            return this.path;
        }
        int i = AnonymousClass1.$SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[this.mergePaths.getMode().ordinal()];
        if (i == 1) {
            addPaths();
        } else if (i == 2) {
            opFirstPathWithRest(Op.UNION);
        } else if (i == 3) {
            opFirstPathWithRest(Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            opFirstPathWithRest(Op.INTERSECT);
        } else if (i == 5) {
            opFirstPathWithRest(Op.XOR);
        }
        return this.path;
    }

    public String getName() {
        return this.name;
    }

    private void addPaths() {
        for (int i = 0; i < this.pathContents.size(); i++) {
            this.path.addPath(((PathContent) this.pathContents.get(i)).getPath());
        }
    }

    private void opFirstPathWithRest(Op op) {
        this.remainderPath.reset();
        this.firstPath.reset();
        for (int size = this.pathContents.size() - 1; size >= 1; size--) {
            PathContent pathContent = (PathContent) this.pathContents.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                List pathList = contentGroup.getPathList();
                for (int size2 = pathList.size() - 1; size2 >= 0; size2--) {
                    Path path2 = ((PathContent) pathList.get(size2)).getPath();
                    path2.transform(contentGroup.getTransformationMatrix());
                    this.remainderPath.addPath(path2);
                }
            } else {
                this.remainderPath.addPath(pathContent.getPath());
            }
        }
        PathContent pathContent2 = (PathContent) this.pathContents.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List pathList2 = contentGroup2.getPathList();
            for (int i = 0; i < pathList2.size(); i++) {
                Path path3 = ((PathContent) pathList2.get(i)).getPath();
                path3.transform(contentGroup2.getTransformationMatrix());
                this.firstPath.addPath(path3);
            }
        } else {
            this.firstPath.set(pathContent2.getPath());
        }
        this.path.op(this.firstPath, this.remainderPath, op);
    }
}
