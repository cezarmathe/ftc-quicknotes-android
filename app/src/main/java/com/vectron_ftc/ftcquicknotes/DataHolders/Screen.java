package com.vectron_ftc.ftcquicknotes.DataHolders;

/**
 * Created by cezar on 3/1/18.
 */

//    what screen you're looking at in the hub
public enum Screen {
    DRAFTS,
    FINISHED_THINGS,
    QUICK_NOTES,
    BUNDLES_OF_PICTURES,
    SPY_REPORTS,
    FUTURE_PLANS_ACTIVITIES,
    ARCHIVE,
    TAGS,
    BIN;
//    return string value for the current screen
//    used to display the current screen in the header
    public String toString() {
        switch(this) {
            case DRAFTS:
                return "Drafts";
            case FINISHED_THINGS:
                return "Finished things";
            case QUICK_NOTES:
                return "Quick notes";
            case BUNDLES_OF_PICTURES:
                return "Bundles of pictures";
            case SPY_REPORTS:
                return "Spy reports";
            case FUTURE_PLANS_ACTIVITIES:
                return "Future plans/activities";
            case ARCHIVE:
                return "Archive";
            case TAGS:
                return "Tags";
            case BIN:
                return "Bin";
            default:
                return "";
        }
    }
//    return screen from a screen
//    used to get a screen value from a string(most likely preference)
    public static Screen getScreenFromString(String value) {
        switch (value) {
            case "DRAFTS":
                return DRAFTS;
            case "FINISHED_THINGS":
                return FINISHED_THINGS;
            case "QUICK_NOTES":
                return QUICK_NOTES;
            case "BUNDLES_OF_PICTURES":
                return BUNDLES_OF_PICTURES;
            case "SPY_REPORTS":
                return SPY_REPORTS;
            case "FUTURE_PLANS_ACTIVITIES":
                return FUTURE_PLANS_ACTIVITIES;
            case "ARCHIVE":
                return ARCHIVE;
            case "TAGS":
                return TAGS;
            case "BIN":
                return BIN;
            case "":
                return DRAFTS;
            default:
                return DRAFTS;
        }
    }
}
