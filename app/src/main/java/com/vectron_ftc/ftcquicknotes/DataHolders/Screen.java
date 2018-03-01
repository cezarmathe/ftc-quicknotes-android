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
        switch(this){
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
    }
