package com.yangchenwen.sqlparamssetter.i18n;

import com.intellij.DynamicBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

import java.util.function.Supplier;

public class SqlParamsSetterBundle extends DynamicBundle {

    @NonNls
    private static final String BUNDLE = "messages.SqlParamsSetterBundle";

    private static final SqlParamsSetterBundle INSTANCE = new SqlParamsSetterBundle();

    private SqlParamsSetterBundle() {
        super(BUNDLE);
    }

    @NotNull
    public static String message(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, Object @NotNull ... params) {
        return INSTANCE.getMessage(key, params);
    }

    @NotNull
    public static Supplier<String> messagePointer(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, Object @NotNull ... params) {
        return INSTANCE.getLazyMessage(key, params);
    }
}
