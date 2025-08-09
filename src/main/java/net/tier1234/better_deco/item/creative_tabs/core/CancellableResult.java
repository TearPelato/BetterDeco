package net.tier1234.better_deco.item.creative_tabs.core;

public enum CancellableResult {
    PASS(false),
    CANCEL(true);

    public static CancellableResult pass() {
        return PASS;
    }

    public static CancellableResult cancel() {
        return CANCEL;
    }

    private final boolean cancelled;

    CancellableResult(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }
}