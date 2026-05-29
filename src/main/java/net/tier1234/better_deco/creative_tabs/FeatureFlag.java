package net.tier1234.better_deco.creative_tabs;

@FunctionalInterface
public interface FeatureFlag {
    FeatureFlag DEFAULT = () -> true;

    boolean isEnabled();
}