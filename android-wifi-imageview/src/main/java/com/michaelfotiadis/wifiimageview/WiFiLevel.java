package com.michaelfotiadis.wifiimageview;

/**
 * Copy of {@link com.github.pwittchen.reactivewifi.WifiSignalLevel} so as not to expose the library
 */
public enum WiFiLevel {
    NO_SIGNAL(0, "no signal"),
    POOR(1, "poor"),
    FAIR(2, "fair"),
    GOOD(3, "good"),
    EXCELLENT(4, "excellent");

    private final int level;
    private final String description;

    WiFiLevel(final int level, final String description) {
        this.level = level;
        this.description = description;
    }

    /**
     * Gets WifiSignalLevel enum basing on integer value
     *
     * @param level as an integer
     * @return WifiSignalLevel enum
     */
    public static WiFiLevel fromLevel(final int level) {
        switch (level) {
            case 0:
                return NO_SIGNAL;
            case 1:
                return POOR;
            case 2:
                return FAIR;
            case 3:
                return GOOD;
            case 4:
                return EXCELLENT;
            default:
                return NO_SIGNAL;
        }
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "WifiSignalLevel{" + "level=" + level + ", description='" + description + '\'' + '}';
    }
}